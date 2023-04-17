package org.labs.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Questao {

    private Disciplina disciplina = new Disciplina();
    private String assunto;
    private int numero;
    private int valor;
    private String textoDaQuestao;
    private Map<Integer, String> alternativas = new HashMap<>();
    private Integer alternativaEscolhida;
    private Integer alternativaCorreta;


    public Questao() {
    }

    public Questao(Disciplina disciplina, String assunto, int numero,
                   int valor, Map<Integer, String> alternativas,
                   Integer alternativaCorreta) {
        this.disciplina = disciplina;
        this.assunto = assunto;
        this.numero = numero;
        this.valor = valor;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public String getTextoDaQuestao() {
        return textoDaQuestao;
    }

    public void setTextoDaQuestao(String textoDaQuestao) {
        this.textoDaQuestao = textoDaQuestao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        Assunto assunto1 = new Assunto(assunto);
        if(this.getDisciplina().getAssuntos().contains(assunto1)){
            this.assunto = assunto1.getTitulo();
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Map<Integer, String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Map<Integer, String> alternativas) {
        this.alternativas = alternativas;
    }

    public Integer getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(Integer alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }

    public Integer getAlternativaEscolhida() {
        return alternativaEscolhida;
    }

    public void setAlternativaEscolhida(Integer alternativaEscolhida) {
        this.alternativaEscolhida = alternativaEscolhida;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "disciplina=" + disciplina +
                ", assunto='" + assunto + '\'' +
                ", numero=" + numero +
                ", valor=" + valor +
                ", alternativas=" + alternativas +
                ", alternativaEscolhida='" + alternativaEscolhida + '\'' +
                ", alternativaCorreta=" + alternativaCorreta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questao questao = (Questao) o;
        return numero == questao.numero && valor == questao.valor && Objects.equals(disciplina, questao.disciplina) && Objects.equals(assunto, questao.assunto) && Objects.equals(alternativas, questao.alternativas) && Objects.equals(alternativaEscolhida, questao.alternativaEscolhida) && Objects.equals(alternativaCorreta, questao.alternativaCorreta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, assunto, numero, valor, alternativas, alternativaEscolhida, alternativaCorreta);
    }
}
