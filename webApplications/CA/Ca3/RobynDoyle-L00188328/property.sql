-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 20, 2025 at 07:51 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `property`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE `administrator` (
  `admin_email` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `surname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`admin_email`, `password`, `firstname`, `surname`) VALUES
('admin@atu.ie', 'password', 'John', 'Doe');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `categoryid` int(11) NOT NULL,
  `categoryname` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`categoryid`, `categoryname`) VALUES
(1, 'Residential'),
(2, 'Commercial'),
(3, 'Sites');

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `id` int(11) NOT NULL,
  `title` text NOT NULL,
  `content` text NOT NULL,
  `author_name` varchar(100) NOT NULL,
  `author_email` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `status` enum('pending','planned') NOT NULL DEFAULT 'pending'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `title`, `content`, `author_name`, `author_email`, `created_at`, `status`) VALUES
(1, 'Great company!', 'Very happy!', 'Bob', 'Bob@sn.com', '2023-02-14 16:33:28', 'planned'),
(23, 'Great service!', 'Thanks for all your help! It made getting my foot on the property ladder much easier.', 'Joe', 'joe@hotmail.com', '2023-02-19 10:37:23', 'planned'),
(24, 'Love this Site', 'Great company. Customer service second to none!', 'Les', 'Les@lse.uk', '2023-02-19 11:30:00', 'planned'),
(28, 'Great', 'Nice', 'Bob', 'bob@gmail.com', '2025-05-13 18:17:32', 'pending');

-- --------------------------------------------------------

--
-- Table structure for table `Message`
--

CREATE TABLE `Message` (
  `ID` int(11) NOT NULL,
  `Message` varchar(1000) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Service` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Message`
--

INSERT INTO `Message` (`ID`, `Message`, `Email`, `Name`, `Service`) VALUES
(1, '', 'bob@gmial.com', 'Bob', 'Sell'),
(2, '', 'bob@gmial.com', 'd', 'Buy'),
(3, '', 'bob@gmial.com', 'd', 'Sell'),
(4, 'Great service', 'bob@gmial.com', 'Bob', 'Buy'),
(5, 'Hi etc', 'bob@gmail.com', 'Bob', 'Sell'),
(6, 'I need to sell. ', 'bob@gmail.com', 'Bob', 'Sell'),
(7, 's', 'robyn.doyle@gmail.com', 'Robyn Doyle', 'Buy');

-- --------------------------------------------------------

--
-- Table structure for table `property`
--

CREATE TABLE `property` (
  `propertyid` int(11) NOT NULL,
  `address1` varchar(50) NOT NULL,
  `town` varchar(50) NOT NULL,
  `county` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `bedrooms` int(2) DEFAULT NULL,
  `shortdescription` text NOT NULL,
  `longdescription` text NOT NULL,
  `image` varchar(50) NOT NULL,
  `categoryid` int(11) NOT NULL,
  `vendor_email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `property`
--

INSERT INTO `property` (`propertyid`, `address1`, `town`, `county`, `price`, `bedrooms`, `shortdescription`, `longdescription`, `image`, `categoryid`, `vendor_email`) VALUES
(2, 'Cloghan', 'Los Angeles', 'California', 12000, 0, 'Elevated site with magnificent views over the lake.   Now with full planning!', 'This site is elevated with great views. Water and electricity connections are possible via nearby access points.', 'images/site.jpg', 3, 'paddy@hotmail.com'),
(3, 'Main Street', 'Los Angeles', 'California', 26000000, 0, 'Vacant commercial property for sale with lots of amenities.', 'With close access to car parking for employess and generous meeting areas, this commercial property is perfect for setting up a business. ', 'images/commercial2.jpg', 2, 'john@gordons.com'),
(7, '22 college blue', 'Sacramento', 'California', 2343422, 9, 'Sea Side Holiday Home', 'Boasting beach front access and fantastic features this newly listed property is the holiday home of dreams. Now available for viewing.\r\n\r\n\r\n\r\n', 'Assets/mansion.jpg', 1, 'john@gordons.com'),
(8, '55 common lane', 'Los Angeles', 'California', 395000, 3, 'Charming house in the middle of a great neighbourhood. ', 'This stunning 1960\'s house on the edge of LA is the perfect place to call your first home. With a lovely back garden and generous facilites, it is truly a gem of a home. The local area has a school, hospital and shopping mall within walking distance.', 'Assets/firstTimeBuyer.jpg', 1, 'paddy@hotmail.com'),
(9, '56 Bond Market Park Drive', 'Los Angeles', 'California', 290000, 2, 'Amazing and comfortable home close to nature.  ', 'Is it time to move into a more comfortable and easy to maintain home? Then this may be the home you were looking for. Situated in the heart of LA\'s natural beauty this modern and sleek property provides all the benefits of modern living and more!', 'Assets/downsize.jpg', 1, 'john@gordons.com'),
(10, '38 Back Water Way', 'Los Angeles', 'California', 579000, 3, 'Wonderful family home with spacious rooms and large garden. ', 'Modern and sleek home in the heart of the hills. This amazing property has everything you need to enjoy peaceful weekneds and short commuting times into work.', 'Assets/firstTIme2.jpg', 1, 'paddy@hotmail.com'),
(11, '24 Cliff Drive', 'Los Angeles', 'California', 7000000, 9, 'Amazing scenic mansion on the cliff.   ', 'Boasting beach front access and fantastic features this newly listed property is the holiday home of dreams. Now available for viewing.\r\n\r\n\r\n\r\n', 'Assets/mansion2.jpg', 1, 'john@gordons.com'),
(12, '29 Izmir Beach Front', 'Los Angeles', 'California', 45000000, 0, 'High rise office block offering views of the city.', 'Built in 2010 this modern office location is the perfect place for conducting business. ', 'images/commercial3.jpg', 2, 'john@gordons.com'),
(13, '76 Build Road', 'Los Angeles', 'California', 350000000, 0, 'Executive office block with 50 floors and under ground car park. ', 'This state of the art tower block was completed in 2024 and has all the features required to run a full corporate operation. ', 'images/commercial4.jpg', 2, 'john@gordons.com'),
(14, '55 mirage lane', 'Los Angeles', 'California', 34000000, 0, 'Fully kitted out office block with possibility of extension. ', 'Fantastic office location in dowtown LA featuring a large reception and office rooms for all kinds of events. ', 'Assets/commercial.jpg', 2, 'john@gordons.com'),
(15, '33 downtown block', 'Los Angeles', 'California', 3000000, 0, 'Starting from 3 million per office space, these moderately priced offices offer modern functionality and great value. ', 'Your start up needs an office? These state of the art offices in downtown LA have just come to market and are the perfect setting to do business. Demand is high, first come, first served', 'Assets/Sky.jpg', 2, 'john@gordons.com'),
(16, 'California Street', 'Los Angeles', 'California', 30000000, 0, 'Top location and great transport connections! This site is destined for successful development. ', 'Looking for a top investment opportunity? This new 10 acre Site on California Street LA fits the bill. With full planning permission and easy utility connections it is a prime investment in todays market.', 'Assets/site.jpg', 3, 'john@gordons.com'),
(17, '17 Drewy lane', 'Los Angeles', 'California', 332342, 0, 'Big 5 acre site in zoned residential area.', 'Ready to be developed into premiere housing for families in the heart of the city.', 'Assets/site3.jpg', 3, 'paddy@hotmail.com'),
(18, '18 blue water way', 'Los Angeles ', 'California', 45000, 0, 'Lovely green countrysdie field in the Olive district.', 'Large fields starting from $45,000 per acre in LA\'s premiere Olive district.', 'images/site3.jpg', 3, 'john@gordons.com');

-- --------------------------------------------------------

--
-- Table structure for table `Subscribers`
--

CREATE TABLE `Subscribers` (
  `ID` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Subscribers`
--

INSERT INTO `Subscribers` (`ID`, `Email`, `Name`) VALUES
(1, 'mike.benson@gmail.com', 'Mike Benson'),
(4, 'bob@gmial.com', 'Bob'),
(7, 'sam@gmail.com', 'Sam22'),
(8, 'bob@gmail.com', 'Bob22');

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `vendor_email` varchar(30) NOT NULL,
  `vendor_firstname` varchar(20) NOT NULL,
  `vendor_surname` varchar(20) NOT NULL,
  `vendor_phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`vendor_email`, `vendor_firstname`, `vendor_surname`, `vendor_phone`) VALUES
('john@gordons.com', 'John', 'Gordon', '+353 87563543895'),
('paddy@hotmail.com', 'Paddy', 'Smith', '+353 45698543453');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`admin_email`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryid`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Message`
--
ALTER TABLE `Message`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `property`
--
ALTER TABLE `property`
  ADD PRIMARY KEY (`propertyid`),
  ADD KEY `vendor_email` (`vendor_email`),
  ADD KEY `categoryid` (`categoryid`);

--
-- Indexes for table `Subscribers`
--
ALTER TABLE `Subscribers`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`vendor_email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `categoryid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `Message`
--
ALTER TABLE `Message`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `property`
--
ALTER TABLE `property`
  MODIFY `propertyid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `Subscribers`
--
ALTER TABLE `Subscribers`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `property`
--
ALTER TABLE `property`
  ADD CONSTRAINT `property_ibfk_1` FOREIGN KEY (`vendor_email`) REFERENCES `vendor` (`vendor_email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
