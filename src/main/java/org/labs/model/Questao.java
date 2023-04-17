package org.labs.model;

import java.util.HashMap;
import java.util.Map;


public class Questao {

    private Disciplina disciplina = new Disciplina();
    private int numero;
    private int valor;
    private String textoDaQuestao;
    private Map<Integer, String> alternativas = new HashMap<>();
    private Integer alternativaCorreta;


    public Questao() {
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
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

    public String getTextoDaQuestao() {
        return textoDaQuestao;
    }

    public void setTextoDaQuestao(String textoDaQuestao) {
        this.textoDaQuestao = textoDaQuestao;
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
        if(alternativaCorreta > 0 && alternativaCorreta <= 4){
           this.alternativaCorreta = alternativaCorreta;
        }
    }

    @Override
    public String toString() {
        return "Questao{" +
                "disciplina=" + disciplina +
                ", numero=" + numero +
                ", valor=" + valor +
                ", textoDaQuestao='" + textoDaQuestao + '\'' +
                ", alternativas=" + alternativas +
                ", alternativaCorreta=" + alternativaCorreta +
                '}';
    }
}
