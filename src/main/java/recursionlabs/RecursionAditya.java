package recursionlabs;

import java.util.Scanner;
public class RecursionAditya {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial.");
        int Num = Sc.nextInt();
        long Factorial = multiplyNumbers(Num);
        System.out.println("The factorial of " + Num + " is " + Factorial + ".");
    }
    public static long multiplyNumbers(int Num)
    {
        if (Num >= 1)
            return Num * multiplyNumbers(Num - 1);
        else
            return 1;
    }
}