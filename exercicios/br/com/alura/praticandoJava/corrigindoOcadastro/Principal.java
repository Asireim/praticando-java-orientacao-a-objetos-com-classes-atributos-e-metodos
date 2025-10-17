package br.com.alura.praticandoJava.corrigindoOcadastro;

public class Principal {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador("Assírem", "Analista de qualidade", 3);
        System.out.println("--- Antes da atualização: ---");
        colaborador.exibeInformacoes();
        colaborador.alteraCargoNivelAcesso("Analista de testes", 2);
        System.out.println("--- Depois da atualização: ---");
        colaborador.exibeInformacoes();
    }
}
