-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: gene_info
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gene`
--

DROP TABLE IF EXISTS `gene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gene` (
  `Gene_symbol` varchar(45) NOT NULL,
  `NCBI_gene_id` varchar(45) NOT NULL,
  PRIMARY KEY (`Gene_symbol`,`NCBI_gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gene`
--

LOCK TABLES `gene` WRITE;
/*!40000 ALTER TABLE `gene` DISABLE KEYS */;
INSERT INTO `gene` VALUES ('Ahr','11622'),('Angptl4','57875'),('Arg1','11846'),('Arnt','11863'),('Atf3','11910'),('BAX','581'),('BCL2','596'),('Bcl6','12053'),('Bmi1','12151'),('Brd7','26992'),('C5AR1','728'),('CASP3','836'),('Ccl2','20296'),('CCL20','6364'),('CCL3','6348'),('Cd40','21939'),('Cd86','12524'),('Cdx1','12590'),('Cdx2','12591'),('Chrm2','243764'),('Cldn1','12737'),('Clock','12753'),('Col1a1','12842'),('Cpt1b','12895'),('Creb1','12912'),('Crem','12916'),('Ctnnb1','12387'),('CXCL6','6372'),('CXCL8','3576'),('CXCR2','3579'),('Cyp7a1','13122'),('Dbp','13170'),('DUOX2','50506'),('E2f1','13555'),('E2f2','242705'),('E2f3','13557'),('EGFR','1956'),('Egr1','13653'),('Elp1','230233'),('Ep300','328572'),('Esr1','13982'),('Ets2','23872'),('Ezh2','14056'),('Fas','14102'),('Fbxw7','50754'),('Ffar2','233079'),('Ffar3','233080'),('Fgf15','14170'),('Fgfr4','14186'),('Fli1','14247'),('Fn1','14268'),('Fos','14281'),('FOS','2353'),('Foxa1','15375'),('Foxm1','14235'),('Foxo1','56458'),('Foxo4','54601'),('Foxp3','20371'),('FOXP3','50943'),('Gata4','14463'),('Gcg','14526'),('Gfi1','14581'),('Gli1','14632'),('GLP1R','2740'),('Grin1','14810'),('Hcar2','80885'),('Hdac1','433759'),('HDAC3','8841'),('Hdac5','15184'),('Hey1','15213'),('Hic1','15248'),('Hif1a','29560'),('Hmgcr','15357'),('Hnf1a','21405'),('Hnf1b','21410'),('Ido1','15930'),('IFNG','3458'),('Il10','16153'),('IL10','3586'),('IL12A','3592'),('Il12b','16160'),('IL12B','3593'),('Il13','16163'),('IL17A','3605'),('Il1b','16176'),('IL22','50616'),('Il4','16189'),('Il6','16193'),('Irf6','54139'),('JUN','3725'),('Klf2','16598'),('Klf5','12224'),('Lef1','16842'),('Lyl1','17095'),('MAPK1','5594'),('MAPK14','1432'),('MAPK3','5595'),('Mnt','17428'),('Mta1','116870'),('Mtdh','67154'),('Mtpn','14489'),('Mybl2','17865'),('Myc','17869'),('Nacc1','66830'),('Neurog3','11925'),('Nfe2l2','18024'),('Nfkb1','18033'),('NFKB1','4790'),('Nfya','18044'),('Nos2','18126'),('Notch1','18128'),('Nr1h4','20186'),('NR1H4','9971'),('Nr3c1','14815'),('Ocln','18260'),('Onecut1','15379'),('Pdcd1lg2','58205'),('Pdx1','18609'),('Pgr','18667'),('Phf1','21652'),('Pias2','17344'),('Plag1','56711'),('Ppara','19013'),('Pparg','19016'),('Ppargc1a','19017'),('Prkaa1','105787'),('Prkaa2','108079'),('Pttg1','30939'),('Rb1','19645'),('Rbl1','19650'),('Relb','19698'),('Rnf2','19821'),('Sin3a','20466'),('Sirpa','19261'),('Slco4c1','227394'),('Smad2','17126'),('Smad3','17127'),('Smad4','17128'),('Sod1','20655'),('Sox11','20666'),('Srebf1','20787'),('Srebf2','20788'),('Stat1','20846'),('Stat3','20848'),('Stat4','20849'),('Taf4','228980'),('Tcf3','21423'),('Tcf4','21413'),('Tfap2c','21420'),('Tfdp1','21781'),('Tgfb1','21803'),('TGFB1','7040'),('Tjp1','21872'),('Tlr2','24088'),('TLR2','7097'),('Tnf','21926'),('TNF','7124'),('Tob1','22057'),('Trp53','22059'),('Trp63','22061'),('Trp73','22062'),('Vhl','22346'),('Yy1','22632'),('Zbtb17','22642'),('Zeb1','21417'),('Zeb2','24136');
/*!40000 ALTER TABLE `gene` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-10 16:19:04
