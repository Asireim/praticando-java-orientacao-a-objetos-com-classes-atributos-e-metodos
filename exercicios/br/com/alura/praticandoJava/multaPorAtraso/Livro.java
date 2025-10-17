package br.com.alura.praticandoJava.multaPorAtraso;

public class Livro {
    private String titulo;
    private int diasDeAtraso;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public void devolver(int diasDeAtraso) {
        this.diasDeAtraso = diasDeAtraso;

        double multa = (2.50 * diasDeAtraso);

        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", this.titulo, this.diasDeAtraso,multa);
    }
}
