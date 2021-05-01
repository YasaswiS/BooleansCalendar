package com.booleans.calendar.FRQ.Vihan.Inheritance;

public class Computer implements Comparable<Computer> {

    public enum OperatingSystem {
        WINDOWS,
        UBUNTU,
        MACOS
    }

    public OperatingSystem operatingSystem;
    public String name;
    public int ram_size;
    public int storage_size;

    //no variables
    public Computer() {
        this(256, "Computer",8 );
    }
    //initialized with name
    public Computer(String name) {
        this(256, name, 8);
    }
    public Computer(int storage,String name) {this(storage, name,8 ); }

    public Computer(int storage, String name,int ram) {
        this(storage,name,ram,OperatingSystem.UBUNTU);
    }
    public Computer(int storage, String name, int ram_size, OperatingSystem os) {
        this.ram_size = ram_size;
        this.storage_size = storage;
        this.operatingSystem = os;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Name: "+name+" Storage: "+ storage_size+" GB";
    }


    @Override
    public int compareTo(Computer com) {
        if (this.storage_size < com.storage_size) {
            return -1;
        } else if (this.storage_size > com.storage_size) {
            return 1;
        } else if (this.storage_size == com.storage_size) {
            return 0;
        }
        return 0;
    }


}
