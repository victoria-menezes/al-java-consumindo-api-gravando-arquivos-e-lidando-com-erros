package com.github.victoria_menezes.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    // Classe especifica o conteúdo de um objeto
    // Comparable<Titulo> : Comparável com outros títulos

    // private: define quais variáveis nao podem ser alteradas pelo usuário

    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoLancamento;
    private int duracaoMinutos;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int qtdAvaliacoes;

    // construtor: metodo chamado na criação do objeto
    // podemos ter mais de um construtor por objeto (com numeros diferentes de argumentos), mas nao é necessario aqui
    public Titulo(String nome, int anoLancamento){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb myTituloOmdb) {
        this.nome = myTituloOmdb.title();
        this.anoLancamento = Integer.valueOf(myTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(myTituloOmdb.runtime().substring(0,3));
    }


    // void: não tem retorno
    // public: acessivel para outros pacotes
    public void exibeFicha(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    // metodo acessor (get): utilizado para LER uma variável
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getQtdAvaliacoes(){
        return qtdAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome; // this especifica que é o atributo da classe
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        qtdAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes/qtdAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome()); // como fazer a comparacao
        // habilita o uso de Collections.sort(), etc
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento +
                " duração=" + duracaoMinutos;
    }
}
