package me.dio.boot;

import java.util.HashSet;
import java.util.Set;

public class Atividade{
    private String nome;
    private Set<Topico> topicos = new HashSet<Topico>();

    public Atividade(String nome){
        this.nome = nome;
    }

    public String getNome(){return nome;}

    public void adicionar(Topico t){topicos.add(t);}

    public void mostrar_topicos(){
        System.out.println(getNome());
        for(Topico t: topicos){
            System.out.println(" * " + t.getNome());
        }
    }
}

