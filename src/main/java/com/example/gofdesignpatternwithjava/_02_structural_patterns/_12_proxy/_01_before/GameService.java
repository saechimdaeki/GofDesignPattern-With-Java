package com.example.gofdesignpatternwithjava._02_structural_patterns._12_proxy._01_before;

public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
        Thread.sleep(1000L);
    }
}
