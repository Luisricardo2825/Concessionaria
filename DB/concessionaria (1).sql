-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Jun-2019 às 18:59
-- Versão do servidor: 10.1.40-MariaDB
-- versão do PHP: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `concessionaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carrinho`
--

CREATE TABLE `carrinho` (
  `ID` int(11) NOT NULL,
  `preco` float DEFAULT NULL,
  `Imagem` longblob,
  `Modelo` varchar(255) DEFAULT NULL,
  `Usuario_vendedor` varchar(255) NOT NULL,
  `Data_hora` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carrinho`
--

INSERT INTO `carrinho` (`ID`, `preco`, `Imagem`, `Modelo`, `Usuario_vendedor`, `Data_hora`) VALUES
(191, 50000, NULL, 'Chevrolet C2', 'Ricardo  Alves         ', '08/06/2019'),
(192, 50000, NULL, 'Chevrolet C2', 'Ricardo  Alves         ', '08/06/2019'),
(194, 25000, NULL, 'Palio', 'Ricardo  Alves         ', '08/06/2019');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `idfuncionario` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `datanasc` varchar(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `cnh` varchar(13) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `idfuncionario` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `foto` longblob NOT NULL,
  `datanasc` varchar(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `telefone` varchar(16) NOT NULL,
  `num_pis` varchar(12) NOT NULL,
  `estado` varchar(200) NOT NULL,
  `cidade` varchar(200) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`idfuncionario`, `nome`, `foto`, `datanasc`, `email`, `cpf`, `rg`, `telefone`, `num_pis`, `estado`, `cidade`, `login`, `senha`) VALUES
(2, 'Ricardo  Alves         ', 0x89504e470d0a1a0a0000000d4948445200000096000000960802000000b363e6b5000000584944415478daedc13101000000c2a0f54f6d076fa00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e0310851000190e51c4a0000000049454e44ae426082, '32/32/2002', 'luis@gmail.com', '333.333.333-33', '3333333333.3', '+55(85)992323233', '333.33333.33', 'Ceará', 'fortaleza', 'Ricardo', '1234');

-- --------------------------------------------------------

--
-- Estrutura da tabela `opcionais`
--

CREATE TABLE `opcionais` (
  `idveiculo` int(11) NOT NULL,
  `arcondicionado` char(1) DEFAULT NULL,
  `travaeletrica` char(1) DEFAULT NULL,
  `arquente` char(1) DEFAULT NULL,
  `tetosolar` char(1) DEFAULT NULL,
  `cambioautomatico` char(1) DEFAULT NULL,
  `gps` char(1) DEFAULT NULL,
  `radio` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `promocao`
--

CREATE TABLE `promocao` (
  `idpromocao` int(11) NOT NULL,
  `idveiculo` int(11) NOT NULL,
  `dataexpiracao` date NOT NULL,
  `datainicio` date NOT NULL,
  `desconto` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `idveiculo` int(11) NOT NULL,
  `imgCarro` longblob NOT NULL,
  `modelo` varchar(200) NOT NULL,
  `fabricante` varchar(200) NOT NULL,
  `cor` varchar(100) NOT NULL,
  `ano` varchar(4) NOT NULL,
  `preco` float NOT NULL,
  `numChassi` varchar(17) NOT NULL,
  `descricao` varchar(500) NOT NULL,
  `quilometragem` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`idveiculo`, `imgCarro`, `modelo`, `fabricante`, `cor`, `ano`, `preco`, `numChassi`, `descricao`, `quilometragem`) VALUES
(1, '', 'Palio', 'Toyota', 'Preto', '2007', 25000, '9B123456372534C24', 'horrivel', 10),
(2, '', 'Chevrolet C2', 'Chevrolet', 'preto', '1982', 50000, '34343bf34gt34', 'Lá vem o monstro', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `idvendas` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idfuncionario` int(11) NOT NULL,
  `idveiculo` int(11) NOT NULL,
  `datavenda` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carrinho`
--
ALTER TABLE `carrinho`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idcliente`),
  ADD KEY `idfuncionario` (`idfuncionario`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`idfuncionario`);

--
-- Indexes for table `opcionais`
--
ALTER TABLE `opcionais`
  ADD PRIMARY KEY (`idveiculo`);

--
-- Indexes for table `promocao`
--
ALTER TABLE `promocao`
  ADD PRIMARY KEY (`idpromocao`),
  ADD KEY `idveiculo` (`idveiculo`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`idveiculo`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`idvendas`),
  ADD KEY `idcliente` (`idcliente`),
  ADD KEY `idfuncionario` (`idfuncionario`),
  ADD KEY `idveiculo` (`idveiculo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carrinho`
--
ALTER TABLE `carrinho`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=195;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `idfuncionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `promocao`
--
ALTER TABLE `promocao`
  MODIFY `idpromocao` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `idveiculo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `idvendas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`idfuncionario`) REFERENCES `funcionario` (`idfuncionario`);

--
-- Limitadores para a tabela `opcionais`
--
ALTER TABLE `opcionais`
  ADD CONSTRAINT `opcionais_ibfk_1` FOREIGN KEY (`idveiculo`) REFERENCES `veiculo` (`idveiculo`);

--
-- Limitadores para a tabela `promocao`
--
ALTER TABLE `promocao`
  ADD CONSTRAINT `promocao_ibfk_1` FOREIGN KEY (`idveiculo`) REFERENCES `veiculo` (`idveiculo`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`),
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`idfuncionario`) REFERENCES `funcionario` (`idfuncionario`),
  ADD CONSTRAINT `vendas_ibfk_3` FOREIGN KEY (`idveiculo`) REFERENCES `veiculo` (`idveiculo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
