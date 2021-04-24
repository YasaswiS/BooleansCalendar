package com.booleans.calendar.FRQ.Vihan.Sorts;

import java.util.ArrayList;
import java.util.Arrays;


public class IntegerSorts {



    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> array) {


        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() - 1; j++) {
                int current = (int) array.get(j);
                int next = (int) array.get(j + 1);
                if (current >= next) {
                    array.set(j, next);
                    array.set(j + 1, current);
                }
            }
        }
        return array;

    }


    public static ArrayList<Integer> selectionSort(ArrayList<Integer> array) {

        for (int i = 0; i < array.size()-1; i++) {
            int minimum_index = i;
            for (int j = i; j < array.size(); j++) {
                int current_element = array.get(j);
                if (current_element < array.get(minimum_index)) {

                    minimum_index = j;
                }
            }

            int temp = array.get(i);
            array.set(i, array.get(minimum_index));
            array.set(minimum_index, temp);
        }
        return array;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> array) {

        if (array.size() == 1) {
            return array;
        } else {
            for (int i = 1; i < array.size(); i++) {
                int current = array.get(i);
                for (int j = i; j >= 1; j--) {
                    if (current <= array.get(j - 1)) {
                        array.remove(j);
                        array.add(j-1, current);

                    }
                }

            }
            return array;
        }
    }

    public static void main(String[] args) {

        Integer[] array = {20,200,3,500,1,3234,666};
        ArrayList<Integer> testarraylist = new ArrayList<Integer>(Arrays.asList(array));

        System.out.println(bubbleSort(testarraylist));
    }


}


