package com.pti.backend.javaspringbackendpti.controllers;
import org.springframework.stereotype.Service;

import com.pti.backend.javaspringbackendpti.interfaces.AlunoDAO;
import com.pti.backend.javaspringbackendpti.interfaces.FornecedorDAO;
import com.pti.backend.javaspringbackendpti.interfaces.ProfessorDAO;

@Service
public class CadastroService {

    private final AlunoDAO alunoDAO;
    private final ProfessorDAO professorDAO;
    private final FornecedorDAO fornecedorDAO;

    public CadastroService(AlunoDAO alunoDAO, ProfessorDAO professorDAO, FornecedorDAO fornecedorDAO) {
        this.alunoDAO = alunoDAO;
        this.professorDAO = professorDAO;
        this.fornecedorDAO = fornecedorDAO;
    }

    public void cadastrarAluno(String nome, String dataNascimento, String cpf, String endereco, String email, String telefone) {
        // Lógica de negócio para cadastro de aluno (se necessário)
        alunoDAO.inserirAluno(nome, dataNascimento, cpf, endereco, email, telefone);
    }

    public void cadastrarProfessor(String nome, String cpf, String email, String disciplina) {
        // Lógica de negócio para cadastro de professor (se necessário)
        professorDAO.inserirProfessor(nome, cpf, email, disciplina);
    }

    public void cadastrarFornecedor(String nomeFantasia, String cnpj, String telefone) {
        // Lógica de negócio para cadastro de fornecedor (se necessário)
        fornecedorDAO.inserirFornecedor(nomeFantasia, cnpj, telefone);
    }
}
