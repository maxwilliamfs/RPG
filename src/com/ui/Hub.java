package com.ui;

import com.negocio.exceptions.RPGException;

import java.util.Scanner;

public class Hub {
    //Atributos e Instancias
    public static Scanner scanner = new Scanner(System.in);

    //Metodos
    public static void linhas(){
        System.out.println("----------------------------------------------------------------------------------------");
    }
    public static char leitorChar(String mensagem, char[] permitidos){
        while (true) {
            System.out.println(mensagem);
            char resp = scanner.next().charAt(0);
            for (int i = 0; i < permitidos.length; i++) {
                if (resp == permitidos[i]) {
                    return resp;
                }
            }
            System.out.println("Informe um caractere valido!!!!!");
        }
    }
    public static int leitorInt(String mensagem, boolean limitador, int minimo, int maximo) {
        while (true) {
            System.out.println(mensagem);
            String buffer = scanner.nextLine();
            try {
                int resp = Integer.parseInt(buffer);
                if (!limitador) {
                    return resp;
                } else {
                    if (resp >= minimo && resp <= maximo) {
                        return resp;
                    }
                }
            } catch (NumberFormatException ex){}
            System.out.println("Informe um numero valido!!!!!");
        }
    }
}
