package com.example.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String testDatabaseConnection() {
        try {
            // Teste uma consulta simples ao banco de dados
            jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return "Conexão com o banco de dados bem-sucedida!";
        } catch (Exception e) {
            // Se ocorrer uma exceção, algo está errado
            return "Erro na conexão com o banco de dados: " + e.getMessage();
        }
    }
}
