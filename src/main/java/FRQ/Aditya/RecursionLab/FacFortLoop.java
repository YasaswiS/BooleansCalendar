package FRQ.Aditya.RecursionLab;

import java.util.Scanner;
class FacFortLoop
{
    public static void main(String [] args)
    {
        int I, Fact = 1;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial.");
        int Number = Sc.nextInt(); // This number's factorial will be calculated.
        for (I = 1; I <= Number; I++)
        {
            Fact = Fact * I;
        }
        System.out.println("The factorial of " + Number + " is: " + Fact);
    }
}