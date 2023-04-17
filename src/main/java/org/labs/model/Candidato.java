package org.labs.model;

import java.util.Objects;

public class Candidato {

    private String nome;

    public Candidato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
