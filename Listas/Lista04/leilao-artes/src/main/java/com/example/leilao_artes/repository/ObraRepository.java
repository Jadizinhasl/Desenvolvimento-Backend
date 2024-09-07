package com.example.leilao_artes.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.leilao_artes.model.Obra;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObraRepository {
    private static final int ZERO_BYTES = 0;
    private ObjectMapper objectMapper = new ObjectMapper();
    private File arquivo =
        new File("src/main/resources/database/tb_obras.json");

    public List<Obra> getAll() throws IOException {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        if (arquivo.length() > ZERO_BYTES) {
            return objectMapper
                .readValue(arquivo, new TypeReference<List<Obra>>(){});
        }
        return new ArrayList<>();
    }

    public boolean save(Obra obra) throws IOException {
        List<Obra> obras = this.getAll();

        for (Obra obraNoDataBase : obras) {
            if (obra.getId() == obraNoDataBase.getId()) {
                return false;
            }
        }
        obras.add(obra);
        objectMapper.writeValue(arquivo, obras);
        return true;
    }

    public boolean update(Obra obra) throws IOException {
        List<Obra> obras = this.getAll();

        for (Obra obraNoDataBase : obras) {
            if (obra.getId() == obraNoDataBase.getId()) {
                obraNoDataBase.setJaFoiVendida(obra.isJaFoiVendida());
                obraNoDataBase.setId(obra.getId());
                objectMapper
                    .writeValue(arquivo, obras);
                return true;
            }
        }
        return false;
    }
}
