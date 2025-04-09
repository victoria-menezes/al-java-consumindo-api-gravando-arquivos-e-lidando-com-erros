package com.github.victoria_menezes.screenmatch.exercicios.aula1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book to search:");
        String search = scanner.nextLine();

        search = search.replace(" ", "+");
        String APIKey = "KEY";
        String url = String.format("https://www.googleapis.com/books/v1/volumes?q=%s&key=%s", search, APIKey);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
