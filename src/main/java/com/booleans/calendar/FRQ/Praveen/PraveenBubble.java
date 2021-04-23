package com.booleans.calendar.FRQ.Praveen;

public class PraveenBubble {
    public void PraveenBubble(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int target = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = target;
                }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        PraveenBubble ob = new PraveenBubble();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.PraveenBubble(arr);
        ob.printArray(arr);
    }
}
