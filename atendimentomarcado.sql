-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Ago-2021 às 12:35
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `atendimentomarcado`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `estadoCivil` varchar(20) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `morada` varchar(100) NOT NULL,
  `nacionalidade` varchar(20) NOT NULL,
  `altura` double DEFAULT NULL,
  `nomeMae` varchar(20) NOT NULL,
  `nomePai` varchar(20) NOT NULL,
  `dataNascimento` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `dataMarcacao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `nome`, `estadoCivil`, `sexo`, `morada`, `nacionalidade`, `altura`, `nomeMae`, `nomePai`, `dataNascimento`, `status`, `dataMarcacao`) VALUES
(6, 'khawir', 'Masculino', 'Solteiro', 'Triunfo', 'Mocambicano', 0, 'Marcia', 'Paulo', NULL, NULL, NULL),
(7, 'Lampiao', 'Masculino', 'Solteiro', 'Triunfo', 'Mocambicano', 1.98, 'Marcia', 'Paulo', NULL, 'activo', '21/22/2222'),
(8, 'imil', 'Masculino', 'N', 'Triunfo', 'Mocambicano', 0, 'Marcia', 'Paulo', NULL, NULL, NULL),
(10, 'Lampiao', 'Masculino', 'Solteiro', 'Triunfo', 'Mocambicano', 0, 'Marcia', 'Paulo', NULL, NULL, NULL),
(11, 'iiiii', '', '', 'Triunfo', 'Mocambicano', 1.9, 'Marcia', 'Paulo', 'jjd', 'Activo', 'oihy'),
(12, 'Marcia', 'Femenino', 'Solteiro/a', 'MAxaquene', 'Mocambicana', 1.77, 'Filomena', 'Joao', '222', 'Activo', '222'),
(13, 'Joao', 'ad', 'oy', 'ou', 'ou', 1.29, 'ou', 'ou', '10', 'Activo', '327'),
(14, 'khawir', 'So', 'Masc', 'Tri', 'Moz', 0, 'Mar', 'Pa', NULL, NULL, NULL),
(15, 'jh', 'kh', 'kh', 'kh', 'ho', 0, 'kh', 'kh', NULL, NULL, NULL),
(16, 'ikhydd', 'kgkg', 'iui', 'kgkg', 'kgkg', 0, 'ttt', 'ttttt', NULL, NULL, NULL),
(17, 'ikhydd', 'Femenino', 'Solteiro/a', 'T3', 'kgkg', 1.56, 'ttt', 'ttttt', 'WE', 'Desactivo', 'WE'),
(18, 'iugwigkr', 'jfjfjf', 'kgjgjgf', 'kkkkkkkkk', 'Moz', 1.9, 'iuyiy', 'mar', NULL, '1', NULL),
(19, 'Paulo', 'Solteiro', 'masculino', 'Triunfo', 'Mocambicano', 1.9, 'rabia', 'Joao', NULL, NULL, NULL),
(20, 'Marcia', 'Solteira', 'Famela', 'Triunfo', 'Moz', 1.98, 'Filomena', 'Joao', NULL, 'Desativo', NULL),
(21, 'Khaa', 'Solteir', 'Femenino', 'Triunfo', 'Moz', 1.99, 'Marcai', 'pauol', NULL, 'Desativo', NULL),
(22, 'Martins', 'Solteiro/a', 'Femenino', 'Matalane', 'Mcambicano', 1.9, 'Mart', 'Ins', NULL, 'Desativo', NULL),
(23, 'Nayra', 'Femenino', 'Solteiro/a', 'Triunfo', 'Mocambicana', 1.5, 'Marcia', 'Paulo', '22', 'Activo', '22'),
(24, 'Zabela', 'Solteiro/a', 'Femenino', 'Triunfo', 'Moza', 0, 'man', 'Om', NULL, 'Desativo', NULL),
(25, 'Azaza', 'Divorciado/a', 'Masculino', 'OO', 'MA', 0, 'www', 'www', '12 12 2020', 'Desativo', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `senha` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `senha`) VALUES
(1, 'a', 'a'),
(63, 'a', 'a'),
(64, 'a', 'a'),
(65, 'a', 'a'),
(67, 'khawir', '1'),
(68, 'admin', 'admin');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
