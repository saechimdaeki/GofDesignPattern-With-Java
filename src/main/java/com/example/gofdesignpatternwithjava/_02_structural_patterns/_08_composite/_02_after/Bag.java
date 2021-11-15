package com.example.gofdesignpatternwithjava._02_structural_patterns._08_composite._02_after;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

// 이 Bag이 Composit
public class Bag implements Component {


    private List<Component> components=new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}