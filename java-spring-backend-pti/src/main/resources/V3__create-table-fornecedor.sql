-- Cria a tabela "alunos"
CREATE TABLE professores (
    id SERIAL PRIMARY KEY,
    nome_fantasia VARCHAR(100),
    CNPJ INT NOT NULL,
    telefone VARCHAR(50)
);