package com.edu.hzau.ic.fe.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
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
            CloseableHttpResponse response = null;
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


}
