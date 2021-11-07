package com.example.gofdesignpatternwithjava._01_creational_patterns._01_Singleton;

public class App {
    public static void main(String[] args) {
        Settings settings=Settings.getInstance();
        Settings settings1=Settings.getInstance();
        System.out.println(settings == settings1);
    }
}
