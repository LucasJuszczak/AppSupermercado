package com.example.appsupermercado.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Produtos {
        public static List<Util> obterListaProdutos() {
            List<Util> produtos = new ArrayList<>();
            produtos.add(new Util("Arroz", 25.90));
            produtos.add(new Util("Feijão", 9.80));
            produtos.add(new Util("Macarrão", 4.50));
            produtos.add(new Util("Óleo", 8.90));
            produtos.add(new Util("Açúcar", 6.20));
            produtos.add(new Util("Café", 18.50));
            produtos.add(new Util("Leite", 4.30));
            produtos.add(new Util("Manteiga", 12.75));
            produtos.add(new Util("Queijo", 32.90));
            produtos.add(new Util("Presunto", 15.60));
            produtos.add(new Util("Farinha de trigo", 5.70));
            produtos.add(new Util("Refrigerante", 7.90));
            produtos.add(new Util("Biscoito", 3.40));
            produtos.add(new Util("Papel higiênico", 16.50));
            produtos.add(new Util("Detergente", 2.30));
            produtos.add(new Util("Batata", 5.90));
            produtos.add(new Util("Cenoura", 4.20));
            produtos.add(new Util("Tomate", 6.80));
            produtos.add(new Util("Cebola", 3.60));
            produtos.add(new Util("Alho", 15.30));
            produtos.add(new Util("Banana", 4.50));
            produtos.add(new Util("Maçã", 7.20));
            produtos.add(new Util("Laranja", 5.10));
            produtos.add(new Util("Uva", 9.80));
            produtos.add(new Util("Pera", 10.40));
            produtos.add(new Util("Frango", 19.90));
            produtos.add(new Util("Carne bovina", 45.60));
            produtos.add(new Util("Peixe", 28.30));
            produtos.add(new Util("Linguiça", 21.50));
            produtos.add(new Util("Ovos", 12.90));
            produtos.add(new Util("Massa para pizza", 7.40));
            produtos.add(new Util("Molho de tomate", 4.20));
            produtos.add(new Util("Creme de leite", 3.50));
            produtos.add(new Util("Leite condensado", 5.70));
            produtos.add(new Util("Iogurte", 2.80));
            produtos.add(new Util("Granola", 13.50));
            produtos.add(new Util("Cereal matinal", 14.90));
            produtos.add(new Util("Chocolate em barra", 8.30));
            produtos.add(new Util("Achocolatado em pó", 6.50));
            produtos.add(new Util("Bebida energética", 9.90));
            produtos.add(new Util("Água mineral", 1.50));
            produtos.add(new Util("Suco em pó", 2.00));
            produtos.add(new Util("Bolo pronto", 12.40));
            produtos.add(new Util("Pão de forma", 8.20));
            produtos.add(new Util("Baguete", 5.50));
            produtos.add(new Util("Salgadinho", 7.80));
            produtos.add(new Util("Batata frita congelada", 14.20));
            produtos.add(new Util("Pizza congelada", 22.90));
            produtos.add(new Util("Sorvete", 18.40));
            produtos.add(new Util("Chá gelado", 4.80));
            return produtos;
        }

        public static Map<String, Util> obterMapaProdutos() {
            List<Util> listaProdutos = obterListaProdutos();
            Map<String, Util> produtos = new HashMap<>();
            for (int i = 0; i < listaProdutos.size(); i++) {
                produtos.put(String.valueOf(i + 1), listaProdutos.get(i));
            }
            return produtos;
        }
    }