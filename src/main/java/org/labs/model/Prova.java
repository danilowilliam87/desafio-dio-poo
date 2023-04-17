package org.labs.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Prova {

    private String titulo;
    private Set<Questao> questoes = new HashSet<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Set<Questao> questoes) {
        this.questoes = questoes;
    }

    @Override
    public String toString() {
        return "Prova{" +
                "titulo='" + titulo + '\'' +
                ", questoes=" + questoes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prova prova = (Prova) o;
        return Objects.equals(titulo, prova.titulo) && Objects.equals(questoes, prova.questoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, questoes);
    }
}
