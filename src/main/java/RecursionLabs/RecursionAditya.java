package RecursionLabs;

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

}
