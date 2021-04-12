package FRQ.Aditya.RecursionLab;

import java.util.Scanner;
class FactRecursion
{
    static int Factorial(int N){
        if (N == 0)
        {
            return 1;
        }
        else
        {
            return(N * Factorial(N - 1));
        }
    }
    public static void main(String [] args)
    {
        int I, Fact = 1;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial.");
        int Number = Sc.nextInt(); // The factorial will be calculated according to this number.
        Fact = Factorial(Number);
        System.out.println("The factorial of " + Number +" is: " + Fact);
    }
}