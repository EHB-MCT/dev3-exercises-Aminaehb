-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 09, 2021 at 04:12 PM
-- Server version: 5.7.36-0ubuntu0.18.04.1
-- PHP Version: 7.2.24-0ubuntu0.18.04.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2122DEV3002`
--

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE `cities` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Passengers`
--

CREATE TABLE `Passengers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
  `multiple_rides` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ride passenger`
--

CREATE TABLE `ride passenger` (
  `id` int(11) NOT NULL,
  `ride_id` int(11) NOT NULL,
  `passenger_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Rides`
--

CREATE TABLE `Rides` (
  `id` int(11) NOT NULL,
  `train_id` int(11) NOT NULL,
  `departure_time` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL,
  `departure_cities_id` int(11) NOT NULL,
  `destination_cities_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Rides`
--

INSERT INTO `Rides` (`id`, `train_id`, `departure_time`, `departure_cities_id`, `destination_cities_id`) VALUES
(1, 10, '2021-11-09 15:07:31', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `Trains`
--

CREATE TABLE `Trains` (
  `id` int(11) NOT NULL,
  `type` varchar(255) CHARACTER SET utf8 NOT NULL,
  `max_speed` int(11) NOT NULL,
  `max_passengers` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Trains`
--

INSERT INTO `Trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(1, 'Express', 180, 1000),
(11, 'Express train', 180, 20000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Passengers`
--
ALTER TABLE `Passengers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ride passenger`
--
ALTER TABLE `ride passenger`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Rides`
--
ALTER TABLE `Rides`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Trains`
--
ALTER TABLE `Trains`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
