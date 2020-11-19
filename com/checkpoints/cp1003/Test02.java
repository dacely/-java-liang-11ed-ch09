package com.checkpoints.cp1003;

public class Test02
{
    public static void main(String[] args)
    {
        int[] a = {1, 2};
        swap(a);
        System.out.printf("a[0] = %d\n", a[0]);
        System.out.printf("a[1] = %d\n", a[1]);
    }

    public static void swap(int[] a)
    {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
