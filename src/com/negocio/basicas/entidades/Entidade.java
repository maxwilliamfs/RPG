package com.negocio.basicas.entidades;
import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.AtaqueMagico;
import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;
import com.negocio.exceptions.AcaoInvalidaException;
import com.negocio.exceptions.RPGException;

import java.util.ArrayList;

public abstract class Entidade {
    //Instancias e Atributos
    private String nome;
    private ArrayList<AtaqueAbstrato> ataques = new ArrayList<>();
    private int Vida,stamina;

    //Construtor
    public Entidade (String nome, int vida, AtaqueAbstrato at1, AtaqueAbstrato at2){
        this.setStamina(5);
        this.setVida(vida);
        this.setNome(nome);
        this.getAtaques().add(at1);
        this.getAtaques().add(at2);
    }

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
    public void perderStamina(int valor){
        this.setStamina(this.getStamina() - valor);
    }
    public void GanharStamina(int valor){
        this.setStamina(this.getStamina() + valor);
    }
    public String getStatus(){
        return "Nome: " + this.getNome() + " / HP:" + this.getVida() + "\n" + "Stamina: " + this.getStamina();
    }

    //Metodos Ataque
    public void atacar(Entidade alvo, ListaAtaques ataqueEscolhido) throws RPGException {
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
        if(requisitosAtaque(escolhido)){
            alvo.receberDano(escolhido.getDano());
            consumirRecursos(escolhido);
        }
    }
    public boolean requisitosAtaque(AtaqueAbstrato escolhido) throws RPGException {
        if(this.getStamina() >= escolhido.getStamina()){
            return true;
        } else {
            throw new AcaoInvalidaException("Stamina Insuficiente!");
        }
    }
    public void consumirRecursos(AtaqueAbstrato escolhido){
        this.perderStamina(escolhido.getStamina());
    }
    public void finalizarTurno(){
        this.GanharStamina(5);
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
