package org.labs.model;

import java.util.Objects;

public class Candidato {

    private String nome;
    private Prova prova;
    private double pontuacao;

    public Candidato() {
    }

    public double calcularPontuacao(){
         return this.prova.getQuestoes()
                .stream()
                .filter(questao -> questao.getAlternativaEscolhida().equals(questao.getAlternativaCorreta()))
                 .mapToDouble(q -> q.getValor())
                 .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    private void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Double.compare(candidato.pontuacao, pontuacao) == 0 && Objects.equals(nome, candidato.nome) && Objects.equals(prova, candidato.prova);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, prova, pontuacao);
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", prova=" + prova +
                ", pontuacao=" + pontuacao +
                '}';
    }
}
