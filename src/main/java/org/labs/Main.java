package org.labs;

import org.labs.model.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Assunto assunto = new Assunto("ARTIGO");
        Assunto assunto1 = new Assunto("SUBSTANTIVO");
        Assunto assunto2 = new Assunto("ADJETIVO");
        Questao questao = new Questao();
        Questao questao1 = new Questao();
        Questao questao2 = new Questao();

        Candidato  candidato = new Candidato();
        candidato.setNome("candidato 1");
        Prova prova = new Prova();

        Disciplina disciplina = new Disciplina("PORTUGUES");
        Set<Assunto> assuntosDisciplina = new HashSet<>();
        assuntosDisciplina.add(new Assunto("ARTIGO"));
        assuntosDisciplina.add(new Assunto("SUBSTANTIVO"));
        assuntosDisciplina.add(new Assunto("PRONOME"));
        disciplina.setAssuntos(assuntosDisciplina);

        Map<Integer, String> alternativas1 = new HashMap<>();
        Map<Integer, String> alternativas2 = new HashMap<>();
        Map<Integer, String> alternativas3 = new HashMap<>();

        alternativas1.put(1, "Como aponta o relatório da Unicef de 2021 sobre o impacto da covid-19 na saúde mental [...]” (3º§) Como aponta relatório da Unicef de 2021 sobre o impacto da covid-19 na saúde mental [...]");
        alternativas1.put(2, "No noticiário de todo o país, explodiu a ocorrência de casos de discriminação e bullying [...]” (3º§) No noticiário de todo país, explodiu a ocorrência de casos de discriminação e bullying [...]");
        alternativas1.put(3, "[...] se bebermos da fonte mais preciosa, acolhendo as ideias de quem vive na pele os danos do distanciamento social.” (8º§) [...]se bebermos da fonte mais preciosa, acolhendo as ideias de quem vive na pele danos do distanciamento social");
        alternativas1.put(4, "Cada tipo de violência demanda respostas diversas (...) como evidenciou o vasto levantamento produzido pela consultoria Vozes da Educação.” (4º§) Cada tipo de violência demanda respostas diversas (...) como evidenciou vasto levantamento produzido pela consultoria Vozes da Educação.");
        Integer alternaticaCerta = 1;

        alternativas2.put(1, "as – sem artigo – as");
        alternativas2.put(2, "as – as – sem artigo");
        alternativas2.put(3, "sem artigo – as – as");
        alternativas2.put(4, "sem artigo – sem artigo – as");
        Integer alternaticaCerta2 = 4;


        alternativas3.put(1, "as – sem artigo – as");
        alternativas3.put(2, "as – as – sem artigo");
        alternativas3.put(3, "sem artigo – as – as");
        alternativas3.put(4, "sem artigo – sem artigo – as");
        Integer alternaticaCerta3 = 4;

        questao.setAssunto("ARTIGO");
        questao.setTextoDaQuestao("Em qual dos seguintes fragmentos a supressão do artigo definido o(s) destacado altera sensivelmente o sentido do enunciado?");
        questao.setAlternativas(alternativas1);
        questao.setDisciplina(disciplina);
        questao.setAlternativaCorreta(1);
        questao.setAlternativaEscolhida(1);
        questao.setValor(100);



        questao1.setAssunto("ARTIGO");
        questao1.setTextoDaQuestao("Considerando o emprego correto dos artigos, assinale a alternativa que preenche, correta e respectivamente, as lacunas pontilhadas nas linhas 09, 14 e 17. Onde não houver a ocorrência de artigo, considere a expressão sem artigo");
        questao1.setAlternativas(alternativas2);
        questao1.setDisciplina(disciplina);
        questao1.setAlternativaCorreta(4);
        questao1.setAlternativaEscolhida(1);
        questao1.setValor(100);



        Set<Questao> questaos = new HashSet<>();
        questaos.add(questao);
        questaos.add(questao1);

        prova.setQuestoes(questaos);

        candidato.setProva(prova);



        System.out.println("Pontuação total = " + candidato.calcularPontuacao());


    }
}