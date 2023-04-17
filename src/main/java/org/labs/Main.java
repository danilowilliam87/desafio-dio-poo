package org.labs;

import org.labs.model.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato();
        candidato1.setNome("Canidato #1");

        Candidato candidato2 = new Candidato();
        candidato2.setNome("Canidato #2");


        Disciplina disciplina = new Disciplina();
        disciplina.setTitulo("MATEMATICA");

        Map<Integer, String> alternativas1 = new HashMap<>();
        Map<Integer, String> alternativas2 = new HashMap<>();

        //alternativas1.put(1, "QUANTO É 15% DE R$ 200,00 ");
        String texto = "quanto é 10% de R$ 300,00".toUpperCase();
        alternativas1.put(1, "R$ 20,00");
        alternativas1.put(2, "R$ 22,00");
        alternativas1.put(3, "R$ 39,00");
        alternativas1.put(4, "R$ 30,00");

        String texto2 = "quanto é 10% de R$ 100,00".toUpperCase();
        alternativas2.put(1, "R$ 20,00");
        alternativas2.put(2, "R$ 10,00");
        alternativas2.put(3, "R$ 39,00");
        alternativas2.put(4, "R$ 30,00");

        Questao questao = new Questao();
        Questao questao1 = new Questao();

        questao.setValor(1000);
        questao.setTextoDaQuestao(texto);
        questao.setAlternativas(alternativas1);
        questao.setAlternativaCorreta(4);
        questao.setNumero(100);


        questao1.setValor(1000);
        questao1.setTextoDaQuestao(texto2);
        questao1.setAlternativas(alternativas2);
        questao1.setAlternativaCorreta(2);
        questao1.setNumero(200);

        Resposta resposta = new Resposta();
        Resposta resposta1 = new Resposta();
        Resposta resposta2 = new Resposta();
        Resposta resposta3 = new Resposta();

        resposta.setNumeroResposta(4);
        resposta.setQuestao(questao);

        resposta1.setNumeroResposta(2);
        resposta1.setQuestao(questao1);

        resposta2.setNumeroResposta(4);
        resposta2.setQuestao(questao);

        resposta3.setNumeroResposta(1);
        resposta3.setQuestao(questao1);

        Prova prova = new Prova();
        Prova prova1 = new Prova();

        Set<Resposta> respostas1 = new HashSet<>();
        Set<Resposta> respostas2 = new HashSet<>();
        respostas1.add(resposta);
        respostas1.add(resposta1);
        respostas2.add(resposta2);
        respostas2.add(resposta3);

        prova.setCandidato(candidato1);
        prova.setRespostas(respostas1);

        prova1.setCandidato(candidato2);
        prova1.setRespostas(respostas2);

        prova.setTitulo("avaliação de matematica");
        prova1.setTitulo("avaliação de matematica");

        System.out.println("Pontuação de candidato #1 : " + prova.calcularPontuacao());
        System.out.println("Pontuação de candidato #2 : " + prova1.calcularPontuacao());


    }
}