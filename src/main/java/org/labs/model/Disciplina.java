package org.labs.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Disciplina {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
