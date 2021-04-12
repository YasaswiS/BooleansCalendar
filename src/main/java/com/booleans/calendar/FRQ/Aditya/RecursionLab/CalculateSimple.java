package com.booleans.calendar.FRQ.Aditya.RecursionLab;

import org.springframework.stereotype.Service;
import java.lang.Math;

@Service
public class CalculateSimple {

    public int add(OperationModel model){
        return model.getA() + model.getB();
    }

    public int subtract(OperationModel model){
        return model.getA() - model.getB();
    }

    public int multiply(OperationModel model){
        return model.getA() * model.getB();
    }

    public double divide(OperationModel model){
        if(model.getA() == 0) return 0;
        if(model.getB() == 0) return 0;
        return (double) model.getA() / model.getB();
    }

    public int factorial(OperationModel model) {
        return factorial(model.getC());
    }

    private int factorial(int n){
        return n < 2 ? n : n * factorial(n-1);
    }

    public int fibonacci(OperationModel model){
        return fibonacci(model.getC());
    }

    private int fibonacci(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else if(n == 2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public double sqrt(OperationModel model){
        return Math.sqrt(model.getC());
    }

    public int power(OperationModel model){
        return model.getC() * model.getC();
    }

    public OperationModel clearSimple(OperationModel model){
        model.setA(0);
        model.setB(0);
        return model;
    }

    public OperationModel clearAdvanced(OperationModel model){
        model.setC(0);
        return model;
    }
}

/*package RecursionLabs;

public class RecursionAditya
{
    public static void main(String[] args)
    {
        RecursionAditya Run = new RecursionAditya();
        System.out.println(Run.returnFact(6));
        System.out.println(Run.Fact(6));
        System.out.println(Run.GCF(24,6));
        System.out.println(Run.decimalToBinary(10));
    }

    public int Fact(int N)
    {
        return N > 0 ? N * Fact(N - 1) : 1;
    }

    public String returnFact(int N)
    {
        return "The factorial of " + N + " is equal to " + Fact(N) + ".";
    }

    public int GCF(int X, int Y) {
        if (X % Y == 0)
        {
            return Y;
        }
        return GCF(Y, X % Y);
    }

    public int decimalToBinary(int N)
    {
        if (N <= 1)
        {
            return N;
        }
        return N % 2 + 10 * decimalToBinary(N/2);
    }

    public String returnBinary(int N)
    {
        return "The binary form of " + N + " is " + decimalToBinary(N) + ".";
    }

}*/
