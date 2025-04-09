package com.github.victoria_menezes.screenmatch.exercicios.aula2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ex2 {
    public static void main (String[] args){
        String jsonPerson = "{\"name\":\"Rodrigo\",\"city\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa person = gson.fromJson(jsonPerson, Pessoa.class);

        System.out.println("Objeto Pessoa: " + person);
    }
}
