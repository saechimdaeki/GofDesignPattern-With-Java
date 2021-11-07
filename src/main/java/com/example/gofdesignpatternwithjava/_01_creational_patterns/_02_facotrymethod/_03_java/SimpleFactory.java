package com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._03_java;

import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.BlackShip;
import com.example.gofdesignpatternwithjava._01_creational_patterns._02_facotrymethod._02_after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
