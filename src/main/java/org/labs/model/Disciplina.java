package org.labs.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Disciplina {

    private String titulo;
    private Set<Assunto> assuntos = new HashSet<>();

    public Disciplina(String titulo) {
        this.titulo = titulo;
    }

    public Disciplina() {
        this.titulo = "";
        this.assuntos = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Assunto> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(Set<Assunto> assuntos) {
        this.assuntos = assuntos;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "titulo='" + titulo + '\'' +
                ", assuntos=" + assuntos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
