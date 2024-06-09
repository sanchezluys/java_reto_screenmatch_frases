package com.aluracursos.screenmatch_frases_reto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepository extends JpaRepository<Frases, Long> {

    @Query("SELECT f FROM Frases f ORDER BY function('RANDOM') LIMIT 1)")
    public Frases obtenerFraseAleatoria();
}
