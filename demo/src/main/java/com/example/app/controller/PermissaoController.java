package com.example.app.controller;

import com.example.app.model.Permissao;
import com.example.app.repository.PermissaoRepository;
import com.example.app.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/permissoes")
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @GetMapping
    public List<Permissao> findAll() {
        return permissaoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Permissao findById(@PathVariable Integer id) {
        return permissaoService.findById(id).orElse(null);
    }

    @PostMapping
    public Permissao insert(@RequestBody Permissao permissao) {
        return permissaoService.save(permissao);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        permissaoService.deleteById(id);
    }

}
