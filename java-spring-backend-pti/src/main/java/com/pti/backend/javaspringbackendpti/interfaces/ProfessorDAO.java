package com.pti.backend.javaspringbackendpti.interfaces;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.pti.backend.javaspringbackendpti.models.Professor;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Repository
public interface ProfessorDAO extends JpaRepository<Professor, Long> {
    
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO professores (nome, cpf, email, disciplina) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void inserirProfessor(String nome, String cpf, String email, String disciplina);

    // Encontra um professor pelo nome
    @Query(value = "SELECT * FROM professores WHERE nome = ?", nativeQuery = true)
    Professor findByNome(String nome);

    // Encontra todos os professores com um determinado departamento
    @Query(value = "SELECT * FROM professor WHERE disciplina = ?", nativeQuery = true)
    List<Professor> findByDisciplina(String disciplina);

}
