package com.negocio.basicas.entidades.itens;

import com.negocio.basicas.entidades.itens.consumiveis.PocaoMana;

import java.util.ArrayList;
import java.util.List;

public class ListaItens {
     private static ArrayList<Item> itens = new ArrayList<>(List.of(
             new PocaoMana()
     ));
}
