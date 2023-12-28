package com.example.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String nacionalidade;

    @ManyToMany(mappedBy = "autores")
    private Set<Livro> livros = new HashSet<>();
}
