package com.negocio.basicas;
public class AtaqueMagico extends AtaqueAbstrato{
    //Atributos
    private int mana;

    //Contrutor
    public AtaqueMagico(String nome, int dano, int stamina, int mana){
        super(nome,dano,stamina);
        this.setMana(mana);
    }

    //Metodos Padroes
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}
