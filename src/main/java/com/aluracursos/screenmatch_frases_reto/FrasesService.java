package com.aluracursos.screenmatch_frases_reto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {
    @Autowired
    private FrasesRepository repository;

    public FrasesDTO obtenerFraseAleatoria() {
        Frases frase = repository.obtenerFraseAleatoria();
        return new FrasesDTO(
                frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonaje(),
                frase.getPoster()
        );
    }
}
