package com.example;

// aufgabe 4: liest den Token aus einer Umgebungsvariable statt ihn im Code zu speichern, so landet er nie im Git-Repo
public class SecretUser {
    public static boolean hasSecret() {
        String secret = System.getenv("APP_SECRET_TOKEN");
        return secret != null && !secret.isBlank();
    }
}
