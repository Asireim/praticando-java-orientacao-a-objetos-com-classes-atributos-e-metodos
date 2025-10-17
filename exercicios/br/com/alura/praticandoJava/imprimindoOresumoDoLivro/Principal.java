package br.com.alura.praticandoJava.imprimindoOresumoDoLivro;

public class Principal {
    public static void main(String[] args) {
        Livro guiaMochileiro = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams", 208);
        guiaMochileiro.imprimeResumo();
        System.out.println("\n");

        Livro meninaQueRoubavaLivros = new Livro("A Menina que Roubava Livros", "Markus Zusak", 480);
        meninaQueRoubavaLivros.imprimeResumo();
    }
}
