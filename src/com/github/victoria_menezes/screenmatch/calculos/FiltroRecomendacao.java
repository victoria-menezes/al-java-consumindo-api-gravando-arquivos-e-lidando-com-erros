package com.github.victoria_menezes.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel c){
        if (c.getClassificacao() >=4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (c.getClassificacao() >=2 ){
            System.out.println("Bem avaliado no momento!");
        } else{
            System.out.println("Coloque na sua lista para ver depois!");
        }
    }
}
