package com.edu.hzau.ic.fe.utils;

import com.edu.hzau.ic.fe.entity.KeggEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yue
 */
@Slf4j
@Component
public class KeggUtils {
    private static final String KEGG_URL = "https://rest.kegg.jp/conv/genes/ncbi-geneid:";

    /**
     * 根据ncbi_gene_id获取keggId
     */
    public List<String> getKeggIds(List<String> ncbiGeneIdsList) throws IOException {
        List<String> keggIds = new ArrayList<>();
        for (String ncbiGeneId : ncbiGeneIdsList) {
            // 配置socket，防止阻塞
            SocketConfig socketConfig = SocketConfig.custom()
                    .setSoKeepAlive(false)
                    .setSoReuseAddress(true)
                    .setSoTimeout(10000)
                    .setTcpNoDelay(true).build();
            CloseableHttpResponse response;
            try {
                // 发起请求
                CloseableHttpClient client = HttpClientBuilder.create()
                        .setDefaultSocketConfig(socketConfig).build();
                HttpGet httpGet = new HttpGet(KEGG_URL + ncbiGeneId);
                response = client.execute(httpGet);
            } catch (IOException e ) {
                log.warn("request time out..., failed ncbiGeneId: {}", ncbiGeneId);
                continue;
            }
            // 获取结果
            HttpEntity entity = response.getEntity();
            InputStream content = entity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(content));
            String line = br.readLine();
            if (line.length() <= 0) {
                continue;
            }
            int prefixLen = ncbiGeneId.length() + 12;
            String keggId = line.substring(prefixLen).trim();
            log.info("{} queried", keggId);
            keggIds.add(keggId);
        }
        return keggIds;
    }

    /**
     * 根据keggId获取实体
     */
    public List<KeggEntity> getKeggEntity(List<String> keggIds) throws RserveException, REXPMismatchException {
        RConnection rc = new RConnection();
        REXP eval;
        List<KeggEntity> entities = new ArrayList<>();
        // 加载kegg库
        rc.eval("library(KEGGREST)");
        // 解析entry
        for (String keggId : keggIds) {
            KeggEntity entry = new KeggEntity();
            String ncbiGeneId = keggId.replaceAll(".*[^\\d](?=(\\d+))","");
            entry.setNcbiGeneId(ncbiGeneId);

            // 根据keggId查询
            rc.eval("query <- keggGet(c('" + keggId + "'))");
            entry.setKeggId(keggId);

            // 查询symbol
            eval = rc.eval("query[[1]]$SYMBOL");
            String keggSymbol = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggSymbol(keggSymbol);

            // 查询name
            eval = rc.eval("query[[1]]$NAME");
            String keggName = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggName(keggName);

            // 查询orthology
            eval = rc.eval("query[[1]]$ORTHOLOGY");
            String keggOrthology = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggOrthology(keggOrthology);

            // 查询organism
            eval = rc.eval("query[[1]]$ORGANISM");
            String keggOrganism = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggOrganism(keggOrganism);

            // 查询pathway
            eval = rc.eval("query[[1]]$PATHWAY");
            String keggPathway = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggPathway(keggPathway);

            // 查询network
            eval = rc.eval("as.character(query[[1]]$NETWORK[1])");
            String keggNetwork = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggNetWork(keggNetwork);

            // 查询networkelement
            eval = rc.eval("as.character(query[[1]]$NETWORK$ELEMENT)");
            String keggNetworkElement = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggNetWorkElement(keggNetworkElement);

            // 查询brite
            eval = rc.eval("query[[1]]$BRITE");
            String keggBrite;
            if (eval.isNull()) {
                keggBrite = null;
            } else {
                String[] strings = eval.asStrings();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strings.length - 1; i++) {
                    if (strings[i + 1].trim().startsWith(ncbiGeneId)) {
                        sb.append(strings[i].trim());
                        sb.append("; ");
                    }
                }
                keggBrite = sb.toString();
            }
            entry.setKeggBrite(keggBrite);

            // 查询motif
            eval = rc.eval("as.character(query[[1]]$MOTIF)");
            String keggMotif = eval.isNull() ? null : Arrays.toString(eval.asStrings());
            entry.setKeggMotif(keggMotif);
            entities.add(entry);
            log.info(ncbiGeneId + " queried");
        }
        rc.close();
        return entities;
    }
}
