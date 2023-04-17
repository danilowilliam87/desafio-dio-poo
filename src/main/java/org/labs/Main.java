package org.labs;

import org.labs.model.Bootcamp;
import org.labs.model.Curso;
import org.labs.model.Dev;
import org.labs.model.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Java Web");
        curso.setDescricao("curso de desenvolvimento java web com jsf e jsp");
        curso.setCargaHoraria(360);

        mentoria.setTitulo("Desafio Java");
        mentoria.setDescricao("mentoria para resolução do desafio java");
        mentoria.setData(LocalDate.of(2022, 10, 10));

        System.out.println(curso);
        System.out.println("####################################");
        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BANCO PAN");
        bootcamp.setDescricao("Bootcamp Java Developer em parceria com o banco pan");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);
        Dev dev = new Dev();


        dev.setNome("MESTRE YODA");


        dev.inscreverBootcamp(bootcamp);
        System.out.println("cursos inscritos : " + dev.getConteudosInscritos());

        dev.progredirBootcamp();
        System.out.println("cursos inscritos : " + dev.getConteudosInscritos());


//        System.out.println("Dev 1 conteudos inscritos : " + dev.getConteudosInscritos());
//
//        System.out.println("##########################################################");
//        System.out.println(dev.getConteudosInscritos().size() == 0 ? "não há cursos a terminar" : "falta 1 curso" + dev.getConteudosFinalizados());

    }
}