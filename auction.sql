-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2015 at 10:51 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `auction`
--

-- --------------------------------------------------------

--
-- Table structure for table `item_information`
--

CREATE TABLE IF NOT EXISTS `item_information` (
  `Item_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Item_name` varchar(20) NOT NULL,
  `itemDescription` text,
  `Image` longblob NOT NULL,
  `Starting_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`Item_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `item_information`
--

INSERT INTO `item_information` (`Item_ID`, `Item_name`, `itemDescription`, `Image`, `Starting_price`) VALUES
(1, 'Vintage Antique Wood', 'Vintage Wood', '', 100),
(2, 'Typewriter', 'Vintage Typewriter', '', 50),
(3, 'Camera-1', '1945 Camera', '', 100),
(4, 'Camera-2', '1900 Camera', '', 500),
(5, 'King of spain gun', 'King''s Gold Gun', '', 6000),
(6, 'Piano', 'vintage wood Piano', '', 5000),
(13, 'Banana boat', 'good Banana Boat', 0x30, 300);

-- --------------------------------------------------------

--
-- Table structure for table `user_information`
--

CREATE TABLE IF NOT EXISTS `user_information` (
  `Username` varchar(20) NOT NULL,
  `UserPassword` varchar(20) NOT NULL,
  `User_Email` varchar(20) DEFAULT NULL,
  `User_bank_account_number` varchar(16) DEFAULT NULL,
  `User_bank_account_Password` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_information`
--

INSERT INTO `user_information` (`Username`, `UserPassword`, `User_Email`, `User_bank_account_number`, `User_bank_account_Password`) VALUES
('MinaEssam', 'minaessam12', 'mina.essam@hotmail.c', '8934537872357999', '09876'),
('MohamedAli', 'mohamedali12', 'mohamed.ali@hotmail.', '1234567891023456', '12345'),
('NadaHady', 'nadahady12', 'nada.hady@hotmail.co', '1766567891257899', '67890'),
('Ramy', 'ramy11', NULL, NULL, NULL),
('RamyMamdouh', 'ramymamdouh12', 'ramy.mamdouh@hotmail', '1234567891357899', '52312');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
