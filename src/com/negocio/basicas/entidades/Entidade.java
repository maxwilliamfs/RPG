package com.negocio.basicas.entidades;
import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.enuns.ListaAtaques;

import java.util.ArrayList;

public abstract class Entidade {
    //Instancias e Atributos
    private String nome;
    private ArrayList<AtaqueAbstrato> ataques;
    private int pVida,pEstamina;

    //Metodos
    public boolean isVivo(){
        if(this.getpVida() <= 0){
            return false;
        }
        return true;
    }
    public void receberDano(int valor){
        this.setpVida(this.getpVida() - valor);
    }
    public void curar(int valor){
        this.setpVida(this.getpVida() + valor);
    }
    public void perderEstamina(int valor){
        this.setpEstamina(this.getpEstamina() - valor);
    }
    public void GanharEstamina(int valor){
        this.setpEstamina(this.getpEstamina() + valor);
    }
    public String getStatus(){
        return "Nome: " + this.getNome() + " / HP:" + this.getpVida() + "\n" + "Stamina: " + this.getpEstamina();
    }
    public void atacar(Entidade alvo, ListaAtaques ataqueEscolhido){

    }

    //Metodos Padroes
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getpEstamina() {
        return pEstamina;
    }
    public void setpEstamina(int pEstamina) {
        this.pEstamina = pEstamina;
    }
    public int getpVida() {
        return pVida;
    }
    public void setpVida(int pVida) {
        this.pVida = pVida;
    }
    public ArrayList<AtaqueAbstrato> getAtaques() {
        return ataques;
    }
    public void setAtaques(ArrayList<AtaqueAbstrato> ataques) {
        this.ataques = ataques;
    }
}
