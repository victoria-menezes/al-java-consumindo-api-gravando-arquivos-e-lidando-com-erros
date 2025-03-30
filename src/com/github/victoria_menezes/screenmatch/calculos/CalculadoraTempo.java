package com.github.victoria_menezes.screenmatch.calculos;

import com.github.victoria_menezes.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoMinutos();
    }
}
