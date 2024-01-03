package com.example.app.service;


import com.example.app.model.Permissao;
import com.example.app.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissaoService {

    @Autowired
    private PermissaoRepository permissaoRepository;

    public List<Permissao> findAll() {
        return permissaoRepository.findAll();
    }

    public Optional<Permissao> findById(Integer id) {
        return permissaoRepository.findById(id);
    }

    public Permissao save(Permissao permissao) {
        return permissaoRepository.save(permissao);
    }

    public void deleteById(Integer id) {
        permissaoRepository.deleteById(id);
    }
}
