package com.negocio.basicas.entidades.itens.consumiveis;

//Bibliotecas
import com.negocio.basicas.entidades.Entidade;
import com.negocio.basicas.entidades.itens.Item;
import com.negocio.interfaces.Consumivel;

public class PocaoStamina extends Item implements Consumivel {
    public PocaoStamina(){
        this.setNome("Pocao de Stamina");
        this.setDescricao("Restaura 10 pontos de Stamina");
    }
    public void consumir(Entidade entidade){
        entidade.ganharStamina(10);
    }
}
