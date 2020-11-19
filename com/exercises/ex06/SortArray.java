package com.exercises.ex06;

public class SortArray
{
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            for (int j = 0; j < list.length - i; j++)
            {
                if (list[j] > list[j + 1])
                {
                    int temp  = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    private static int partition(int[] list, int low, int high)
    {
        int pivot = list[low];
        int countBigger = 0;
        int temp, i;

        for (int j = high; j > low; j--)
        {
            if (list[j] > pivot)
            {
                i = high - countBigger;
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                countBigger++;
            }
        }

        i = high - countBigger;
        temp = list[i];
        list[i] = list[low];
        list[low] = temp;

        return i;
    }

    private static void quickSortRecursive(int[] list, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(list, low, high);
            quickSortRecursive(list, low, pi - 1);
            quickSortRecursive(list, pi + 1, high);
        }
    }

    public static void quickSort(int[] list)
    {
        quickSortRecursive(list, 0, list.length - 1);
    }
}
