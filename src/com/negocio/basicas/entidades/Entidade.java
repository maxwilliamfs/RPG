package com.negocio.basicas.entidades;
import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.AtaqueMagico;
import com.negocio.basicas.enuns.ListaAtaques;

import java.util.ArrayList;

public abstract class Entidade {
    //Instancias e Atributos
    private String nome;
    private ArrayList<AtaqueAbstrato> ataques;
    private int Vida,stamina;

    //Metodos
    public boolean isVivo(){
        if(this.getVida() <= 0){
            return false;
        }
        return true;
    }
    public void receberDano(int valor){
        this.setVida(this.getVida() - valor);
    }
    public void curar(int valor){
        this.setVida(this.getVida() + valor);
    }
    public void perderEstamina(int valor){
        this.setStamina(this.getStamina() - valor);
    }
    public void GanharEstamina(int valor){
        this.setStamina(this.getStamina() + valor);
    }
    public String getStatus(){
        return "Nome: " + this.getNome() + " / HP:" + this.getVida() + "\n" + "Stamina: " + this.getStamina();
    }
    public void atacar(Entidade alvo, ListaAtaques ataqueEscolhido){
        AtaqueAbstrato escolhido = null;
        switch (ataqueEscolhido){
            case ATAQUE1:
                escolhido = this.getAtaques().get(0);
                break;
            case ATAQUE2:
                escolhido = this.getAtaques().get(1);
                break;
        }
        System.out.println(this.getNome() + " usou " + escolhido.getNome() + "!!!!");
        if(this.getStamina() >= )

        alvo.receberDano(escolhido.getDano());
        this.perderEstamina(escolhido.getStamina());
        if(escolhido instanceof AtaqueMagico){
            JogadorMagico usuario = (JogadorMagico) this;
            usuario.perderMana(((AtaqueMagico) escolhido).getMana());
        }
    }

    //Metodos Padroes
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public int getVida() {
        return Vida;
    }
    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    public ArrayList<AtaqueAbstrato> getAtaques() {
        return ataques;
    }
    public void setAtaques(ArrayList<AtaqueAbstrato> ataques) {
        this.ataques = ataques;
    }
}
