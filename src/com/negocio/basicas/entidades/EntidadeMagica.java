package com.negocio.basicas.entidades;

import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.AtaqueMagico;
import com.negocio.exceptions.AcaoInvalidaException;
import com.negocio.exceptions.RPGException;

public abstract class EntidadeMagica extends Entidade{
    //Atibutos
    private int mana;

    //Metodos
    @Override
    public boolean requisitosAtaque(AtaqueAbstrato escolhido) throws RPGException {
        if(!(escolhido instanceof AtaqueMagico)){
            return super.requisitosAtaque(escolhido);
        }
        if(this.getStamina() >= escolhido.getStamina()){
            AtaqueMagico escolhidoMagico = (AtaqueMagico) escolhido;
            if(this.getMana() >= escolhidoMagico.getMana()){
                return true;
            } else {
                throw new AcaoInvalidaException("Mana Insuficiente");
            }
        } else {
            throw new AcaoInvalidaException("Stamina Insuficiente");
        }
    }
    @Override
    public void consumirRecursos(AtaqueAbstrato escolhido){
        AtaqueMagico escolhidoMagico = (AtaqueMagico) escolhido;
        super.consumirRecursos(escolhido);
        this.setMana(this.getMana() - escolhidoMagico.getMana());
    }
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
