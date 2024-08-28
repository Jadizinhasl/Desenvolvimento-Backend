package com.example.UTI.service;

import java.util.List;

import com.example.UTI.model.Leito;
import com.example.UTI.repository.LeitoRepository;

public class LeitoService {
    private LeitoRepository repository = new LeitoRepository();

    public List<Leito> listarLeitos() {
        return repository.getAll();
    }

    public String cadastrarNovoLeito(Leito leito) {
        if (repository.save(leito)) {
            return "Leito " + leito.getNumeroQuarto() + "foi adicionado";
        }

        return "Leitos devem tet id unico";
    }
}
