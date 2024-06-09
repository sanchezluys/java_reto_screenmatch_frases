package com.aluracursos.screenmatch_frases_reto;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personaje;
    private String poster;
}
