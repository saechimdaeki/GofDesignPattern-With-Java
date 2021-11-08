package com.example.gofdesignpatternwithjava._01_creational_patterns._03_abstract_factory._02_after;

import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.Ship;
import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory=new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactory shipFactory2=new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor().getClass());
        System.out.println(ship2.getWheel().getClass());
    }
}
