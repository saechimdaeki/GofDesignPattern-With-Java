package com.example.gofdesignpatternwithjava._02_structural_patterns._07_brdige._02_after;

import com.example.gofdesignpatternwithjava._02_structural_patterns._07_brdige._01_before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kda = new 아리(new KDA());
        kda.skillQ();
        kda.skillW();
    }
}
