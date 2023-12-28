package com.example.app.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoDePermissao;

    @ManyToMany(mappedBy = "permissoes")
    private Set<Usuario> usuarios = new HashSet<>();
}
