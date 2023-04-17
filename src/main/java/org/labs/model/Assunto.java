package org.labs.model;

import java.util.Objects;

public class Assunto {

    private String titulo;

    public Assunto(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assunto assunto = (Assunto) o;
        return Objects.equals(titulo, assunto.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }


    @Override
    public String toString() {
        return "Assunto{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
