-- Cria a tabela "alunos"
CREATE TABLE professor (
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(100),
    CPF INT NOT NULL,
    email VARCHAR(100) NOT NULL,
    disciplina VARCHAR(50) NOT NULL,
);