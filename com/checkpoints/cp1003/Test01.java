package com.checkpoints.cp1003;

public class Test01
{
    public static void main(String[] args)
    {
        int[] a = {1, 2};
        swap(a[0], a[1]);
        System.out.printf("a[0] = %d\n", a[0]);
        System.out.printf("a[1] = %d\n", a[1]);
    }

    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
