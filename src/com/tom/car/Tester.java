package com.tom.car;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        int fee = 30;
        Map<String, Car> cars = new HashMap<>();

        Car c1 = new Car("ABC-1234", "07:30");
        Car c2 = new Car("XYZ-8888", "09:30");
        Car c3 = new Car("BBC-1111", "10:30");

        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);
        String id = "ABC-1234";
        Car car = cars.get(id);
        if (car == null){
            System.out.println("Can't find your car!");
        }else{
            Date now = new Date();
            long ms = now.getTime() - car.enter.getTime();
            long mins = ms/(1000*60);
            System.out.println(mins);
        }

    }
}
