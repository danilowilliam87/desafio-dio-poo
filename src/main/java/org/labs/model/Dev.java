package org.labs.model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
    private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<Conteudo>();

    public void inscreverBootcamp(Bootcamp bootcamp){
         this.conteudosInscritos.addAll(bootcamp.getConteudos());
         bootcamp.getDevsIncritos().add(this);
    }

    public void progredirBootcamp(){
        Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();
         if(conteudo.isPresent()) {
             this.conteudosFinalizados.add(conteudo.get());
             this.conteudosInscritos.remove(conteudo.get());
         }else{
             System.out.println("você não está inscrito neste curso !");
         }
    }

    public double calcularTotalXP(){
        return this.conteudosFinalizados
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosFinalizados, dev.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosFinalizados);
    }
}
