package com.pti.backend.javaspringbackendpti.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "fornecedor")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(nullable = false)
    private String nome_fantasia;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String telefone;

}
