package org.labs.model;

public class Resposta {
    private Integer numeroResposta;
    private Questao questao;

    public Integer getNumeroResposta() {
        return numeroResposta;
    }

    public void setNumeroResposta(Integer numeroResposta) {
        this.numeroResposta = numeroResposta;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public double obterPontoDaQuestao(){
        return this.questao.getAlternativaCorreta()
                .equals(this.numeroResposta) ? questao.getValor() : 0d;
    }

    @Override
    public String toString() {
        return "Resposta{" +
                "numeroResposta=" + numeroResposta +
                ", questao=" + questao +
                '}';
    }
}
