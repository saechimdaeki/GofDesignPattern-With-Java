package com.example.gofdesignpatternwithjava._01_creational_patterns._01_Singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
