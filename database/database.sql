-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.28 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2012-12-26 00:54:05
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for test
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `test`;


-- Dumping structure for table test.company
CREATE TABLE IF NOT EXISTS `company` (
  `ID_COMPANY` int(10) unsigned NOT NULL,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_COMPANY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table test.company: ~3 rows (approximately)
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` (`ID_COMPANY`, `NAME`) VALUES
	(1, 'Company 1'),
	(2, 'Company 2'),
	(3, 'Company 3');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;


-- Dumping structure for table test.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `ID_EMPLOYEE` int(10) unsigned NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `ID_COMPANY` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID_EMPLOYEE`),
  KEY `FK_employee_company` (`ID_COMPANY`),
  CONSTRAINT `FK_employee_company` FOREIGN KEY (`ID_COMPANY`) REFERENCES `company` (`ID_COMPANY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table test.employee: ~15 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`ID_EMPLOYEE`, `NAME`, `ID_COMPANY`) VALUES
	(1, 'EMPLOYEE 1', 1),
	(2, 'EMPLOYEE 2', 2),
	(3, 'EMPLOYEE 3', 3),
	(4, 'EMPLOYEE 4', 1),
	(5, 'EMPLOYEE 5', 1),
	(6, 'EMPLOYEE 6', 1),
	(7, 'EMPLOYEE 7', 2),
	(8, 'EMPLOYEE 8', 2),
	(9, 'EMPLOYEE 9', 1),
	(10, 'EMPLOYEE 10', 3),
	(11, 'EMPLOYEE 11', 2),
	(12, 'EMPLOYEE 12', 1),
	(13, 'EMPLOYEE 13', 2),
	(14, 'EMPLOYEE 14', 3),
	(15, 'EMPLOYEE 15', 2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
