package br.com.alura.praticandoJava.controleDeTarefas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Tarefa1", false);
        Tarefa tarefa2 = new Tarefa("Tarefa2", true);

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);

        for (int i = 0; i < tarefas.size(); i++) {
            tarefas.get(i).status();
        }

    }
}
