package com.mike.carApp;

public class Lexus extends Car {
    private  boolean hasLeaserSears;

    public Lexus(String color, int year, int maxSpeed,boolean hasLeaserSears) {
        super(color,year, maxSpeed );
        this.hasLeaserSears = hasLeaserSears;
    }

    public boolean isHasLeaserSears() {
        return hasLeaserSears;
    }

    public void setHasLeaserSears(boolean hasLeaserSears) {
        this.hasLeaserSears = hasLeaserSears;
    }
}
