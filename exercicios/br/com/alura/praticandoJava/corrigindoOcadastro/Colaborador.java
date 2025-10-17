package br.com.alura.praticandoJava.corrigindoOcadastro;

public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public void exibeInformacoes() {
        System.out.printf("""
                Nome do colaborador: %s
                Cargo: %s
                Nível de acesso: %d
                %n""", this.nome, this.cargo, this.nivelAcesso);
    }
    public void alteraCargoNivelAcesso(String cargo, int nivelAcesso) {
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }
}
