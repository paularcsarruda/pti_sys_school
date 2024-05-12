-- Cria a tabela "aluno"
CREATE TABLE aluno (
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100),
    data_de_nascimento DATE NOT NULL,
    CPF INT NOT NULL,
    endereco VARCHAR(150) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(50) NOT NULL,
);
