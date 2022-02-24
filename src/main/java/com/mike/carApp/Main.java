package com.mike.carApp;

public class Main {
    
    public static void main(String[] args) {
        Car civic = new Honda("red", 2022, 200, true);
        Car rx350 = new Lexus("black", 2019, 250, false);
        Car supra = new Toyota("gray", 2020, 190, true);
        System.out.println("honda color: " + civic.getColor());
        System.out.println("toyota color: " + supra.getColor());
        System.out.println("lexus color: " + rx350.getColor());
        System.out.println(civic.getMaxSpeed());
        int newSpeed = civic.accelerateSpeed();
        System.out.println(newSpeed);
        newSpeed = civic.decelerateSpeed();
        System.out.println(newSpeed);
        civic.convertToElectric();
        System.out.println("is electric " + civic.isElectric());
    }
}
