package com.exercises.ex01;

public class Test
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("Rectangle 1:");
        System.out.println(r1.getInfo());
        System.out.println("Rectangle 2:");
        System.out.println(r2.getInfo());
    }
}
