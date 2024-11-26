-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2024 at 01:04 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ap_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `User_Admin` text NOT NULL,
  `Password_Admin` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`User_Admin`, `Password_Admin`) VALUES
('itxsamad1', 'SamHacker1');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` text NOT NULL,
  `qmed` text NOT NULL,
  `amount` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Name_Customer` text NOT NULL,
  `User_Customer` text NOT NULL,
  `Contact_Customer` text NOT NULL,
  `Address_Customer` text NOT NULL,
  `Password_Customer` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Name_Customer`, `User_Customer`, `Contact_Customer`, `Address_Customer`, `Password_Customer`) VALUES
('Abdul Samad', '2', '+923070200506', 'Karachi,Pakistan', 'Samad1'),
('Junaid Ahmed', 'j4302@astra', '03132294302', 'Hadeed,Pakistan', 'junaid@4302'),
('Hafiz Mudasir', 'mudasir1@astra', '03070200506', 'Orangi Town,Karachi', '1@234567');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Name_Employee` text NOT NULL,
  `Contact_Employee` text NOT NULL,
  `Email_Employee` text NOT NULL,
  `CNIC_Employee` text NOT NULL,
  `User_Employee` text NOT NULL,
  `Password_Employee` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Name_Employee`, `Contact_Employee`, `Email_Employee`, `CNIC_Employee`, `User_Employee`, `Password_Employee`) VALUES
('Abdul Samad', '+923070200506', 'itxsamad1@gmail.com', '42301', '2', 'Samad1'),
('Junaid Ahmed', '03303125663', 'j123@gmail.com', '42000-0000000-0', 'j12@emp', 'Junaid12'),
('Adeel', '03070200506', 'adeel1@gmail.com', '42000-0000000-0', 'adeel1@emp', 'adeel123');

-- --------------------------------------------------------

--
-- Table structure for table `order_customer`
--

CREATE TABLE `order_customer` (
  `id` text NOT NULL,
  `qmed` text NOT NULL,
  `amount` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_customer`
--

INSERT INTO `order_customer` (`id`, `qmed`, `amount`) VALUES
('2', ' Arinac', '232'),
('2', ' Arinac', '232'),
('2', ' Arinac', '232'),
('2', ' Arinac', '232'),
('2', ' Arinac', '232'),
('2', ' Arinac', '232'),
('2', ' Arinac', '232'),
('2', ' Arinac', '928'),
('2', 'Panadol', '80'),
('2', '1 Panadol', '40'),
('2', '2  :Panadol', '80'),
('2', '2  :Panadol', '80'),
('2', '2  :Arinac', '232'),
('2', '2  :Centrum Silver', '1200'),
('mudasir1@astra', ' Arinac', '348'),
('mudasir1@astra', '2  :Panadol', '80'),
('mudasir1@astra', '2  :Brufen DS ', '180');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `name` text NOT NULL,
  `code` decimal(30,0) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`name`, `code`, `quantity`, `price`) VALUES
('Panadol', 30097378318, 20, 40),
('Lyzim Tablet Blister', 300002571452, 10, 560),
('kch bh', 2020, 20, 1),
('hn', 2020, 1, 23),
('pgl', 2024, 1, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD UNIQUE KEY `User_Admin` (`User_Admin`) USING HASH;

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD UNIQUE KEY `User_Customer` (`User_Customer`) USING HASH;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
