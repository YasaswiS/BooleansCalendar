package com.booleans.calendar.FRQ.Vihan.Inheritance;

public class Laptop extends Computer {

    int battery_charge;

    public Laptop() {
        super();
        this.battery_charge = 4;
    }

    public Laptop(String name,int battery_charge) {
        super(name);
        this.battery_charge = battery_charge;
    }

    public Laptop(int storage, String name, int ram, OperatingSystem os, int battery_charge) {
        super(storage,name,ram,os);
        this.battery_charge=battery_charge;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Battery: "+battery_charge+" hours";
    }

    public int compareTo(Laptop laptop) {
        if (this.battery_charge < laptop.battery_charge) {
            return -1;
        } else if (this.battery_charge > laptop.battery_charge) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Laptop 1", 10);
        Laptop lap2 = new Laptop("Laptop 2", 4);

        Computer com1 = new Computer("Computer 1");

        System.out.println(lap1);
        System.out.println(lap2);
        System.out.println(com1);

        System.out.println("Lap1 Compared to Lap2" + lap1.compareTo(lap2));
        System.out.println("Lap1 compared to Comp 1" + lap1.compareTo(com1));



    }
}


