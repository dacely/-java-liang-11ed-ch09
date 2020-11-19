package com.checkpoints.cp1001;

public class Test
{
    public static void main(String[] args)
    {
        Count myCount = new Count();
        int times = 0;

        for (int i = 0; i < 100; i++)
            increment(myCount, times);

        System.out.printf("myCount.count = %d\n", myCount.count);
        System.out.printf("times = %d\n", times);
    }

    public static void increment(Count c, int times)
    {
        c.count++;
        times++;
    }
}
