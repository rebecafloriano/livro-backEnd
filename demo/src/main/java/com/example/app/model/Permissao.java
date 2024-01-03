package com.example.app.model;

import jakarta.persistence.*;


import java.util.List;
import java.util.Set;


@Entity
public class Permissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoDePermissao;

    @ManyToMany(mappedBy = "permissoes")
    private Set<Usuario> usuarios;

    public Permissao() {

    }
    public Permissao(String tipoDePermissao) {
        this.tipoDePermissao = tipoDePermissao;
    }


    public Integer getId() {
        return id;
    }

    public String getTipoDePermissao() {
        return tipoDePermissao;
    }

    public void setTipoDePermissao(String tipoDePermissao) {
        this.tipoDePermissao = tipoDePermissao;
    }
}
