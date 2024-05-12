package com.pti.backend.javaspringbackendpti.controllers;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.pti.backend.javaspringbackendpti.models.*;


@Controller
public class CadastroController {

    private final CadastroService cadastroService;

    // @Autowired
    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @PostMapping("/aluno")
    @ResponseBody
    public String cadastrarAluno(@RequestBody Aluno alunoRequest) {
        cadastroService.cadastrarAluno(
            alunoRequest.getNome(),
            alunoRequest.getDataNascimento(),
            alunoRequest.getCpf(),
            alunoRequest.getEndereco(),
            alunoRequest.getEmail(),
            alunoRequest.getTelefone()
        );
        return "Aluno cadastrado com sucesso!";
    }

    @PostMapping("/professor")
    @ResponseBody
    public String cadastrarProfessor(@RequestBody Professor professorRequest) {
        cadastroService.cadastrarProfessor(
            professorRequest.getNome(),
            professorRequest.getCpf(),
            professorRequest.getEmail(),
            professorRequest.getDisciplina()
        );
        return "Professor cadastrado com sucesso!";
    }

    @PostMapping("/fornecedor")
    @ResponseBody
    public String cadastrarFornecedor(@RequestBody Fornecedor fornecedorRequest) {
        cadastroService.cadastrarFornecedor(
            fornecedorRequest.getNome_fantasia(),
            fornecedorRequest.getCnpj(),
            fornecedorRequest.getTelefone()
        );
        return "Fornecedor cadastrado com sucesso!";
    }
}
