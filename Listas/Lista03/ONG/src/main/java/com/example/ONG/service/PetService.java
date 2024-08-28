package com.example.ONG.service;

import java.util.List;

import com.example.ONG.model.Pet;
import com.example.ONG.repository.PetRepository;

public class PetService {
    private PetRepository repository = new PetRepository();

    public List<Pet> listarPets() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception {
        if (repository.save(pet)) {
            return pet.getNome()+" cadastrado com sucesso";
        }
        return "O id de cada animal devem ser unico";
    }
}
