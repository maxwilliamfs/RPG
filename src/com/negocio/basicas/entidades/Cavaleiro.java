package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;

public class Cavaleiro extends Jogador{
    //Contrutor
    public Cavaleiro(){
        this.setNome("Cavaleiro");
        this.setVida(30);
        this.getAtaques().add(BancoAtaques.espadada);
        this.getAtaques().add(BancoAtaques.corteProfundo);
    }
}
