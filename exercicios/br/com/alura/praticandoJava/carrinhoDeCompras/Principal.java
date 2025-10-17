package br.com.alura.praticandoJava.carrinhoDeCompras;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 120.00, 1);
        Produto mouse = new Produto("Mouse", 60.00, 2);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(teclado);
        produtos.add(mouse);

        double total = 0;
        for (int i = 0; i < produtos.size(); i++) {
            total += produtos.get(i).valorTotal();
        }

        System.out.printf("Total da compra: RS %.2f", total);
    }
}
