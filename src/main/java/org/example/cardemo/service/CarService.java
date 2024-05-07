package org.example.cardemo.service;


import org.example.cardemo.*;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public Car drive() {
        Car car = new Car();
        Fuel fuel = new Fuel();
        fuel.type = "Diesel";

        Engine engine = new Engine();
        engine.fuel = fuel;


        Seats seats = new Seats();
        seats.type = "reliner";

        Seats seats1 = new Seats();
        seats1.type = "normal";


        Battery battery = new Battery();
        battery.Watts = "4v";


        Wheel wheel1 = new Wheel();
        wheel1.name = "MRF";
        wheel1.type = "alloy";

        Wheel wheel2 = new Wheel();
        wheel2.name = "Ceat";
        wheel2.type = "alloy";


        List<Seats> Seats = new ArrayList<>();
        Seats.add(seats1);
        Seats.add(seats);


        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);

        Car car1 =new Car();
        car1.name="swift";
        car1.battery=battery;
        car1.engine=engine;
        car1.wheelList=wheels;
        car1.seats=Seats;

        return  null;
    }
}
