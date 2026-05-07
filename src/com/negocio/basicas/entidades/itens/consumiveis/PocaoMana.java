package com.negocio.basicas.entidades.itens.consumiveis;

//Bibliotecas
import com.negocio.basicas.entidades.Entidade;
import com.negocio.basicas.entidades.EntidadeMagica;
import com.negocio.basicas.entidades.itens.Item;
import com.negocio.interfaces.Consumivel;

public class PocaoMana extends Item implements Consumivel {
    public PocaoMana(){
        this.setNome("Pocao de mana");
        this.setDescricao("Restaura 15 pontos de Mana");
    }
    public void consumir(Entidade entidade){
        EntidadeMagica magica = (EntidadeMagica) entidade;
        magica.ganharMana(15);
    }
}
