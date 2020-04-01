-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2019 at 06:57 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant`
--

-- --------------------------------------------------------

--
-- Table structure for table `bauturi_alcolice`
--
create database restaurant;
use restaurant;

CREATE TABLE `bauturi_alcoolice` (
  `nume` varchar(55) NOT NULL,
  `cantitate` int(11) NOT NULL,
  `vol_alc` int(11) NOT NULL,
  `pret` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bauturi_alcoolice`
--

INSERT INTO `bauturi_alcoolice` (`nume`, `cantitate`, `vol_alc`, `pret`) VALUES
('bere', 500, 5, 6),
('whisky', 50, 45, 15),
('vodka', 50, 50, 13);

-- --------------------------------------------------------

--
-- Table structure for table `desert`
--

CREATE TABLE `desert` (
  `nume` varchar(55) NOT NULL,
  `cantitate` int(11) NOT NULL,
  `pret` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `desert`
--

INSERT INTO `desert` (`nume`, `cantitate`, `pret`) VALUES
('amandina', 230, 9),
('ecler', 150, 12),
('tiramisu', 150, 12);

-- --------------------------------------------------------

--
-- Table structure for table `fel1`
--

CREATE TABLE `fel1` (
  `nume` varchar(55) NOT NULL,
  `cantitate` int(11) NOT NULL,
  `ingrediente` varchar(55) NOT NULL,
  `pret` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fel1`
--

INSERT INTO `fel1` (`nume`, `cantitate`, `ingrediente`, `pret`) VALUES
('ciorba de perisoare', 150, 'perisoare,rosii,verdeata', 12),
('ciorba de legume ', 250, 'rosii,cartof,leustean,bors', 11),
('supa de galuste', 200, 'supa,galuste', 10);

-- --------------------------------------------------------

--
-- Table structure for table `fel2`
--

CREATE TABLE `fel2` (
  `nume` varchar(55) NOT NULL,
  `cantitate` int(11) NOT NULL,
  `garnitura` varchar(55) NOT NULL,
  `pret` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fel2`
--

INSERT INTO `fel2` (`nume`, `cantitate`, `garnitura`, `pret`) VALUES
('piept de pui', 120, 'cartofi copti', 11),
('ceafa de porc', 250, 'cartofi parajiti', 19),
('carnati', 180, 'cartofi copti', 17);

-- --------------------------------------------------------

--
-- Table structure for table `racoritoare`
--

CREATE TABLE `racoritoare` (
  `nume` varchar(55) NOT NULL,
  `cantitate` int(11) NOT NULL,
  `tip` varchar(55) NOT NULL,
  `pret` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `racoritoare`
--

INSERT INTO `racoritoare` (`nume`, `cantitate`, `tip`, `pret`) VALUES
('fanta', 330, 'acidulata', 6),
('coca cola', 330, 'acidulata', 6),
('apa', 330, 'neacidulata', 5);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
