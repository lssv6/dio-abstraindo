package me.dio.boot;

import java.util.HashSet;
import java.util.Set;

public class Bootcamp{
    private String nome;
    private Set<Atividade> atividades = new HashSet<Atividade>();
    public Bootcamp(String nome){
        this.nome = nome;
    }
 
    public String getNome(){return nome;}
    public void adicionar(Atividade a){atividades.add(a);}
    public void mostrar_todas_as_aulas(){
        for(Atividade a : atividades){
            a.mostrar_topicos();
        }
    }
}

