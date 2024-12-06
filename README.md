# TRABALHO FINAL POO

### PRÉ-REQUISITOS:

#### 1. Fazer download do MySQL Workbench (8.0.32):
- https://downloads.mysql.com/archives/installer/

#### 2. Fazer download do Git Bash:
- https://git-scm.com/downloads (baixe de acordo com seu sistema operacional).

#### 3. Fazer download do Java 17:
- https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html (baixe de acordo com seu sistema operacional).

### PRIMEIROS PASSOS:

#### 1. Para criar o banco de dados
- Abrir o workbench e logar no localhost
- Importar:

```

-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.30 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para trabalho_final
CREATE DATABASE IF NOT EXISTS `trabalho_final` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `trabalho_final`;

-- Copiando estrutura para tabela trabalho_final.estagiario
CREATE TABLE IF NOT EXISTS `estagiario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `idade` int NOT NULL,
  `endereco` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sexo` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `altura` double DEFAULT NULL,
  `telefone` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `registro` int NOT NULL,
  `salario` double DEFAULT NULL,
  `bolsa` double DEFAULT NULL,
  `horas_servico` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela trabalho_final.estagiario: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela trabalho_final.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `idade` int NOT NULL,
  `endereco` varchar(200) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sexo` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `altura` double DEFAULT NULL,
  `telefone` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `registro` int NOT NULL,
  `salario` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando estrutura para tabela trabalho_final.evento
CREATE TABLE IF NOT EXISTS `evento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `dia` int NOT NULL,
  `hora` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela trabalho_final.funcionario: ~0 rows (aproximadamente)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

```

### INSTALAÇÃO DO PROJETO
- Crie uma pasta em um lugar de preferencia na sua maquina, e em seguida, abra ele e com o botao direito do mouse, selecione a opção "Open Git Bash Here".
- Digite no console "git clone https://github.com/gbirck/trabalho-final-POO.git".
- Faça login no seu git e pronto, abra sua IDE e abra o caminho onde você clonou o projeto.
- IDE que recomendo: https://netbeans.apache.org/front/main/index.html.]

### EXECUÇÃO DO PROJETO
- Execute e utilize
