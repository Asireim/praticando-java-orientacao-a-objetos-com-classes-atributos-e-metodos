package br.com.alura.praticandoJava.calculandoAsNotas;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Aluno", 9.9,8.9);
        aluno.exibeMedia();

        Aluno aluno1 = new Aluno("Aluno1", 6.4, 4.2);
        aluno1.exibeMedia();
    }
}
