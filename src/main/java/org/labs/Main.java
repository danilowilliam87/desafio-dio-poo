package org.labs;

import org.labs.model.Curso;
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
    }
}