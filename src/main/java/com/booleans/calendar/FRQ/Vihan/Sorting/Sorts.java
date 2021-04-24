package com.booleans.calendar.FRQ.Vihan.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;

public class Sorts {
    Instant start;
    public double bubbleTime;
    public double insertionTime;
    public double selectionTime;
    public boolean arraysMatch = false;


    public Sorts(ArrayList<Comparable> array) {
        //Bubble Sort
        start = Instant.now();
        ArrayList<Comparable> barray = bubbleSort(array);
        bubbleTime = Duration.between(start,Instant.now()).getNano();

        start = Instant.now();
        ArrayList<Comparable> sarray = selectionSort(array);
        selectionTime = Duration.between(start,Instant.now()).getNano();

        start = Instant.now();
        ArrayList<Comparable> iarray = insertionSort(array);
        insertionTime = Duration.between(start,Instant.now()).getNano();

        if (!(barray.equals(iarray) && iarray.equals(sarray))) {
            arraysMatch = false;
        } else{
            arraysMatch = true;
        }
    }

    public ArrayList<Comparable> bubbleSort(ArrayList<Comparable> array) {


        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                Comparable current =  array.get(j);
                Comparable next = array.get(j + 1);
                if (current.compareTo(next) > 0||current.compareTo(next)==0) {
                    array.set(j, next);
                    array.set(j + 1, current);
                }
            }
        };
        return array;

    }


    public ArrayList<Comparable> selectionSort(ArrayList<Comparable> array) {
        Instant start = Instant.now();

        for (int i = 0; i < array.size()-1; i++) {
            int minimum_index = i;
            for (int j = i; j < array.size(); j++) {
                Comparable current = array.get(j);
                if (current.compareTo(array.get(minimum_index)) < 0) {

                    minimum_index = j;
                }
            }

            Comparable temp = array.get(i);
            array.set(i, array.get(minimum_index));
            array.set(minimum_index, temp);
        };
        return array;
    }

    public ArrayList<Comparable> insertionSort(ArrayList<Comparable> array) {
        Instant start = Instant.now();

        if (array.size() == 1) {
            return array;
        } else {
            for (int i = 1; i < array.size(); i++) {
                Comparable current = array.get(i);
                for (int j = i; j >= 1; j--) {
                    Comparable next = array.get(j-1);
                    if (current.compareTo(next)==0||current.compareTo(next)<0) {
                        array.remove(j);
                        array.add(j-1, current);
                    }
                }

            };
            return array;
        }
    }


    public static void main(String[] args) {
        Sorts sort = new Sorts(new ArrayList<Comparable>(Arrays.asList(34,51,231,4002,12)));
        System.out.println(sort.bubbleTime);
        System.out.println(sort.selectionTime);
        System.out.println(sort.insertionTime);
        System.out.println(sort.arraysMatch);


    }




}
