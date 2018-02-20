-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 08, 2018 at 01:35 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projekat_dipl`
--

-- --------------------------------------------------------

--
-- Table structure for table `proizvod`
--

CREATE TABLE `proizvod` (
  `proizvodID` int(11) NOT NULL,
  `naziv` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `datumUnosa` date NOT NULL,
  `cena` double NOT NULL,
  `brend` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `pol` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tipProizvodaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `proizvod`
--

INSERT INTO `proizvod` (`proizvodID`, `naziv`, `datumUnosa`, `cena`, `brend`, `pol`, `tipProizvodaID`) VALUES
(1, 'Rolerblade - 06310400-110', '2018-02-05', 8999, 'Rolerblade', 'Muski', 14),
(2, 'Spalding - 73-985Z', '2018-02-05', 2990, 'Spalding', 'Unisex', 1);

-- --------------------------------------------------------

--
-- Table structure for table `svojstvo`
--

CREATE TABLE `svojstvo` (
  `tipID` int(11) NOT NULL,
  `svojstvoID` int(11) NOT NULL,
  `svojstvoNaziv` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `tipSvojstva` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `svojstvo`
--

INSERT INTO `svojstvo` (`tipID`, `svojstvoID`, `svojstvoNaziv`, `tipSvojstva`) VALUES
(1, 1, 'precnik', 'double'),
(1, 2, 'sport', 'string'),
(1, 3, 'specijal', 'string'),
(2, 4, 'specijal', 'string'),
(2, 5, 'sport', 'string'),
(2, 6, 'velicina', 'string'),
(2, 7, 'materijal', 'string'),
(2, 8, 'boja', 'string'),
(3, 9, 'velicina', 'double'),
(3, 10, 'sport', 'string'),
(3, 11, 'boja', 'string'),
(3, 12, 'specijal', 'string'),
(4, 13, 'velicinu', 'string'),
(4, 14, 'sport', 'string'),
(4, 15, 'materijal', 'string'),
(4, 16, 'boja', 'string'),
(4, 17, 'specijal', 'string'),
(5, 18, 'velicina', 'string'),
(5, 19, 'sport', 'string'),
(5, 20, 'boja', 'string'),
(5, 21, 'materijal', 'string'),
(5, 22, 'specijal', 'string'),
(6, 23, 'boja', 'string'),
(7, 24, 'velicina', 'double'),
(7, 25, 'sport', 'string'),
(7, 26, 'specijal', 'string'),
(7, 27, 'boja', 'string'),
(7, 28, 'metalni deo', 'boolean'),
(8, 29, 'sport', 'string'),
(8, 30, 'velicina', 'string'),
(8, 31, 'specijal', 'string'),
(9, 32, 'velicina', 'string'),
(9, 33, 'materijal', 'string'),
(9, 34, 'boja', 'string'),
(9, 35, 'sport', 'string'),
(9, 36, 'specijal', 'string'),
(10, 37, 'velicina', 'string'),
(10, 38, 'materijal', 'string'),
(10, 39, 'boja', 'string'),
(10, 40, 'sport', 'string'),
(11, 41, 'velicina', 'string'),
(11, 42, 'materijal', 'string'),
(11, 43, 'boja', 'string'),
(11, 44, 'sport', 'string'),
(12, 45, 'velicina', 'string'),
(12, 46, 'materijal', 'string'),
(12, 47, 'boja', 'string'),
(12, 48, 'specijal', 'string'),
(12, 49, 'sport', 'string'),
(13, 50, 'sport', 'string'),
(13, 51, 'specijal', 'string'),
(14, 52, 'sport', 'string'),
(14, 53, 'boja', 'string'),
(15, 54, 'boja', 'string'),
(15, 55, 'sport', 'string'),
(16, 56, 'velicina', 'double'),
(16, 57, 'boja', 'string'),
(16, 58, 'sport', 'string'),
(17, 59, 'velicina', 'double'),
(17, 60, 'boja', 'string'),
(17, 61, 'sport', 'string'),
(18, 62, 'velicina', 'double'),
(18, 63, 'boja', 'string'),
(18, 64, 'sport', 'string'),
(19, 65, 'velicina', 'double'),
(19, 66, 'boja', 'string'),
(19, 67, 'sport', 'string'),
(20, 68, 'velicina', 'string'),
(20, 69, 'boja', 'string'),
(20, 70, 'materijal', 'string'),
(20, 71, 'sport', 'string'),
(20, 72, 'specijal', 'string'),
(21, 73, 'velicina', 'string'),
(21, 74, 'materijal', 'string'),
(21, 75, 'boja', 'string'),
(21, 76, 'sport', 'string'),
(21, 77, 'specijal', 'string'),
(22, 78, 'velicina', 'string'),
(22, 79, 'boja', 'string'),
(22, 80, 'sport', 'string'),
(22, 81, 'specijal', 'string'),
(23, 82, 'velicina', 'integer'),
(23, 83, 'boja', 'string'),
(23, 84, 'materijal', 'string'),
(23, 88, 'sport', 'string'),
(23, 89, 'specijal', 'string'),
(24, 85, 'sport', 'string'),
(24, 86, 'tip sprave', 'string'),
(24, 88, 'specijal', 'string'),
(25, 87, 'boja', 'string'),
(25, 89, 'specijal', 'string'),
(25, 90, 'sport', 'string'),
(26, 91, 'boja', 'string'),
(26, 92, 'sport', 'string'),
(26, 93, 'specijal', 'string'),
(27, 94, 'sport', 'string'),
(27, 95, 'boja', 'string'),
(27, 96, 'specijal', 'string'),
(28, 97, 'sport', 'string'),
(28, 98, 'boja', 'string'),
(28, 99, 'specijal', 'string');

-- --------------------------------------------------------

--
-- Table structure for table `tipproizvoda`
--

CREATE TABLE `tipproizvoda` (
  `tipProizvodaID` int(11) NOT NULL,
  `nazivTipa` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tipproizvoda`
--

INSERT INTO `tipproizvoda` (`tipProizvodaID`, `nazivTipa`) VALUES
(1, 'lopta'),
(2, 'majica'),
(3, 'patika'),
(4, 'trenerka'),
(5, 'duks'),
(6, 'torba'),
(7, 'kopacke'),
(8, 'dres'),
(9, 'trenerke donji delovi'),
(10, 'skafander'),
(11, 'helanke'),
(12, 'sorts'),
(13, 'reket'),
(14, 'roleri'),
(15, 'ranac'),
(16, 'papuce'),
(17, 'sandale'),
(18, 'cipele'),
(19, 'cizme'),
(20, 'jakna'),
(21, 'prsluk'),
(22, 'kupaci'),
(23, 'carape'),
(24, 'sprave'),
(25, 'bicikl'),
(26, 'kaciga'),
(27, 'skejtbord'),
(28, 'kostobrani');

-- --------------------------------------------------------

--
-- Table structure for table `vrednost`
--

CREATE TABLE `vrednost` (
  `vrednostID` int(11) NOT NULL,
  `stringVrednost` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `integerVrednost` int(11) NOT NULL,
  `doubleVrednost` double NOT NULL,
  `booleanVrednost` tinyint(4) NOT NULL,
  `proizvodID` int(11) NOT NULL,
  `tipProizvodaID` int(11) NOT NULL,
  `svojstvoID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `vrednost`
--

INSERT INTO `vrednost` (`vrednostID`, `stringVrednost`, `integerVrednost`, `doubleVrednost`, `booleanVrednost`, `proizvodID`, `tipProizvodaID`, `svojstvoID`) VALUES
(1, 'Lifestyle', 0, 0, 0, 1, 14, 52),
(2, 'plava', 0, 0, 0, 1, 14, 53),
(3, '', 0, 24.1, 0, 2, 1, 1),
(4, 'Kosarka', 0, 0, 0, 2, 1, 2),
(5, 'EUROLEAGUE OFFICIAL GAME BALL', 0, 0, 0, 2, 1, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `proizvod`
--
ALTER TABLE `proizvod`
  ADD PRIMARY KEY (`proizvodID`),
  ADD KEY `tipProizvodaID` (`tipProizvodaID`);

--
-- Indexes for table `svojstvo`
--
ALTER TABLE `svojstvo`
  ADD PRIMARY KEY (`tipID`,`svojstvoID`);

--
-- Indexes for table `tipproizvoda`
--
ALTER TABLE `tipproizvoda`
  ADD PRIMARY KEY (`tipProizvodaID`);

--
-- Indexes for table `vrednost`
--
ALTER TABLE `vrednost`
  ADD PRIMARY KEY (`vrednostID`),
  ADD KEY `svojstvo` (`svojstvoID`,`tipProizvodaID`),
  ADD KEY `proizvodID` (`proizvodID`),
  ADD KEY `svojstvoID` (`svojstvoID`,`tipProizvodaID`),
  ADD KEY `vrednost_ibfk_2` (`tipProizvodaID`,`svojstvoID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `proizvod`
--
ALTER TABLE `proizvod`
  MODIFY `proizvodID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tipproizvoda`
--
ALTER TABLE `tipproizvoda`
  MODIFY `tipProizvodaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
--
-- AUTO_INCREMENT for table `vrednost`
--
ALTER TABLE `vrednost`
  MODIFY `vrednostID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `proizvod`
--
ALTER TABLE `proizvod`
  ADD CONSTRAINT `proizvod_ibfk_1` FOREIGN KEY (`tipProizvodaID`) REFERENCES `tipproizvoda` (`tipProizvodaID`);

--
-- Constraints for table `svojstvo`
--
ALTER TABLE `svojstvo`
  ADD CONSTRAINT `svojstvo_ibfk_1` FOREIGN KEY (`tipID`) REFERENCES `tipproizvoda` (`tipProizvodaID`);

--
-- Constraints for table `vrednost`
--
ALTER TABLE `vrednost`
  ADD CONSTRAINT `vrednost_ibfk_1` FOREIGN KEY (`proizvodID`) REFERENCES `proizvod` (`proizvodID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vrednost_ibfk_2` FOREIGN KEY (`tipProizvodaID`,`svojstvoID`) REFERENCES `svojstvo` (`tipID`, `svojstvoID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
