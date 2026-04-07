package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;

public class Cavaleiro extends Jogador{
    //Contrutor
    public Cavaleiro(){
        this.getAtaques().set(1, BancoAtaques.espadada);
        this.getAtaques().set(2, BancoAtaques.corteProfundo);
    }
}
