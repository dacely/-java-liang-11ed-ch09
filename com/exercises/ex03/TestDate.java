package com.exercises.ex03;

import java.util.Date;

public class TestDate
{
    public static void main(String[] args)
    {
        Date[] dates = new Date[8];
        long milliseconds = 10_000;

        for (int i = 0; i < dates.length; i++)
        {
            dates[i] = new Date(milliseconds);
            System.out.println(dates[i].toString());
            milliseconds *= 10;
        }
    }
}
