package com.negocio.basicas.entidades;

import com.negocio.basicas.AtaqueAbstrato;

public abstract class Jogador extends Entidade{
    public Jogador (String nome, int vida, AtaqueAbstrato at1, AtaqueAbstrato at2){
        super(nome, vida, at1, at2);
    }
}
