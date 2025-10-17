package br.com.alura.praticandoJava.relatorioProduto;

public class Principal {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse gamer", 199.99, 10);
        mouse.gerarRelatorio();

        Produto teclado = new Produto("Teclado gamer", 299.90, 16);
        teclado.gerarRelatorio();

        Produto headset = new Produto("Headset gamer", 189.00,5);
        headset.gerarRelatorio();
    }
}
