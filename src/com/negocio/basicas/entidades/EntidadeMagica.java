package com.negocio.basicas.entidades;

import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.AtaqueMagico;
import com.negocio.exceptions.AcaoInvalidaException;
import com.negocio.exceptions.RPGException;

public class EntidadeMagica extends Entidade{
    //Atibutos
    private int mana;

    //Metodos

    @Override
    public String getStatus(){
        return super.getStatus() + " / Mana: " + this.getMana();
    }
    public void ganharMana(int mana){
        this.setMana(this.getMana() + mana);
    }
    public void perderMana(int mana){
        this.setMana(this.getMana() - mana);
    }

    //Metodos Padroes
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
}
