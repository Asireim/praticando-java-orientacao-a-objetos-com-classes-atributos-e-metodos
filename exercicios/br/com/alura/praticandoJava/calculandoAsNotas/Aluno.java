package br.com.alura.praticandoJava.calculandoAsNotas;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    private double calculaMedia () {
        return ((this.nota1 + this.nota2) / 2);
    }

    private String verificaAprovacao() {
        String resultado;

        if (this.calculaMedia() >= 7) {
            resultado = "Aprovado!";
        } else {
            resultado = "Reprovado.";
        }

        return resultado;
    }

    public void exibeMedia() {
        System.out.printf("""
                Nome do aluno: %s
                Nota 1: %.1f
                Nota 2: %.1f
                Média: %.1f
                %s
                """, this.nome, this.nota1, this.nota2, this.calculaMedia(), this.verificaAprovacao());
    }
}
