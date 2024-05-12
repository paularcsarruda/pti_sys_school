package com.pti.backend.javaspringbackendpti.interfaces;

import com.pti.backend.javaspringbackendpti.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface FornecedorDAO extends JpaRepository<Fornecedor, Long> {
    
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO fornecedores (nome_fantasia, cnpj, telefone) VALUES (?1, ?2, ?3)", nativeQuery = true)
    void inserirFornecedor(String nome_fantasia, String cnpj, String telefone);
    
    // Encontra um fornecedor pelo nome fantasia
    @Query(value = "SELECT * FROM fornecedor WHERE nome_fantasia = ?", nativeQuery = true)
    Fornecedor findByNomeFantasia(String nome_fantasia);


}
