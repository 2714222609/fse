### Q1 某天，日阶段的饲喂方式对某生长育肥猪肠道微生物组成和功能的影响？（以100天为例）
#### Datalog
```
?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-
relationship:is_host_of(Swine_index,Microbe_id,<100>),
attribute:p_value_dpf_tpf_difference(Microbe_id,<1>),
attribute:microbe_name(Microbe_id,Microbe_name),
attribute:microbe_time(Microbe_id,<100>),

relationship:changes_the_expression_by_microbiota(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),
attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),

relationship:has_gene_kegg_info(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),
attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).
```
#### 映射规则
```
{
  "rules":{
    "relationship": {
      "is_host_of": "is_host_of",
      "changes_the_expression_by_microbiota": "changes_the_expression_by_microbiota",
      "has_gene_kegg_info": "has_gene_kegg_info"
    },
    "attribute": {
      "p_value_dpf_tpf_difference": "fsmm.microbe.microbe_dpf_tpf_difference",
      "microbe_time": "fsmm.microbe.days",
      "group": "fsmm.microbe.col",
      "p_age_difference": "fsmm.microbe.microbe_age_difference",
      "metabolome_difference": "fsmm.metabolism.metabolome_difference",
      "metabolism_time": "metabolism_time"
    }
  }
}
```
#### 查询结果
```
[
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 44803,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 45279,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 86
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 45517,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 171
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 45755,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 256
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 45993,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 301
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 46231,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 366
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 46469,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 421
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 45041,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 461
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 47897,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 531
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 48135,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 596
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 48373,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 661
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 46945,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 726
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 46707,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 796
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 47183,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 871
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 47421,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 916
    },
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 1006
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 47659,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 1006
    },
    {
        "response count": 128,
        "response time": "0.645s"
    }
]
```

### Q2 A1组，出栏时（180日龄）的猪相比于初入育肥阶段时（80日龄）的猪，肠道微生物组成和功能有什么差异？
#### Datalog
```
?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-
relationship:is_host_of(Swine_index,Microbe_id,<80>),
attribute:group(Microbe_id,<A1>),
attribute:p_age_difference(Microbe_id,<1>),
attribute:microbe_name(Microbe_id,Microbe_name),
attribute:microbe_time(Microbe_id,<80>),
relationship:changes_the_expression_by_microbiota(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),
attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),
relationship:has_gene_kegg_info(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),
attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).
```
#### 映射规则
```
{
  "rules":{
    "relationship": {
      "is_host_of": "is_host_of",
      "changes_the_expression_by_microbiota": "changes_the_expression_by_microbiota",
      "has_gene_kegg_info": "has_gene_kegg_info"
    },
    "attribute": {
      "p_value_dpf_tpf_difference": "fsmm.microbe.microbe_dpf_tpf_difference",
      "microbe_time": "fsmm.microbe.days",
      "group": "fsmm.microbe.col",
      "p_age_difference": "fsmm.microbe.microbe_age_difference",
      "metabolome_difference": "fsmm.metabolism.metabolome_difference",
      "metabolism_time": "metabolism_time"
    }
  }
}
```
#### 查询结果
```
[
    {
        "geneKeggIndex": 1,
        "geneKeggPathway": "[Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Ahr), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Ahr), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Ahr), Geraniol degradation(https://www.kegg.jp/pathway/map=map00281&keyword=Ahr), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Ahr), Glycolysis / Gluconeogenesis(https://www.kegg.jp/pathway/map=map00010&keyword=Ahr), Pyruvate metabolism(https://www.kegg.jp/pathway/map=map00620&keyword=Ahr), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Ahr), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Ahr), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Ahr)]",
        "geneSymbol": "Ahr",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11622,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 99,
        "geneKeggPathway": "[Carbon metabolism(https://www.kegg.jp/pathway/map=map01200&keyword=Mta1), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Mta1), Carbon fixation pathways in prokaryotes(https://www.kegg.jp/pathway/map=map00720&keyword=Mta1), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Mta1), C5-Branched dibasic acid metabolism(https://www.kegg.jp/pathway/map=map00660&keyword=Mta1)]",
        "geneSymbol": "Mta1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 116870,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 4,
        "geneKeggPathway": "[Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Arnt), Lipopolysaccharide biosynthesis(https://www.kegg.jp/pathway/map=map00540&keyword=Arnt), Cationic antimicrobial peptide (CAMP) resistance(https://www.kegg.jp/pathway/map=map01503&keyword=Arnt), Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Arnt), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Arnt), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Arnt), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Arnt), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Arnt), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Arnt), Circadian rhythm - fly(https://www.kegg.jp/pathway/map=map04711&keyword=Arnt), Dopaminergic synapse(https://www.kegg.jp/pathway/map=map04728&keyword=Arnt), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Arnt)]",
        "geneSymbol": "Arnt",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11863,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 5,
        "geneKeggPathway": "[]",
        "geneSymbol": "Atf3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11910,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 105,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Neurog3)]",
        "geneSymbol": "Neurog3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11925,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 8,
        "geneKeggPathway": "[FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Bcl6), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Bcl6), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Bcl6)]",
        "geneSymbol": "Bcl6",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12053,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 9,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Bmi1)]",
        "geneSymbol": "Bmi1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12151,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 92,
        "geneKeggPathway": "[Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Klf5)]",
        "geneSymbol": "Klf5",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12224,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 27,
        "geneKeggPathway": "[Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Ctnnb1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Ctnnb1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Ctnnb1), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Ctnnb1), Endometrial cancer(https://www.kegg.jp/pathway/map=map05213&keyword=Ctnnb1), Rap1 signaling pathway(https://www.kegg.jp/pathway/map=map04015&keyword=Ctnnb1), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Ctnnb1), Leukocyte transendothelial migration(https://www.kegg.jp/pathway/map=map04670&keyword=Ctnnb1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Ctnnb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Ctnnb1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Ctnnb1), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Ctnnb1), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Ctnnb1), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Ctnnb1), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Ctnnb1), Focal adhesion(https://www.kegg.jp/pathway/map=map04510&keyword=Ctnnb1), Melanogenesis(https://www.kegg.jp/pathway/map=map04916&keyword=Ctnnb1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Ctnnb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Ctnnb1), Alzheimer disease(https://www.kegg.jp/pathway/map=map05010&keyword=Ctnnb1)]",
        "geneSymbol": "Ctnnb1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12387,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 18,
        "geneKeggPathway": "[]",
        "geneSymbol": "Cdx1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12590,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 19,
        "geneKeggPathway": "[Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Cdx2)]",
        "geneSymbol": "Cdx2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12591,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 22,
        "geneKeggPathway": "[Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Clock), Circadian rhythm - fly(https://www.kegg.jp/pathway/map=map04711&keyword=Clock), Circadian entrainment(https://www.kegg.jp/pathway/map=map04713&keyword=Clock), Circadian rhythm - plant(https://www.kegg.jp/pathway/map=map04712&keyword=Clock), Dopaminergic synapse(https://www.kegg.jp/pathway/map=map04728&keyword=Clock)]",
        "geneSymbol": "Clock",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12753,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 25,
        "geneKeggPathway": "[Estrogen signaling pathway(https://www.kegg.jp/pathway/map=map04915&keyword=Creb1), Circadian entrainment(https://www.kegg.jp/pathway/map=map04713&keyword=Creb1), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Creb1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Creb1), Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=Creb1), Alcoholism(https://www.kegg.jp/pathway/map=map05034&keyword=Creb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Creb1), cGMP-PKG signaling pathway(https://www.kegg.jp/pathway/map=map04022&keyword=Creb1), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Creb1), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Creb1), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Creb1), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Creb1), Adrenergic signaling in cardiomyocytes(https://www.kegg.jp/pathway/map=map04261&keyword=Creb1), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Creb1), Antigen processing and presentation(https://www.kegg.jp/pathway/map=map04612&keyword=Creb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Creb1), Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Creb1), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Creb1), Cholinergic synapse(https://www.kegg.jp/pathway/map=map04725&keyword=Creb1), Dopaminergic synapse(https://www.kegg.jp/pathway/map=map04728&keyword=Creb1)]",
        "geneSymbol": "Creb1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12912,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 26,
        "geneKeggPathway": "[Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=Crem), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Crem), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Crem), Biosynthesis of various antibiotics(https://www.kegg.jp/pathway/map=map00998&keyword=Crem), Adrenergic signaling in cardiomyocytes(https://www.kegg.jp/pathway/map=map04261&keyword=Crem)]",
        "geneSymbol": "Crem",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12916,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 32,
        "geneKeggPathway": "[Amyotrophic lateral sclerosis(https://www.kegg.jp/pathway/map=map05014&keyword=Dbp), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=Dbp), Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Dbp), mRNA surveillance pathway(https://www.kegg.jp/pathway/map=map03015&keyword=Dbp), Viral life cycle - HIV-1(https://www.kegg.jp/pathway/map=map03250&keyword=Dbp), Peroxisome(https://www.kegg.jp/pathway/map=map04146&keyword=Dbp), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Dbp)]",
        "geneSymbol": "Dbp",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13170,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 34,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=E2f1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=E2f1), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=E2f1), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=E2f1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=E2f1), Mitophagy - animal(https://www.kegg.jp/pathway/map=map04137&keyword=E2f1), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=E2f1), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=E2f1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=E2f1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=E2f1), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=E2f1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=E2f1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=E2f1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=E2f1), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=E2f1), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=E2f1), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=E2f1), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=E2f1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=E2f1), Melanoma(https://www.kegg.jp/pathway/map=map05218&keyword=E2f1)]",
        "geneSymbol": "E2f1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13555,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 36,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=E2f3), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=E2f3), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=E2f3), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=E2f3), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=E2f3), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=E2f3), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=E2f3), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=E2f3), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=E2f3), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=E2f3), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=E2f3), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=E2f3), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=E2f3), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=E2f3), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=E2f3), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=E2f3), Melanoma(https://www.kegg.jp/pathway/map=map05218&keyword=E2f3), Bladder cancer(https://www.kegg.jp/pathway/map=map05219&keyword=E2f3), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=E2f3), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=E2f3)]",
        "geneSymbol": "E2f3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13557,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 38,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Egr1), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Egr1), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=Egr1), GnRH signaling pathway(https://www.kegg.jp/pathway/map=map04912&keyword=Egr1), Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=Egr1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Egr1), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Egr1)]",
        "geneSymbol": "Egr1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13653,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 41,
        "geneKeggPathway": "[Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=Esr1), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Esr1), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Esr1), Estrogen signaling pathway(https://www.kegg.jp/pathway/map=map04915&keyword=Esr1), Prolactin signaling pathway(https://www.kegg.jp/pathway/map=map04917&keyword=Esr1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Esr1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Esr1), Endocrine and other factor-regulated calcium reabsorption(https://www.kegg.jp/pathway/map=map04961&keyword=Esr1), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Esr1)]",
        "geneSymbol": "Esr1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13982,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 43,
        "geneKeggPathway": "[Lysine degradation(https://www.kegg.jp/pathway/map=map00310&keyword=Ezh2), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Ezh2), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Ezh2)]",
        "geneSymbol": "Ezh2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14056,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 55,
        "geneKeggPathway": "[Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Foxm1)]",
        "geneSymbol": "Foxm1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14235,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 50,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Fli1)]",
        "geneSymbol": "Fli1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14247,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 52,
        "geneKeggPathway": "[Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=Fos), Phosphonate and phosphinate metabolism(https://www.kegg.jp/pathway/map=map00440&keyword=Fos), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Fos), Drug metabolism - cytochrome P450(https://www.kegg.jp/pathway/map=map00982&keyword=Fos), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Fos), Anti-HIV agents(https://www.kegg.jp/pathway/map=map07053&keyword=Fos), HIV protease inhibitors(https://www.kegg.jp/pathway/map=map07218&keyword=Fos), Anticonvulsants(https://www.kegg.jp/pathway/map=map07033&keyword=Fos), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Fos), Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=Fos), Growth hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04935&keyword=Fos), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=Fos), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=Fos), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Fos), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Fos), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Fos), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Fos), Hypnotics(https://www.kegg.jp/pathway/map=map07032&keyword=Fos), Antiviral agents(https://www.kegg.jp/pathway/map=map07044&keyword=Fos), Renin-angiotensin system inhibitors(https://www.kegg.jp/pathway/map=map07217&keyword=Fos)]",
        "geneSymbol": "Fos",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14281,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 60,
        "geneKeggPathway": "[Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Gata4), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Gata4), cGMP-PKG signaling pathway(https://www.kegg.jp/pathway/map=map04022&keyword=Gata4), Tight junction(https://www.kegg.jp/pathway/map=map04530&keyword=Gata4)]",
        "geneSymbol": "Gata4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14463,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 101,
        "geneKeggPathway": "[]",
        "geneSymbol": "Mtpn",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14489,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 62,
        "geneKeggPathway": "[]",
        "geneSymbol": "Gfi1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14581,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 63,
        "geneKeggPathway": "[Hedgehog signaling pathway(https://www.kegg.jp/pathway/map=map04340&keyword=Gli1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Gli1), Basal cell carcinoma(https://www.kegg.jp/pathway/map=map05217&keyword=Gli1), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Gli1)]",
        "geneSymbol": "Gli1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14632,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 114,
        "geneKeggPathway": "[Neuroactive ligand-receptor interaction(https://www.kegg.jp/pathway/map=map04080&keyword=Nr3c1)]",
        "geneSymbol": "Nr3c1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14815,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 69,
        "geneKeggPathway": "[]",
        "geneSymbol": "Hdac5",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15184,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 70,
        "geneKeggPathway": "[]",
        "geneSymbol": "Hey1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15213,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 71,
        "geneKeggPathway": "[]",
        "geneSymbol": "Hic1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15248,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 54,
        "geneKeggPathway": "[]",
        "geneSymbol": "Foxa1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15375,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 116,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Onecut1), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Onecut1)]",
        "geneSymbol": "Onecut1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15379,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 87,
        "geneKeggPathway": "[Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il4), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Il4), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il4), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Il4), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il4), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Il4), Phenylalanine, tyrosine and tryptophan biosynthesis(https://www.kegg.jp/pathway/map=map00400&keyword=Il4), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il4), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il4), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il4), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il4), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Il4), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il4), Alanine, aspartate and glutamate metabolism(https://www.kegg.jp/pathway/map=map00250&keyword=Il4), Cysteine and methionine metabolism(https://www.kegg.jp/pathway/map=map00270&keyword=Il4), Valine, leucine and isoleucine degradation(https://www.kegg.jp/pathway/map=map00280&keyword=Il4), Tyrosine metabolism(https://www.kegg.jp/pathway/map=map00350&keyword=Il4), Phenylalanine metabolism(https://www.kegg.jp/pathway/map=map00360&keyword=Il4), Tryptophan metabolism(https://www.kegg.jp/pathway/map=map00380&keyword=Il4)]",
        "geneSymbol": "Il4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16189,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16193,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 91,
        "geneKeggPathway": "[Fluid shear stress and atherosclerosis(https://www.kegg.jp/pathway/map=map05418&keyword=Klf2), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Klf2), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Klf2)]",
        "geneSymbol": "Klf2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16598,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 93,
        "geneKeggPathway": "[Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Lef1), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Lef1), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Lef1), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Lef1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Lef1), Melanogenesis(https://www.kegg.jp/pathway/map=map04916&keyword=Lef1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Lef1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Lef1), Salmonella infection(https://www.kegg.jp/pathway/map=map05132&keyword=Lef1), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Lef1), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Lef1), Endometrial cancer(https://www.kegg.jp/pathway/map=map05213&keyword=Lef1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=Lef1), Thyroid cancer(https://www.kegg.jp/pathway/map=map05216&keyword=Lef1), Basal cell carcinoma(https://www.kegg.jp/pathway/map=map05217&keyword=Lef1), Acute myeloid leukemia(https://www.kegg.jp/pathway/map=map05221&keyword=Lef1), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Lef1), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Lef1), Arrhythmogenic right ventricular cardiomyopathy(https://www.kegg.jp/pathway/map=map05412&keyword=Lef1)]",
        "geneSymbol": "Lef1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16842,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 94,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Lyl1)]",
        "geneSymbol": "Lyl1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17095,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 136,
        "geneKeggPathway": "[TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Smad2), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Smad2), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Smad2), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Smad2), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Smad2), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Smad2), Endocytosis(https://www.kegg.jp/pathway/map=map04144&keyword=Smad2), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Smad2), Relaxin signaling pathway(https://www.kegg.jp/pathway/map=map04926&keyword=Smad2), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Smad2), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Smad2), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Smad2), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Smad2), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=Smad2), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Smad2), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Smad2), Diabetic cardiomyopathy(https://www.kegg.jp/pathway/map=map05415&keyword=Smad2), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Smad2), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Smad2), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Smad2)]",
        "geneSymbol": "Smad2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17126,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 137,
        "geneKeggPathway": "[TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Smad3), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Smad3), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Smad3), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Smad3), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Smad3), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Smad3), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Smad3), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Smad3), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=Smad3), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Smad3), Endocytosis(https://www.kegg.jp/pathway/map=map04144&keyword=Smad3), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Smad3), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Smad3), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Smad3), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Smad3), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Smad3), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Smad3), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=Smad3), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Smad3), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Smad3)]",
        "geneSymbol": "Smad3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17127,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 138,
        "geneKeggPathway": "[Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=Smad4), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Smad4), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Smad4), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Smad4), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Smad4), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Smad4), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Smad4), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Smad4), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Smad4), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Smad4), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Smad4), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Smad4), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Smad4), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Smad4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Smad4), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=Smad4), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Smad4), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Smad4)]",
        "geneSymbol": "Smad4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17128,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 121,
        "geneKeggPathway": "[Ubiquitin mediated proteolysis(https://www.kegg.jp/pathway/map=map04120&keyword=Pias2), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Pias2)]",
        "geneSymbol": "Pias2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17344,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 98,
        "geneKeggPathway": "[ABC transporters(https://www.kegg.jp/pathway/map=map02010&keyword=Mnt), Other types of O-glycan biosynthesis(https://www.kegg.jp/pathway/map=map00514&keyword=Mnt), Two-component system(https://www.kegg.jp/pathway/map=map02020&keyword=Mnt)]",
        "geneSymbol": "Mnt",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17428,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 102,
        "geneKeggPathway": "[Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Mybl2)]",
        "geneSymbol": "Mybl2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17865,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 103,
        "geneKeggPathway": "[Neo<font color=\"red\">myc</font>in, kana<font color=\"red\">myc</font>in and gentamicin biosynthesis(https://www.kegg.jp/pathway/map=map00524&keyword=Myc), Vanco<font color=\"red\">myc</font>in resistance(https://www.kegg.jp/pathway/map=map01502&keyword=Myc), Arabinogalactan biosynthesis - <font color=\"red\">Myc</font>obacterium(https://www.kegg.jp/pathway/map=map00572&keyword=Myc), Strepto<font color=\"red\">myc</font>in biosynthesis(https://www.kegg.jp/pathway/map=map00521&keyword=Myc), Biosynthesis of ansa<font color=\"red\">myc</font>ins(https://www.kegg.jp/pathway/map=map01051&keyword=Myc), Rifa<font color=\"red\">myc</font>ins(https://www.kegg.jp/pathway/map=map07023&keyword=Myc), Biosynthesis of vanco<font color=\"red\">myc</font>in group antibiotics(https://www.kegg.jp/pathway/map=map01055&keyword=Myc), Acarbose and valida<font color=\"red\">myc</font>in biosynthesis(https://www.kegg.jp/pathway/map=map00525&keyword=Myc), Carbapenem biosynthesis(https://www.kegg.jp/pathway/map=map00332&keyword=Myc), Prodigiosin biosynthesis(https://www.kegg.jp/pathway/map=map00333&keyword=Myc), Central carbon metabolism in cancer(https://www.kegg.jp/pathway/map=map05230&keyword=Myc), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=Myc), Lipoarabinomannan (LAM) biosynthesis(https://www.kegg.jp/pathway/map=map00571&keyword=Myc), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Myc), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Myc), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Myc), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Myc), Penicillin and cephalosporin biosynthesis(https://www.kegg.jp/pathway/map=map00311&keyword=Myc), Biosynthesis of enediyne antibiotics(https://www.kegg.jp/pathway/map=map01059&keyword=Myc), Sulfur relay system(https://www.kegg.jp/pathway/map=map04122&keyword=Myc)]",
        "geneSymbol": "Myc",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17869,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 106,
        "geneKeggPathway": "[Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Nfe2l2), Fluid shear stress and atherosclerosis(https://www.kegg.jp/pathway/map=map05418&keyword=Nfe2l2), Protein processing in endoplasmic reticulum(https://www.kegg.jp/pathway/map=map04141&keyword=Nfe2l2), Longevity regulating pathway - worm(https://www.kegg.jp/pathway/map=map04212&keyword=Nfe2l2), Parkinson disease(https://www.kegg.jp/pathway/map=map05012&keyword=Nfe2l2), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Nfe2l2), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Nfe2l2), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfe2l2)]",
        "geneSymbol": "Nfe2l2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18024,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 109,
        "geneKeggPathway": "[Antigen processing and presentation(https://www.kegg.jp/pathway/map=map04612&keyword=Nfya), Spinocerebellar ataxia(https://www.kegg.jp/pathway/map=map05017&keyword=Nfya), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Nfya)]",
        "geneSymbol": "Nfya",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18044,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 111,
        "geneKeggPathway": "[Notch signaling pathway(https://www.kegg.jp/pathway/map=map04330&keyword=Notch1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Notch1), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Notch1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Notch1), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Notch1), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=Notch1), Dorso-ventral axis formation(https://www.kegg.jp/pathway/map=map04320&keyword=Notch1), Axon regeneration(https://www.kegg.jp/pathway/map=map04361&keyword=Notch1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Notch1), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=Notch1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Notch1)]",
        "geneSymbol": "Notch1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18128,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 118,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Pdx1)]",
        "geneSymbol": "Pdx1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18609,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 119,
        "geneKeggPathway": "[Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Pgr), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Pgr), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Pgr), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Pgr), Oocyte meiosis(https://www.kegg.jp/pathway/map=map04114&keyword=Pgr), Estrogen signaling pathway(https://www.kegg.jp/pathway/map=map04915&keyword=Pgr), Progesterone-mediated oocyte maturation(https://www.kegg.jp/pathway/map=map04914&keyword=Pgr), Viral replication(https://www.kegg.jp/pathway/map=map03240&keyword=Pgr)]",
        "geneSymbol": "Pgr",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18667,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 123,
        "geneKeggPathway": "[PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Ppara), Renin secretion(https://www.kegg.jp/pathway/map=map04924&keyword=Ppara), DNA replication(https://www.kegg.jp/pathway/map=map03030&keyword=Ppara), Proteasome(https://www.kegg.jp/pathway/map=map03050&keyword=Ppara), N-Glycan biosynthesis(https://www.kegg.jp/pathway/map=map00510&keyword=Ppara)]",
        "geneSymbol": "Ppara",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19013,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 124,
        "geneKeggPathway": "[PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Pparg), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Pparg), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Pparg), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Pparg), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Pparg), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Pparg), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Pparg), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Pparg), Insulin signaling pathway(https://www.kegg.jp/pathway/map=map04910&keyword=Pparg), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Pparg), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Pparg), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Pparg)]",
        "geneSymbol": "Pparg",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19016,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 125,
        "geneKeggPathway": "[AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Ppargc1a), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Ppargc1a), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Ppargc1a), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Ppargc1a), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Ppargc1a), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Ppargc1a), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Ppargc1a), Insulin signaling pathway(https://www.kegg.jp/pathway/map=map04910&keyword=Ppargc1a), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Ppargc1a), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Ppargc1a)]",
        "geneSymbol": "Ppargc1a",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19017,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 129,
        "geneKeggPathway": "[Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=Rb1), Carbon metabolism(https://www.kegg.jp/pathway/map=map01200&keyword=Rb1), Bacterial secretion system(https://www.kegg.jp/pathway/map=map03070&keyword=Rb1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Rb1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Rb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Rb1), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Rb1), mTOR signaling pathway(https://www.kegg.jp/pathway/map=map04150&keyword=Rb1), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Rb1), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Rb1), Calcium signaling pathway(https://www.kegg.jp/pathway/map=map04020&keyword=Rb1), Neuroactive ligand-receptor interaction(https://www.kegg.jp/pathway/map=map04080&keyword=Rb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Rb1), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Rb1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Rb1), Salivary secretion(https://www.kegg.jp/pathway/map=map04970&keyword=Rb1), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=Rb1), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Rb1), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=Rb1), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Rb1)]",
        "geneSymbol": "Rb1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19645,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 130,
        "geneKeggPathway": "[Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Rbl1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Rbl1), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Rbl1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Rbl1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Rbl1)]",
        "geneSymbol": "Rbl1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19650,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 131,
        "geneKeggPathway": "[NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Relb), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Relb), Antineoplastics - agents from natural products(https://www.kegg.jp/pathway/map=map07042&keyword=Relb), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=Relb), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Relb), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Relb), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Relb)]",
        "geneSymbol": "Relb",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19698,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 132,
        "geneKeggPathway": "[]",
        "geneSymbol": "Rnf2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19821,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 133,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Sin3a), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Sin3a), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Sin3a), Mitophagy - yeast(https://www.kegg.jp/pathway/map=map04139&keyword=Sin3a), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Sin3a)]",
        "geneSymbol": "Sin3a",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20466,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 140,
        "geneKeggPathway": "[]",
        "geneSymbol": "Sox11",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20666,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 143,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Stat1), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Stat1), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Stat1), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Stat1), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Stat1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Stat1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Stat1), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Stat1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Stat1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Stat1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Stat1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Stat1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Stat1), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Stat1), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Stat1), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=Stat1), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Stat1), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Stat1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Stat1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Stat1)]",
        "geneSymbol": "Stat1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20846,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 144,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Stat3), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Stat3), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Stat3), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Stat3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Stat3), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Stat3), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Stat3), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Stat3), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Stat3), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Stat3), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Stat3), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Stat3), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Stat3), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Stat3), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Stat3), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=Stat3), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Stat3), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Stat3), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Stat3), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Stat3)]",
        "geneSymbol": "Stat3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20848,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 145,
        "geneKeggPathway": "[JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Stat4), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Stat4), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Stat4), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=Stat4), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Stat4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Stat4)]",
        "geneSymbol": "Stat4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20849,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 74,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Hnf1a)]",
        "geneSymbol": "Hnf1a",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21405,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 75,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Hnf1b)]",
        "geneSymbol": "Hnf1b",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21410,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 148,
        "geneKeggPathway": "[]",
        "geneSymbol": "Tcf4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21413,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 165,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Zeb1), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Zeb1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=Zeb1)]",
        "geneSymbol": "Zeb1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21417,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 149,
        "geneKeggPathway": "[]",
        "geneSymbol": "Tfap2c",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21420,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 147,
        "geneKeggPathway": "[Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Tcf3), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Tcf3), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Tcf3)]",
        "geneSymbol": "Tcf3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21423,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 120,
        "geneKeggPathway": "[]",
        "geneSymbol": "Phf1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21652,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 150,
        "geneKeggPathway": "[Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Tfdp1), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Tfdp1)]",
        "geneSymbol": "Tfdp1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21781,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 153,
        "geneKeggPathway": "[Tight junction(https://www.kegg.jp/pathway/map=map04530&keyword=Tjp1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Tjp1), Gap junction(https://www.kegg.jp/pathway/map=map04540&keyword=Tjp1), Vibrio cholerae infection(https://www.kegg.jp/pathway/map=map05110&keyword=Tjp1), Epithelial cell signaling in Helicobacter pylori infection(https://www.kegg.jp/pathway/map=map05120&keyword=Tjp1), Pathogenic Escherichia coli infection(https://www.kegg.jp/pathway/map=map05130&keyword=Tjp1)]",
        "geneSymbol": "Tjp1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21872,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 157,
        "geneKeggPathway": "[<font color=\"red\">TNF</font> signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=TNF), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=TNF), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=TNF), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=TNF), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=TNF), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=TNF), Graft-versus-host disease(https://www.kegg.jp/pathway/map=map05332&keyword=TNF), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=TNF), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=TNF), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=TNF), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=TNF), Antifolate resistance(https://www.kegg.jp/pathway/map=map01523&keyword=TNF), Fc epsilon RI signaling pathway(https://www.kegg.jp/pathway/map=map04664&keyword=TNF), Type II diabetes mellitus(https://www.kegg.jp/pathway/map=map04930&keyword=TNF), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=TNF), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=TNF), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=TNF), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=TNF), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=TNF), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=TNF)]",
        "geneSymbol": "Tnf",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21926,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21939,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 158,
        "geneKeggPathway": "[]",
        "geneSymbol": "Tob1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22057,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 159,
        "geneKeggPathway": "[]",
        "geneSymbol": "Trp53",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22059,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 160,
        "geneKeggPathway": "[]",
        "geneSymbol": "Trp63",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22061,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 161,
        "geneKeggPathway": "[]",
        "geneSymbol": "Trp73",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22062,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 162,
        "geneKeggPathway": "[Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Vhl), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Vhl), Ubiquitin mediated proteolysis(https://www.kegg.jp/pathway/map=map04120&keyword=Vhl), Longevity regulating pathway - worm(https://www.kegg.jp/pathway/map=map04212&keyword=Vhl), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Vhl)]",
        "geneSymbol": "Vhl",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22346,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 163,
        "geneKeggPathway": "[]",
        "geneSymbol": "Yy1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22632,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 164,
        "geneKeggPathway": "[Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Zbtb17), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Zbtb17), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Zbtb17), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=Zbtb17)]",
        "geneSymbol": "Zbtb17",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22642,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 146,
        "geneKeggPathway": "[Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Taf4), Basal transcription factors(https://www.kegg.jp/pathway/map=map03022&keyword=Taf4)]",
        "geneSymbol": "Taf4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 228980,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 39,
        "geneKeggPathway": "[]",
        "geneSymbol": "Elp1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 230233,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 233079,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 233080,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 42,
        "geneKeggPathway": "[Ras signaling pathway(https://www.kegg.jp/pathway/map=map04014&keyword=Ets2), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Ets2)]",
        "geneSymbol": "Ets2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 23872,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 166,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Zeb2)]",
        "geneSymbol": "Zeb2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 24136,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 35,
        "geneKeggPathway": "[Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=E2f2), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=E2f2), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=E2f2), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=E2f2), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=E2f2), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=E2f2), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=E2f2), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=E2f2), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=E2f2), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=E2f2), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=E2f2), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=E2f2), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=E2f2), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=E2f2), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=E2f2), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=E2f2), Melanoma(https://www.kegg.jp/pathway/map=map05218&keyword=E2f2), Bladder cancer(https://www.kegg.jp/pathway/map=map05219&keyword=E2f2), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=E2f2), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=E2f2)]",
        "geneSymbol": "E2f2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 242705,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 10,
        "geneKeggPathway": "[Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Brd7)]",
        "geneSymbol": "Brd7",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 26992,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 72,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Hif1a), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Hif1a), Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Hif1a), Central carbon metabolism in cancer(https://www.kegg.jp/pathway/map=map05230&keyword=Hif1a), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Hif1a), Mitophagy - animal(https://www.kegg.jp/pathway/map=map04137&keyword=Hif1a), Autophagy - animal(https://www.kegg.jp/pathway/map=map04140&keyword=Hif1a), Longevity regulating pathway - worm(https://www.kegg.jp/pathway/map=map04212&keyword=Hif1a), Axon regeneration(https://www.kegg.jp/pathway/map=map04361&keyword=Hif1a), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Hif1a), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Hif1a), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Hif1a), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Hif1a), Choline metabolism in cancer(https://www.kegg.jp/pathway/map=map05231&keyword=Hif1a), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Hif1a)]",
        "geneSymbol": "Hif1a",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 29560,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 128,
        "geneKeggPathway": "[]",
        "geneSymbol": "Pttg1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 30939,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 40,
        "geneKeggPathway": "[Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Ep300), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Ep300), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Ep300), Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Ep300), Viral life cycle - HIV-1(https://www.kegg.jp/pathway/map=map03250&keyword=Ep300), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ep300), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Ep300), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Ep300), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Ep300), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Ep300), Notch signaling pathway(https://www.kegg.jp/pathway/map=map04330&keyword=Ep300), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Ep300), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Ep300), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Ep300), Long-term potentiation(https://www.kegg.jp/pathway/map=map04720&keyword=Ep300), Melanogenesis(https://www.kegg.jp/pathway/map=map04916&keyword=Ep300), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Ep300), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Ep300), Growth hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04935&keyword=Ep300), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Ep300)]",
        "geneSymbol": "Ep300",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 328572,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 77,
        "geneKeggPathway": "[Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=IFNG), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IFNG), Natural killer cell mediated cytotoxicity(https://www.kegg.jp/pathway/map=map04650&keyword=IFNG), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=IFNG), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=IFNG), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IFNG), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IFNG), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=IFNG), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IFNG), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=IFNG), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=IFNG), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=IFNG), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=IFNG), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=IFNG), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IFNG), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=IFNG), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IFNG), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=IFNG), Graft-versus-host disease(https://www.kegg.jp/pathway/map=map05332&keyword=IFNG), Proteasome(https://www.kegg.jp/pathway/map=map03050&keyword=IFNG)]",
        "geneSymbol": "IFNG",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3458,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 29,
        "geneKeggPathway": "[Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=CXCL8), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=CXCL8), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=CXCL8)]",
        "geneSymbol": "CXCL8",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3576,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 79,
        "geneKeggPathway": "[Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=IL10), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IL10), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IL10), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=IL10), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IL10), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IL10), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=IL10), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=IL10), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=IL10), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=IL10), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IL10), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IL10), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=IL10), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=IL10), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=IL10), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=IL10), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=IL10), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=IL10), Yersinia infection(https://www.kegg.jp/pathway/map=map05135&keyword=IL10), Staphylococcus aureus infection(https://www.kegg.jp/pathway/map=map05150&keyword=IL10)]",
        "geneSymbol": "IL10",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3586,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 80,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=IL12A), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=IL12A), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IL12A), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=IL12A), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IL12A), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IL12A), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=IL12A), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=IL12A), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=IL12A), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IL12A), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=IL12A), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=IL12A), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=IL12A), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=IL12A), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IL12A), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=IL12A), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=IL12A), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=IL12A), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IL12A), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=IL12A)]",
        "geneSymbol": "IL12A",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3592,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 82,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=IL12B), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=IL12B), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=IL12B), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IL12B), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IL12B), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=IL12B), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=IL12B), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IL12B), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=IL12B), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=IL12B), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IL12B), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=IL12B), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=IL12B), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=IL12B), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=IL12B), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IL12B), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=IL12B), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=IL12B), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IL12B), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=IL12B)]",
        "geneSymbol": "IL12B",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3593,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 67,
        "geneKeggPathway": "[Neutrophil extracellular trap formation(https://www.kegg.jp/pathway/map=map04613&keyword=Hdac1), Alcoholism(https://www.kegg.jp/pathway/map=map05034&keyword=Hdac1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Hdac1), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Hdac1), Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=Hdac1), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Hdac1), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Hdac1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Hdac1), Longevity regulating pathway - multiple species(https://www.kegg.jp/pathway/map=map04213&keyword=Hdac1), Notch signaling pathway(https://www.kegg.jp/pathway/map=map04330&keyword=Hdac1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Hdac1), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Hdac1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Hdac1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Hdac1), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=Hdac1)]",
        "geneSymbol": "Hdac1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 433759,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 108,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=NFKB1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=NFKB1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=NFKB1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=NFKB1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=NFKB1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=NFKB1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=NFKB1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=NFKB1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=NFKB1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=NFKB1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=NFKB1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=NFKB1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=NFKB1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=NFKB1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=NFKB1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=NFKB1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=NFKB1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=NFKB1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=NFKB1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=NFKB1)]",
        "geneSymbol": "NFKB1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 4790,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 45,
        "geneKeggPathway": "[Ubiquitin mediated proteolysis(https://www.kegg.jp/pathway/map=map04120&keyword=Fbxw7)]",
        "geneSymbol": "Fbxw7",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 50754,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 59,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=FOXP3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=FOXP3)]",
        "geneSymbol": "FOXP3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 50943,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 89,
        "geneKeggPathway": "[]",
        "geneSymbol": "Irf6",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 54139,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 57,
        "geneKeggPathway": "[FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Foxo4), Ras signaling pathway(https://www.kegg.jp/pathway/map=map04014&keyword=Foxo4), Shigellosis(https://www.kegg.jp/pathway/map=map05131&keyword=Foxo4)]",
        "geneSymbol": "Foxo4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 54601,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 56,
        "geneKeggPathway": "[FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Foxo1), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Foxo1), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Foxo1), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Foxo1), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Foxo1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Foxo1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Foxo1), Insulin signaling pathway(https://www.kegg.jp/pathway/map=map04910&keyword=Foxo1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Foxo1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Foxo1), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Foxo1), Longevity regulating pathway - multiple species(https://www.kegg.jp/pathway/map=map04213&keyword=Foxo1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Foxo1), Shigellosis(https://www.kegg.jp/pathway/map=map05131&keyword=Foxo1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Foxo1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=Foxo1)]",
        "geneSymbol": "Foxo1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 56458,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 122,
        "geneKeggPathway": "[]",
        "geneSymbol": "Plag1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 56711,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 2,
        "geneKeggPathway": "[PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Angptl4), Cholesterol metabolism(https://www.kegg.jp/pathway/map=map04979&keyword=Angptl4)]",
        "geneSymbol": "Angptl4",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 57875,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 104,
        "geneKeggPathway": "[]",
        "geneSymbol": "Nacc1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 66830,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 100,
        "geneKeggPathway": "[]",
        "geneSymbol": "Mtdh",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 67154,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 152,
        "geneKeggPathway": "[Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=TGFB1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=TGFB1), Diabetic cardiomyopathy(https://www.kegg.jp/pathway/map=map05415&keyword=TGFB1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=TGFB1), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=TGFB1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=TGFB1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=TGFB1), Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=TGFB1), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=TGFB1), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=TGFB1), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=TGFB1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=TGFB1), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=TGFB1), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=TGFB1), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=TGFB1), Relaxin signaling pathway(https://www.kegg.jp/pathway/map=map04926&keyword=TGFB1), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=TGFB1), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=TGFB1), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=TGFB1), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=TGFB1)]",
        "geneSymbol": "TGFB1",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 7040,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 80885,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 68,
        "geneKeggPathway": "[Neutrophil extracellular trap formation(https://www.kegg.jp/pathway/map=map04613&keyword=HDAC3), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=HDAC3), Alcoholism(https://www.kegg.jp/pathway/map=map05034&keyword=HDAC3), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=HDAC3)]",
        "geneSymbol": "HDAC3",
        "microbeId": 37099,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 8841,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 126,
        "geneKeggPathway": "[]",
        "geneSymbol": "Prkaa1",
        "microbeId": 20148,
        "microbeName": "Eubacterium",
        "ncbiGeneId": 105787,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 127,
        "geneKeggPathway": "[]",
        "geneSymbol": "Prkaa2",
        "microbeId": 20148,
        "microbeName": "Eubacterium",
        "ncbiGeneId": 108079,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 6,
        "geneKeggPathway": "[Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=BAX), Platinum drug resistance(https://www.kegg.jp/pathway/map=map01524&keyword=BAX), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=BAX), Sphingolipid signaling pathway(https://www.kegg.jp/pathway/map=map04071&keyword=BAX), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=BAX), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=BAX), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=BAX), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=BAX), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=BAX), Endometrial cancer(https://www.kegg.jp/pathway/map=map05213&keyword=BAX), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=BAX), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=BAX), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=BAX), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=BAX), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=BAX), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=BAX), p53 signaling pathway(https://www.kegg.jp/pathway/map=map04115&keyword=BAX), Protein processing in endoplasmic reticulum(https://www.kegg.jp/pathway/map=map04141&keyword=BAX), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=BAX), Apoptosis - multiple species(https://www.kegg.jp/pathway/map=map04215&keyword=BAX)]",
        "geneSymbol": "BAX",
        "microbeId": 20148,
        "microbeName": "Eubacterium",
        "ncbiGeneId": 581,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 7,
        "geneKeggPathway": "[EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=BCL2), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=BCL2), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=BCL2), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=BCL2), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=BCL2), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=BCL2), Apoptosis - multiple species(https://www.kegg.jp/pathway/map=map04215&keyword=BCL2), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=BCL2), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=BCL2), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=BCL2), Amyotrophic lateral sclerosis(https://www.kegg.jp/pathway/map=map05014&keyword=BCL2), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=BCL2), Shigellosis(https://www.kegg.jp/pathway/map=map05131&keyword=BCL2), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=BCL2), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=BCL2), Protein processing in endoplasmic reticulum(https://www.kegg.jp/pathway/map=map04141&keyword=BCL2), Hedgehog signaling pathway(https://www.kegg.jp/pathway/map=map04340&keyword=BCL2), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=BCL2), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=BCL2), p53 signaling pathway(https://www.kegg.jp/pathway/map=map04115&keyword=BCL2)]",
        "geneSymbol": "BCL2",
        "microbeId": 20148,
        "microbeName": "Eubacterium",
        "ncbiGeneId": 596,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 12,
        "geneKeggPathway": "[Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=CASP3), Apoptosis - multiple species(https://www.kegg.jp/pathway/map=map04215&keyword=CASP3), Alzheimer disease(https://www.kegg.jp/pathway/map=map05010&keyword=CASP3), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=CASP3), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=CASP3), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=CASP3), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=CASP3), Platinum drug resistance(https://www.kegg.jp/pathway/map=map01524&keyword=CASP3), p53 signaling pathway(https://www.kegg.jp/pathway/map=map04115&keyword=CASP3), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=CASP3), Natural killer cell mediated cytotoxicity(https://www.kegg.jp/pathway/map=map04650&keyword=CASP3), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=CASP3), Serotonergic synapse(https://www.kegg.jp/pathway/map=map04726&keyword=CASP3), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=CASP3), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=CASP3), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=CASP3), Parkinson disease(https://www.kegg.jp/pathway/map=map05012&keyword=CASP3), Amyotrophic lateral sclerosis(https://www.kegg.jp/pathway/map=map05014&keyword=CASP3), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=CASP3), Epithelial cell signaling in Helicobacter pylori infection(https://www.kegg.jp/pathway/map=map05120&keyword=CASP3)]",
        "geneSymbol": "CASP3",
        "microbeId": 20148,
        "microbeName": "Eubacterium",
        "ncbiGeneId": 836,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 24,
        "geneKeggPathway": "[Fatty acid metabolism(https://www.kegg.jp/pathway/map=map01212&keyword=Cpt1b), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Cpt1b), Diabetic cardiomyopathy(https://www.kegg.jp/pathway/map=map05415&keyword=Cpt1b), Fatty acid degradation(https://www.kegg.jp/pathway/map=map00071&keyword=Cpt1b), PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Cpt1b), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Cpt1b), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Cpt1b), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Cpt1b), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Cpt1b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Cpt1b)]",
        "geneSymbol": "Cpt1b",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 12895,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 31,
        "geneKeggPathway": "[Primary bile acid biosynthesis(https://www.kegg.jp/pathway/map=map00120&keyword=Cyp7a1), PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Cyp7a1), Bile secretion(https://www.kegg.jp/pathway/map=map04976&keyword=Cyp7a1), Cholesterol metabolism(https://www.kegg.jp/pathway/map=map04979&keyword=Cyp7a1), Steroid hormone biosynthesis(https://www.kegg.jp/pathway/map=map00140&keyword=Cyp7a1), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Cyp7a1)]",
        "geneSymbol": "Cyp7a1",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 13122,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 44,
        "geneKeggPathway": "[Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=Fas), Graft-versus-host disease(https://www.kegg.jp/pathway/map=map05332&keyword=Fas), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=Fas), Regulation of lipolysis in adipocytes(https://www.kegg.jp/pathway/map=map04923&keyword=Fas), GABAergic synapse(https://www.kegg.jp/pathway/map=map04727&keyword=Fas), Ferroptosis(https://www.kegg.jp/pathway/map=map04216&keyword=Fas), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Fas), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Fas), Cortisol synthesis and secretion(https://www.kegg.jp/pathway/map=map04927&keyword=Fas), Proteasome(https://www.kegg.jp/pathway/map=map03050&keyword=Fas), Base excision repair(https://www.kegg.jp/pathway/map=map03410&keyword=Fas), Calcium signaling pathway(https://www.kegg.jp/pathway/map=map04020&keyword=Fas), Glutamatergic synapse(https://www.kegg.jp/pathway/map=map04724&keyword=Fas), Phototransduction - fly(https://www.kegg.jp/pathway/map=map04745&keyword=Fas), GnRH signaling pathway(https://www.kegg.jp/pathway/map=map04912&keyword=Fas), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Fas), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Fas), Fat digestion and absorption(https://www.kegg.jp/pathway/map=map04975&keyword=Fas), Fatty acid metabolism(https://www.kegg.jp/pathway/map=map01212&keyword=Fas), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Fas)]",
        "geneSymbol": "Fas",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 14102,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 48,
        "geneKeggPathway": "[]",
        "geneSymbol": "Fgf15",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 14170,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 49,
        "geneKeggPathway": "[MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=Fgfr4), Ras signaling pathway(https://www.kegg.jp/pathway/map=map04014&keyword=Fgfr4), Rap1 signaling pathway(https://www.kegg.jp/pathway/map=map04015&keyword=Fgfr4), Calcium signaling pathway(https://www.kegg.jp/pathway/map=map04020&keyword=Fgfr4), Endocytosis(https://www.kegg.jp/pathway/map=map04144&keyword=Fgfr4), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Fgfr4), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Fgfr4), Regulation of actin cytoskeleton(https://www.kegg.jp/pathway/map=map04810&keyword=Fgfr4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Fgfr4)]",
        "geneSymbol": "Fgfr4",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 14186,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 61,
        "geneKeggPathway": "[Neuroactive ligand-receptor interaction(https://www.kegg.jp/pathway/map=map04080&keyword=Gcg), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Gcg), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Gcg), ABC transporters(https://www.kegg.jp/pathway/map=map02010&keyword=Gcg), Hypertrophic cardiomyopathy(https://www.kegg.jp/pathway/map=map05410&keyword=Gcg), Arrhythmogenic right ventricular cardiomyopathy(https://www.kegg.jp/pathway/map=map05412&keyword=Gcg), Dilated cardiomyopathy(https://www.kegg.jp/pathway/map=map05414&keyword=Gcg), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Gcg), Sphingolipid metabolism(https://www.kegg.jp/pathway/map=map00600&keyword=Gcg), Biosynthesis of enediyne antibiotics(https://www.kegg.jp/pathway/map=map01059&keyword=Gcg), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Gcg), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Gcg), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Gcg), Insulin secretion(https://www.kegg.jp/pathway/map=map04911&keyword=Gcg), Glycosphingolipid biosynthesis - lacto and neolacto series(https://www.kegg.jp/pathway/map=map00601&keyword=Gcg), Glycosphingolipid biosynthesis - globo and isoglobo series(https://www.kegg.jp/pathway/map=map00603&keyword=Gcg), Glycosphingolipid biosynthesis - ganglio series(https://www.kegg.jp/pathway/map=map00604&keyword=Gcg), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Gcg)]",
        "geneSymbol": "Gcg",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 14526,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 134,
        "geneKeggPathway": "[Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Sirpa)]",
        "geneSymbol": "Sirpa",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 19261,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 112,
        "geneKeggPathway": "[Bile secretion(https://www.kegg.jp/pathway/map=map04976&keyword=Nr1h4)]",
        "geneSymbol": "Nr1h4",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 20186,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 6,
        "geneKeggPathway": "[Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=BAX), Platinum drug resistance(https://www.kegg.jp/pathway/map=map01524&keyword=BAX), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=BAX), Sphingolipid signaling pathway(https://www.kegg.jp/pathway/map=map04071&keyword=BAX), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=BAX), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=BAX), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=BAX), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=BAX), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=BAX), Endometrial cancer(https://www.kegg.jp/pathway/map=map05213&keyword=BAX), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=BAX), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=BAX), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=BAX), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=BAX), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=BAX), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=BAX), p53 signaling pathway(https://www.kegg.jp/pathway/map=map04115&keyword=BAX), Protein processing in endoplasmic reticulum(https://www.kegg.jp/pathway/map=map04141&keyword=BAX), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=BAX), Apoptosis - multiple species(https://www.kegg.jp/pathway/map=map04215&keyword=BAX)]",
        "geneSymbol": "BAX",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 581,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 7,
        "geneKeggPathway": "[EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=BCL2), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=BCL2), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=BCL2), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=BCL2), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=BCL2), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=BCL2), Apoptosis - multiple species(https://www.kegg.jp/pathway/map=map04215&keyword=BCL2), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=BCL2), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=BCL2), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=BCL2), Amyotrophic lateral sclerosis(https://www.kegg.jp/pathway/map=map05014&keyword=BCL2), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=BCL2), Shigellosis(https://www.kegg.jp/pathway/map=map05131&keyword=BCL2), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=BCL2), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=BCL2), Protein processing in endoplasmic reticulum(https://www.kegg.jp/pathway/map=map04141&keyword=BCL2), Hedgehog signaling pathway(https://www.kegg.jp/pathway/map=map04340&keyword=BCL2), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=BCL2), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=BCL2), p53 signaling pathway(https://www.kegg.jp/pathway/map=map04115&keyword=BCL2)]",
        "geneSymbol": "BCL2",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 596,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 12,
        "geneKeggPathway": "[Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=CASP3), Apoptosis - multiple species(https://www.kegg.jp/pathway/map=map04215&keyword=CASP3), Alzheimer disease(https://www.kegg.jp/pathway/map=map05010&keyword=CASP3), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=CASP3), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=CASP3), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=CASP3), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=CASP3), Platinum drug resistance(https://www.kegg.jp/pathway/map=map01524&keyword=CASP3), p53 signaling pathway(https://www.kegg.jp/pathway/map=map04115&keyword=CASP3), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=CASP3), Natural killer cell mediated cytotoxicity(https://www.kegg.jp/pathway/map=map04650&keyword=CASP3), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=CASP3), Serotonergic synapse(https://www.kegg.jp/pathway/map=map04726&keyword=CASP3), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=CASP3), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=CASP3), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=CASP3), Parkinson disease(https://www.kegg.jp/pathway/map=map05012&keyword=CASP3), Amyotrophic lateral sclerosis(https://www.kegg.jp/pathway/map=map05014&keyword=CASP3), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=CASP3), Epithelial cell signaling in Helicobacter pylori infection(https://www.kegg.jp/pathway/map=map05120&keyword=CASP3)]",
        "geneSymbol": "CASP3",
        "microbeId": 20118,
        "microbeName": "Bacteroides",
        "ncbiGeneId": 836,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 1,
        "geneKeggPathway": "[Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Ahr), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Ahr), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Ahr), Geraniol degradation(https://www.kegg.jp/pathway/map=map00281&keyword=Ahr), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Ahr), Glycolysis / Gluconeogenesis(https://www.kegg.jp/pathway/map=map00010&keyword=Ahr), Pyruvate metabolism(https://www.kegg.jp/pathway/map=map00620&keyword=Ahr), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Ahr), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Ahr), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Ahr)]",
        "geneSymbol": "Ahr",
        "microbeId": 11794,
        "microbeName": "Desulfovibrionaceae",
        "ncbiGeneId": 11622,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 24,
        "geneKeggPathway": "[Fatty acid metabolism(https://www.kegg.jp/pathway/map=map01212&keyword=Cpt1b), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Cpt1b), Diabetic cardiomyopathy(https://www.kegg.jp/pathway/map=map05415&keyword=Cpt1b), Fatty acid degradation(https://www.kegg.jp/pathway/map=map00071&keyword=Cpt1b), PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Cpt1b), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Cpt1b), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Cpt1b), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Cpt1b), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Cpt1b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Cpt1b)]",
        "geneSymbol": "Cpt1b",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 12895,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 31,
        "geneKeggPathway": "[Primary bile acid biosynthesis(https://www.kegg.jp/pathway/map=map00120&keyword=Cyp7a1), PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Cyp7a1), Bile secretion(https://www.kegg.jp/pathway/map=map04976&keyword=Cyp7a1), Cholesterol metabolism(https://www.kegg.jp/pathway/map=map04979&keyword=Cyp7a1), Steroid hormone biosynthesis(https://www.kegg.jp/pathway/map=map00140&keyword=Cyp7a1), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Cyp7a1)]",
        "geneSymbol": "Cyp7a1",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 13122,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 44,
        "geneKeggPathway": "[Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=Fas), Graft-versus-host disease(https://www.kegg.jp/pathway/map=map05332&keyword=Fas), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=Fas), Regulation of lipolysis in adipocytes(https://www.kegg.jp/pathway/map=map04923&keyword=Fas), GABAergic synapse(https://www.kegg.jp/pathway/map=map04727&keyword=Fas), Ferroptosis(https://www.kegg.jp/pathway/map=map04216&keyword=Fas), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Fas), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Fas), Cortisol synthesis and secretion(https://www.kegg.jp/pathway/map=map04927&keyword=Fas), Proteasome(https://www.kegg.jp/pathway/map=map03050&keyword=Fas), Base excision repair(https://www.kegg.jp/pathway/map=map03410&keyword=Fas), Calcium signaling pathway(https://www.kegg.jp/pathway/map=map04020&keyword=Fas), Glutamatergic synapse(https://www.kegg.jp/pathway/map=map04724&keyword=Fas), Phototransduction - fly(https://www.kegg.jp/pathway/map=map04745&keyword=Fas), GnRH signaling pathway(https://www.kegg.jp/pathway/map=map04912&keyword=Fas), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Fas), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Fas), Fat digestion and absorption(https://www.kegg.jp/pathway/map=map04975&keyword=Fas), Fatty acid metabolism(https://www.kegg.jp/pathway/map=map01212&keyword=Fas), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Fas)]",
        "geneSymbol": "Fas",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 14102,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 48,
        "geneKeggPathway": "[]",
        "geneSymbol": "Fgf15",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 14170,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 49,
        "geneKeggPathway": "[MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=Fgfr4), Ras signaling pathway(https://www.kegg.jp/pathway/map=map04014&keyword=Fgfr4), Rap1 signaling pathway(https://www.kegg.jp/pathway/map=map04015&keyword=Fgfr4), Calcium signaling pathway(https://www.kegg.jp/pathway/map=map04020&keyword=Fgfr4), Endocytosis(https://www.kegg.jp/pathway/map=map04144&keyword=Fgfr4), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Fgfr4), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Fgfr4), Regulation of actin cytoskeleton(https://www.kegg.jp/pathway/map=map04810&keyword=Fgfr4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Fgfr4)]",
        "geneSymbol": "Fgfr4",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 14186,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 134,
        "geneKeggPathway": "[Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Sirpa)]",
        "geneSymbol": "Sirpa",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 19261,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 112,
        "geneKeggPathway": "[Bile secretion(https://www.kegg.jp/pathway/map=map04976&keyword=Nr1h4)]",
        "geneSymbol": "Nr1h4",
        "microbeId": 11784,
        "microbeName": "Bacteroidaceae",
        "ncbiGeneId": 20186,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 53,
        "geneKeggPathway": "[Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=FOS), Phosphonate and phosphinate metabolism(https://www.kegg.jp/pathway/map=map00440&keyword=FOS), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=FOS), Drug metabolism - cytochrome P450(https://www.kegg.jp/pathway/map=map00982&keyword=FOS), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=FOS), Anti-HIV agents(https://www.kegg.jp/pathway/map=map07053&keyword=FOS), HIV protease inhibitors(https://www.kegg.jp/pathway/map=map07218&keyword=FOS), Anticonvulsants(https://www.kegg.jp/pathway/map=map07033&keyword=FOS), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=FOS), Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=FOS), Growth hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04935&keyword=FOS), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=FOS), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=FOS), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=FOS), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=FOS), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=FOS), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=FOS), Hypnotics(https://www.kegg.jp/pathway/map=map07032&keyword=FOS), Antiviral agents(https://www.kegg.jp/pathway/map=map07044&keyword=FOS), Renin-angiotensin system inhibitors(https://www.kegg.jp/pathway/map=map07217&keyword=FOS)]",
        "geneSymbol": "FOS",
        "microbeId": 2320,
        "microbeName": "Fusobacteriia",
        "ncbiGeneId": 2353,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 90,
        "geneKeggPathway": "[Gap <font color=\"red\">jun</font>ction(https://www.kegg.jp/pathway/map=map04540&keyword=JUN), Tight <font color=\"red\">jun</font>ction(https://www.kegg.jp/pathway/map=map04530&keyword=JUN), Adherens <font color=\"red\">jun</font>ction(https://www.kegg.jp/pathway/map=map04520&keyword=JUN), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=JUN), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=JUN), Focal adhesion(https://www.kegg.jp/pathway/map=map04510&keyword=JUN), GnRH signaling pathway(https://www.kegg.jp/pathway/map=map04912&keyword=JUN), MAPK signaling pathway - fly(https://www.kegg.jp/pathway/map=map04013&keyword=JUN), Homologous recombination(https://www.kegg.jp/pathway/map=map03440&keyword=JUN), Vibrio cholerae infection(https://www.kegg.jp/pathway/map=map05110&keyword=JUN), Carbon fixation pathways in prokaryotes(https://www.kegg.jp/pathway/map=map00720&keyword=JUN), mRNA surveillance pathway(https://www.kegg.jp/pathway/map=map03015&keyword=JUN), Rap1 signaling pathway(https://www.kegg.jp/pathway/map=map04015&keyword=JUN), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=JUN), Cardiac muscle contraction(https://www.kegg.jp/pathway/map=map04260&keyword=JUN), Leukocyte transendothelial migration(https://www.kegg.jp/pathway/map=map04670&keyword=JUN), Long-term depression(https://www.kegg.jp/pathway/map=map04730&keyword=JUN), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=JUN), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=JUN), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=JUN)]",
        "geneSymbol": "JUN",
        "microbeId": 2320,
        "microbeName": "Fusobacteriia",
        "ncbiGeneId": 3725,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 95,
        "geneKeggPathway": "[IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=MAPK1), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=MAPK1), Oocyte meiosis(https://www.kegg.jp/pathway/map=map04114&keyword=MAPK1)]",
        "geneSymbol": "MAPK1",
        "microbeId": 2320,
        "microbeName": "Fusobacteriia",
        "ncbiGeneId": 5594,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 97,
        "geneKeggPathway": "[]",
        "geneSymbol": "MAPK3",
        "microbeId": 2320,
        "microbeName": "Fusobacteriia",
        "ncbiGeneId": 5595,
        "swineIndex": 26
    },
    {
        "response count": 138,
        "response time": "0.523s"
    }
]
```

### Q3 A1组，出栏时（180日龄）的猪相比于生长育肥中期（131日龄）的猪，肠道微生物组成和功能有什么差异？
#### Datalog
```
?(Microbe_name,Gene_symbol,Gene_kegg_pathway):-
relationship:is_host_of(Swine_index,Microbe_id,<131>),
attribute:group(Microbe_id,<A1>),
attribute:p_age_difference(Microbe_id,<1>),
attribute:microbe_name(Microbe_id,Microbe_name),
attribute:microbe_time(Microbe_id,<131>),
relationship:changes_the_expression_by_microbiota(Microbe_id,Ncbi_gene_id,<change_the_expression_by_microbiota>),
attribute:gene_symbol(Ncbi_gene_id,Gene_symbol),
relationship:has_gene_kegg_info(Ncbi_gene_id,Gene_kegg_id,<has_gene_kegg_info>),
attribute:gene_kegg_pathway(Gene_kegg_id,Gene_kegg_pathway).
```
#### 映射规则
```
{
  "rules":{
    "relationship": {
      "is_host_of": "is_host_of",
      "changes_the_expression_by_microbiota": "changes_the_expression_by_microbiota",
      "has_gene_kegg_info": "has_gene_kegg_info"
    },
    "attribute": {
      "p_value_dpf_tpf_difference": "fsmm.microbe.microbe_dpf_tpf_difference",
      "microbe_time": "fsmm.microbe.days",
      "group": "fsmm.microbe.col",
      "p_age_difference": "fsmm.microbe.microbe_age_difference",
      "metabolome_difference": "fsmm.metabolism.metabolome_difference",
      "metabolism_time": "metabolism_time"
    }
  }
}
```

#### 查询结果
```
[
    {
        "geneKeggIndex": 81,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il12b), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il12b), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=Il12b), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il12b), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Il12b), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Il12b), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Il12b), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il12b), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Il12b), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=Il12b), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il12b), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il12b), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Il12b), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=Il12b), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=Il12b), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Il12b), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=Il12b), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=Il12b), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Il12b), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Il12b)]",
        "geneSymbol": "Il12b",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16160,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 16193,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 107,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Nfkb1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Nfkb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Nfkb1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Nfkb1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfkb1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Nfkb1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Nfkb1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Nfkb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Nfkb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Nfkb1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Nfkb1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Nfkb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Nfkb1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Nfkb1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Nfkb1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Nfkb1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Nfkb1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Nfkb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Nfkb1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=Nfkb1)]",
        "geneSymbol": "Nfkb1",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 18033,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 58,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Foxp3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Foxp3)]",
        "geneSymbol": "Foxp3",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 20371,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 21939,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233079,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 233080,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 52419,
        "microbeName": "Ruminococcus_bromii",
        "ncbiGeneId": 80885,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 1,
        "geneKeggPathway": "[Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Ahr), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Ahr), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Ahr), Geraniol degradation(https://www.kegg.jp/pathway/map=map00281&keyword=Ahr), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Ahr), Glycolysis / Gluconeogenesis(https://www.kegg.jp/pathway/map=map00010&keyword=Ahr), Pyruvate metabolism(https://www.kegg.jp/pathway/map=map00620&keyword=Ahr), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Ahr), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Ahr), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Ahr)]",
        "geneSymbol": "Ahr",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11622,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 99,
        "geneKeggPathway": "[Carbon metabolism(https://www.kegg.jp/pathway/map=map01200&keyword=Mta1), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Mta1), Carbon fixation pathways in prokaryotes(https://www.kegg.jp/pathway/map=map00720&keyword=Mta1), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Mta1), C5-Branched dibasic acid metabolism(https://www.kegg.jp/pathway/map=map00660&keyword=Mta1)]",
        "geneSymbol": "Mta1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 116870,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 4,
        "geneKeggPathway": "[Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Arnt), Lipopolysaccharide biosynthesis(https://www.kegg.jp/pathway/map=map00540&keyword=Arnt), Cationic antimicrobial peptide (CAMP) resistance(https://www.kegg.jp/pathway/map=map01503&keyword=Arnt), Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Arnt), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Arnt), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Arnt), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Arnt), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Arnt), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Arnt), Circadian rhythm - fly(https://www.kegg.jp/pathway/map=map04711&keyword=Arnt), Dopaminergic synapse(https://www.kegg.jp/pathway/map=map04728&keyword=Arnt), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Arnt)]",
        "geneSymbol": "Arnt",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11863,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 5,
        "geneKeggPathway": "[]",
        "geneSymbol": "Atf3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11910,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 105,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Neurog3)]",
        "geneSymbol": "Neurog3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 11925,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 8,
        "geneKeggPathway": "[FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Bcl6), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Bcl6), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Bcl6)]",
        "geneSymbol": "Bcl6",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12053,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 9,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Bmi1)]",
        "geneSymbol": "Bmi1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12151,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 92,
        "geneKeggPathway": "[Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Klf5)]",
        "geneSymbol": "Klf5",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12224,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 27,
        "geneKeggPathway": "[Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Ctnnb1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Ctnnb1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Ctnnb1), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Ctnnb1), Endometrial cancer(https://www.kegg.jp/pathway/map=map05213&keyword=Ctnnb1), Rap1 signaling pathway(https://www.kegg.jp/pathway/map=map04015&keyword=Ctnnb1), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Ctnnb1), Leukocyte transendothelial migration(https://www.kegg.jp/pathway/map=map04670&keyword=Ctnnb1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Ctnnb1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Ctnnb1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Ctnnb1), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Ctnnb1), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Ctnnb1), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Ctnnb1), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Ctnnb1), Focal adhesion(https://www.kegg.jp/pathway/map=map04510&keyword=Ctnnb1), Melanogenesis(https://www.kegg.jp/pathway/map=map04916&keyword=Ctnnb1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Ctnnb1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Ctnnb1), Alzheimer disease(https://www.kegg.jp/pathway/map=map05010&keyword=Ctnnb1)]",
        "geneSymbol": "Ctnnb1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12387,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 18,
        "geneKeggPathway": "[]",
        "geneSymbol": "Cdx1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12590,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 19,
        "geneKeggPathway": "[Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Cdx2)]",
        "geneSymbol": "Cdx2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12591,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 22,
        "geneKeggPathway": "[Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Clock), Circadian rhythm - fly(https://www.kegg.jp/pathway/map=map04711&keyword=Clock), Circadian entrainment(https://www.kegg.jp/pathway/map=map04713&keyword=Clock), Circadian rhythm - plant(https://www.kegg.jp/pathway/map=map04712&keyword=Clock), Dopaminergic synapse(https://www.kegg.jp/pathway/map=map04728&keyword=Clock)]",
        "geneSymbol": "Clock",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12753,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 25,
        "geneKeggPathway": "[Estrogen signaling pathway(https://www.kegg.jp/pathway/map=map04915&keyword=Creb1), Circadian entrainment(https://www.kegg.jp/pathway/map=map04713&keyword=Creb1), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Creb1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Creb1), Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=Creb1), Alcoholism(https://www.kegg.jp/pathway/map=map05034&keyword=Creb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Creb1), cGMP-PKG signaling pathway(https://www.kegg.jp/pathway/map=map04022&keyword=Creb1), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Creb1), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Creb1), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Creb1), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Creb1), Adrenergic signaling in cardiomyocytes(https://www.kegg.jp/pathway/map=map04261&keyword=Creb1), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Creb1), Antigen processing and presentation(https://www.kegg.jp/pathway/map=map04612&keyword=Creb1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Creb1), Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Creb1), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Creb1), Cholinergic synapse(https://www.kegg.jp/pathway/map=map04725&keyword=Creb1), Dopaminergic synapse(https://www.kegg.jp/pathway/map=map04728&keyword=Creb1)]",
        "geneSymbol": "Creb1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12912,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 26,
        "geneKeggPathway": "[Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=Crem), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Crem), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Crem), Biosynthesis of various antibiotics(https://www.kegg.jp/pathway/map=map00998&keyword=Crem), Adrenergic signaling in cardiomyocytes(https://www.kegg.jp/pathway/map=map04261&keyword=Crem)]",
        "geneSymbol": "Crem",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 12916,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 32,
        "geneKeggPathway": "[Amyotrophic lateral sclerosis(https://www.kegg.jp/pathway/map=map05014&keyword=Dbp), Pathways of neurodegeneration - multiple diseases(https://www.kegg.jp/pathway/map=map05022&keyword=Dbp), Circadian rhythm(https://www.kegg.jp/pathway/map=map04710&keyword=Dbp), mRNA surveillance pathway(https://www.kegg.jp/pathway/map=map03015&keyword=Dbp), Viral life cycle - HIV-1(https://www.kegg.jp/pathway/map=map03250&keyword=Dbp), Peroxisome(https://www.kegg.jp/pathway/map=map04146&keyword=Dbp), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Dbp)]",
        "geneSymbol": "Dbp",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13170,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 34,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=E2f1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=E2f1), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=E2f1), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=E2f1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=E2f1), Mitophagy - animal(https://www.kegg.jp/pathway/map=map04137&keyword=E2f1), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=E2f1), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=E2f1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=E2f1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=E2f1), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=E2f1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=E2f1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=E2f1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=E2f1), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=E2f1), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=E2f1), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=E2f1), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=E2f1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=E2f1), Melanoma(https://www.kegg.jp/pathway/map=map05218&keyword=E2f1)]",
        "geneSymbol": "E2f1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13555,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 36,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=E2f3), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=E2f3), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=E2f3), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=E2f3), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=E2f3), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=E2f3), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=E2f3), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=E2f3), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=E2f3), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=E2f3), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=E2f3), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=E2f3), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=E2f3), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=E2f3), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=E2f3), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=E2f3), Melanoma(https://www.kegg.jp/pathway/map=map05218&keyword=E2f3), Bladder cancer(https://www.kegg.jp/pathway/map=map05219&keyword=E2f3), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=E2f3), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=E2f3)]",
        "geneSymbol": "E2f3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13557,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 38,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Egr1), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Egr1), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=Egr1), GnRH signaling pathway(https://www.kegg.jp/pathway/map=map04912&keyword=Egr1), Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=Egr1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Egr1), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Egr1)]",
        "geneSymbol": "Egr1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13653,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 41,
        "geneKeggPathway": "[Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=Esr1), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Esr1), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Esr1), Estrogen signaling pathway(https://www.kegg.jp/pathway/map=map04915&keyword=Esr1), Prolactin signaling pathway(https://www.kegg.jp/pathway/map=map04917&keyword=Esr1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Esr1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Esr1), Endocrine and other factor-regulated calcium reabsorption(https://www.kegg.jp/pathway/map=map04961&keyword=Esr1), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Esr1)]",
        "geneSymbol": "Esr1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 13982,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 43,
        "geneKeggPathway": "[Lysine degradation(https://www.kegg.jp/pathway/map=map00310&keyword=Ezh2), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Ezh2), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Ezh2)]",
        "geneSymbol": "Ezh2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14056,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 55,
        "geneKeggPathway": "[Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Foxm1)]",
        "geneSymbol": "Foxm1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14235,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 50,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Fli1)]",
        "geneSymbol": "Fli1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14247,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 52,
        "geneKeggPathway": "[Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=Fos), Phosphonate and phosphinate metabolism(https://www.kegg.jp/pathway/map=map00440&keyword=Fos), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Fos), Drug metabolism - cytochrome P450(https://www.kegg.jp/pathway/map=map00982&keyword=Fos), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Fos), Anti-HIV agents(https://www.kegg.jp/pathway/map=map07053&keyword=Fos), HIV protease inhibitors(https://www.kegg.jp/pathway/map=map07218&keyword=Fos), Anticonvulsants(https://www.kegg.jp/pathway/map=map07033&keyword=Fos), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=Fos), Parathyroid hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04928&keyword=Fos), Growth hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04935&keyword=Fos), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=Fos), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=Fos), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=Fos), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Fos), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Fos), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Fos), Hypnotics(https://www.kegg.jp/pathway/map=map07032&keyword=Fos), Antiviral agents(https://www.kegg.jp/pathway/map=map07044&keyword=Fos), Renin-angiotensin system inhibitors(https://www.kegg.jp/pathway/map=map07217&keyword=Fos)]",
        "geneSymbol": "Fos",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14281,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 60,
        "geneKeggPathway": "[Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Gata4), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Gata4), cGMP-PKG signaling pathway(https://www.kegg.jp/pathway/map=map04022&keyword=Gata4), Tight junction(https://www.kegg.jp/pathway/map=map04530&keyword=Gata4)]",
        "geneSymbol": "Gata4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14463,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 101,
        "geneKeggPathway": "[]",
        "geneSymbol": "Mtpn",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14489,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 62,
        "geneKeggPathway": "[]",
        "geneSymbol": "Gfi1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14581,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 63,
        "geneKeggPathway": "[Hedgehog signaling pathway(https://www.kegg.jp/pathway/map=map04340&keyword=Gli1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Gli1), Basal cell carcinoma(https://www.kegg.jp/pathway/map=map05217&keyword=Gli1), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Gli1)]",
        "geneSymbol": "Gli1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14632,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 114,
        "geneKeggPathway": "[Neuroactive ligand-receptor interaction(https://www.kegg.jp/pathway/map=map04080&keyword=Nr3c1)]",
        "geneSymbol": "Nr3c1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 14815,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 69,
        "geneKeggPathway": "[]",
        "geneSymbol": "Hdac5",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15184,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 70,
        "geneKeggPathway": "[]",
        "geneSymbol": "Hey1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15213,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 71,
        "geneKeggPathway": "[]",
        "geneSymbol": "Hic1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15248,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 54,
        "geneKeggPathway": "[]",
        "geneSymbol": "Foxa1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15375,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 116,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Onecut1), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Onecut1)]",
        "geneSymbol": "Onecut1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 15379,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 87,
        "geneKeggPathway": "[Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il4), Metabolic pathways(https://www.kegg.jp/pathway/map=map01100&keyword=Il4), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il4), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Il4), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Il4), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Il4), Phenylalanine, tyrosine and tryptophan biosynthesis(https://www.kegg.jp/pathway/map=map00400&keyword=Il4), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il4), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il4), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il4), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il4), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Il4), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Il4), Alanine, aspartate and glutamate metabolism(https://www.kegg.jp/pathway/map=map00250&keyword=Il4), Cysteine and methionine metabolism(https://www.kegg.jp/pathway/map=map00270&keyword=Il4), Valine, leucine and isoleucine degradation(https://www.kegg.jp/pathway/map=map00280&keyword=Il4), Tyrosine metabolism(https://www.kegg.jp/pathway/map=map00350&keyword=Il4), Phenylalanine metabolism(https://www.kegg.jp/pathway/map=map00360&keyword=Il4), Tryptophan metabolism(https://www.kegg.jp/pathway/map=map00380&keyword=Il4)]",
        "geneSymbol": "Il4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16189,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 88,
        "geneKeggPathway": "[Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Il6), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Il6), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Il6), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=Il6), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Il6), Hematopoietic cell lineage(https://www.kegg.jp/pathway/map=map04640&keyword=Il6), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Il6), Rheumatoid arthritis(https://www.kegg.jp/pathway/map=map05323&keyword=Il6), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Il6), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Il6), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Il6), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=Il6), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Il6), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Il6), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Il6), PI3K-Akt signaling pathway(https://www.kegg.jp/pathway/map=map04151&keyword=Il6), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=Il6), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=Il6), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Il6), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Il6)]",
        "geneSymbol": "Il6",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16193,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 91,
        "geneKeggPathway": "[Fluid shear stress and atherosclerosis(https://www.kegg.jp/pathway/map=map05418&keyword=Klf2), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Klf2), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Klf2)]",
        "geneSymbol": "Klf2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16598,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 93,
        "geneKeggPathway": "[Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Lef1), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Lef1), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Lef1), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Lef1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Lef1), Melanogenesis(https://www.kegg.jp/pathway/map=map04916&keyword=Lef1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Lef1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Lef1), Salmonella infection(https://www.kegg.jp/pathway/map=map05132&keyword=Lef1), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Lef1), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Lef1), Endometrial cancer(https://www.kegg.jp/pathway/map=map05213&keyword=Lef1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=Lef1), Thyroid cancer(https://www.kegg.jp/pathway/map=map05216&keyword=Lef1), Basal cell carcinoma(https://www.kegg.jp/pathway/map=map05217&keyword=Lef1), Acute myeloid leukemia(https://www.kegg.jp/pathway/map=map05221&keyword=Lef1), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Lef1), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Lef1), Arrhythmogenic right ventricular cardiomyopathy(https://www.kegg.jp/pathway/map=map05412&keyword=Lef1)]",
        "geneSymbol": "Lef1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 16842,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 94,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Lyl1)]",
        "geneSymbol": "Lyl1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17095,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 136,
        "geneKeggPathway": "[TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Smad2), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Smad2), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Smad2), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Smad2), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Smad2), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Smad2), Endocytosis(https://www.kegg.jp/pathway/map=map04144&keyword=Smad2), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Smad2), Relaxin signaling pathway(https://www.kegg.jp/pathway/map=map04926&keyword=Smad2), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Smad2), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=Smad2), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Smad2), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Smad2), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=Smad2), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Smad2), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Smad2), Diabetic cardiomyopathy(https://www.kegg.jp/pathway/map=map05415&keyword=Smad2), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Smad2), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Smad2), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Smad2)]",
        "geneSymbol": "Smad2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17126,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 137,
        "geneKeggPathway": "[TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Smad3), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Smad3), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Smad3), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Smad3), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Smad3), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Smad3), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Smad3), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Smad3), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=Smad3), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Smad3), Endocytosis(https://www.kegg.jp/pathway/map=map04144&keyword=Smad3), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Smad3), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Smad3), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Smad3), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Smad3), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Smad3), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Smad3), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=Smad3), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Smad3), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Smad3)]",
        "geneSymbol": "Smad3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17127,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 138,
        "geneKeggPathway": "[Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=Smad4), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Smad4), Colorectal cancer(https://www.kegg.jp/pathway/map=map05210&keyword=Smad4), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=Smad4), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Smad4), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Smad4), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Smad4), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Smad4), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Smad4), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Smad4), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Smad4), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Smad4), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Smad4), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Smad4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Smad4), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=Smad4), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Smad4), Gastric cancer(https://www.kegg.jp/pathway/map=map05226&keyword=Smad4)]",
        "geneSymbol": "Smad4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17128,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 121,
        "geneKeggPathway": "[Ubiquitin mediated proteolysis(https://www.kegg.jp/pathway/map=map04120&keyword=Pias2), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Pias2)]",
        "geneSymbol": "Pias2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17344,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 98,
        "geneKeggPathway": "[ABC transporters(https://www.kegg.jp/pathway/map=map02010&keyword=Mnt), Other types of O-glycan biosynthesis(https://www.kegg.jp/pathway/map=map00514&keyword=Mnt), Two-component system(https://www.kegg.jp/pathway/map=map02020&keyword=Mnt)]",
        "geneSymbol": "Mnt",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17428,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 102,
        "geneKeggPathway": "[Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Mybl2)]",
        "geneSymbol": "Mybl2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17865,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 103,
        "geneKeggPathway": "[Neo<font color=\"red\">myc</font>in, kana<font color=\"red\">myc</font>in and gentamicin biosynthesis(https://www.kegg.jp/pathway/map=map00524&keyword=Myc), Vanco<font color=\"red\">myc</font>in resistance(https://www.kegg.jp/pathway/map=map01502&keyword=Myc), Arabinogalactan biosynthesis - <font color=\"red\">Myc</font>obacterium(https://www.kegg.jp/pathway/map=map00572&keyword=Myc), Strepto<font color=\"red\">myc</font>in biosynthesis(https://www.kegg.jp/pathway/map=map00521&keyword=Myc), Biosynthesis of ansa<font color=\"red\">myc</font>ins(https://www.kegg.jp/pathway/map=map01051&keyword=Myc), Rifa<font color=\"red\">myc</font>ins(https://www.kegg.jp/pathway/map=map07023&keyword=Myc), Biosynthesis of vanco<font color=\"red\">myc</font>in group antibiotics(https://www.kegg.jp/pathway/map=map01055&keyword=Myc), Acarbose and valida<font color=\"red\">myc</font>in biosynthesis(https://www.kegg.jp/pathway/map=map00525&keyword=Myc), Carbapenem biosynthesis(https://www.kegg.jp/pathway/map=map00332&keyword=Myc), Prodigiosin biosynthesis(https://www.kegg.jp/pathway/map=map00333&keyword=Myc), Central carbon metabolism in cancer(https://www.kegg.jp/pathway/map=map05230&keyword=Myc), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=Myc), Lipoarabinomannan (LAM) biosynthesis(https://www.kegg.jp/pathway/map=map00571&keyword=Myc), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Myc), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Myc), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Myc), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Myc), Penicillin and cephalosporin biosynthesis(https://www.kegg.jp/pathway/map=map00311&keyword=Myc), Biosynthesis of enediyne antibiotics(https://www.kegg.jp/pathway/map=map01059&keyword=Myc), Sulfur relay system(https://www.kegg.jp/pathway/map=map04122&keyword=Myc)]",
        "geneSymbol": "Myc",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 17869,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 106,
        "geneKeggPathway": "[Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Nfe2l2), Fluid shear stress and atherosclerosis(https://www.kegg.jp/pathway/map=map05418&keyword=Nfe2l2), Protein processing in endoplasmic reticulum(https://www.kegg.jp/pathway/map=map04141&keyword=Nfe2l2), Longevity regulating pathway - worm(https://www.kegg.jp/pathway/map=map04212&keyword=Nfe2l2), Parkinson disease(https://www.kegg.jp/pathway/map=map05012&keyword=Nfe2l2), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Nfe2l2), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Nfe2l2), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Nfe2l2)]",
        "geneSymbol": "Nfe2l2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18024,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 109,
        "geneKeggPathway": "[Antigen processing and presentation(https://www.kegg.jp/pathway/map=map04612&keyword=Nfya), Spinocerebellar ataxia(https://www.kegg.jp/pathway/map=map05017&keyword=Nfya), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=Nfya)]",
        "geneSymbol": "Nfya",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18044,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 111,
        "geneKeggPathway": "[Notch signaling pathway(https://www.kegg.jp/pathway/map=map04330&keyword=Notch1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Notch1), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Notch1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Notch1), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Notch1), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=Notch1), Dorso-ventral axis formation(https://www.kegg.jp/pathway/map=map04320&keyword=Notch1), Axon regeneration(https://www.kegg.jp/pathway/map=map04361&keyword=Notch1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Notch1), Prion disease(https://www.kegg.jp/pathway/map=map05020&keyword=Notch1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Notch1)]",
        "geneSymbol": "Notch1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18128,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 118,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Pdx1)]",
        "geneSymbol": "Pdx1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18609,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 119,
        "geneKeggPathway": "[Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Pgr), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=Pgr), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Pgr), Breast cancer(https://www.kegg.jp/pathway/map=map05224&keyword=Pgr), Oocyte meiosis(https://www.kegg.jp/pathway/map=map04114&keyword=Pgr), Estrogen signaling pathway(https://www.kegg.jp/pathway/map=map04915&keyword=Pgr), Progesterone-mediated oocyte maturation(https://www.kegg.jp/pathway/map=map04914&keyword=Pgr), Viral replication(https://www.kegg.jp/pathway/map=map03240&keyword=Pgr)]",
        "geneSymbol": "Pgr",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 18667,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 123,
        "geneKeggPathway": "[PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Ppara), Renin secretion(https://www.kegg.jp/pathway/map=map04924&keyword=Ppara), DNA replication(https://www.kegg.jp/pathway/map=map03030&keyword=Ppara), Proteasome(https://www.kegg.jp/pathway/map=map03050&keyword=Ppara), N-Glycan biosynthesis(https://www.kegg.jp/pathway/map=map00510&keyword=Ppara)]",
        "geneSymbol": "Ppara",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19013,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 124,
        "geneKeggPathway": "[PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Pparg), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Pparg), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Pparg), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Pparg), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Pparg), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Pparg), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Pparg), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Pparg), Insulin signaling pathway(https://www.kegg.jp/pathway/map=map04910&keyword=Pparg), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Pparg), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Pparg), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Pparg)]",
        "geneSymbol": "Pparg",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19016,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 125,
        "geneKeggPathway": "[AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Ppargc1a), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Ppargc1a), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Ppargc1a), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Ppargc1a), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Ppargc1a), Apelin signaling pathway(https://www.kegg.jp/pathway/map=map04371&keyword=Ppargc1a), Thermogenesis(https://www.kegg.jp/pathway/map=map04714&keyword=Ppargc1a), Insulin signaling pathway(https://www.kegg.jp/pathway/map=map04910&keyword=Ppargc1a), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Ppargc1a), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Ppargc1a)]",
        "geneSymbol": "Ppargc1a",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19017,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 129,
        "geneKeggPathway": "[Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=Rb1), Carbon metabolism(https://www.kegg.jp/pathway/map=map01200&keyword=Rb1), Bacterial secretion system(https://www.kegg.jp/pathway/map=map03070&keyword=Rb1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Rb1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Rb1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Rb1), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Rb1), mTOR signaling pathway(https://www.kegg.jp/pathway/map=map04150&keyword=Rb1), Biosynthesis of secondary metabolites(https://www.kegg.jp/pathway/map=map01110&keyword=Rb1), Microbial metabolism in diverse environments(https://www.kegg.jp/pathway/map=map01120&keyword=Rb1), Calcium signaling pathway(https://www.kegg.jp/pathway/map=map04020&keyword=Rb1), Neuroactive ligand-receptor interaction(https://www.kegg.jp/pathway/map=map04080&keyword=Rb1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Rb1), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Rb1), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=Rb1), Salivary secretion(https://www.kegg.jp/pathway/map=map04970&keyword=Rb1), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=Rb1), Chemical carcinogenesis - receptor activation(https://www.kegg.jp/pathway/map=map05207&keyword=Rb1), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=Rb1), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Rb1)]",
        "geneSymbol": "Rb1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19645,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 130,
        "geneKeggPathway": "[Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Rbl1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Rbl1), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Rbl1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Rbl1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Rbl1)]",
        "geneSymbol": "Rbl1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19650,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 131,
        "geneKeggPathway": "[NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Relb), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Relb), Antineoplastics - agents from natural products(https://www.kegg.jp/pathway/map=map07042&keyword=Relb), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=Relb), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Relb), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Relb), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Relb)]",
        "geneSymbol": "Relb",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19698,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 132,
        "geneKeggPathway": "[]",
        "geneSymbol": "Rnf2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 19821,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 133,
        "geneKeggPathway": "[Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Sin3a), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Sin3a), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Sin3a), Mitophagy - yeast(https://www.kegg.jp/pathway/map=map04139&keyword=Sin3a), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Sin3a)]",
        "geneSymbol": "Sin3a",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20466,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 140,
        "geneKeggPathway": "[]",
        "geneSymbol": "Sox11",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20666,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 143,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Stat1), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Stat1), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=Stat1), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=Stat1), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=Stat1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Stat1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=Stat1), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Stat1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Stat1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Stat1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=Stat1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Stat1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Stat1), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=Stat1), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Stat1), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=Stat1), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Stat1), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Stat1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Stat1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Stat1)]",
        "geneSymbol": "Stat1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20846,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 144,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Stat3), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=Stat3), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Stat3), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Stat3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Stat3), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Stat3), EGFR tyrosine kinase inhibitor resistance(https://www.kegg.jp/pathway/map=map01521&keyword=Stat3), Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Stat3), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Stat3), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Stat3), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=Stat3), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=Stat3), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Stat3), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Stat3), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Stat3), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=Stat3), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=Stat3), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Stat3), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Stat3), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Stat3)]",
        "geneSymbol": "Stat3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20848,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 145,
        "geneKeggPathway": "[JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Stat4), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=Stat4), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=Stat4), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=Stat4), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Stat4), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Stat4)]",
        "geneSymbol": "Stat4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 20849,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 74,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Hnf1a)]",
        "geneSymbol": "Hnf1a",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21405,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 75,
        "geneKeggPathway": "[Maturity onset diabetes of the young(https://www.kegg.jp/pathway/map=map04950&keyword=Hnf1b)]",
        "geneSymbol": "Hnf1b",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21410,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 148,
        "geneKeggPathway": "[]",
        "geneSymbol": "Tcf4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21413,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 165,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Zeb1), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Zeb1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=Zeb1)]",
        "geneSymbol": "Zeb1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21417,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 149,
        "geneKeggPathway": "[]",
        "geneSymbol": "Tfap2c",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21420,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 147,
        "geneKeggPathway": "[Signaling pathways regulating pluripotency of stem cells(https://www.kegg.jp/pathway/map=map04550&keyword=Tcf3), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Tcf3), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Tcf3)]",
        "geneSymbol": "Tcf3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21423,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 120,
        "geneKeggPathway": "[]",
        "geneSymbol": "Phf1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21652,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 150,
        "geneKeggPathway": "[Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Tfdp1), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Tfdp1)]",
        "geneSymbol": "Tfdp1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21781,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 153,
        "geneKeggPathway": "[Tight junction(https://www.kegg.jp/pathway/map=map04530&keyword=Tjp1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Tjp1), Gap junction(https://www.kegg.jp/pathway/map=map04540&keyword=Tjp1), Vibrio cholerae infection(https://www.kegg.jp/pathway/map=map05110&keyword=Tjp1), Epithelial cell signaling in Helicobacter pylori infection(https://www.kegg.jp/pathway/map=map05120&keyword=Tjp1), Pathogenic Escherichia coli infection(https://www.kegg.jp/pathway/map=map05130&keyword=Tjp1)]",
        "geneSymbol": "Tjp1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21872,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 157,
        "geneKeggPathway": "[<font color=\"red\">TNF</font> signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=TNF), Apoptosis(https://www.kegg.jp/pathway/map=map04210&keyword=TNF), Adipocytokine signaling pathway(https://www.kegg.jp/pathway/map=map04920&keyword=TNF), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=TNF), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=TNF), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=TNF), Graft-versus-host disease(https://www.kegg.jp/pathway/map=map05332&keyword=TNF), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=TNF), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=TNF), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=TNF), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=TNF), Antifolate resistance(https://www.kegg.jp/pathway/map=map01523&keyword=TNF), Fc epsilon RI signaling pathway(https://www.kegg.jp/pathway/map=map04664&keyword=TNF), Type II diabetes mellitus(https://www.kegg.jp/pathway/map=map04930&keyword=TNF), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=TNF), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=TNF), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=TNF), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=TNF), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=TNF), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=TNF)]",
        "geneSymbol": "Tnf",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21926,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 16,
        "geneKeggPathway": "[Cell adhesion molecules(https://www.kegg.jp/pathway/map=map04514&keyword=Cd40), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=Cd40), Allograft rejection(https://www.kegg.jp/pathway/map=map05330&keyword=Cd40), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=Cd40), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=Cd40), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=Cd40), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=Cd40), Asthma(https://www.kegg.jp/pathway/map=map05310&keyword=Cd40), Systemic lupus erythematosus(https://www.kegg.jp/pathway/map=map05322&keyword=Cd40), Primary immunodeficiency(https://www.kegg.jp/pathway/map=map05340&keyword=Cd40), Viral myocarditis(https://www.kegg.jp/pathway/map=map05416&keyword=Cd40), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=Cd40), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=Cd40), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=Cd40), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=Cd40), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Cd40), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Cd40)]",
        "geneSymbol": "Cd40",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 21939,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 158,
        "geneKeggPathway": "[]",
        "geneSymbol": "Tob1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22057,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 159,
        "geneKeggPathway": "[]",
        "geneSymbol": "Trp53",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22059,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 160,
        "geneKeggPathway": "[]",
        "geneSymbol": "Trp63",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22061,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 161,
        "geneKeggPathway": "[]",
        "geneSymbol": "Trp73",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22062,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 162,
        "geneKeggPathway": "[Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Vhl), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Vhl), Ubiquitin mediated proteolysis(https://www.kegg.jp/pathway/map=map04120&keyword=Vhl), Longevity regulating pathway - worm(https://www.kegg.jp/pathway/map=map04212&keyword=Vhl), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Vhl)]",
        "geneSymbol": "Vhl",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22346,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 163,
        "geneKeggPathway": "[]",
        "geneSymbol": "Yy1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22632,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 164,
        "geneKeggPathway": "[Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Zbtb17), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Zbtb17), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Zbtb17), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=Zbtb17)]",
        "geneSymbol": "Zbtb17",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 22642,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 146,
        "geneKeggPathway": "[Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Taf4), Basal transcription factors(https://www.kegg.jp/pathway/map=map03022&keyword=Taf4)]",
        "geneSymbol": "Taf4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 228980,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 39,
        "geneKeggPathway": "[]",
        "geneSymbol": "Elp1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 230233,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 46,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ffar2)]",
        "geneSymbol": "Ffar2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 233079,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 47,
        "geneKeggPathway": "[]",
        "geneSymbol": "Ffar3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 233080,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 42,
        "geneKeggPathway": "[Ras signaling pathway(https://www.kegg.jp/pathway/map=map04014&keyword=Ets2), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=Ets2)]",
        "geneSymbol": "Ets2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 23872,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 166,
        "geneKeggPathway": "[MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Zeb2)]",
        "geneSymbol": "Zeb2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 24136,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 35,
        "geneKeggPathway": "[Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=E2f2), Glioma(https://www.kegg.jp/pathway/map=map05214&keyword=E2f2), Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=E2f2), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=E2f2), Endocrine resistance(https://www.kegg.jp/pathway/map=map01522&keyword=E2f2), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=E2f2), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=E2f2), Cushing syndrome(https://www.kegg.jp/pathway/map=map04934&keyword=E2f2), Hepatitis C(https://www.kegg.jp/pathway/map=map05160&keyword=E2f2), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=E2f2), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=E2f2), Human T-cell leukemia virus 1 infection(https://www.kegg.jp/pathway/map=map05166&keyword=E2f2), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=E2f2), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=E2f2), Pancreatic cancer(https://www.kegg.jp/pathway/map=map05212&keyword=E2f2), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=E2f2), Melanoma(https://www.kegg.jp/pathway/map=map05218&keyword=E2f2), Bladder cancer(https://www.kegg.jp/pathway/map=map05219&keyword=E2f2), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=E2f2), Small cell lung cancer(https://www.kegg.jp/pathway/map=map05222&keyword=E2f2)]",
        "geneSymbol": "E2f2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 242705,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 10,
        "geneKeggPathway": "[Hepatocellular carcinoma(https://www.kegg.jp/pathway/map=map05225&keyword=Brd7)]",
        "geneSymbol": "Brd7",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 26992,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 72,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=Hif1a), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Hif1a), Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Hif1a), Central carbon metabolism in cancer(https://www.kegg.jp/pathway/map=map05230&keyword=Hif1a), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Hif1a), Mitophagy - animal(https://www.kegg.jp/pathway/map=map04137&keyword=Hif1a), Autophagy - animal(https://www.kegg.jp/pathway/map=map04140&keyword=Hif1a), Longevity regulating pathway - worm(https://www.kegg.jp/pathway/map=map04212&keyword=Hif1a), Axon regeneration(https://www.kegg.jp/pathway/map=map04361&keyword=Hif1a), Kaposi sarcoma-associated herpesvirus infection(https://www.kegg.jp/pathway/map=map05167&keyword=Hif1a), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Hif1a), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=Hif1a), Chemical carcinogenesis - reactive oxygen species(https://www.kegg.jp/pathway/map=map05208&keyword=Hif1a), Choline metabolism in cancer(https://www.kegg.jp/pathway/map=map05231&keyword=Hif1a), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=Hif1a)]",
        "geneSymbol": "Hif1a",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 29560,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 128,
        "geneKeggPathway": "[]",
        "geneSymbol": "Pttg1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 30939,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 40,
        "geneKeggPathway": "[Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Ep300), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Ep300), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=Ep300), Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=Ep300), Viral life cycle - HIV-1(https://www.kegg.jp/pathway/map=map03250&keyword=Ep300), cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Ep300), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=Ep300), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Ep300), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Ep300), Wnt signaling pathway(https://www.kegg.jp/pathway/map=map04310&keyword=Ep300), Notch signaling pathway(https://www.kegg.jp/pathway/map=map04330&keyword=Ep300), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=Ep300), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Ep300), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=Ep300), Long-term potentiation(https://www.kegg.jp/pathway/map=map04720&keyword=Ep300), Melanogenesis(https://www.kegg.jp/pathway/map=map04916&keyword=Ep300), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Ep300), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Ep300), Growth hormone synthesis, secretion and action(https://www.kegg.jp/pathway/map=map04935&keyword=Ep300), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Ep300)]",
        "geneSymbol": "Ep300",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 328572,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 77,
        "geneKeggPathway": "[Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=IFNG), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IFNG), Natural killer cell mediated cytotoxicity(https://www.kegg.jp/pathway/map=map04650&keyword=IFNG), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=IFNG), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=IFNG), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IFNG), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IFNG), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=IFNG), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IFNG), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=IFNG), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=IFNG), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=IFNG), HIF-1 signaling pathway(https://www.kegg.jp/pathway/map=map04066&keyword=IFNG), Necroptosis(https://www.kegg.jp/pathway/map=map04217&keyword=IFNG), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IFNG), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=IFNG), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IFNG), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=IFNG), Graft-versus-host disease(https://www.kegg.jp/pathway/map=map05332&keyword=IFNG), Proteasome(https://www.kegg.jp/pathway/map=map03050&keyword=IFNG)]",
        "geneSymbol": "IFNG",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3458,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 29,
        "geneKeggPathway": "[Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=CXCL8), Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=CXCL8), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=CXCL8)]",
        "geneSymbol": "CXCL8",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3576,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 79,
        "geneKeggPathway": "[Viral protein interaction with cytokine and cytokine receptor(https://www.kegg.jp/pathway/map=map04061&keyword=IL10), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IL10), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IL10), C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=IL10), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IL10), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IL10), Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=IL10), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=IL10), Autoimmune thyroid disease(https://www.kegg.jp/pathway/map=map05320&keyword=IL10), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=IL10), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IL10), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IL10), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=IL10), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=IL10), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=IL10), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=IL10), T cell receptor signaling pathway(https://www.kegg.jp/pathway/map=map04660&keyword=IL10), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=IL10), Yersinia infection(https://www.kegg.jp/pathway/map=map05135&keyword=IL10), Staphylococcus aureus infection(https://www.kegg.jp/pathway/map=map05150&keyword=IL10)]",
        "geneSymbol": "IL10",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3586,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 80,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=IL12A), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=IL12A), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IL12A), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=IL12A), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IL12A), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IL12A), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=IL12A), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=IL12A), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=IL12A), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IL12A), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=IL12A), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=IL12A), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=IL12A), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=IL12A), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IL12A), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=IL12A), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=IL12A), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=IL12A), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IL12A), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=IL12A)]",
        "geneSymbol": "IL12A",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3592,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 82,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=IL12B), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=IL12B), Pertussis(https://www.kegg.jp/pathway/map=map05133&keyword=IL12B), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=IL12B), Toxoplasmosis(https://www.kegg.jp/pathway/map=map05145&keyword=IL12B), Measles(https://www.kegg.jp/pathway/map=map05162&keyword=IL12B), Proteoglycans in cancer(https://www.kegg.jp/pathway/map=map05205&keyword=IL12B), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=IL12B), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=IL12B), RIG-I-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04622&keyword=IL12B), JAK-STAT signaling pathway(https://www.kegg.jp/pathway/map=map04630&keyword=IL12B), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=IL12B), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=IL12B), Type I diabetes mellitus(https://www.kegg.jp/pathway/map=map04940&keyword=IL12B), Legionellosis(https://www.kegg.jp/pathway/map=map05134&keyword=IL12B), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=IL12B), African trypanosomiasis(https://www.kegg.jp/pathway/map=map05143&keyword=IL12B), Amoebiasis(https://www.kegg.jp/pathway/map=map05146&keyword=IL12B), Tuberculosis(https://www.kegg.jp/pathway/map=map05152&keyword=IL12B), Influenza A(https://www.kegg.jp/pathway/map=map05164&keyword=IL12B)]",
        "geneSymbol": "IL12B",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 3593,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 67,
        "geneKeggPathway": "[Neutrophil extracellular trap formation(https://www.kegg.jp/pathway/map=map04613&keyword=Hdac1), Alcoholism(https://www.kegg.jp/pathway/map=map05034&keyword=Hdac1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=Hdac1), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Hdac1), Amphetamine addiction(https://www.kegg.jp/pathway/map=map05031&keyword=Hdac1), Epstein-Barr virus infection(https://www.kegg.jp/pathway/map=map05169&keyword=Hdac1), MicroRNAs in cancer(https://www.kegg.jp/pathway/map=map05206&keyword=Hdac1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=Hdac1), Longevity regulating pathway - multiple species(https://www.kegg.jp/pathway/map=map04213&keyword=Hdac1), Notch signaling pathway(https://www.kegg.jp/pathway/map=map04330&keyword=Hdac1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Hdac1), Huntington disease(https://www.kegg.jp/pathway/map=map05016&keyword=Hdac1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Hdac1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Hdac1), Chronic myeloid leukemia(https://www.kegg.jp/pathway/map=map05220&keyword=Hdac1)]",
        "geneSymbol": "Hdac1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 433759,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 108,
        "geneKeggPathway": "[C-type lectin receptor signaling pathway(https://www.kegg.jp/pathway/map=map04625&keyword=NFKB1), IL-17 signaling pathway(https://www.kegg.jp/pathway/map=map04657&keyword=NFKB1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=NFKB1), Hepatitis B(https://www.kegg.jp/pathway/map=map05161&keyword=NFKB1), Lipid and atherosclerosis(https://www.kegg.jp/pathway/map=map05417&keyword=NFKB1), Herpes simplex virus 1 infection(https://www.kegg.jp/pathway/map=map05168&keyword=NFKB1), NF-kappa B signaling pathway(https://www.kegg.jp/pathway/map=map04064&keyword=NFKB1), NOD-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04621&keyword=NFKB1), TNF signaling pathway(https://www.kegg.jp/pathway/map=map04668&keyword=NFKB1), Human cytomegalovirus infection(https://www.kegg.jp/pathway/map=map05163&keyword=NFKB1), Human immunodeficiency virus 1 infection(https://www.kegg.jp/pathway/map=map05170&keyword=NFKB1), Coronavirus disease - COVID-19(https://www.kegg.jp/pathway/map=map05171&keyword=NFKB1), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=NFKB1), PD-L1 expression and PD-1 checkpoint pathway in cancer(https://www.kegg.jp/pathway/map=map05235&keyword=NFKB1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=NFKB1), Toll-like receptor signaling pathway(https://www.kegg.jp/pathway/map=map04620&keyword=NFKB1), Cytosolic DNA-sensing pathway(https://www.kegg.jp/pathway/map=map04623&keyword=NFKB1), Toll and Imd signaling pathway(https://www.kegg.jp/pathway/map=map04624&keyword=NFKB1), Th1 and Th2 cell differentiation(https://www.kegg.jp/pathway/map=map04658&keyword=NFKB1), Neurotrophin signaling pathway(https://www.kegg.jp/pathway/map=map04722&keyword=NFKB1)]",
        "geneSymbol": "NFKB1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 4790,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 45,
        "geneKeggPathway": "[Ubiquitin mediated proteolysis(https://www.kegg.jp/pathway/map=map04120&keyword=Fbxw7)]",
        "geneSymbol": "Fbxw7",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 50754,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 59,
        "geneKeggPathway": "[Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=FOXP3), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=FOXP3)]",
        "geneSymbol": "FOXP3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 50943,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 89,
        "geneKeggPathway": "[]",
        "geneSymbol": "Irf6",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 54139,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 57,
        "geneKeggPathway": "[FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Foxo4), Ras signaling pathway(https://www.kegg.jp/pathway/map=map04014&keyword=Foxo4), Shigellosis(https://www.kegg.jp/pathway/map=map05131&keyword=Foxo4)]",
        "geneSymbol": "Foxo4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 54601,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 56,
        "geneKeggPathway": "[FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=Foxo1), Glucagon signaling pathway(https://www.kegg.jp/pathway/map=map04922&keyword=Foxo1), Insulin resistance(https://www.kegg.jp/pathway/map=map04931&keyword=Foxo1), Transcriptional misregulation in cancer(https://www.kegg.jp/pathway/map=map05202&keyword=Foxo1), AMPK signaling pathway(https://www.kegg.jp/pathway/map=map04152&keyword=Foxo1), Alcoholic liver disease(https://www.kegg.jp/pathway/map=map04936&keyword=Foxo1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=Foxo1), Insulin signaling pathway(https://www.kegg.jp/pathway/map=map04910&keyword=Foxo1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=Foxo1), Human papillomavirus infection(https://www.kegg.jp/pathway/map=map05165&keyword=Foxo1), Longevity regulating pathway(https://www.kegg.jp/pathway/map=map04211&keyword=Foxo1), Longevity regulating pathway - multiple species(https://www.kegg.jp/pathway/map=map04213&keyword=Foxo1), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=Foxo1), Shigellosis(https://www.kegg.jp/pathway/map=map05131&keyword=Foxo1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=Foxo1), Prostate cancer(https://www.kegg.jp/pathway/map=map05215&keyword=Foxo1)]",
        "geneSymbol": "Foxo1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 56458,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 122,
        "geneKeggPathway": "[]",
        "geneSymbol": "Plag1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 56711,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 2,
        "geneKeggPathway": "[PPAR signaling pathway(https://www.kegg.jp/pathway/map=map03320&keyword=Angptl4), Cholesterol metabolism(https://www.kegg.jp/pathway/map=map04979&keyword=Angptl4)]",
        "geneSymbol": "Angptl4",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 57875,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 104,
        "geneKeggPathway": "[]",
        "geneSymbol": "Nacc1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 66830,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 100,
        "geneKeggPathway": "[]",
        "geneSymbol": "Mtdh",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 67154,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 152,
        "geneKeggPathway": "[Intestinal immune network for IgA production(https://www.kegg.jp/pathway/map=map04672&keyword=TGFB1), Inflammatory bowel disease(https://www.kegg.jp/pathway/map=map05321&keyword=TGFB1), Diabetic cardiomyopathy(https://www.kegg.jp/pathway/map=map05415&keyword=TGFB1), Cellular senescence(https://www.kegg.jp/pathway/map=map04218&keyword=TGFB1), Th17 cell differentiation(https://www.kegg.jp/pathway/map=map04659&keyword=TGFB1), AGE-RAGE signaling pathway in diabetic complications(https://www.kegg.jp/pathway/map=map04933&keyword=TGFB1), Pathways in cancer(https://www.kegg.jp/pathway/map=map05200&keyword=TGFB1), Renal cell carcinoma(https://www.kegg.jp/pathway/map=map05211&keyword=TGFB1), Cytokine-cytokine receptor interaction(https://www.kegg.jp/pathway/map=map04060&keyword=TGFB1), MAPK signaling pathway(https://www.kegg.jp/pathway/map=map04010&keyword=TGFB1), FoxO signaling pathway(https://www.kegg.jp/pathway/map=map04068&keyword=TGFB1), Cell cycle(https://www.kegg.jp/pathway/map=map04110&keyword=TGFB1), TGF-beta signaling pathway(https://www.kegg.jp/pathway/map=map04350&keyword=TGFB1), Osteoclast differentiation(https://www.kegg.jp/pathway/map=map04380&keyword=TGFB1), Hippo signaling pathway(https://www.kegg.jp/pathway/map=map04390&keyword=TGFB1), Relaxin signaling pathway(https://www.kegg.jp/pathway/map=map04926&keyword=TGFB1), Non-alcoholic fatty liver disease(https://www.kegg.jp/pathway/map=map04932&keyword=TGFB1), Leishmaniasis(https://www.kegg.jp/pathway/map=map05140&keyword=TGFB1), Chagas disease(https://www.kegg.jp/pathway/map=map05142&keyword=TGFB1), Malaria(https://www.kegg.jp/pathway/map=map05144&keyword=TGFB1)]",
        "geneSymbol": "TGFB1",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 7040,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 66,
        "geneKeggPathway": "[cAMP signaling pathway(https://www.kegg.jp/pathway/map=map04024&keyword=Hcar2)]",
        "geneSymbol": "Hcar2",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 80885,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 68,
        "geneKeggPathway": "[Neutrophil extracellular trap formation(https://www.kegg.jp/pathway/map=map04613&keyword=HDAC3), Thyroid hormone signaling pathway(https://www.kegg.jp/pathway/map=map04919&keyword=HDAC3), Alcoholism(https://www.kegg.jp/pathway/map=map05034&keyword=HDAC3), Viral carcinogenesis(https://www.kegg.jp/pathway/map=map05203&keyword=HDAC3)]",
        "geneSymbol": "HDAC3",
        "microbeId": 52331,
        "microbeName": "Faecalibacterium_prausnitzii",
        "ncbiGeneId": 8841,
        "swineIndex": 26
    },
    {
        "geneKeggIndex": 153,
        "geneKeggPathway": "[Tight junction(https://www.kegg.jp/pathway/map=map04530&keyword=Tjp1), Adherens junction(https://www.kegg.jp/pathway/map=map04520&keyword=Tjp1), Gap junction(https://www.kegg.jp/pathway/map=map04540&keyword=Tjp1), Vibrio cholerae infection(https://www.kegg.jp/pathway/map=map05110&keyword=Tjp1), Epithelial cell signaling in Helicobacter pylori infection(https://www.kegg.jp/pathway/map=map05120&keyword=Tjp1), Pathogenic Escherichia coli infection(https://www.kegg.jp/pathway/map=map05130&keyword=Tjp1)]",
        "geneSymbol": "Tjp1",
        "microbeId": 28569,
        "microbeName": "Blautia",
        "ncbiGeneId": 21872,
        "swineIndex": 26
    },
    {
        "response count": 119,
        "response time": "0.479s"
    }
]
```

### Q4 某日，日阶段饲养相比三阶段饲养，代谢物组成和功能有什么差异？（在HMDB中查询）
#### Datalog
```
?(Metabolome_name,Metabolome_pathway,Metabolome_pathway_url):-
relationship:generates(Swine_index,Metabolome_index,<generates>),
attribute:metabolome_difference(Metabolome_index,<1>),
attribute:metabolism_name(Metabolome_index,Metabolome_name),
attribute:metabolism_time(Metabolome_index,<155>),
relationship:has_hmdb_info(Hmdb_info_index,Metabolome_index,<has_hmdb_info>),
attribute:metabolome_hmdb_index(Hmdb_info_index,Metabolome_hmdb_index),
attribute:metabolome_pathway(Hmdb_info_index,Metabolome_pathway),
attribute:metabolome_pathway_url(Hmdb_info_index,Metabolome_pathway_url).
```
#### 映射规则
```
{
  "rules":{
    "relationship": {
      "is_host_of": "is_host_of",
      "changes_the_expression_by_microbiota": "changes_the_expression_by_microbiota",
      "has_gene_kegg_info": "has_gene_kegg_info"
    },
    "attribute": {
      "p_value_dpf_tpf_difference": "fsmm.microbe.microbe_dpf_tpf_difference",
      "microbe_time": "fsmm.microbe.days",
      "group": "fsmm.microbe.col",
      "p_age_difference": "fsmm.microbe.microbe_age_difference",
      "metabolome_difference": "fsmm.metabolism.metabolome_difference",
      "metabolism_time": "metabolism_time"
    }
  }
}
```

#### 查询结果
```
[
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 26
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 86
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 171
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 256
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 301
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 366
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 421
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 461
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 531
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 596
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 661
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 726
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 796
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 871
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 916
    },
    {
        "hmdbInfoIndex": 99,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0000305",
        "metabolismIndex": 5053,
        "metabolismName": "Vitamin a",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 1,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000012",
        "metabolismIndex": 5096,
        "metabolismName": "Deoxyuridine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 191,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0001852",
        "metabolismIndex": 5154,
        "metabolismName": "Tretinoin",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 209,
        "hmdbPathway": "Retinol Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00830.gif",
        "metabolismHmdbInfoIndex": "HMDB0006218",
        "metabolismIndex": 5177,
        "metabolismName": "(9cis)-retinal",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 163,
        "hmdbPathway": "Purine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00230.gif",
        "metabolismHmdbInfoIndex": "HMDB0001235",
        "metabolismIndex": 5245,
        "metabolismName": "5-aminoimidazole ribotide",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 162,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001200",
        "metabolismIndex": 5260,
        "metabolismName": "Formylkynurenine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 144,
        "hmdbPathway": "Glycine, serine and threonine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00260.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 145,
        "hmdbPathway": "Methionine Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00270.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 146,
        "hmdbPathway": "Arginine and proline metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000939",
        "metabolismIndex": 5473,
        "metabolismName": "S-adenosyl-l-homocysteine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 220,
        "hmdbPathway": "Arachidonic Acid Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00590.gif",
        "metabolismHmdbInfoIndex": "HMDB0010379",
        "metabolismIndex": 5687,
        "metabolismName": "L-alpha-lysophosphatidylcholine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 161,
        "hmdbPathway": "Tryptophan metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00380.gif",
        "metabolismHmdbInfoIndex": "HMDB0001190",
        "metabolismIndex": 5741,
        "metabolismName": "Indole-3-acetaldehyde",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 221,
        "hmdbPathway": "Phospholipid Biosynthesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00564.gif",
        "metabolismHmdbInfoIndex": "HMDB0010382",
        "metabolismIndex": 6905,
        "metabolismName": "5385682",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 91,
        "hmdbPathway": "Pyrimidine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00240.gif",
        "metabolismHmdbInfoIndex": "HMDB0000273",
        "metabolismIndex": 7043,
        "metabolismName": "Thymidine",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 176,
        "hmdbPathway": "Tyrosine metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00350.gif",
        "metabolismHmdbInfoIndex": "HMDB0001398",
        "metabolismIndex": 7217,
        "metabolismName": "Guaiacol",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 68,
        "hmdbPathway": "Citric Acid Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00020.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 69,
        "hmdbPathway": "Gluconeogenesis",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00010.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 70,
        "hmdbPathway": "Glutamate Metabolism",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00250.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 1006
    },
    {
        "hmdbInfoIndex": 71,
        "hmdbPathway": "Urea Cycle",
        "hmdbPathwayUrl": "https://www.genome.jp/kegg/misc/thumbnail/map00330.gif",
        "metabolismHmdbInfoIndex": "HMDB0000208",
        "metabolismIndex": 7332,
        "metabolismName": "Alpha-ketoglutaric acid",
        "swineIndex": 1006
    },
    {
        "response count": 288,
        "response time": "5.196s"
    }
]
```