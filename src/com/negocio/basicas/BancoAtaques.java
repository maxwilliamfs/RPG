package com.negocio.basicas;

public class BancoAtaques {
    public static AtaqueFisico arranhao = new AtaqueFisico("Arranhar", 3, 1);
    public static AtaqueFisico espadada = new AtaqueFisico("Espadada", 5, 1);
    public static AtaqueFisico corteProfundo = new AtaqueFisico("Corte Profundo", 15, 8);
    public static AtaqueFisico dilacerar = new AtaqueFisico("Dilacerar", 10, 6);
    public static AtaqueMagico bolaDeFogo = new AtaqueMagico("Bola de Fogo", 20, 10, 40);
    public static AtaqueMagico raioDeGelo = new AtaqueMagico("Raio de Gelo", 7, 1, 4);
    public static AtaqueMagico magiaNegra = new AtaqueMagico("Magia Negra", 15, 9, 40);
}
