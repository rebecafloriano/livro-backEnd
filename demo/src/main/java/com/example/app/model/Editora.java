package com.example.app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "editora")
    private List<Livro> livros;
    public Editora() {

    }

    public Editora(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
