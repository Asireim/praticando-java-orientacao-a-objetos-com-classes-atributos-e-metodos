package br.com.alura.praticandoJava.controleDeTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public void status() {
        String status;
        if (this.concluida) {
            status = "Concluída";
        } else {
            status = "Pendente";
        }

        System.out.printf("""
                Descrição da tarefa: %s
                Status: %s
                """, this.descricao, status);
    }
}
