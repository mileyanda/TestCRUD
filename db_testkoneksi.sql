-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2017 at 03:51 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_testkoneksi`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_akun`
--

CREATE TABLE `tb_akun` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`) VALUES
('doxa', '1235'),
('yusril', '1234'),
('admin', 'admin'),
('yanda', 'yanda');

-- --------------------------------------------------------

--
-- Table structure for table `t_siswa`
--

CREATE TABLE `t_siswa` (
  `NIS` int(11) NOT NULL,
  `NamaSiswa` varchar(80) NOT NULL,
  `TempatLahir` varchar(100) NOT NULL,
  `TanggalLahir` date NOT NULL,
  `JenisKelamin` enum('L','P') NOT NULL,
  `Kelas` varchar(10) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_siswa`
--

INSERT INTO `t_siswa` (`NIS`, `NamaSiswa`, `TempatLahir`, `TanggalLahir`, `JenisKelamin`, `Kelas`, `Email`, `Alamat`) VALUES
(1, 'Mileyanda', 'Banyuwangi', '2000-03-06', 'L', 'XI RPL 5', 'mileyanda@gmail.com', 'Banyuwangi'),
(2, 'Qurrota Ayun', 'Pasuruan', '2017-03-15', 'P', 'XI RPL 5', 'qurrota@gmail.com', 'Pasuruan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_siswa`
--
ALTER TABLE `t_siswa`
  ADD PRIMARY KEY (`NIS`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
