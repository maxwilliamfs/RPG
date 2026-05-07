package com.ui;

import java.awt.*;
import java.util.Random;

import com.negocio.basicas.AtaqueAbstrato;
import com.negocio.basicas.AtaqueMagico;
import com.negocio.basicas.entidades.*;
import com.negocio.basicas.enuns.ListaAtaques;
import com.negocio.exceptions.RPGException;

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
        System.out.println("Bem vindo ao RPG");
        System.out.println("1 - Cavaleiro");
        System.out.println("2 - Feiticeiro");
        System.out.println("3 - Fechar Programa");
        int op = Hub.leitorInt("Informe seu Personagem:",true,1,3);

        Entidade player = null;
        switch (op) {
            case 1:
                player = new Cavaleiro();
                break;
            case 2:
                player = new Feiticeiro();
                break;
            case 3:
                return false;
        }

        Entidade enemy = null;
        int r = random.nextInt(2) + 1;
        switch (r) {
            case 1:
                enemy = new Zumbi();
                break;
            case 2:
                enemy = new Bruxa();
                break;
        }
        while (player.isVivo() && enemy.isVivo()) {
            batalha(player,enemy);
        }
        return true;
    }
    public static void batalha(Entidade player, Entidade enemy){
        Hub.linhas();
        System.out.println("| INIMIGO |");
        System.out.println(enemy.getStatus() + "\n");
        System.out.println("| JOGADOR |");
        System.out.println(player.getStatus() + "\n");
        Hub.linhas();
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar item");
        System.out.println("3 - Passar o turno");
        int op = Hub.leitorInt("| INFORME SUA ACAO |",true,1,3);2
        switch (op){
            case 1:
                try {
                    ListaAtaques escolhido = menuAtaque(player);
                    player.atacar(enemy, escolhido);
                    printAcao(player,escolhido);
                    scanner.nextLine();
                } catch (RPGException Ex){
                    System.out.println(Ex.getMessage());
                }
                break;
            case 2:
                //NAO FIZ A INTEFACE DE ITEM
                break;
        }
        int ataqueInimigo = random.nextInt(2) + 1;
        ListaAtaques escolhido = null;
        AtaqueAbstrato ataque = null;
        switch (ataqueInimigo) {
            case 1:
                escolhido = ListaAtaques.ATAQUE1;
                ataque = enemy.getAtaques().get(0);
                break;
            case 2:
                escolhido = ListaAtaques.ATAQUE2;
                ataque = enemy.getAtaques().get(1);
                break;
        }
        try {
            printAcao(enemy,escolhido);
            enemy.atacar(player,escolhido);
        } catch (RPGException Ex){
            System.out.println(Ex.getMessage());
        }
        scanner.nextLine();
        player.finalizarTurno();
        enemy.finalizarTurno();
        if(!player.isVivo() || !enemy.isVivo()) {
            if (!player.isVivo()) {
                System.out.println("DERROTA... nao foi dessa vez!!!");
            }
            if (!enemy.isVivo()) {
                System.out.println("VITORIA!!! Parabens!!!");
            }
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
        }
    }
    public static ListaAtaques menuAtaque(Entidade player){
        ListaAtaques escolhido = null;
        Hub.linhas();
        printAtaque("1",player.getAtaques().get(0));
        printAtaque("2",player.getAtaques().get(1));
        int opp = Hub.leitorInt("| INFORME O ATAQUE |",true,1,2);
        Hub.linhas();
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
    private static void printAtaque(String mensagem,AtaqueAbstrato ataque){
        System.out.print(mensagem + " - " + ataque.getNome() + ": Stamina - " + ataque.getStamina() + " / Dano - " + ataque.getDano());
        if(ataque instanceof AtaqueMagico){
            System.out.println(" / Mana - " + ((AtaqueMagico) ataque).getMana());
        } else {
            System.out.print("\n");
        }
    }
    private static void printAcao(Entidade entidade, ListaAtaques escolhido) {
        AtaqueAbstrato ataque = null;
        switch (escolhido){
            case ATAQUE1:
                ataque = entidade.getAtaques().get(0);
                break;
            case ATAQUE2:
                ataque = entidade.getAtaques().get(1);
                break;
        }
        System.out.println(entidade.getNome() + " usou " + ataque.getNome() + "!!!!");
        System.out.print("Stamina: " + ataque.getStamina());
        if(ataque instanceof AtaqueMagico){
            AtaqueMagico atkMagico = (AtaqueMagico) ataque;
            System.out.println("/ Mana: " + atkMagico.getMana());
        } else {
            System.out.println();
        }
    }
}
