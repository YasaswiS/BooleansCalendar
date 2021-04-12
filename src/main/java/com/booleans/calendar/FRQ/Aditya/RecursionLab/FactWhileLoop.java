package com.booleans.calendar.FRQ.Aditya.RecursionLab;

import java.util.Scanner;
public class FactWhileLoop
{

    public static void main(String [] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial.");
        int Number = Sc.nextInt();
        long Fact = 1;
        int I = 1;
        while (I <= Number)
        {
            Fact = Fact * I;
            I++;
        }
        System.out.println("The factorial of " + Number + " is: " + Fact);
    }
}