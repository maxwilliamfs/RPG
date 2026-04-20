package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;

public class Zumbi extends Inimigo{
    public Zumbi(){
        this.setNome("Zumbi");
        this.setVida(25);
        this.getAtaques().add(BancoAtaques.arranhao);
        this.getAtaques().add(BancoAtaques.dilacerar);
    }
}
