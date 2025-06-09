package com.aluracursos.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FraseService {

    @Autowired
   private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrases(),
                frase.getPersonajes(),frase.getPoster());
    }
}
