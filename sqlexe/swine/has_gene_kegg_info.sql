-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: relationship_entity
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
-- Table structure for table `has_gene_kegg_info`
--

DROP TABLE IF EXISTS `has_gene_kegg_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `has_gene_kegg_info` (
  `NCBI_gene_id` varchar(45) NOT NULL,
  `Gene_kegg_index` int NOT NULL,
  `relationship` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Gene_kegg_index`,`NCBI_gene_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `has_gene_kegg_info`
--

LOCK TABLES `has_gene_kegg_info` WRITE;
/*!40000 ALTER TABLE `has_gene_kegg_info` DISABLE KEYS */;
INSERT INTO `has_gene_kegg_info` VALUES ('11622',1,'has_gene_kegg_info'),('57875',2,'has_gene_kegg_info'),('11846',3,'has_gene_kegg_info'),('11863',4,'has_gene_kegg_info'),('11910',5,'has_gene_kegg_info'),('581',6,'has_gene_kegg_info'),('596',7,'has_gene_kegg_info'),('12053',8,'has_gene_kegg_info'),('12151',9,'has_gene_kegg_info'),('26992',10,'has_gene_kegg_info'),('728',11,'has_gene_kegg_info'),('836',12,'has_gene_kegg_info'),('20296',13,'has_gene_kegg_info'),('6364',14,'has_gene_kegg_info'),('6348',15,'has_gene_kegg_info'),('21939',16,'has_gene_kegg_info'),('12524',17,'has_gene_kegg_info'),('12590',18,'has_gene_kegg_info'),('12591',19,'has_gene_kegg_info'),('243764',20,'has_gene_kegg_info'),('12737',21,'has_gene_kegg_info'),('12753',22,'has_gene_kegg_info'),('12842',23,'has_gene_kegg_info'),('12895',24,'has_gene_kegg_info'),('12912',25,'has_gene_kegg_info'),('12916',26,'has_gene_kegg_info'),('12387',27,'has_gene_kegg_info'),('6372',28,'has_gene_kegg_info'),('3576',29,'has_gene_kegg_info'),('3579',30,'has_gene_kegg_info'),('13122',31,'has_gene_kegg_info'),('13170',32,'has_gene_kegg_info'),('50506',33,'has_gene_kegg_info'),('13555',34,'has_gene_kegg_info'),('242705',35,'has_gene_kegg_info'),('13557',36,'has_gene_kegg_info'),('1956',37,'has_gene_kegg_info'),('13653',38,'has_gene_kegg_info'),('230233',39,'has_gene_kegg_info'),('328572',40,'has_gene_kegg_info'),('13982',41,'has_gene_kegg_info'),('23872',42,'has_gene_kegg_info'),('14056',43,'has_gene_kegg_info'),('14102',44,'has_gene_kegg_info'),('50754',45,'has_gene_kegg_info'),('233079',46,'has_gene_kegg_info'),('233080',47,'has_gene_kegg_info'),('14170',48,'has_gene_kegg_info'),('14186',49,'has_gene_kegg_info'),('14247',50,'has_gene_kegg_info'),('14268',51,'has_gene_kegg_info'),('14281',52,'has_gene_kegg_info'),('2353',53,'has_gene_kegg_info'),('15375',54,'has_gene_kegg_info'),('14235',55,'has_gene_kegg_info'),('56458',56,'has_gene_kegg_info'),('54601',57,'has_gene_kegg_info'),('20371',58,'has_gene_kegg_info'),('50943',59,'has_gene_kegg_info'),('14463',60,'has_gene_kegg_info'),('14526',61,'has_gene_kegg_info'),('14581',62,'has_gene_kegg_info'),('14632',63,'has_gene_kegg_info'),('2740',64,'has_gene_kegg_info'),('14810',65,'has_gene_kegg_info'),('80885',66,'has_gene_kegg_info'),('433759',67,'has_gene_kegg_info'),('8841',68,'has_gene_kegg_info'),('15184',69,'has_gene_kegg_info'),('15213',70,'has_gene_kegg_info'),('15248',71,'has_gene_kegg_info'),('29560',72,'has_gene_kegg_info'),('15357',73,'has_gene_kegg_info'),('21405',74,'has_gene_kegg_info'),('21410',75,'has_gene_kegg_info'),('15930',76,'has_gene_kegg_info'),('3458',77,'has_gene_kegg_info'),('16153',78,'has_gene_kegg_info'),('3586',79,'has_gene_kegg_info'),('3592',80,'has_gene_kegg_info'),('16160',81,'has_gene_kegg_info'),('3593',82,'has_gene_kegg_info'),('16163',83,'has_gene_kegg_info'),('3605',84,'has_gene_kegg_info'),('16176',85,'has_gene_kegg_info'),('50616',86,'has_gene_kegg_info'),('16189',87,'has_gene_kegg_info'),('16193',88,'has_gene_kegg_info'),('54139',89,'has_gene_kegg_info'),('3725',90,'has_gene_kegg_info'),('16598',91,'has_gene_kegg_info'),('12224',92,'has_gene_kegg_info'),('16842',93,'has_gene_kegg_info'),('17095',94,'has_gene_kegg_info'),('5594',95,'has_gene_kegg_info'),('1432',96,'has_gene_kegg_info'),('5595',97,'has_gene_kegg_info'),('17428',98,'has_gene_kegg_info'),('116870',99,'has_gene_kegg_info'),('67154',100,'has_gene_kegg_info'),('14489',101,'has_gene_kegg_info'),('17865',102,'has_gene_kegg_info'),('17869',103,'has_gene_kegg_info'),('66830',104,'has_gene_kegg_info'),('11925',105,'has_gene_kegg_info'),('18024',106,'has_gene_kegg_info'),('18033',107,'has_gene_kegg_info'),('4790',108,'has_gene_kegg_info'),('18044',109,'has_gene_kegg_info'),('18126',110,'has_gene_kegg_info'),('18128',111,'has_gene_kegg_info'),('20186',112,'has_gene_kegg_info'),('9971',113,'has_gene_kegg_info'),('14815',114,'has_gene_kegg_info'),('18260',115,'has_gene_kegg_info'),('15379',116,'has_gene_kegg_info'),('58205',117,'has_gene_kegg_info'),('18609',118,'has_gene_kegg_info'),('18667',119,'has_gene_kegg_info'),('21652',120,'has_gene_kegg_info'),('17344',121,'has_gene_kegg_info'),('56711',122,'has_gene_kegg_info'),('19013',123,'has_gene_kegg_info'),('19016',124,'has_gene_kegg_info'),('19017',125,'has_gene_kegg_info'),('105787',126,'has_gene_kegg_info'),('108079',127,'has_gene_kegg_info'),('30939',128,'has_gene_kegg_info'),('19645',129,'has_gene_kegg_info'),('19650',130,'has_gene_kegg_info'),('19698',131,'has_gene_kegg_info'),('19821',132,'has_gene_kegg_info'),('20466',133,'has_gene_kegg_info'),('19261',134,'has_gene_kegg_info'),('227394',135,'has_gene_kegg_info'),('17126',136,'has_gene_kegg_info'),('17127',137,'has_gene_kegg_info'),('17128',138,'has_gene_kegg_info'),('20655',139,'has_gene_kegg_info'),('20666',140,'has_gene_kegg_info'),('20787',141,'has_gene_kegg_info'),('20788',142,'has_gene_kegg_info'),('20846',143,'has_gene_kegg_info'),('20848',144,'has_gene_kegg_info'),('20849',145,'has_gene_kegg_info'),('228980',146,'has_gene_kegg_info'),('21423',147,'has_gene_kegg_info'),('21413',148,'has_gene_kegg_info'),('21420',149,'has_gene_kegg_info'),('21781',150,'has_gene_kegg_info'),('21803',151,'has_gene_kegg_info'),('7040',152,'has_gene_kegg_info'),('21872',153,'has_gene_kegg_info'),('24088',154,'has_gene_kegg_info'),('7097',155,'has_gene_kegg_info'),('7124',156,'has_gene_kegg_info'),('21926',157,'has_gene_kegg_info'),('22057',158,'has_gene_kegg_info'),('22059',159,'has_gene_kegg_info'),('22061',160,'has_gene_kegg_info'),('22062',161,'has_gene_kegg_info'),('22346',162,'has_gene_kegg_info'),('22632',163,'has_gene_kegg_info'),('22642',164,'has_gene_kegg_info'),('21417',165,'has_gene_kegg_info'),('24136',166,'has_gene_kegg_info');
/*!40000 ALTER TABLE `has_gene_kegg_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-20 22:31:09
