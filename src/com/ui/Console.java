package com.ui;

import java.awt.*;
import java.util.Random;

import com.negocio.basicas.entidades.*;

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

            Jogador player = null;
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

            Inimigo enemy = null;
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
    public static void batalha(Jogador player, Inimigo enemy){

    }
}
