CREATE TABLE funcionario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    endereco VARCHAR(200),
    sexo CHAR(1),
    altura DOUBLE,
    telefone VARCHAR(20),
    registro INT NOT NULL,
    salario DOUBLE
);

CREATE TABLE estagiario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    endereco VARCHAR(200),
    sexo CHAR(1),
    altura DOUBLE,
    telefone VARCHAR(20),
    registro INT NOT NULL,
    salario DOUBLE
);