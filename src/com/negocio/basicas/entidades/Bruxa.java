package com.negocio.basicas.entidades;

import com.negocio.basicas.BancoAtaques;
import com.negocio.basicas.enuns.ListaAtaques;
import com.negocio.interfaces.Magico;

public class Bruxa extends InimigoMagico implements Magico {
    public Bruxa(){
        this.setNome("Bruxa");
        this.getAtaques().add(BancoAtaques.raioDeGelo);
        this.getAtaques().add(BancoAtaques.magiaNegra);
        this.setVida(20);
    }
}
