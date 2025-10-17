package br.com.alura.praticandoJava.zerandoOsaldo;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta(1234.99);
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
