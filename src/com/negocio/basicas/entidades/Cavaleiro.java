package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;

public class Cavaleiro extends Jogador{
    //Contrutor
    public Cavaleiro(){
        super("Cavaleiro",40, BancoAtaques.espadada,BancoAtaques.corteProfundo);
    }
}
