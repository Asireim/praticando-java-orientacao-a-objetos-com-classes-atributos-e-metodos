package br.com.alura.praticandoJava.controleDeEstoque;

public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.printf("Venda realizada. Estoque restante de Camiseta: %d%n", this.quantidade);
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
}
