package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        try (Car car = new Car("Nissan","Ferrari","write",4.9,
                LocalDate.of(2020, Month.FEBRUARY,11))) {
            System.out.println(car);
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
    }

