package com.github.victoria_menezes.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosTemporada;
    private boolean ativa;
    private int episodioDuracaoMinutos;

    // não há herança de construtores, precisamos fazer um construtor equivalente ao do pai
    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioDuracaoMinutos() {
        return episodioDuracaoMinutos;
    }

    public void setEpisodioDuracaoMinutos(int episodioDuracaoMinutos) {
        this.episodioDuracaoMinutos = episodioDuracaoMinutos;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodioDuracaoMinutos;
    }

    @Override
    public String toString() { // dá override em uma funcao herdada do object do java
        return "Série: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
