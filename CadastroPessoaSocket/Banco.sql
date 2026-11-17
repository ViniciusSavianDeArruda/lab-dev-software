CREATE DATABASE IF NOT EXISTS cadastro_pessoa;
CREATE DATABASE cadastro_pessoa;

USE cadastro_pessoa;

CREATE TABLE pessoas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(20),
    idioma VARCHAR(50)
);

SELECT * FROM pessoas;