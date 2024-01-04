package com.example.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String password;
    private String telefone;

    @ManyToMany
    @JoinTable(
            name = "Usuario_Permissao",
            joinColumns = @JoinColumn(name= "usuarioId"),
            inverseJoinColumns = @JoinColumn(name= "permissaoId")
    )
    private Set<Permissao> permissoes;


    // Contrutores
    public Usuario() {

    }

    public Usuario(String nome, String email, String password, String telefone) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.telefone = telefone;
                        
    }

    // Métodos Getters
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefone() {
        return telefone;
    }

    // Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    // Métodos Específicos
    
}
