package com.example.gofdesignpatternwithjava._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

//mediator역할
public class FrontDesk {

    private CleaningService cleaningService=new CleaningService();
    private Resturant resturant=new Resturant();

    public void getTowers(Guest guest, int numberOfTower) {
        //필요한 수준의 정보만큼만 제공 이렇게한다면 클리닝 서비스는 guest에 대한 의존성이 사라진다
        cleaningService.getTowers(guest.getId(), numberOfTower);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        resturant.dinner(guest.getId(),dateTime);
    }
}
