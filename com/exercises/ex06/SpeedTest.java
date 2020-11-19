package com.exercises.ex06;

import java.util.Random;

public class SpeedTest
{
    public static void main(String[] args)
    {
        Random random = new Random(1000);
        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        int[] arr0 = new int[100_000];
        int[] arr1 = new int[100_000];
        int[] arr2 = new int[100_000];
        int[] arr3 = new int[100_000];

        for (int i = 0; i < 100_000; i++)
            arr0[i] = arr1[i] = arr2[i] = arr3[i] = random.nextInt();
        stopwatch.end();
        System.out.printf("Initializing: %d milliseconds\n", stopwatch.getElapsedTime());

        stopwatch.start();
        SortArray.selectionSort(arr1);
        stopwatch.end();
        System.out.printf("\nSelection Sort: %d milliseconds\n", stopwatch.getElapsedTime());
        printElements(arr1, 90_000, 90_100);

        stopwatch.start();
        SortArray.bubbleSort(arr2);
        stopwatch.end();
        System.out.printf("\nBubble Sort: %d milliseconds\n", stopwatch.getElapsedTime());
        printElements(arr2, 90_000, 90_100);

        stopwatch.start();
        SortArray.quickSort(arr3);
        stopwatch.end();
        System.out.printf("\nQuick Sort: %d milliseconds\n", stopwatch.getElapsedTime());
        printElements(arr3, 90_000, 90_100);
    }

    public static void printElements(int[] arr, int start, int end)
    {
        for (int i = 0; i < end - start; i++)
        {
            System.out.printf(" %d", arr[start + i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
