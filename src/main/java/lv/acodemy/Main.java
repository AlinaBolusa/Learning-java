package lv.acodemy;

import lv.acodemy.classroom.Car;
import lv.acodemy.classroom.Cat;

public class Main {
    public static void main(String[] args){

        // How to create Object?

        Car myFirstCar = new Car();
        System.out.println(myFirstCar);

        // Set carBrand
        myFirstCar.setCarModel("Audi");
        System.out.println(myFirstCar);

        // Set all other fields

        myFirstCar.setModel("A4");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(6);
        myFirstCar.setColor("Red");
        System.out.println(myFirstCar);

        // Task
        Car mySecondCar = new Car();
        mySecondCar.setCarModel("BMW");
        mySecondCar.setModel("X6");
        mySecondCar.setProductionYear(2024);
        mySecondCar.setMileage(5);
        mySecondCar.setColor("Blue");
        System.out.println(mySecondCar);

        Car myBmwCar = new Car("BMW", "X5", 2020, 130.00, "black");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder()
                .setColor("Grey")
                .setModel("Octavia")
                .setProductionYear(2024).build();
        System.out.println(mySkoda);

        mySkoda.start();
        mySkoda.drive(1_000);
        mySkoda.drive(2_000);


        //

        Cat myCat = new Cat("Bella", 5, "Persian", "Grey", 4.5);
        
        System.out.println(myCat);

        // Call cat methods
        myCat.voice();
        myCat.eat();
        myCat.sleep();
        myCat.walk();
    }
    }
