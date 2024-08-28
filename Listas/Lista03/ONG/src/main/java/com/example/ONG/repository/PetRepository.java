package com.example.ONG.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.ONG.model.Pet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetRepository {
    private static final long ZERO_BYTES = 0;
    private static File arquivo = new File("ONG/src/main/resources/database/tb_pets.json");

    private ObjectMapper objectMapper = new ObjectMapper();

    public List<Pet> getAll() throws Exception{
        if (!arquivo.exists()){
            arquivo.createNewFile();
        }

        if (arquivo.length() > ZERO_BYTES) {
            return objectMapper.readValue(arquivo, new TypeReference<ArrayList<Pet>>() {});
        }
        
        return new ArrayList<>();
    }

    public boolean save(Pet pet) throws Exception {
        List<Pet> pets = this.getAll();

        for (Pet petsNoBanco : pets) {
            if (pet.getId() == petsNoBanco.getId()) {
                return false;
            }
        }
        pets.add(pet);
        objectMapper.writeValue(arquivo, pets);
        return true;
    }
}
