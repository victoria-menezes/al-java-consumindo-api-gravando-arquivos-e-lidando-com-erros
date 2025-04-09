package com.github.victoria_menezes.screenmatch.exercicios.aula2;

import com.google.gson.Gson;
public class ex1 {
    public static void main (String[] args){
        String jsonPerson = "{\"name\":\"Rodrigo\",\"age\":20,\"city\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa person = gson.fromJson(jsonPerson, Pessoa.class);

        System.out.println(person);

    }
}
