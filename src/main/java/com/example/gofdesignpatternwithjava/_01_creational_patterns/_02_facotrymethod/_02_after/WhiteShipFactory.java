package com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
       return new WhiteShip();
    }
}
