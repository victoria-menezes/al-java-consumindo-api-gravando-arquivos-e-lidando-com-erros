package com.github.victoria_menezes.screenmatch.exercicios.aula2;

import com.google.gson.Gson;

public class ex3 {
    public static void main (String[] args){
        String jsonBook = "{\"title\":\"Aventuras do Java\",\"author\":\"Akemi\",\"publisher\":{\"name\":\"TechBooks\",\"city\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro book = gson.fromJson(jsonBook, Livro.class);


        System.out.println("Objeto Livro: " + book);
    }
}
