package com.example.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
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
            name = "UsuarioPermissao",
            joinColumns = @JoinColumn(name= "usuarioId"),
            inverseJoinColumns = @JoinColumn(name= "permissaoId")
    )
    // declara um atributo chamado permissoes na classe Usuario e nao permite elementos duplicados
    private Set<Permissao> permissoes = new HashSet<>();
}
