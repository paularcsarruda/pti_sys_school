package com.pti.backend.javaspringbackendpti.interfaces;

import com.pti.backend.javaspringbackendpti.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface AlunoDAO extends JpaRepository<Aluno, Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO alunos (nome, data_de_nascimento, CPF, endereco, email, telefone) VALUES (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
    void inserirAluno(String nome, String dataNascimento, String cpf, String endereco, String email, String telefone);
    
    // Encontra um aluno pelo nome
    @Query(value = "SELECT * FROM alunos WHERE nome = ?", nativeQuery = true)
    Aluno findByNome(String nome);


}
