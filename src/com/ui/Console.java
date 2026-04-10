package com.ui;

import java.awt.*;
import java.util.Random;

import com.negocio.basicas.entidades.*;
import com.negocio.basicas.enuns.ListaAtaques;

import java.util.Scanner;

public class Console {
    //Intancias e Atributos
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    //Metodos
    public static void main(String[] args){
        while(menu());
    }
    public static boolean menu(){
        while (true) {
            System.out.println("Bem vindo ao RPG");
            System.out.println("Informe seu Personagem:");
            System.out.println("1 - Fechar Programa");
            System.out.println("2 - Cavaleiro");
            System.out.println("3 - Feiticeiro");
            String l = scanner.nextLine();
            int op = Integer.parseInt(l);

            Entidade player = null;
            switch (op) {
                case 1:
                    return false;
                case 2:
                    player = new Cavaleiro();
                    break;
                case 3:
                    player = new Feiticeiro();
                    break;
            }

            Entidade enemy = null;
            int r = random.nextInt(2) + 1;
            switch (op) {
                case 1:
                    enemy = new Zumbi();
                    break;
                case 2:
                    enemy = new Bruxa();
                    break;
            }
            batalha(player,enemy);
        }
    }
    public static void batalha(Entidade player, Entidade enemy){
        System.out.println("| INIMIGO |");
        System.out.println(enemy.getStatus() + "\n");
        System.out.println("| JOGADOR |");
        System.out.println(player.getStatus() + "\n");
        Hub.linhas();
        System.out.println("INFORME SUA ACAO");
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar item");
        System.out.println("3 - Passar o turno");
        String opp = scanner.nextLine();
        int op = Integer.parseInt(opp);
        switch (op){
            case 1:
                player.atacar(enemy,menuAtaque(player));
                break;
            case 2:
                //NAO FIZ A INTEFACE DE ITEM
                break;
        }
        int ataqueInimigo = random.nextInt(2) + 1;
        ListaAtaques escolhido = null;
        switch (ataqueInimigo) {
            case 1:
                escolhido = ListaAtaques.ATAQUE1;
                break;
            case 2:
                escolhido = ListaAtaques.ATAQUE2;
                break;
        }
        enemy.atacar(player,escolhido);
        Hub.linhas();
    }
    public static ListaAtaques menuAtaque(Entidade player){
        ListaAtaques escolhido = null;
        System.out.println("INFORME O ATAQUE");
        System.out.println("1 -" + player.getAtaques().get(0).getNome());
        System.out.println("2 -" + player.getAtaques().get(2).getNome());
        String op = scanner.nextLine();
        int opp = Integer.parseInt(op);
        switch (opp){
            case 1:
                escolhido = ListaAtaques.ATAQUE1;
                break;
            case 2:
                escolhido = ListaAtaques.ATAQUE2;
                break;
        }
        return escolhido;
    }
}
