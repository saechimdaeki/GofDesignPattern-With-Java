package com.example.gofdesignpatternwithjava._01_creational_patterns._04_builder._01_before;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TourPlan {
    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;
    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
    }
}
