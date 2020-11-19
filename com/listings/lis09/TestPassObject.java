package com.listings.lis09;

public class TestPassObject
{
    public static void main(String[] args)
    {
        Circle myCircle = new Circle(1);
        int n = 5;

        System.out.printf("Radius before: %.2f\n", myCircle.getRadius());
        System.out.printf("n before: %d\n\n", n);

        printAreas(myCircle, n);

        System.out.printf("\nRadius after: %.2f\n", myCircle.getRadius());
        System.out.printf("n after: %d\n", n);
    }

    public static void printAreas(Circle c, int times)
    {
        System.out.println("Radius      Area");
        while (times >= 1)
        {
            System.out.printf("%8.2f%8.2f\n", c.getRadius(), c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
