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

    public Autor() {

    }
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }


    // Métodos para manipulação do conjunto de livros
    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        livro.getAutores().add(this);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
        livro.getAutores().remove(this);
    }
}
