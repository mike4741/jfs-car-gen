package com.mike.carApp;

public class Car {
    private  String color;
    private int year;
    private  int speed = 0;
    private  int maxSpeed ;
    private  boolean isElectric;
    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    public int accelerateSpeed(){
         int val = this.speed + 5;
         if(val >this.maxSpeed){
           val = getMaxSpeed();
         }
         setSpeed(val);
        return  val;
    }

   public int decelerateSpeed(){
       int val = this.speed - 5;
       if(val<=0) {
          val = 0;
       }
       setSpeed(val);
       return  val;
    }
    public boolean  convertToElectric(){
        boolean status ;
        status  = isElectric();
        if(status){
            System.out.println(" the user stating that the Car is already electric");
        }else
            setElectric(true);
         return isElectric();

    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", isElectric=" + isElectric +
                '}';
    }



}
