package com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after;

public abstract class DefaultShipFactory implements ShipFactory{

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
