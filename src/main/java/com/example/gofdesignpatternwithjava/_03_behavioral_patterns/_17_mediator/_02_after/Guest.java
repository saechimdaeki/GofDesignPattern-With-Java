package com.example.gofdesignpatternwithjava._03_behavioral_patterns._17_mediator._02_after;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Guest {

    private Integer id;

    private FrontDesk frontDesk=new FrontDesk();

    public void getTowers(int numberOfTower){
        this.frontDesk.getTowers(this,numberOfTower);
    }

    private void dinner(LocalDateTime dateTime){
        this.frontDesk.dinner(this,dateTime);
    }
}
