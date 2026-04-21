package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;

public class Bruxa extends InimigoMagico  {
    public Bruxa(){
        super("Bruxa",25, BancoAtaques.raioDeGelo,BancoAtaques.magiaNegra);
    }
}
