package com.example.UTI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UTI.model.Medico;
import com.example.UTI.service.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    private MedicoService service = new MedicoService();

    @GetMapping
    public List<Medico> listarMedicos() throws Exception {
        return service.listarMedicos();
    }

    @PostMapping
    public String cadastrarNovoMedico(@RequestBody Medico medico) throws Exception {
        return service.cadastrarNovoMedico(medico);
    }
}