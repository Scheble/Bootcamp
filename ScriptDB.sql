CREATE DATABASE `bootcamp` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE `countries` (
  `Name` varchar(20) DEFAULT NULL,
  `Alpha2_code` varchar(2) NOT NULL,
  `Alpha3_code` varchar(3) NOT NULL,
  PRIMARY KEY (`Alpha3_code`),
  UNIQUE KEY `Alpha2_code_UNIQUE` (`Alpha2_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `forecastes` (
  `idForecast` int(11) NOT NULL AUTO_INCREMENT,
  `Date` varchar(20) DEFAULT NULL,
  `Day` varchar(10) DEFAULT NULL,
  `High` int(11) DEFAULT NULL,
  `low` int(11) DEFAULT NULL,
  `Text` varchar(20) DEFAULT NULL,
  `idState` int(11) DEFAULT NULL,
  PRIMARY KEY (`idForecast`),
  KEY `FK_States_Forecastes_idx` (`idState`),
  CONSTRAINT `FK_States_Forecastes` FOREIGN KEY (`idState`) REFERENCES `states` (`idStates`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `states` (
  `idStates` int(11) NOT NULL AUTO_INCREMENT,
  `Country` varchar(3) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Abbr` varchar(2) DEFAULT NULL,
  `Area` int(11) DEFAULT NULL,
  `Largest_city` varchar(30) DEFAULT NULL,
  `Capital` varchar(30) DEFAULT NULL,
  `idWeather` int(11) NOT NULL,
  PRIMARY KEY (`idStates`),
  KEY `FK_Countries_States_idx` (`Country`),
  KEY `FK_Weathers_States_idx` (`idWeather`),
  CONSTRAINT `FK_Countries_States` FOREIGN KEY (`Country`) REFERENCES `countries` (`Alpha3_code`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Weathers_States` FOREIGN KEY (`idWeather`) REFERENCES `weathers` (`Code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `weathers` (
  `Code` int(11) NOT NULL AUTO_INCREMENT,
  `Date` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `Temp` int(11) DEFAULT NULL,
  `Text` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `Chill` int(11) DEFAULT NULL,
  `Direction` int(11) DEFAULT NULL,
  `Speed` int(11) DEFAULT NULL,
  `Humidity` int(11) DEFAULT NULL,
  `Pressure` float DEFAULT NULL,
  `Rising` int(11) DEFAULT NULL,
  `Visibility` int(11) DEFAULT NULL,
  `Sunrise` varchar(15) CHARACTER SET utf8 DEFAULT NULL,
  `Sunset` varchar(15) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`Code`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

