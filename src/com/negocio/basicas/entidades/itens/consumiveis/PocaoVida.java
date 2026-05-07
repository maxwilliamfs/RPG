package com.negocio.basicas.entidades.itens.consumiveis;

//Bibliotecas
import com.negocio.basicas.entidades.Entidade;
import com.negocio.basicas.entidades.itens.Item;
import com.negocio.interfaces.Consumivel;

public class PocaoVida extends Item implements Consumivel {
    public PocaoVida(){
        this.setNome("Pocao de Vida");
        this.setDescricao("Restaura 10 pontos de vida");
    }
    public void consumir(Entidade entidade){
        entidade.curar(10);
    }
}
