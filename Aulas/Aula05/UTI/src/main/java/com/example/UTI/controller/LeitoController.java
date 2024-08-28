package com.example.UTI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UTI.model.Leito;
import com.example.UTI.service.LeitoService;

@RestController
@RequestMapping("/leitos")
public class LeitoController {
    private LeitoService service = new LeitoService();

    @GetMapping
    public List<Leito> listarTodosLeitos() {
        return service.listarLeitos();
    }

    @PostMapping
    public String cadastrarNovoLeito(@RequestBody Leito leito) {
        return service.cadastrarNovoLeito(leito);
    }
}