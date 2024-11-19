package com.example.appsupermercado.Model;

public class Util {
    private final String descricao;
    private final double preco;

    public Util(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
