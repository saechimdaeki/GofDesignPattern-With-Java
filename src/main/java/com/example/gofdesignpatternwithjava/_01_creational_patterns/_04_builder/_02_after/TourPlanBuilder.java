package com.example.gofdesignpatternwithjava._01_creational_patterns._04_builder._02_after;

import com.example.gofdesignpatternwithjava._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan(); //인스턴스의 상태가 불안정한지 확인할 수 있음
}
