-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Feb 21, 2025 alle 11:08
-- Versione del server: 10.4.25-MariaDB
-- Versione PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `5ait_vacanze`
--
CREATE DATABASE IF NOT EXISTS `5ait_vacanze` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `5ait_vacanze`;

-- --------------------------------------------------------

--
-- Struttura della tabella `alberghi`
--

CREATE TABLE `alberghi` (
  `idAlbergo` int(11) NOT NULL,
  `albergo` varchar(50) NOT NULL,
  `idBioma` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `biomi`
--

CREATE TABLE `biomi` (
  `idBioma` int(11) NOT NULL,
  `Bioma` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `biomi`
--

INSERT INTO `biomi` (`idBioma`, `Bioma`) VALUES
(1, 'undefined'),
(2, ' Citta'),
(3, 'Mare'),
(4, 'Pianura'),
(5, 'Montagna');

-- --------------------------------------------------------

--
-- Struttura della tabella `prenotazioni`
--

CREATE TABLE `prenotazioni` (
  `ID_Prenotazione` int(11) NOT NULL,
  `Data_Creazione` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `ID_Utente` int(11) NOT NULL,
  `Data_Inizio_Soggiorno` date NOT NULL,
  `Durata_Soggiorno` tinyint(4) NOT NULL,
  `Data_Fine_Soggiorno` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `prenotazioni`
--

INSERT INTO `prenotazioni` (`ID_Prenotazione`, `Data_Creazione`, `ID_Utente`, `Data_Inizio_Soggiorno`, `Durata_Soggiorno`, `Data_Fine_Soggiorno`) VALUES
(1, '2025-02-06 17:57:45', 12, '2025-02-12', 4, NULL),
(2, '2025-02-06 18:00:15', 12, '2025-02-12', 2, NULL),
(3, '2025-02-06 18:00:15', 10, '2025-02-14', 6, NULL),
(4, '2025-02-06 18:00:15', 132, '2025-02-11', 3, NULL),
(5, '2025-02-06 18:00:15', 62, '2025-02-16', 2, NULL),
(6, '2025-02-06 18:00:15', 62, '2025-02-09', 5, NULL),
(7, '2025-02-06 18:00:15', 62, '2025-02-22', 4, NULL),
(8, '2025-02-06 18:00:15', 2, '2025-02-18', 5, NULL);

--
-- Trigger `prenotazioni`
--
DELIMITER $$
CREATE TRIGGER `prenotazioni_Modyfy_Date` AFTER UPDATE ON `prenotazioni` FOR EACH ROW UPDATE prenotazioni SET Data_Creazione = NOW() WHERE id = OLD.ID_Prenotazione
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `ID` int(11) NOT NULL,
  `user` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `utenti`
--

INSERT INTO `utenti` (`ID`, `user`, `password`) VALUES
(1, 'pippo', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(2, 'pippo2', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(3, 'pippo3', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(4, 'pippo4', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(5, 'CIAO', '534b44a19bf18d20b71ecc4eb77c572f'),
(6, 'pippo5', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(7, 'CIAO1', '6e6bc4e49dd477ebc98ef4046c067b5f'),
(8, 'toffolo ', '6e11873b9d9d94a44058bef5747735ce'),
(9, 'devi nasconderli ', 'ddb18b2a58645c6fc4d8118d0deafb9c'),
(10, 's', '9f6e6800cfae7749eb6c486619254b9c'),
(11, 'sss', '3691308f2a4c2f6983f2880d32e29c84'),
(12, 'ffff', '343d9040a671c45832ee5381860e2996'),
(13, 'battilove pisello 69', 'ff8bb7c3ab3ae93a5afbde39ba06f394'),
(14, 'pippo6', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(15, 'pippo7', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(16, 'pippo8', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(17, 'pippo9', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(18, 'pippo10', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(19, 'pippo11', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(20, 'pippo12', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(21, 'pippo13', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(22, '0', '4124bc0a9335c27f086f24ba207a4912'),
(23, '0', '4124bc0a9335c27f086f24ba207a4912'),
(24, '0', '4124bc0a9335c27f086f24ba207a4912'),
(25, '0', '4124bc0a9335c27f086f24ba207a4912'),
(26, '0', '4124bc0a9335c27f086f24ba207a4912'),
(27, '0', '4124bc0a9335c27f086f24ba207a4912'),
(28, '<h2>negroz</h2>', '099b3b060154898840f0ebdfb46ec78f'),
(29, 'Marco ', '49907a0d2a950a3ad02104d3b767afe1'),
(30, 'pippo69', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(31, 'pippo70', '74b87337454200d4d33f80c4663dc5e5'),
(32, 'toffologay', 'af15d5fdacd5fdfea300e88a8e253e82'),
(33, 'tiamopapi', '50f84daf3a6dfd6a9f20c9f8ef428942'),
(34, 'aprimilano', '338d811d532553557ca33be45b6bde55'),
(35, 'pippo71', '74b87337454200d4d33f80c4663dc5e5'),
(36, 'lovoglionelculo', '22db3594d5060e4ef8bf12a167d7a80c'),
(37, 'aprimiindue', '89a5f1a27b55b9628ad2785b25f7188f'),
(38, 'toffolochiavami', 'def829b073d57d51b85e01309e1e0ea9'),
(39, 'diocanaglia', 'baa7a52965b99778f38ef37f235e9053'),
(40, 'diomaledetto', 'baa7a52965b99778f38ef37f235e9053'),
(41, 'madonnacicciona', 'baa7a52965b99778f38ef37f235e9053'),
(42, '1+over 2.5', 'f970e2767d0cfe75876ea857f92e319b'),
(43, '1corner', '3691308f2a4c2f6983f2880d32e29c84'),
(44, '1Xmultigol1-3', '457391c9c82bfdcbb4947278c0401e41'),
(45, 'pippo', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(46, 'pippo', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(47, 'pippo', '0c88028bf3aa6a6a143ed846f2be1ea4'),
(48, '0', 'e3e84538a1b02b1cc11bf71fe3169958'),
(49, '0', 'e3e84538a1b02b1cc11bf71fe3169958'),
(50, '0', 'e3e84538a1b02b1cc11bf71fe3169958'),
(51, '0', 'e3e84538a1b02b1cc11bf71fe3169958'),
(52, '0', '88654ca490a56ec0ed547b57c0b746e7'),
(53, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(54, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(55, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(56, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(57, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(58, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(59, '0', '22c276a05aa7c90566ae2175bcc2a9b0'),
(61, '105; DROP DATABASE 5ait_vacanze', '0cc175b9c0f1b6a831c399e269772661'),
(62, '105; DROP DATABASE 5ait_vacanze;', '47bce5c74f589f4867dbd57e9ca9f808'),
(63, 'aaaa; DROP DATABASE 5ait_vacanze;', 'f4b02687cf8ed3909d2b9d20c28c2bce'),
(64, '💩💩💩💩💩💩💩💩', '5d793fc5b00a2348c3fb9ab59e5ca98a'),
(65, 'aledeste1', '2fb88da6ea5c9c6701c66346e34907ec'),
(66, 'gay', 'b2f5ff47436671b6e533d8dc3614845d');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `alberghi`
--
ALTER TABLE `alberghi`
  ADD PRIMARY KEY (`idAlbergo`);

--
-- Indici per le tabelle `biomi`
--
ALTER TABLE `biomi`
  ADD PRIMARY KEY (`idBioma`);

--
-- Indici per le tabelle `prenotazioni`
--
ALTER TABLE `prenotazioni`
  ADD PRIMARY KEY (`ID_Prenotazione`);

--
-- Indici per le tabelle `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `alberghi`
--
ALTER TABLE `alberghi`
  MODIFY `idAlbergo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT per la tabella `biomi`
--
ALTER TABLE `biomi`
  MODIFY `idBioma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT per la tabella `prenotazioni`
--
ALTER TABLE `prenotazioni`
  MODIFY `ID_Prenotazione` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT per la tabella `utenti`
--
ALTER TABLE `utenti`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
