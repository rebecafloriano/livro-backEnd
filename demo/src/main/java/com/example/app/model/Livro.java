package com.example.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String isbn;
    private Integer anoPublicacao;
    private Integer numDePaginas;
    private Integer estoque;

    @ManyToOne
    @JoinColumn(name = "categoriaId")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "editoraId")
    private Editora editora;


    @ManyToMany
    @JoinTable(
            name = "AutorLivro",
            joinColumns = @JoinColumn(name= "livroId"),
            inverseJoinColumns = @JoinColumn(name= "autorId")
    )
    // declara um atributo chamado autores na classe Livro e nao permite elementos duplicados
    private Set<Autor> autores = new HashSet<>();




}
