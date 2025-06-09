package com.aluracursos.screenmatch_frases;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")

public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String titulo;
    private String frases;
    private String personajes;
    private String poster;
}
