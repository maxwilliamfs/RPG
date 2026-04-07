package com.negocio.basicas;

public class Ataque {
    //Atributos
    private String nome;
    private int dano, stamina;
    
    //Construtor
    public Ataque(String nome, int dano, int stamina){

    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
