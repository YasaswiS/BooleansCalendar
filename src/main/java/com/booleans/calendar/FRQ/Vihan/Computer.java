package com.booleans.calendar.FRQ.Vihan;

public class Computer implements Comparable<Computer> {

    public enum operating_system {
        WINDOWS,
        UBUNTU,
        MACOS
    }

    public int ssd_size;
    public int storage_size;

    public Computer() {
        storage_size = 256;
        ssd_size=8;
    }
    public Computer(int storage) {
        storage_size=storage;
    }

    public Computer(int storage, int ssd) {
        this.ssd_size = ssd;
        this.storage_size = storage;
    }

    @Override
    public String toString() {
        return "Storage: "+ String.valueOf(storage_size)+" GB";
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
