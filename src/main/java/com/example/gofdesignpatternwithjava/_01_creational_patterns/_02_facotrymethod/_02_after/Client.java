package com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after;

public class Client {
    public static void main(String[] args) {
        Client client=new Client();
        client.print(new WhiteShipFactory(),"Whiteship","anima94@kakao.com");
        client.print(new BlackShipFactory(),"Blackship","anima94@kakao.com");
//        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship","anima94@kakao.com");
//        System.out.println(whiteship);
//
//        Ship blackship= new BlackShipFactory().orderShip("Blackship","anima94@kakao.com");
//        System.out.println(blackship);

    }
    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name,email));
    }
}
