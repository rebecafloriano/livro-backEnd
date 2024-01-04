package com.example.app.model;

import jakarta.persistence.*;


import java.util.List;
import java.util.Set;


@Entity
@Table(name = "permissao")
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "permissao")
    private String permissao;

    @ManyToMany(mappedBy = "permissoes")
    private Set<Usuario> usuarios;

    public Permissao() {

    }
    public Permissao(String permissao) {
        this.permissao = permissao;
    }


    public Integer getId() {
        return id;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
}
