package com.booleans.calendar.FRQ.Praveen;

class Car{
    public int gear;
    public int speed;

    public Car(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public String toString(){
        return ("Number of gears is " + gear + "\n" + "speed of car is " + speed + "\n");
    }
}

class SportsCar extends Car{
    public int rideheight;

    public SportsCar(int gear, int speed, int darideheight){
        super(gear,speed);
        rideheight = darideheight;
    }
    @Override public String toString(){
        return(super.toString() + "ride height is " + rideheight + " inches");
    }
}

public class CarInheritance {
    public static void main(String args[]){
        SportsCar sc = new SportsCar(5,200,12);
        System.out.println(sc.toString());
    }
}
