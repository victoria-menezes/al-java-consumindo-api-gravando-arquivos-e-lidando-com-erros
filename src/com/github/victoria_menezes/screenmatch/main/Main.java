package com.github.victoria_menezes.screenmatch.main;

import com.github.victoria_menezes.screenmatch.modelos.Titulo;
import com.github.victoria_menezes.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Film to search:");

        String search = scanner.nextLine();
        String APIKey = "fb8364fd";
        String url = String.format("http://www.omdbapi.com/?t=%s&apikey=%s", search, APIKey);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Titulo myTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb myTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(myTituloOmdb);
        Titulo myTitulo = new Titulo(myTituloOmdb);
        System.out.println(myTitulo);

    }
}
