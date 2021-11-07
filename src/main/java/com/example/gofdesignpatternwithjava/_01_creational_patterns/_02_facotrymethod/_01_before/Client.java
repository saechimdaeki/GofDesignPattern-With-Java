package com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._01_before;

public class Client {
    public static void main(String[] args) {
        Client client=new Client();
        Ship whiteship = ShipFactory.orderShip("Whiteship","anima94@kakao.com");
        System.out.println(whiteship);

        Ship blackship=ShipFactory.orderShip("Blackship","anima94@kakao.com");
        System.out.println(blackship);

    }
}
