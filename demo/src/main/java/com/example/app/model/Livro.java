package com.example.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
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
    private Set<Autor> autores;

    public Livro() {

    }
    public Livro(String titulo, String isbn, Integer anoPublicacao, Integer numDePaginas, Integer estoque, Categoria categoria, Editora editora) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.numDePaginas = numDePaginas;
        this.estoque = estoque;
        this.categoria = categoria;
        this.editora = editora;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public Integer getNumDePaginas() {
        return numDePaginas;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Editora getEditora() {
        return editora;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumDePaginas(Integer numDePaginas) {
        this.numDePaginas = numDePaginas;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
}
