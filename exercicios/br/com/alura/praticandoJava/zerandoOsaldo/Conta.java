package br.com.alura.praticandoJava.zerandoOsaldo;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void zerarSaldo() {
        this.saldo = 0.0;
    }

    public void exibirSaldo() {
        System.out.printf("O saldo atual é: %.2f%n", this.saldo);
    }
}
