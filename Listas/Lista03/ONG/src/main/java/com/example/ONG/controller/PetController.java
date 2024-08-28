package com.example.ONG.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ONG.model.Pet;
import com.example.ONG.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
    private PetService service = new PetService();

    @GetMapping
    public List<Pet> listarPets() throws Exception {
        return service.listarPets();
    }

    @PostMapping
    public String cadastrarNovoPet(@RequestBody Pet pet) throws Exception {
        return service.cadastrarNovoPet(pet);
    }
}
