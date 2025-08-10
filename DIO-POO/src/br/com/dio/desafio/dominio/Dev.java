package br.com.dio.desafio.dominio;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //Assim só é possível adicionar 1 vez o conteudo
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); //Adiciona tudo dentro do parâmetro nos conteudosInscritos
        bootcamp.getDevsInscritos().add(this);//Adiciona os DEVs na classe Bootcamp
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();//Uitliza o stream para procurar pelo primeiro conteudo nos conteudosInscritos
        if(conteudo.isPresent()){//Se tiver conteudo
            this.conteudosConcluidos.add(conteudo.get());//Adiciona o conteudo aos conteudosConcluídos
            this.conteudosInscritos.remove(conteudo.get());//E remove o conteudo dos conteudosInscritos
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXP(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calculaXP).sum(); //Pega todos os conteúdos concluídos, calcula o XP de cada um e retorna a soma total
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

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
