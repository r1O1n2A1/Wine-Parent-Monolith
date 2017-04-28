-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: wine_bdd
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Select database to use
USE wine_bdd_test;
--
-- Table structure for table `adress`
--
DROP TABLE IF EXISTS `adress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adress` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `billing` tinyint(1) DEFAULT '0',
  `number` varchar(50) NOT NULL,
  `street` varchar(100) NOT NULL,
  `idCity` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_5dkvctw0qff597feu35v456fv` (`idCity`),
  CONSTRAINT `FK_5dkvctw0qff597feu35v456fv` FOREIGN KEY (`idCity`) REFERENCES `city` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adress`
--

LOCK TABLES `adress` WRITE;
/*!40000 ALTER TABLE `adress` DISABLE KEYS */;
INSERT INTO `adress` VALUES (1,0,'18','rue de rivoli',1);
/*!40000 ALTER TABLE `adress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `zipcode` varchar(50) NOT NULL,
  `idRegion` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_so5k81fr3tcsalxnpkn623ff` (`idRegion`),
  CONSTRAINT `FK_so5k81fr3tcsalxnpkn623ff` FOREIGN KEY (`idRegion`) REFERENCES `region` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Paris','75001',1);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `datePublished` datetime NOT NULL,
  `isValidated` tinyint(1) NOT NULL,
  `text` varchar(200) NOT NULL,
  `title` varchar(50) NOT NULL,
  `idAdmin` int(11) NOT NULL,
  `idCustomer` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `FK_p6nd3cjjl9xgetyx90e4pb74n` (`idAdmin`),
  KEY `FK_fhdei47i0xrueywx2mcyuixdy` (`idCustomer`),
  CONSTRAINT `FK_fhdei47i0xrueywx2mcyuixdy` FOREIGN KEY (`idCustomer`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_p6nd3cjjl9xgetyx90e4pb74n` FOREIGN KEY (`idAdmin`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'France');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newsletter`
--

DROP TABLE IF EXISTS `newsletter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newsletter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `body` varchar(200) NOT NULL,
  `createdAt` datetime NOT NULL,
  `publishedAt` datetime NOT NULL,
  `title` varchar(50) NOT NULL,
  `updateAt` datetime NOT NULL,
  `idAdmin` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_oyf71o4x24e6s8vpwoi1itya` (`idAdmin`),
  CONSTRAINT `FK_oyf71o4x24e6s8vpwoi1itya` FOREIGN KEY (`idAdmin`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newsletter`
--

LOCK TABLES `newsletter` WRITE;
/*!40000 ALTER TABLE `newsletter` DISABLE KEYS */;
/*!40000 ALTER TABLE `newsletter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderdetail` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `quantite` int(11) NOT NULL,
  `idOrder` int(11) NOT NULL,
  `idProductOrdered` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `FK_rfm3057x9657vpm0v2cglhsxp` (`idOrder`),
  KEY `FK_rk25vy94wj9g2knoxl2w19nc8` (`idProductOrdered`),
  CONSTRAINT `FK_rfm3057x9657vpm0v2cglhsxp` FOREIGN KEY (`idOrder`) REFERENCES `ordering` (`id`),
  CONSTRAINT `FK_rk25vy94wj9g2knoxl2w19nc8` FOREIGN KEY (`idProductOrdered`) REFERENCES `product` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordering`
--

DROP TABLE IF EXISTS `ordering`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordering` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createdAt` datetime NOT NULL,
  `paidAt` datetime DEFAULT NULL,
  `idCustomer` int(11) NOT NULL,
  `idPaymentInfo` int(11) NOT NULL,
  `idShippingMethod` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_6i9dcfu1v8kgbglfg1dfd60dm` (`idCustomer`),
  KEY `FK_61mrj9c7ewwyt6hh0g36te4ov` (`idPaymentInfo`),
  KEY `FK_ojpdb84tudllol92dvioerjxp` (`idShippingMethod`),
  CONSTRAINT `FK_61mrj9c7ewwyt6hh0g36te4ov` FOREIGN KEY (`idPaymentInfo`) REFERENCES `paymentinfo` (`id`),
  CONSTRAINT `FK_6i9dcfu1v8kgbglfg1dfd60dm` FOREIGN KEY (`idCustomer`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_ojpdb84tudllol92dvioerjxp` FOREIGN KEY (`idShippingMethod`) REFERENCES `shippingmethod` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordering`
--

LOCK TABLES `ordering` WRITE;
/*!40000 ALTER TABLE `ordering` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordering` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paymentinfo`
--

DROP TABLE IF EXISTS `paymentinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paymentinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paymentMethod` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paymentinfo`
--

LOCK TABLES `paymentinfo` WRITE;
/*!40000 ALTER TABLE `paymentinfo` DISABLE KEYS */;
INSERT INTO `paymentinfo` VALUES (1,'Visa');
/*!40000 ALTER TABLE `paymentinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `DTYPE` varchar(31) NOT NULL,
  `id_product` int(11) NOT NULL AUTO_INCREMENT,
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `description` varchar(255) DEFAULT NULL,
  `images` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `apiId` int(11) DEFAULT NULL,
  `appellation` varchar(255) DEFAULT NULL,
  `imagesUrl` varchar(255) DEFAULT NULL,
  `idSpecialEvent` int(11) DEFAULT NULL,
  `idProductType` int(11) DEFAULT NULL,
  `idProductVarietal` int(11) DEFAULT NULL,
  `idProductVintage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_product`),
  KEY `FK_3x0xwp8ts43e4su28u2jotwm3` (`idSpecialEvent`),
  KEY `FK_7d2unio4s9iiqg1kb3dqbkbgj` (`idProductType`),
  KEY `FK_4fp1i81xrpkr6qhqe9y6rl8qm` (`idProductVarietal`),
  KEY `FK_67oyaf2cr40b71frlgsbtb99s` (`idProductVintage`),
  CONSTRAINT `FK_3x0xwp8ts43e4su28u2jotwm3` FOREIGN KEY (`idSpecialEvent`) REFERENCES `specialevent` (`id`),
  CONSTRAINT `FK_4fp1i81xrpkr6qhqe9y6rl8qm` FOREIGN KEY (`idProductVarietal`) REFERENCES `productvarietal` (`id`),
  CONSTRAINT `FK_67oyaf2cr40b71frlgsbtb99s` FOREIGN KEY (`idProductVintage`) REFERENCES `productvintage` (`id`),
  CONSTRAINT `FK_7d2unio4s9iiqg1kb3dqbkbgj` FOREIGN KEY (`idProductType`) REFERENCES `producttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=208 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('Product',1,'2017-03-27 18:14:10','un produit',NULL,'pre',500,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('ProductAccessories',2,'2017-03-27 18:14:11','un beau mug',NULL,'un mug',25,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('ProductWine',3,'2017-03-27 18:14:12','Collectible Wines|Champagne Gifts|Older Vintages|Has Large Label','130489m.jpg|772.jpg','Salon Blanc de Blancs Le Mesnil-sur-Oger 2002',480,130489,'Champagne',NULL,1,1,1,1),('ProductWine',4,'2017-03-27 18:14:12','Collectible Wines|Corporate Gifts|Champagne Gifts|Older Vintages|Great Bottles to Give|Has Large Label','124883m.jpg|100.jpg','Dom Perignon  2004',189.99,124883,'Champagne',NULL,1,1,1,2),('ProductWine',5,'2017-03-27 18:14:13','Collectible Wines|Champagne Gifts|Older Vintages|Has Large Label','136006m.jpg|988.jpg','Louis Roederer Cristal Rose 2006',585.99,136006,'Champagne',NULL,1,1,2,3),('ProductWine',6,'2017-03-27 18:14:13','Collectible Wines|Has Large Label','120644m.jpg|105.jpg','Taittinger Comtes de Champagne Blanc de Blancs 2002',195,120644,'Champagne',NULL,1,1,1,1),('ProductWine',7,'2017-03-27 18:14:13','Champagne Gifts|Great Bottles to Give|Has Large Label','120282m.jpg|767.jpg','Champagne Krug Grande Cuvee',189.99,120282,'Champagne',NULL,1,1,3,NULL),('ProductWine',8,'2017-03-27 18:14:13','Collectible Wines|Champagne Gifts|Older Vintages|Has Large Label','134789m.jpg|100.jpg','Dom Perignon Limited Edition Metamorphosis in Gift Box 2004',195.99,134789,'Champagne',NULL,1,1,1,2),('ProductWine',9,'2017-03-27 18:14:13','Collectible Wines|Older Vintages|Has Large Label','134788m.jpg|100.jpg','Dom Perignon P2 in Gift Box 1998',399.99,134788,'Champagne',NULL,1,1,1,4),('ProductWine',10,'2017-03-27 18:14:13','Collectible Wines|Champagne Gifts','106088m.jpg|100.jpg','Dom Perignon  2002',169,106088,'Champagne',NULL,1,1,1,1),('ProductWine',11,'2017-03-27 18:14:13','Collectible Wines|Corporate Gifts|Champagne Gifts|Great Bottles to Give|Older Vintages|Has Large Label','142403m.jpg|100.jpg','Dom Perignon  2005',179.99,142403,'Champagne',NULL,1,1,1,5),('ProductWine',12,'2017-03-27 18:14:13','Collectible Wines|Corporate Gifts|Champagne Gifts|Great Bottles to Give|Has Large Label|Older Vintages','150397m.jpg|100.jpg','Dom Perignon  2006',180.99,150397,'Champagne',NULL,1,1,1,3),('ProductWine',13,'2017-03-27 18:14:14','Collectible Wines|Champagne Gifts|Older Vintages|Great Bottles to Give|Has Large Label','126951m.jpg','Piper-Heidsieck Brut Vintage Rare with Gift Box 2002',169.99,126951,'Champagne',NULL,1,1,1,1),('ProductWine',14,'2017-03-27 18:14:14','Older Vintages|Has Large Label','149492m.jpg|988.jpg','Louis Roederer Cristal Brut 2007',249.99,149492,'Champagne',NULL,NULL,1,1,6),('ProductWine',15,'2017-03-27 18:14:14','Champagne Gifts','121425m.jpg|767.jpg','Champagne Krug Flanerie Grande Cuvee in Leather Purse',209,121425,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',16,'2017-03-27 18:14:14','Collectible Wines|Champagne Gifts|Congratulations|Older Vintages|Great Bottles to Give|Has Large Label','128463m.jpg|988.jpg','Louis Roederer Cristal Brut 2006',249.99,128463,'Champagne',NULL,NULL,1,1,3),('ProductWine',17,'2017-03-27 18:14:14','Collectible Wines|Older Vintages','120161m.jpg|767.jpg','Champagne Krug Vintage Brut with Collection Giftbox 1989',569,120161,'Champagne',NULL,NULL,1,1,7),('ProductWine',18,'2017-03-27 18:14:14','Collectible Wines|Champagne Gifts|Older Vintages|Great Bottles to Give|Has Large Label','129852m.jpg|105.jpg','Taittinger Comtes de Champagne Blanc de Blancs 2005',172.99,129852,'Champagne',NULL,NULL,1,1,5),('ProductWine',19,'2017-03-27 18:14:14','Collectible Wines|Older Vintages|Has Large Label','115506m.jpg|767.jpg','Champagne Krug Vintage Brut 2000',300,115506,'Champagne',NULL,NULL,1,1,8),('ProductWine',20,'2017-03-27 18:14:14','Collectible Wines|Champagne Gifts|Congratulations|Older Vintages','119568m.jpg|988.jpg','Louis Roederer Cristal Brut 2005',249,119568,'Champagne',NULL,NULL,1,1,5),('ProductWine',21,'2017-03-27 18:14:15','Collectible Wines|Has Large Label|Older Vintages','113962m.jpg|105.jpg','Taittinger Comtes de Champagne Blanc de Blancs 2000',159.99,113962,'Champagne',NULL,NULL,1,1,8),('ProductWine',22,'2017-03-27 18:14:15','Older Vintages|Has Large Label','145751m.jpg|2956.jpg','Billecart-Salmon Brut Blanc de Blancs 2004',175.99,145751,'Champagne',NULL,NULL,1,1,2),('ProductWine',23,'2017-03-27 18:14:15','Champagne Gifts|Older Vintages|Great Bottles to Give|Has Large Label','123131m.jpg|99.jpg','Bollinger Grande Annee Brut Champagne 2004',155,123131,'Champagne',NULL,NULL,1,1,2),('ProductWine',24,'2017-03-27 18:14:15','Collectible Wines|Older Vintages|Has Large Label|94+ Rated Wine','114027m.jpg|99.jpg','Bollinger Grande Annee Brut Rose 2004',225,114027,'Champagne',NULL,NULL,1,2,2),('ProductWine',25,'2017-03-27 18:14:16','Older Vintages|Has Large Label','132370m.jpg','Moet & Chandon Grand Vintage Brut 2006',72.99,132370,'Champagne',NULL,NULL,1,1,3),('ProductWine',26,'2017-03-27 18:14:16','Boutique Wines|Older Vintages|Has Large Label','151715m.jpg|1819.jpg','Pierre Gimonnet Fleuron Blanc de Blancs Brut 2009',69.99,151715,'Champagne',NULL,NULL,1,1,9),('ProductWine',27,'2017-03-27 18:14:17','Older Vintages|Has Large Label','113974m.jpg|3081.jpg','Delamotte Blanc de Blancs 2002',95,113974,'Champagne',NULL,NULL,1,1,1),('ProductWine',28,'2017-03-27 18:14:17','Has Large Label','121629m.jpg|1714.jpg','Lanson Extra Age Brut',99.99,121629,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',29,'2017-03-27 18:14:17','Older Vintages','113895m.jpg|988.jpg','Louis Roederer Brut Vintage 2005',79.99,113895,'Champagne',NULL,NULL,1,1,5),('ProductWine',30,'2017-03-27 18:14:17','Older Vintages|Has Large Label','123409m.jpg|988.jpg','Louis Roederer Brut Rose 2008',78,123409,'Champagne',NULL,NULL,1,2,10),('ProductWine',31,'2017-03-27 18:14:17','Older Vintages','147210m.jpg','H. Blin Millesime Brut 2006',59.99,147210,'Champagne',NULL,NULL,1,1,3),('ProductWine',32,'2017-03-27 18:14:17','','105905m.jpg|99.jpg','Bollinger Brut Rose',110,105905,'Champagne',NULL,NULL,1,2,NULL),('ProductWine',33,'2017-03-27 18:14:17','Has Large Label','107200m.jpg|768.jpg','Charles Heidsieck Rose Reserve',80,107200,'Champagne',NULL,NULL,1,2,NULL),('ProductWine',34,'2017-03-27 18:14:17','Has Large Label','102077m.jpg|771.jpg','Ruinart Blanc de Blancs (375ML half-bottle)',57.99,102077,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',35,'2017-03-27 18:14:17','','120744m.jpg','Gaston-Chiquet Special Club Brut Millesime 2004',76.99,120744,'Champagne',NULL,NULL,1,1,2),('ProductWine',36,'2017-03-27 18:14:17','','129458m.jpg|20076.jpg','Pierre Paillard Blanc de Noirs Acte 1 Les Maillerettes Grand Cru',61.99,129458,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',37,'2017-03-27 18:14:17','Great Bottles to Give|Older Vintages|Has Large Label','125346m.jpg|773.jpg','Laurent-Perrier Brut Millesime 2004',64.99,125346,'Champagne',NULL,NULL,1,1,2),('ProductWine',38,'2017-03-27 18:14:17','Older Vintages','124994m.jpg|19896.jpg','Vranken Brut Champagne Diamant Bleu 1999',150,124994,'Champagne',NULL,NULL,1,1,11),('ProductWine',39,'2017-03-27 18:14:17','Older Vintages|Has Large Label','136517m.jpg|988.jpg','Louis Roederer Brut Vintage 2008',80,136517,'Champagne',NULL,NULL,1,1,10),('ProductWine',40,'2017-03-27 18:14:17','Older Vintages','121472m.jpg|988.jpg','Louis Roederer Brut Vintage 2006',72.99,121472,'Champagne',NULL,NULL,1,1,3),('ProductWine',41,'2017-03-27 18:14:17','Older Vintages','118716m.jpg|105.jpg','Taittinger Brut Millesime 2005',89,118716,'Champagne',NULL,NULL,1,1,5),('ProductWine',42,'2017-03-27 18:14:18','','116392m.jpg|773.jpg','Laurent-Perrier Brut Millesime 2002',70,116392,'Champagne',NULL,NULL,1,1,1),('ProductWine',43,'2017-03-27 18:14:18','Has Large Label|Older Vintages','136022m.jpg|988.jpg','Louis Roederer Brut Rose 2009',80,136022,'Champagne',NULL,NULL,1,2,9),('ProductWine',44,'2017-03-27 18:14:18','Older Vintages|Has Large Label','127372m.jpg|768.jpg','Charles Heidsieck Vintage Brut 2000',100,127372,'Champagne',NULL,NULL,1,1,8),('ProductWine',45,'2017-03-27 18:14:18','Older Vintages|Great Bottles to Give|Champagne Gifts|Has Large Label','114921m.jpg|106.jpg','Veuve Clicquot Vintage Brut 2004',90,114921,'Champagne',NULL,NULL,1,1,2),('ProductWine',46,'2017-03-27 18:14:18','Older Vintages|Has Large Label','120073m.jpg|1714.jpg','Lanson Gold Label Brut 2002',89.99,120073,'Champagne',NULL,NULL,1,1,1),('ProductWine',47,'2017-03-27 18:14:18','Older Vintages|Has Large Label','136658m.jpg|3766.jpg','Ayala Blanc de Blancs 2007',95,136658,'Champagne',NULL,NULL,1,1,6),('ProductWine',48,'2017-03-27 18:14:18','Has Large Label','147577m.jpg','Pehu-Simonet Selection Brut',53.99,147577,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',49,'2017-03-27 18:14:18','Collectible Wines','100278m.jpg','Egly-Ouriet Brut Tradition Grand Cru',77.99,100278,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',50,'2017-03-27 18:14:18','Has Large Label','120428m.jpg|768.jpg','Charles Heidsieck Brut Reserve',70,120428,'Champagne',NULL,NULL,1,3,NULL),('ProductWine',51,'2017-03-27 18:14:19','Has Large Label|94+ Rated Wine Under $75','148176m.jpg','Orin Swift Cellars D66 2013',38.99,148176,'Languedoc-Roussillon',NULL,NULL,2,4,12),('ProductWine',52,'2017-03-27 18:14:19','','153673m.jpg','Les Vignerons de Tautavel Cotes du Roussillon Villages Tautavel Silex 2012',34.99,153673,'Languedoc-Roussillon',NULL,NULL,2,5,13),('ProductWine',53,'2017-03-27 18:14:19','Has Large Label','147266m.jpg|18411.jpg','Bila-Haut by Michel Chapoutier Occultum Lapidem 2014',30,147266,'Languedoc-Roussillon',NULL,NULL,2,5,14),('ProductWine',54,'2017-03-27 18:14:19','Earthy &amp; Spicy|Has Large Label','133879m.jpg|18411.jpg','Bila-Haut by Michel Chapoutier Occultum Lapidem 2012',30,133879,'Languedoc-Roussillon',NULL,NULL,2,5,13),('ProductWine',55,'2017-03-27 18:14:20','Earthy &amp; Spicy|Collectible Wines','154433m.jpg|19345.jpg','Mas Jullien Coteaux du Languedoc Terrasses du Larzac 2011',48.99,154433,'Languedoc-Roussillon',NULL,NULL,2,5,15),('ProductWine',56,'2017-03-27 18:14:20','Big &amp; Bold','133869m.jpg|20421.jpg','Domaine de la Begude Bandol Rouge 2010',49.99,133869,'Provence',NULL,NULL,2,6,16),('ProductWine',57,'2017-03-27 18:14:20','Earthy &amp; Spicy|Green Wines|Has Large Label','147258m.jpg|18490.jpg','Chateau du Cedre Cahors Cedre Heritage 2012',18.99,147258,'Other French',NULL,NULL,2,7,13),('ProductWine',58,'2017-03-27 18:14:20','Earthy &amp; Spicy|Collectible Wines','133374m.jpg|19345.jpg','Mas Jullien Coteaux du Languedoc Terrasses du Larzac 2010',46.99,133374,'Languedoc-Roussillon',NULL,NULL,2,5,16),('ProductWine',59,'2017-03-27 18:14:20','Smooth &amp; Supple|Green Wines|Has Large Label','149950m.jpg|17774.jpg','Domaine Lafage Tessellae Old Vines GSM 2013',14,149950,'Languedoc-Roussillon',NULL,NULL,2,5,12),('ProductWine',60,'2017-03-27 18:14:20','Big &amp; Bold','142547m.jpg|21095.jpg','Mas Ventenac Cabardes 2011',28,142547,'Languedoc-Roussillon',NULL,NULL,2,4,15),('ProductWine',61,'2017-03-27 18:14:20','Big &amp; Bold|Has Large Label|Green Wines','130936m.jpg|19065.jpg','Gerard Bertrand Cotes du Roussillon Tautavel Hommage aux Vignerons 2011',43.99,130936,'Languedoc-Roussillon',NULL,NULL,2,5,15),('ProductWine',62,'2017-03-27 18:14:20','Earthy &amp; Spicy|Green Wines|Has Large Label','152423m.jpg|18280.jpg','Domaine de l\'Hortus Pic Saint Loup Grande Cuvee 2012',31.99,152423,'Languedoc-Roussillon',NULL,NULL,2,5,13),('ProductWine',63,'2017-03-27 18:14:21','Collectible Wines|Smooth &amp; Supple','139933m.jpg|20208.jpg','Maison L\'Envoye Morgon Cote du Py Vieilles Vignes 2012',19.99,139933,'Beaujolais',NULL,NULL,2,8,13),('ProductWine',64,'2017-03-27 18:14:21','Smooth &amp; Supple|Green Wines|Has Large Label','143935m.jpg|2109.jpg','Chateau Maris Continuite de Nature Le Linviere Minervois 2011',33.99,143935,'Languedoc-Roussillon',NULL,NULL,2,9,15),('ProductWine',65,'2017-03-27 18:14:21','Smooth &amp; Supple','128360m.jpg|17774.jpg','Domaine Lafage Tessellae Old Vines GSM 2011',13.99,128360,'Languedoc-Roussillon',NULL,NULL,2,5,15),('ProductWine',66,'2017-03-27 18:14:21','Big &amp; Bold','128952m.jpg|17774.jpg','Domaine Lafage Cuvee Nicolas 2012',13.99,128952,'Languedoc-Roussillon',NULL,NULL,2,10,13),('ProductWine',67,'2017-03-27 18:14:21','Earthy &amp; Spicy|Has Large Label','145989m.jpg|4543.jpg','Domaine du Gros Nore Bandol Rouge 2012',38.99,145989,'Provence',NULL,NULL,2,6,13),('ProductWine',68,'2017-03-27 18:14:21','Green Wines','142975m.jpg|1941.jpg','Domaine de Terrebrune Bandol 2010',37.99,142975,'Provence',NULL,NULL,2,6,16),('ProductWine',69,'2017-03-27 18:14:21','Collectible Wines','131401m.jpg','Michel Gay & Fils Beaune Toussaints Premier Cru Vieilles Vignes 2010',62,131401,'Burgundy',NULL,NULL,2,11,16),('ProductWine',70,'2017-03-27 18:14:21','Has Large Label','135086m.jpg','Orin Swift Cellars D66 2012',36.99,135086,'Languedoc-Roussillon',NULL,NULL,2,4,13),('ProductWine',71,'2017-03-27 18:14:21','Big &amp; Bold|Green Wines','115870m.jpg|19065.jpg','Gerard Bertrand Cotes du Roussillon Tautavel Hommage aux Vignerons 2007',50,115870,'Languedoc-Roussillon',NULL,NULL,2,5,6),('ProductWine',72,'2017-03-27 18:14:21','Earthy &amp; Spicy|Has Large Label','152494m.jpg|6940.jpg','Bernard Baudry Chinon La Croix Boissee 2012',48.99,152494,'Loire',NULL,NULL,2,12,13),('ProductWine',73,'2017-03-27 18:14:22','Smooth &amp; Supple|Has Large Label','148226m.jpg|20208.jpg','Maison L\'Envoye Fleurie 2013',21.99,148226,'Beaujolais',NULL,NULL,2,8,12),('ProductWine',74,'2017-03-27 18:14:22','Smooth &amp; Supple|Has Large Label','156399m.jpg|21979.jpg','Jean-Marc Burgaud Morgon Cote du Py 2013',25.99,156399,'Beaujolais',NULL,NULL,2,8,12),('ProductWine',75,'2017-03-27 18:14:22','Green Wines|Smooth &amp; Supple','143402m.jpg','Jean-Paul Brun Domaine des Terres Dorees Moulin-A-Vent 2013',24.99,143402,'Beaujolais',NULL,NULL,2,8,12),('ProductWine',76,'2017-03-27 18:14:23','Smooth &amp; Supple|Has Large Label','123236m.jpg|548.jpg','Duboeuf Moulin-a-Vent Domaine des Rosiers 2011',19.99,123236,'Beaujolais',NULL,NULL,2,8,15),('ProductWine',77,'2017-03-27 18:14:23','Smooth &amp; Supple|Has Large Label|Green Wines','126607m.jpg|19065.jpg','Gerard Bertrand Corbieres 2011',17.99,126607,'Languedoc-Roussillon',NULL,NULL,2,5,15),('ProductWine',78,'2017-03-27 18:14:23','','130049m.jpg','Domaine Gardies Cotes du Roussillon-Villages Les Milleres 2011',19.99,130049,'Languedoc-Roussillon',NULL,NULL,2,5,15),('ProductWine',79,'2017-03-27 18:14:23','Boutique Wines|Collectible Wines|Has Large Label','151451m.jpg|113.jpg','Louis Jadot Chambertin Clos de Beze 2013',379,151451,'Burgundy',NULL,NULL,2,11,12),('ProductWine',80,'2017-03-27 18:14:23','Earthy &amp; Spicy|Collectible Wines|Boutique Wines|Has Large Label','133854m.jpg|18215.jpg','Lucien Le Moine Charmes-Chambertin Grand Cru 2012',319,133854,'Burgundy',NULL,NULL,2,11,13),('ProductWine',81,'2017-03-27 18:14:23','Earthy &amp; Spicy|Collectible Wines|Boutique Wines|Has Large Label','133793m.jpg|18215.jpg','Lucien Le Moine Bonnes Mares Grand Cru 2012',399,133793,'Burgundy',NULL,NULL,2,11,13),('ProductWine',82,'2017-03-27 18:14:23','Collectible Wines|Boutique Wines|Earthy &amp; Spicy|Has Large Label','151452m.jpg|113.jpg','Louis Jadot Chapelle-Chambertin 2013',229,151452,'Burgundy',NULL,NULL,2,11,12),('ProductWine',83,'2017-03-27 18:14:24','Has Large Label','134868m.jpg|1588.jpg','Domaine Faiveley Corton Clos de Cortons Faiveley Grand Cru 2012',287,134868,'Burgundy',NULL,NULL,2,11,13),('ProductWine',84,'2017-03-27 18:14:24','Earthy &amp; Spicy|Collectible Wines|Boutique Wines|Has Large Label','133862m.jpg|18215.jpg','Lucien Le Moine Echezeaux Grand Cru 2012',319,133862,'Burgundy',NULL,NULL,2,11,13),('ProductWine',85,'2017-03-27 18:14:24','Has Large Label|Collectible Wines|Boutique Wines|Older Vintages','155842m.jpg','Domaine Claude Dugat Charmes Chambertin 2012',425,155842,'Burgundy',NULL,NULL,2,11,13),('ProductWine',86,'2017-03-27 18:14:24','Collectible Wines|Boutique Wines|Older Vintages|Precious Wine','103233m.jpg','Domaine de la Romanee Conti Romanee-Conti 2007',11250,103233,'Burgundy',NULL,NULL,2,11,6),('ProductWine',87,'2017-03-27 18:14:24','Collectible Wines','145653m.jpg|2031.jpg','Bouchard Pere & Fils Chambertin Clos de Beze Grand Cru 2013',399.99,145653,'Burgundy',NULL,NULL,2,11,12),('ProductWine',88,'2017-03-27 18:14:24','Collectible Wines|Smooth &amp; Supple|Older Vintages|Has Large Label','143194m.jpg','Domaine des Lambrays Clos Des Lambrays 2013',209,143194,'Burgundy',NULL,NULL,2,11,12),('ProductWine',89,'2017-03-27 18:14:24','Earthy &amp; Spicy|Collectible Wines|Boutique Wines|Has Large Label','133859m.jpg|18215.jpg','Lucien Le Moine Clos de Vougeot Grand Cru 2012',319,133859,'Burgundy',NULL,NULL,2,11,13),('ProductWine',90,'2017-03-27 18:14:24','Collectible Wines|Has Large Label','151477m.jpg|113.jpg','Louis Jadot Gevrey-Chambertin Clos St. Jacques 2013',208,151477,'Burgundy',NULL,NULL,2,11,12),('ProductWine',91,'2017-03-27 18:14:25','','152321m.jpg','Domaine Anne Gros et Jean-Paul Tollot Les Carretals Minervois 2013',50.99,152321,'Languedoc-Roussillon',NULL,NULL,2,5,12),('ProductWine',92,'2017-03-27 18:14:25','Green Wines|Older Vintages|Smooth &amp; Supple|Collectible Wines|Has Large Label','137351m.jpg|7007.jpg','Domaine de la Vougeraie Vougeot Clos du Prieure Monople Rouge 2011',100,137351,'Burgundy',NULL,NULL,2,11,15),('ProductWine',93,'2017-03-27 18:14:25','Earthy &amp; Spicy|Green Wines|Has Large Label','141962m.jpg|18490.jpg','Chateau du Cedre Cahors Le Cedre 2011',72.99,141962,'Other French',NULL,NULL,2,7,15),('ProductWine',94,'2017-03-27 18:14:25','Earthy &amp; Spicy','131307m.jpg','Jerome Chezeaux Nuits-Saint-George Premier Cru Les Pruliers 2011',91.99,131307,'Burgundy',NULL,NULL,2,11,15),('ProductWine',95,'2017-03-27 18:14:25','Has Large Label','133422m.jpg','Domaine Jules Desjourneys Moulin-a-Vent Les Michelons 2010',78.99,133422,'Beaujolais',NULL,NULL,2,8,16),('ProductWine',96,'2017-03-27 18:14:25','Has Large Label','136880m.jpg|17153.jpg','Domaine Henri Gouges Nuits St. Georges Premier Cru Clos des Porrets 2012',95,136880,'Burgundy',NULL,NULL,2,11,13),('ProductWine',97,'2017-03-27 18:14:25','Earthy &amp; Spicy','124201m.jpg','Jerome Chezeaux Nuits-Saint-George Premier Cru Les Pruliers 2010',69.99,124201,'Burgundy',NULL,NULL,2,11,16),('ProductWine',98,'2017-03-27 18:14:26','Collectible Wines|Has Large Label','125558m.jpg|113.jpg','Louis Jadot Gevrey-Chambertin Estournelles St. Jacques 2011',95,125558,'Burgundy',NULL,NULL,2,11,15),('ProductWine',99,'2017-03-27 18:14:26','Smooth &amp; Supple|Collectible Wines','125321m.jpg|113.jpg','Louis Jadot Beaune Premier Cru 150th Anniversary 2009',54.99,125321,'Burgundy',NULL,NULL,2,11,9),('ProductWine',100,'2017-03-27 18:14:26','Smooth &amp; Supple|Has Large Label','141362m.jpg|17762.jpg','Louis Latour Corton Grand Cru Domaine Latour 2012',80,141362,'Burgundy',NULL,NULL,2,11,13),('ProductWine',101,'2017-03-27 18:14:26','Light &amp; Fruity|Has Large Label','130040m.jpg|2031.jpg','Bouchard Pere & Fils Beaune Clos de la Mousse Premier Cru 2011',59.99,130040,'Burgundy',NULL,NULL,2,11,15),('ProductWine',102,'2017-03-27 18:14:26','Big &amp; Bold|Has Large Label','153911m.jpg|20335.jpg','Domaine Bitouzet Prieur Clos des Chenes Volnay Premier Cru 2011',78.99,153911,'Burgundy',NULL,NULL,2,11,15),('ProductWine',103,'2017-03-27 18:14:26','Earthy &amp; Spicy|Collectible Wines','143568m.jpg|19345.jpg','Mas Jullien Coteaux du Languedoc Cuvee Carlan 2012',57.99,143568,'Languedoc-Roussillon',NULL,NULL,2,5,13),('ProductWine',104,'2017-03-27 18:14:26','Has Large Label','145097m.jpg|17153.jpg','Domaine Henri Gouges Nuits St. Georges Les Chenes Carteaux 2012',77.99,145097,'Burgundy',NULL,NULL,2,11,13),('ProductWine',105,'2017-03-27 18:14:26','Earthy &amp; Spicy','124427m.jpg','Jerome Chezeaux Nuits-Saint-Georges Premier Cru Rue de Chaux 2010',69.99,124427,'Burgundy',NULL,NULL,2,11,16),('ProductWine',106,'2017-03-27 18:14:26','Collectible Wines|Smooth &amp; Supple|Has Large Label','130044m.jpg|2031.jpg','Bouchard Pere & Fils Volnay Caillerets Ancienne Cuvee Carnot 1er Cru 2010',77.99,130044,'Burgundy',NULL,NULL,2,11,16),('ProductWine',107,'2017-03-27 18:14:26','Has Large Label','130485m.jpg|20224.jpg','Domaine Thibault Liger-Belair Les Saint-Georges, Nuits-Saint-Georges Premier Cru 2011',139,130485,'Burgundy',NULL,NULL,2,11,15),('ProductWine',108,'2017-03-27 18:14:26','Green Wines|Collectible Wines|Smooth &amp; Supple|Has Large Label','128431m.jpg|7007.jpg','Domaine de la Vougeraie Nuits-Saint-Georges Premier Cru Les Damodes 2011',138,128431,'Burgundy',NULL,NULL,2,11,15),('ProductWine',109,'2017-03-27 18:14:26','Smooth &amp; Supple|Has Large Label','144657m.jpg|17773.jpg','Domaine Chanson Savigny-Dominode 1er Cru 2012',72.99,144657,'Burgundy',NULL,NULL,2,11,13),('ProductWine',110,'2017-03-27 18:14:26','Big &amp; Bold','153910m.jpg|20335.jpg','Domaine Bitouzet Prieur Les Mitans Volnay Premier Cru 2011',63.99,153910,'Burgundy',NULL,NULL,2,11,15),('ProductWine',111,'2017-03-27 18:14:26','Smooth &amp; Supple','137875m.jpg|20709.jpg','Chateau du Moulin a Vent Champ de Cour 2011',66.99,137875,'Beaujolais',NULL,NULL,2,8,15),('ProductWine',112,'2017-03-27 18:14:26','Green Wines','146573m.jpg','Aurelien Verdet Chambolle Musigny Les Condemennes 2011',79.99,146573,'Burgundy',NULL,NULL,2,11,15),('ProductWine',113,'2017-03-27 18:14:27','','129335m.jpg','Domaine Rollin Pere and Fils Pernand Vergelesses Premier Cru Ile de Vergelesses 2010',51.99,129335,'Burgundy',NULL,NULL,2,11,16),('ProductWine',114,'2017-03-27 18:14:27','','150918m.jpg|2031.jpg','Bouchard Pere & Fils Premier Cru Beaune Teurons Domaine 2012',65.99,150918,'Burgundy',NULL,NULL,2,11,13),('ProductWine',115,'2017-03-27 18:14:27','Has Large Label','156860m.jpg|17683.jpg','Chateau de Pampelonne Cotes de Provence Rose 2015',19.99,156860,'Provence',NULL,NULL,3,2,17),('ProductWine',116,'2017-03-27 18:14:27','Has Large Label','152371m.jpg|19043.jpg','Chateau d\'Esclans Whispering Angel Rose 2015',20,152371,'Provence',NULL,NULL,3,2,17),('ProductWine',117,'2017-03-27 18:14:28','Light &amp; Fruity|Green Wines','144092m.jpg|587.jpg','Domaine Tempier Bandol Rose 2014',39.99,144092,'Provence',NULL,NULL,3,2,14),('ProductWine',118,'2017-03-27 18:14:28','Has Large Label','144513m.jpg|19043.jpg','Chateau d\'Esclans Les Clans Rose 2013',80,144513,'Provence',NULL,NULL,3,2,12),('ProductWine',119,'2017-03-27 18:14:28','','118069m.jpg|19043.jpg','Chateau d\'Esclans Les Clans Rose 2010',75,118069,'Provence',NULL,NULL,3,2,16),('ProductWine',120,'2017-03-27 18:14:28','','143572m.jpg|20664.jpg','Chateau Simone Rose 2013',70.99,143572,'Provence',NULL,NULL,3,2,12),('ProductWine',121,'2017-03-27 18:14:28','Has Large Label','144156m.jpg|4543.jpg','Domaine du Gros Nore Bandol Rose 2014',35,144156,'Provence',NULL,NULL,3,2,14),('ProductWine',122,'2017-03-27 18:14:29','','140521m.jpg|20338.jpg','Clos Cibonne Rose Tradition 2013',26.99,140521,'Provence',NULL,NULL,3,2,12),('ProductWine',123,'2017-03-27 18:14:29','Has Large Label','141513m.jpg|17946.jpg','Domaines Ott Chateau de Selle Cotes de Provence Rose 2014',48.99,141513,'Provence',NULL,NULL,3,2,14),('ProductWine',124,'2017-03-27 18:14:29','Has Large Label','138579m.jpg|19043.jpg','Chateau d\'Esclans Whispering Angel Rose 2014',25,138579,'Provence',NULL,NULL,3,2,14),('ProductWine',125,'2017-03-27 18:14:32','Green Wines|Has Large Label','153085m.jpg|19751.jpg','Miraval Rose 2015',30,153085,'Provence',NULL,NULL,3,2,17),('ProductWine',126,'2017-03-27 18:14:32','Has Large Label','141677m.jpg|2583.jpg','Commanderie de la Bargemone Rose Coteaux d\'Aix en Provence 2014',18.99,141677,'Provence',NULL,NULL,3,2,14),('ProductWine',127,'2017-03-27 18:14:33','Green Wines|Has Large Label|Boutique Wines','146019m.jpg|20317.jpg','Chene Bleu Rose 2014',35.99,146019,'Other French',NULL,NULL,3,2,14),('ProductWine',128,'2017-03-27 18:14:33','Green Wines','143182m.jpg|19065.jpg','Gerard Bertrand Gris Blanc Rose 2014',17,143182,'Languedoc-Roussillon',NULL,NULL,3,2,14),('ProductWine',129,'2017-03-27 18:14:33','Has Large Label','146304m.jpg|18500.jpg','JCB No. 5 Rose 2014',24.99,146304,'Provence',NULL,NULL,3,2,14),('ProductWine',130,'2017-03-27 18:14:33','','128956m.jpg|19043.jpg','Chateau d\'Esclans Rose 2013',35,128956,'Provence',NULL,NULL,3,2,12),('ProductWine',131,'2017-03-27 18:14:33','Has Large Label','144919m.jpg|20956.jpg','Minuty Prestige Rose 2014',28.99,144919,'Provence',NULL,NULL,3,2,14),('ProductWine',132,'2017-03-27 18:14:33','Green Wines','139765m.jpg|19065.jpg','Gerard Bertrand Cote des Roses Rose 2014',15.99,139765,'Languedoc-Roussillon',NULL,NULL,3,2,14),('ProductWine',133,'2017-03-27 18:14:34','Has Large Label','120391m.jpg|19043.jpg','Chateau d\'Esclans Whispering Angel Rose 2012',22,120391,'Provence',NULL,NULL,3,2,13),('ProductWine',134,'2017-03-27 18:14:34','Has Large Label|Green Wines','150265m.jpg|19751.jpg','Miraval Rose (3 Liter) 2014',160,150265,'Provence',NULL,NULL,3,2,14),('ProductWine',135,'2017-03-27 18:14:34','Has Large Label|Green Wines','140943m.jpg|19751.jpg','Miraval Rose (1.5 Liter Magnum) 2014',65,140943,'Provence',NULL,NULL,3,2,14),('ProductWine',136,'2017-03-27 18:14:34','Has Large Label|Green Wines','140639m.jpg|19751.jpg','Miraval Rose 2014',30,140639,'Provence',NULL,NULL,3,2,14),('ProductWine',137,'2017-03-27 18:14:34','Has Large Label','128753m.jpg|19751.jpg','Miraval Rose 2013',30,128753,'Provence',NULL,NULL,3,2,12),('ProductWine',138,'2017-03-27 18:14:34','Has Large Label','154327m.jpg','Aix Rose 2015',19.99,154327,'Provence',NULL,NULL,3,2,17),('ProductWine',139,'2017-03-27 18:14:35','90+ Rated Wine|Has Large Label','156159m.jpg|21256.jpg','Domaine de la Taille Aux Loups Vin de France Bretonniere 2014',38,156159,'Other French',NULL,NULL,4,13,14),('ProductWine',140,'2017-03-27 18:14:35','Collectible Wines|Rich &amp; Creamy','111496m.jpg','Philippe Foreau Vouvray Moelleux Clos Naudin 2008',45.99,111496,'Loire',NULL,NULL,4,13,10),('ProductWine',141,'2017-03-27 18:14:35','Green Wines','156235m.jpg|21723.jpg','Eric Chevalier La Noe Muscadet Cotes de Grand Lieu Sur Lie 2014',18,156235,'Loire',NULL,NULL,4,14,14),('ProductWine',142,'2017-03-27 18:14:35','Light &amp; Crisp|Older Vintages','149578m.jpg|21164.jpg','Domaine Vincent Careme Les Clos 2010',44.99,149578,'Loire',NULL,NULL,4,13,16),('ProductWine',143,'2017-03-27 18:14:35','Older Vintages|Fruity &amp; Smooth','140895m.jpg','Domaine Huet Vouvray Moelleux Le Haut-Lieu 2009',44.99,140895,'Loire',NULL,NULL,4,13,9),('ProductWine',144,'2017-03-27 18:14:35','Light &amp; Crisp|Collectible Wines|Has Large Label','125257m.jpg','Domaine Louis Michel et Fils Chablis Montee de Tonnerre Premier Cru 2011',36,125257,'Chablis',NULL,NULL,4,15,15),('ProductWine',145,'2017-03-27 18:14:35','Light &amp; Crisp|Has Large Label','135322m.jpg|19863.jpg','Alphonse Mellot La Moussiere Sancerre Blanc 2013',35.99,135322,'Loire',NULL,NULL,4,16,12),('ProductWine',146,'2017-03-27 18:14:35','Fruity &amp; Smooth|Screw Cap Wines|Has Large Label','127253m.jpg|1276.jpg','Domaine des Baumard Carte d\'Or Coteaux du Layon 2010',29,127253,'Loire',NULL,NULL,4,13,16),('ProductWine',147,'2017-03-27 18:14:35','Older Vintages|Has Large Label','142365m.jpg|973.jpg','Domaines Schlumberger Grand Cru Saering Riesling 2010',31.99,142365,'Alsace',NULL,NULL,4,17,16),('ProductWine',148,'2017-03-27 18:14:35','Green Wines|Older Vintages|Has Large Label','145542m.jpg','Zind-Humbrecht Clos Jebsal Pinot Gris (375ML half-bottle) 2008',49.99,145542,'Alsace',NULL,NULL,4,18,10),('ProductWine',149,'2017-03-27 18:14:35','Collectible Wines|Light &amp; Crisp|Has Large Label','129316m.jpg|1003.jpg','William Fevre Vaillons Premier Cru Chablis 2012',55,129316,'Chablis',NULL,NULL,4,15,13),('ProductWine',150,'2017-03-27 18:14:35','Light &amp; Crisp|Has Large Label','143625m.jpg|1003.jpg','William Fevre Montmains Premier Cru Chablis (375ML half-bottle) 2012',35.99,143625,'Chablis',NULL,NULL,4,15,13),('ProductWine',151,'2017-03-27 18:14:36','Has Large Label','151775m.jpg','Domaine Huet Vouvray Sec Le Haut Lieu 2014',32.99,151775,'Loire',NULL,NULL,4,13,14),('ProductWine',152,'2017-03-27 18:14:36','Has Large Label','144599m.jpg|19817.jpg','Billaud-Simon Chablis Premier Cru Montee de Tonnerre 2012',49.99,144599,'Chablis',NULL,NULL,4,15,13),('ProductWine',153,'2017-03-27 18:14:36','Older Vintages|Has Large Label','145988m.jpg|973.jpg','Domaines Schlumberger Grand Cru Saering Riesling 2011',34.99,145988,'Alsace',NULL,NULL,4,17,15),('ProductWine',154,'2017-03-27 18:14:36','Fruity &amp; Smooth|90+ Rated Wine','138738m.jpg|3203.jpg','Simonnet-Febvre Chablis Premier Cru Vaillons 2012',34.99,138738,'Chablis',NULL,NULL,4,15,13),('ProductWine',155,'2017-03-27 18:14:36','Collectible Wines|Light &amp; Crisp','129326m.jpg|1003.jpg','William Fevre Vaillons Premier Cru Chablis 2011',44.99,129326,'Chablis',NULL,NULL,4,15,15),('ProductWine',156,'2017-03-27 18:14:36','Light &amp; Crisp|Has Large Label','118660m.jpg|17554.jpg','Lucien Crochet Sancerre Le Chene 2010',34.99,118660,'Loire',NULL,NULL,4,16,16),('ProductWine',157,'2017-03-27 18:14:36','Light &amp; Crisp','124026m.jpg','Domaine de la Perriere Sancerre 2012',23.99,124026,'Loire',NULL,NULL,4,16,13),('ProductWine',158,'2017-03-27 18:14:36','','129609m.jpg|1133.jpg','Jean-Paul Droin Chablis Mont de Milieu Premier Cru 2012',42.99,129609,'Burgundy',NULL,NULL,4,15,13),('ProductWine',159,'2017-03-27 18:14:36','Collectible Wines|Older Vintages|Has Large Label','130698m.jpg|136.jpg','Trimbach Clos Ste. Hune 2007',253,130698,'Alsace',NULL,NULL,4,17,6),('ProductWine',160,'2017-03-27 18:14:37','Collectible Wines|Has Large Label','130185m.jpg|1003.jpg','William Fevre Les Preuses Grand Cru Chablis 2012',114.99,130185,'Chablis',NULL,NULL,4,15,13),('ProductWine',161,'2017-03-27 18:14:37','Collectible Wines|Light &amp; Crisp|Has Large Label','129314m.jpg|1003.jpg','William Fevre Les Clos Chablis Grand Cru 2012',132.99,129314,'Chablis',NULL,NULL,4,15,13),('ProductWine',162,'2017-03-27 18:14:37','','145654m.jpg|2031.jpg','Bouchard Pere & Fils Corton Charlemagne Grand Cru 2013',199.99,145654,'Burgundy',NULL,NULL,4,15,12),('ProductWine',163,'2017-03-27 18:14:37','Boutique Wines|Collectible Wines|Rich &amp; Creamy|Older Vintages|Has Large Label','128359m.jpg','Bonneau du Martray Corton Charlemagne Grand Cru 2010',179.99,128359,'Burgundy',NULL,NULL,4,15,16),('ProductWine',164,'2017-03-27 18:14:38','Collectible Wines|Fruity &amp; Smooth|Has Large Label','157583m.jpg|1003.jpg','William Fevre Bougros Cote Bouguerots Chablis Grand Cru 2014',102.99,157583,'Chablis',NULL,NULL,4,15,14),('ProductWine',165,'2017-03-27 18:14:38','Collectible Wines|Has Large Label','125566m.jpg|113.jpg','Louis Jadot Corton-Charlemagne 2011',200,125566,'Burgundy',NULL,NULL,4,15,15),('ProductWine',166,'2017-03-27 18:14:38','Collectible Wines|Light &amp; Crisp|Great Bottles to Give|Has Large Label','145644m.jpg|1003.jpg','William Fevre Les Clos Chablis Grand Cru (1.5 L Magnum) 2013',229,145644,'Chablis',NULL,NULL,4,15,12),('ProductWine',167,'2017-03-27 18:14:38','Collectible Wines|Light &amp; Crisp|Has Large Label|Great Bottles to Give','143882m.jpg|1003.jpg','William Fevre Les Clos Chablis Grand Cru 2013',113.99,143882,'Chablis',NULL,NULL,4,15,12),('ProductWine',168,'2017-03-27 18:14:38','Collectible Wines|Older Vintages|Boutique Wines','146863m.jpg|1985.jpg','Didier Dagueneau Pouilly-Fume Pur Sang 2002',129,146863,'Loire',NULL,NULL,4,16,1),('ProductWine',169,'2017-03-27 18:14:38','Has Large Label','151604m.jpg|112.jpg','Joseph Drouhin Puligny-Montrachet Folatieres 2013',115.99,151604,'Burgundy',NULL,NULL,4,15,12),('ProductWine',170,'2017-03-27 18:14:38','Collectible Wines|Fruity &amp; Smooth|Has Large Label','145647m.jpg|1003.jpg','William Fevre Valmur Domaine Grand Cru 2013',121.99,145647,'Chablis',NULL,NULL,4,15,12),('ProductWine',171,'2017-03-27 18:14:38','Collectible Wines|Has Large Label','151480m.jpg|113.jpg','Louis Jadot Corton-Charlemagne 2013',187,151480,'Burgundy',NULL,NULL,4,15,12),('ProductWine',172,'2017-03-27 18:14:38','Has Large Label','126308m.jpg','Henri Boillot Puligny Montrachet Clos de la Moucher Premier Cru 2011',126.99,126308,'Burgundy',NULL,NULL,4,15,15),('ProductWine',173,'2017-03-27 18:14:39','Green Wines','145163m.jpg|3132.jpg','Christian Moreau Chablis Les Clos Clos des Hospices 2012',133.99,145163,'Chablis',NULL,NULL,4,15,13),('ProductWine',174,'2017-03-27 18:14:39','Green Wines|Fruity &amp; Smooth','145765m.jpg','Zind-Humbrecht Rangen Clos St. Urbain Grand Cru Riesling 2013',118,145765,'Alsace',NULL,NULL,4,17,12),('ProductWine',175,'2017-03-27 18:14:39','Collectible Wines|Boutique Wines','145651m.jpg|2031.jpg','Bouchard Pere & Fils Meursault Perrieres 2013',141.99,145651,'Burgundy',NULL,NULL,4,15,12),('ProductWine',176,'2017-03-27 18:14:39','Rich &amp; Creamy|Collectible Wines|Boutique Wines|94+ Rated Wine','133844m.jpg','Pierre Yves Colin-Morey Corton Charlemagne Grand Cru 2011',248.99,133844,'Burgundy',NULL,NULL,4,15,15),('ProductWine',177,'2017-03-27 18:14:39','Screw Cap Wines|Has Large Label','124054m.jpg|1577.jpg','Domaine Laroche Les Clos Grand Cru Chablis 2009',109,124054,'Chablis',NULL,NULL,4,15,9),('ProductWine',178,'2017-03-27 18:14:39','Fruity &amp; Smooth|Collectible Wines|Has Large Label','119974m.jpg|112.jpg','Joseph Drouhin Clos des Mouches Premier Cru Blanc 2010',120,119974,'Burgundy',NULL,NULL,4,15,16),('ProductWine',179,'2017-03-27 18:14:39','Fruity &amp; Smooth|Older Vintages|Great Bottles to Give|Has Large Label','128960m.jpg|136.jpg','Trimbach Cuvee Frederic Emile Riesling 2007',68,128960,'Alsace',NULL,NULL,4,17,6),('ProductWine',180,'2017-03-27 18:14:39','Fruity &amp; Smooth','122936m.jpg','Domaine Huet Vouvray Moelleux Premiere Trie Le Mont 2010',66.99,122936,'Loire',NULL,NULL,4,13,16),('ProductWine',181,'2017-03-27 18:14:40','Collectible Wines|Older Vintages','112786m.jpg','Philippe Foreau Vouvray Moelleux Reserve Clos Naudin 2009',87.99,112786,'Loire',NULL,NULL,4,13,9),('ProductWine',182,'2017-03-27 18:14:40','Light &amp; Crisp|Has Large Label','142333m.jpg|19863.jpg','Alphonse Mellot Edmond Sancerre Blanc 2012',72.99,142333,'Loire',NULL,NULL,4,16,13),('ProductWine',183,'2017-03-27 18:14:40','Collectible Wines|Light &amp; Crisp|Older Vintages','112005m.jpg','Philippe Foreau Vouvray Moelleux Clos Naudin 2009',77.99,112005,'Loire',NULL,NULL,4,13,9),('ProductWine',184,'2017-03-27 18:14:40','Collectible Wines|Light &amp; Crisp|Has Large Label','145645m.jpg|1003.jpg','William Fevre Les Clos Chablis Grand Cru (375ML half-bottle) 2013',67.99,145645,'Chablis',NULL,NULL,4,15,12),('ProductWine',185,'2017-03-27 18:14:40','Fruity &amp; Smooth|Older Vintages|Has Large Label','155777m.jpg|1568.jpg','Hugel Riesling Jubilee Grand Cru 2009',70.99,155777,'Alsace',NULL,NULL,4,17,9),('ProductWine',186,'2017-03-27 18:14:40','Rich &amp; Creamy|Collectible Wines|Has Large Label','125255m.jpg|3146.jpg','Domaine Vincent Girardin Puligny-Montrachet Les Folatieres Premier Cru 2010',99,125255,'Burgundy',NULL,NULL,4,15,16),('ProductWine',187,'2017-03-27 18:14:40','Light &amp; Crisp|Collectible Wines|Has Large Label','125320m.jpg|1003.jpg','William Fevre Les Clos Chablis Grand Cru 2010',89.99,125320,'Chablis',NULL,NULL,4,15,16),('ProductWine',188,'2017-03-27 18:14:40','Boutique Wines|Fruity &amp; Smooth|Older Vintages','140925m.jpg','Domaine Huet Vouvray Moelleux Premiere Trie Clos du Bourg 2008',74.99,140925,'Loire',NULL,NULL,4,13,10),('ProductWine',189,'2017-03-27 18:14:40','Collectible Wines|Boutique Wines|Collectible Wines|Has Large Label|Great Bottles to Give|Older Vintages','151661m.jpg|17773.jpg','Domaine Chanson Corton Vergennes 2011',175,151661,'Burgundy',NULL,NULL,4,15,15),('ProductWine',190,'2017-03-27 18:14:40','Collectible Wines|Has Large Label','145646m.jpg|1003.jpg','William Fevre Les Preuses Grand Cru Chablis 2013',110,145646,'Chablis',NULL,NULL,4,15,12),('ProductWine',191,'2017-03-27 18:14:40','Collectible Wines|Fruity &amp; Smooth|Has Large Label','145642m.jpg|1003.jpg','William Fevre Bougros Cote Bouguerots Chablis Grand Cru 2013',93.99,145642,'Chablis',NULL,NULL,4,15,12),('ProductWine',192,'2017-03-27 18:14:41','Collectible Wines|Fruity &amp; Smooth|Has Large Label','130180m.jpg|1003.jpg','William Fevre Bougros Cote Bouguerots Chablis Grand Cru 2012',98.99,130180,'Chablis',NULL,NULL,4,15,13),('ProductWine',193,'2017-03-27 18:14:41','Has Large Label','151500m.jpg|113.jpg','Louis Jadot Puligny-Montrachet Clos de la Garenne 2013',112,151500,'Burgundy',NULL,NULL,4,15,12),('ProductWine',194,'2017-03-27 18:14:41','Has Large Label','142337m.jpg|19863.jpg','Alphonse Mellot Les Romains Sancerre Blanc 2012',62,142337,'Loire',NULL,NULL,4,16,13),('ProductWine',195,'2017-03-27 18:14:41','Has Large Label','142340m.jpg|19863.jpg','Alphonse Mellot Satellite Sancerre Blanc 2012',83.99,142340,'Loire',NULL,NULL,4,16,13),('ProductWine',196,'2017-03-27 18:14:41','Has Large Label','142339m.jpg|19863.jpg','Alphonse Mellot Les Herses Sancerre Blanc 2012',68.99,142339,'Loire',NULL,NULL,4,16,13),('ProductWine',197,'2017-03-27 18:14:41','Light &amp; Crisp|Collectible Wines','125260m.jpg','Domaine Louis Michel et Fils Chablis Grenouilles Grand Cru 2011',65,125260,'Chablis',NULL,NULL,4,15,15),('ProductWine',198,'2017-03-27 18:14:41','Collectible Wines|Green Wines|Has Large Label|Fruity &amp; Smooth','145161m.jpg|3132.jpg','Christian Moreau Chablis Grand Cru Les Clos 2012',91.99,145161,'Chablis',NULL,NULL,4,15,13),('ProductWine',199,'2017-03-27 18:14:41','Fruity &amp; Smooth','133034m.jpg|1574.jpg','Chateau Fuisse Les Combettes Pouilly-Fuisse 2011',69.99,133034,'Burgundy',NULL,NULL,4,15,15),('ProductWine',200,'2017-03-27 18:14:41','Rich &amp; Creamy|Older Vintages','129330m.jpg','Domaine Jean-Marc Pillot Chassagne Montrachet Premier Cru Les Baudines 2009',59.99,129330,'Burgundy',NULL,NULL,4,15,9),('ProductWine',201,'2017-03-27 18:14:42','Rich &amp; Creamy','146592m.jpg','Philippe Colin Chassagne Montrachet 1er Cru Morgeot 2012',90,146592,'Burgundy',NULL,NULL,4,15,13),('ProductWine',202,'2017-03-27 18:14:42','Rich &amp; Creamy','115507m.jpg','Domaine Jean-Marc Pillot Chassagne Montrachet Premier Cru Caillerets 2007',85,115507,'Burgundy',NULL,NULL,4,15,6),('ProductWine',203,'2017-03-27 18:14:42','Fruity &amp; Smooth|Has Large Label','157578m.jpg|1003.jpg','William Fevre Montee de Tonnerre Domaine Premier Cru Chablis 2014',57.99,157578,'Chablis',NULL,NULL,4,15,14),('ProductWine',204,'2017-03-27 18:14:42','Has Large Label','157580m.jpg|1003.jpg','William Fevre Vaulorent Premier Cru 2014',66.99,157580,'Chablis',NULL,NULL,4,15,14),('ProductWine',205,'2017-03-27 18:14:43','Light &amp; Crisp|Collectible Wines','125927m.jpg|796.jpg','Brocard Les Clos Grand Cru Chablis 2010',73.99,125927,'Chablis',NULL,NULL,4,15,16),('ProductWine',206,'2017-03-27 18:14:43','Light &amp; Crisp|Collectible Wines','113024m.jpg|796.jpg','Brocard Les Clos Grand Cru Chablis 2009',88,113024,'Chablis',NULL,NULL,4,15,9),('ProductWine',207,'2017-03-27 18:14:43','Light &amp; Crisp|Collectible Wines|Has Large Label','126060m.jpg','Domaine Louis Michel et Fils Chablis Vaudesir Grand Cru 2010',77,126060,'Chablis',NULL,NULL,4,15,16);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_supplier`
--

DROP TABLE IF EXISTS `product_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_supplier` (
  `quantity` int(11) DEFAULT NULL,
  `id_supplier` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  PRIMARY KEY (`id_product`,`id_supplier`),
  KEY `FK_pq9fsn8sc7r04v093qrepviqi` (`id_supplier`),
  CONSTRAINT `FK_iyxhdt5nu3ngo9xqxcjc6kwhw` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`),
  CONSTRAINT `FK_pq9fsn8sc7r04v093qrepviqi` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_supplier`
--

LOCK TABLES `product_supplier` WRITE;
/*!40000 ALTER TABLE `product_supplier` DISABLE KEYS */;
INSERT INTO `product_supplier` VALUES (30,1,1),(15,2,1),(20,3,2),(29,1,3),(26,2,3),(42,1,4),(5,1,5),(47,2,5),(30,1,6),(46,3,6),(7,1,7),(34,2,7),(16,1,8),(27,1,9),(25,2,9),(5,1,10),(45,1,11),(28,2,11),(12,1,12),(21,3,12),(41,1,13),(14,2,13),(2,1,14),(42,1,15),(33,2,15),(31,1,16),(2,1,17),(35,2,17),(9,1,18),(31,3,18),(42,1,19),(18,2,19),(30,1,20),(8,1,21),(41,2,21),(18,1,22),(33,1,23),(24,2,23),(48,1,24),(13,3,24),(24,1,25),(25,2,25),(14,1,26),(24,1,27),(18,2,27),(16,1,28),(36,1,29),(11,2,29),(9,1,30),(24,3,30),(15,1,31),(47,2,31),(42,1,32),(37,1,33),(29,2,33),(10,1,34),(33,1,35),(25,2,35),(39,1,36),(38,3,36),(17,1,37),(6,2,37),(48,1,38),(14,1,39),(18,2,39),(50,1,40),(35,1,41),(9,2,41),(26,1,42),(10,3,42),(20,1,43),(45,2,43),(13,1,44),(21,1,45),(21,2,45),(32,1,46),(10,1,47),(39,2,47),(2,1,48),(45,3,48),(3,1,49),(2,2,49),(44,1,50),(32,1,51),(10,2,51),(47,1,52),(21,1,53),(25,2,53),(7,1,54),(49,3,54),(6,1,55),(35,2,55),(31,1,56),(23,1,57),(49,2,57),(25,1,58),(42,1,59),(24,2,59),(12,1,60),(31,3,60),(42,1,61),(18,2,61),(33,1,62),(1,1,63),(42,2,63),(10,1,64),(49,1,65),(31,2,65),(16,1,66),(29,3,66),(33,1,67),(31,2,67),(6,1,68),(3,1,69),(18,2,69),(20,1,70),(40,1,71),(26,2,71),(6,1,72),(30,3,72),(11,1,73),(47,2,73),(40,1,74),(48,1,75),(29,2,75),(35,1,76),(20,1,77),(3,2,77),(23,1,78),(8,3,78),(18,1,79),(35,2,79),(49,1,80),(41,1,81),(12,2,81),(39,1,82),(24,1,83),(42,2,83),(16,1,84),(20,3,84),(4,1,85),(5,2,85),(34,1,86),(43,1,87),(18,2,87),(9,1,88),(26,1,89),(43,2,89),(28,1,90),(26,3,90),(47,1,91),(6,2,91),(47,1,92),(20,1,93),(11,2,93),(11,1,94),(42,1,95),(24,2,95),(17,1,96),(17,3,96),(15,1,97),(10,2,97),(19,1,98),(28,1,99),(11,2,99),(39,1,100),(9,1,101),(47,2,101),(17,1,102),(19,3,102),(32,1,103),(5,2,103),(28,1,104),(15,1,105),(44,2,105),(42,1,106),(12,1,107),(23,2,107),(8,1,108),(4,3,108),(38,1,109),(20,2,109),(2,1,110),(10,1,111),(40,2,111),(17,1,112),(23,1,113),(10,2,113),(47,1,114),(9,3,114),(12,1,115),(39,2,115),(14,1,116),(2,1,117),(37,2,117),(8,1,118),(12,1,119),(2,2,119),(22,1,120),(37,3,120),(10,1,121),(30,2,121),(13,1,122),(37,1,123),(27,2,123),(3,1,124),(34,1,125),(12,2,125),(49,1,126),(11,3,126),(43,1,127),(21,2,127),(30,1,128),(18,1,129),(9,2,129),(21,1,130),(28,1,131),(16,2,131),(38,1,132),(28,3,132),(23,1,133),(16,2,133),(6,1,134),(46,1,135),(29,2,135),(15,1,136),(47,1,137),(17,2,137),(37,1,138),(19,3,138),(37,1,139),(43,2,139),(21,1,140),(47,1,141),(9,2,141),(21,1,142),(37,1,143),(34,2,143),(27,1,144),(26,3,144),(6,1,145),(46,2,145),(5,1,146),(40,1,147),(4,2,147),(46,1,148),(25,1,149),(47,2,149),(23,1,150),(36,3,150),(2,1,151),(10,2,151),(21,1,152),(7,1,153),(48,2,153),(32,1,154),(17,1,155),(45,2,155),(37,1,156),(8,3,156),(25,1,157),(12,2,157),(24,1,158),(43,1,159),(9,2,159),(38,1,160),(38,1,161),(35,2,161),(20,1,162),(28,3,162),(21,1,163),(6,2,163),(18,1,164),(29,1,165),(24,2,165),(1,1,166),(50,1,167),(34,2,167),(33,1,168),(3,3,168),(27,1,169),(50,2,169),(43,1,170),(33,1,171),(48,2,171),(22,1,172),(21,1,173),(34,2,173),(24,1,174),(27,3,174),(26,1,175),(17,2,175),(24,1,176),(33,1,177),(44,2,177),(33,1,178),(49,1,179),(39,2,179),(39,1,180),(5,3,180),(50,1,181),(11,2,181),(28,1,182),(12,1,183),(25,2,183),(8,1,184),(19,1,185),(22,2,185),(18,1,186),(22,3,186),(8,1,187),(41,2,187),(10,1,188),(16,1,189),(25,2,189),(46,1,190),(7,1,191),(39,2,191),(30,1,192),(20,3,192),(4,1,193),(11,2,193),(5,1,194),(7,1,195),(17,2,195),(24,1,196),(31,1,197),(22,2,197),(18,1,198),(39,3,198),(32,1,199),(1,2,199),(15,1,200),(28,1,201),(28,2,201),(33,1,202),(42,1,203),(24,2,203),(37,1,204),(48,3,204),(45,1,205),(22,2,205),(46,1,206),(50,1,207),(6,2,207);
/*!40000 ALTER TABLE `product_supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producttype`
--

DROP TABLE IF EXISTS `producttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttype`
--

LOCK TABLES `producttype` WRITE;
/*!40000 ALTER TABLE `producttype` DISABLE KEYS */;
INSERT INTO `producttype` VALUES (1,'Champagne'),(2,'Vins Rouges'),(3,'Rosés'),(4,'Vins Blancs');
/*!40000 ALTER TABLE `producttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productvarietal`
--

DROP TABLE IF EXISTS `productvarietal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productvarietal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productvarietal`
--

LOCK TABLES `productvarietal` WRITE;
/*!40000 ALTER TABLE `productvarietal` DISABLE KEYS */;
INSERT INTO `productvarietal` VALUES (1,'Vintage'),(2,'Rosé'),(3,'Non-Vintage'),(4,'Other Red Blends'),(5,'Rhone Red Blends'),(6,'Mourvedre'),(7,'Malbec'),(8,'Gamay'),(9,'Other Red Wine'),(10,'Grenache'),(11,'Pinot Noir'),(12,'Cabernet Franc'),(13,'Chenin Blanc'),(14,'Other White Wine'),(15,'Chardonnay'),(16,'Sauvignon Blanc'),(17,'Riesling'),(18,'Pinot Gris/Grigio');
/*!40000 ALTER TABLE `productvarietal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productvintage`
--

DROP TABLE IF EXISTS `productvintage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productvintage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `year` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productvintage`
--

LOCK TABLES `productvintage` WRITE;
/*!40000 ALTER TABLE `productvintage` DISABLE KEYS */;
INSERT INTO `productvintage` VALUES (1,2002),(2,2004),(3,2006),(4,1998),(5,2005),(6,2007),(7,1989),(8,2000),(9,2009),(10,2008),(11,1999),(12,2013),(13,2012),(14,2014),(15,2011),(16,2010),(17,2015);
/*!40000 ALTER TABLE `productvintage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `idCountry` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_5uil1l5cjg5xj27n16fximefe` (`idCountry`),
  CONSTRAINT `FK_5uil1l5cjg5xj27n16fximefe` FOREIGN KEY (`idCountry`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1,'Idf',1);
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shippingmethod`
--

DROP TABLE IF EXISTS `shippingmethod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shippingmethod` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `information` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shippingmethod`
--

LOCK TABLES `shippingmethod` WRITE;
/*!40000 ALTER TABLE `shippingmethod` DISABLE KEYS */;
INSERT INTO `shippingmethod` VALUES (1,'Colissimo');
/*!40000 ALTER TABLE `shippingmethod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specialevent`
--

DROP TABLE IF EXISTS `specialevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `specialevent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `activated` tinyint(1) NOT NULL,
  `createdDate` datetime NOT NULL,
  `description` varchar(150) NOT NULL,
  `endDate` datetime NOT NULL,
  `txreduction` int(11) NOT NULL,
  `startDate` datetime NOT NULL,
  `Title` varchar(50) NOT NULL,
  `idAdmin` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_jup34pjqyl0knk4mr4e4wv5wr` (`idAdmin`),
  CONSTRAINT `FK_jup34pjqyl0knk4mr4e4wv5wr` FOREIGN KEY (`idAdmin`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialevent`
--

LOCK TABLES `specialevent` WRITE;
/*!40000 ALTER TABLE `specialevent` DISABLE KEYS */;
INSERT INTO `specialevent` VALUES (1,1,'2017-03-27 20:14:11','10% sur une sélection de produits','2017-03-27 20:14:11',10,'2017-03-27 20:14:11','Promotest',1);
/*!40000 ALTER TABLE `specialevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `id_supplier` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(255) DEFAULT NULL,
  `createdAt` datetime DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_supplier`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Aux bon vins de Bourgogne','2017-03-27 20:14:11','vinsbourgogne@gmail.com','05 85 74 85 69'),(2,'Aux bon vins de Bordeaux','2017-03-27 20:14:11','vinsbordeaux@gmail.com','04 85 74 85 69'),(3,'Aux bon vins de l\'Aude','2017-03-27 20:14:11','vinsaude@gmail.com','07 85 74 85 69');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `DTYPE` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `birthdate` datetime NOT NULL,
  `civility` varchar(255) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `fisrtname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `login` varchar(50) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phonenumber` varchar(50) NOT NULL,
  `updatedAt` datetime DEFAULT NULL,
  `activated` tinyint(1) DEFAULT '0',
  `idAdresse` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_8y417mxqp9pp42l9p6l4kp3qa` (`idAdresse`),
  CONSTRAINT `FK_8y417mxqp9pp42l9p6l4kp3qa` FOREIGN KEY (`idAdresse`) REFERENCES `adress` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('Admin',1,'2017-03-27 20:14:10','MR','2017-03-27 20:14:10','admini','strateur','nicolastorero@gmail.com','nicolastorero@gmail.com','test1234','0680413240','2017-03-27 20:14:10',0,1),('Customer',2,'2017-03-27 20:14:10','MISS','2017-03-27 20:14:10','Fen','Wang','fenwang@hotmail.com','fenwang@hotmail.com','test1234','0666666666','2017-03-27 20:14:10',1,1),('Customer',3,'2017-03-27 20:14:10','MR','2017-03-27 20:14:10','Zouheir','Anes','zouheir.anes@gmail.com','zouheir.anes@gmail.com','test1234','0666666666','2017-03-27 20:14:10',1,1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-07 17:58:41
