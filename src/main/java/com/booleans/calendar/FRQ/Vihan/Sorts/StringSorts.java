package com.booleans.calendar.FRQ.Vihan.Sorts;

import java.util.ArrayList;
import java.util.Arrays;


public class StringSorts {



    public static ArrayList<String> bubbleSort(ArrayList<String> array) {


        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                String current =  array.get(j);
                String next = array.get(j + 1);
                if (current.compareTo(next) > 0||current.compareTo(next)==0) {
                    array.set(j, next);
                    array.set(j + 1, current);
                }
            }
        }
        return array;

    }


    public static ArrayList<String> selectionSort(ArrayList<String> array) {

        for (int i = 0; i < array.size()-1; i++) {
            int minimum_index = i;
            for (int j = i; j < array.size(); j++) {
                String current = array.get(j);
                if (current.compareTo(array.get(minimum_index)) < 0) {

                    minimum_index = j;
                }
            }

            String temp = array.get(i);
            array.set(i, array.get(minimum_index));
            array.set(minimum_index, temp);
        }
        return array;
    }

    public static ArrayList<String> insertionSort(ArrayList<String> array) {

        if (array.size() == 1) {
            return array;
        } else {
            for (int i = 1; i < array.size(); i++) {
                String current = array.get(i);
                for (int j = i; j >= 1; j--) {
                    String next = array.get(j-1);
                    if (current.compareTo(next)==0||current.compareTo(next)<0) {
                        array.remove(j);
                        array.add(j-1, current);
                    }
                }

            }
            return array;
        }
    }

    public static void main(String[] args) {

        String[] array = {"a","c","dfdasdf","sefd","aaa"};
        ArrayList<String> testarraylist = new ArrayList<String>(Arrays.asList(array));

        System.out.println(insertionSort(testarraylist));
    }


}
