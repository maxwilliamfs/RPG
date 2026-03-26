package com.negocio.basicas.entidades;

import com.negocio.interfaces.Magico;

public abstract class InimigoMagico extends Entidade implements Magico {
    //Atibutos
    private int mana;

    //Metodos
    @Override
    public String getStatus(){
        return super.getStatus() + "\nMana: " + this.getMana();
    }

    //Metodos Padroes
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}
