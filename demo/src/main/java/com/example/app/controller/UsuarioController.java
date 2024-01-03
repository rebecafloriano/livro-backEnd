package com.example.app.controller;

import com.example.app.model.Usuario;
import com.example.app.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Integer id) {
        return usuarioService.findById(id).orElse(null);
    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        usuarioService.deleteById(id);
    }
}
