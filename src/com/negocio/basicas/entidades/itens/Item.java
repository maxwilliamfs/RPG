package com.negocio.basicas.entidades.itens;

public abstract class Item {
    //Atributos
    private String nome, descricao;

    //Metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
