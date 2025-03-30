package com.github.victoria_menezes.screenmatch.modelos;

import com.github.victoria_menezes.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() { // dá override em uma funcao herdada do object do java
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
