package com.exercises;

import java.util.Random;

public class E04_TestRandom
{
    public static void main(String[] args)
    {
        Random rnd = new Random(1000);

        for (int i = 1; i <= 50; i++)
        {
            System.out.printf("  %02d", rnd.nextInt(100));
            if (i % 10 == 0)
                System.out.println();
        }
    }
}
