package com.negocio.basicas.entidades;

public abstract class Entidade {
    //Instancias e Atributos
    private String nome;
    private int pVida,pEstamina;

    //Metodos
    public boolean isVivo(){
        if(this.getpVida() <= 0){
            return false;
        }
        return true;
    }
    public void receberDano(int valor){
        this.setpVida(this.getpVida() - valor);
    }
    public void curar(int valor){
        this.setpVida(this.getpVida() + valor);
    }
    public void perderEstamina(int valor){
        this.setpEstamina(this.getpEstamina() - valor);
    }
    public void GanharEstamina(int valor){
        this.setpEstamina(this.getpEstamina() + valor);
    }

    //Metodos Abstratos
    public abstract void atacar(Entidade alvo);

    //Metodos Padroes
    public String getStatus(){
        return;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getpEstamina() {
        return pEstamina;
    }
    public void setpEstamina(int pEstamina) {
        this.pEstamina = pEstamina;
    }
    public int getpVida() {
        return pVida;
    }
    public void setpVida(int pVida) {
        this.pVida = pVida;
    }
}
