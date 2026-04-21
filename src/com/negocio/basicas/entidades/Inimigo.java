package com.negocio.basicas.entidades;

import com.negocio.basicas.AtaqueAbstrato;

public abstract class Inimigo extends Entidade{
    public Inimigo (String nome, int vida, AtaqueAbstrato at1, AtaqueAbstrato at2){
        super(nome, vida, at1, at2);
    }
}
