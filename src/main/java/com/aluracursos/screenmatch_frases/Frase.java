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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrases() {
        return frases;
    }

    public void setFrases(String frases) {
        this.frases = frases;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}

