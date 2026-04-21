package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;

public class Feiticeiro extends JogadorMagico {
    public Feiticeiro(){
        super("Feiticeiro",30, BancoAtaques.raioDeGelo,BancoAtaques.bolaDeFogo);
    }
}
