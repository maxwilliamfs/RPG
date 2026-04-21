package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;

public class Zumbi extends Inimigo{
    public Zumbi(){
        super("Zumbi",35, BancoAtaques.arranhao,BancoAtaques.dilacerar);
    }
}
