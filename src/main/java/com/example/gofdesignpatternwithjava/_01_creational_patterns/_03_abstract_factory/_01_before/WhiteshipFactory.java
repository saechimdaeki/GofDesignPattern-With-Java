package com.example.gofdesignpatternwithjava._01_creational_patterns._03_abstract_factory._01_before;

import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.DefaultShipFactory;
import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.Ship;
import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
