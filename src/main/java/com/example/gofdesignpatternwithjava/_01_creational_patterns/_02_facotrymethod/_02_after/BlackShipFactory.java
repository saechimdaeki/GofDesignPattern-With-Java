package com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after;

public class BlackShipFactory extends DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
