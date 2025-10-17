package br.com.alura.praticandoJava.relatorioProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void gerarRelatorio() {
        System.out.printf("""
                Nome do produto: %s
                Preco: R$ %.2f
                Quantidade: %d
                """, this.nome, this.preco, this.quantidade);
    }
}
