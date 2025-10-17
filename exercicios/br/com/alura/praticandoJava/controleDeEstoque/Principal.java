package br.com.alura.praticandoJava.controleDeEstoque;

public class Principal {
    public static void main(String[] args) {
        Produto camiseta = new Produto("Camiseta", 10);
        camiseta.vender(9);

        Produto casaco = new Produto("Casaco", 5);
        casaco.vender(7);
    }
}
