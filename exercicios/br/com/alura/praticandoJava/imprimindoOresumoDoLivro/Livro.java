package br.com.alura.praticandoJava.imprimindoOresumoDoLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void imprimeResumo() {
        System.out.printf("'%s' de %s com %d páginas.", this.titulo, this.autor, this.paginas);
    }
}
