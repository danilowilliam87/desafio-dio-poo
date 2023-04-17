package org.labs.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Prova {

    private String titulo;
    private Candidato candidato;
    private Set<Resposta> respostas = new HashSet<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Set<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(Set<Resposta> respostas) {
        this.respostas = respostas;
    }

    public double calcularPontuacao(){
        return this.respostas
                .stream()
                .filter(resposta -> resposta.getNumeroResposta().equals(resposta.getNumeroResposta()))
                .mapToDouble(pontos -> pontos.obterPontoDaQuestao())
                .sum();
    }

    @Override
    public String toString() {
        return "Prova{" +
                "titulo='" + titulo + '\'' +
                ", candidato=" + candidato +
                ", respostas=" + respostas +
                '}';
    }
}
