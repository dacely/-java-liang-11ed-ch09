package com.listings.lis07;

public class TestCircle
{
    public static void main(String[] args)
    {
        System.out.println("Before creating objects");
        System.out.printf("\tCircle objects: %d\n", Circle.getNumberOfObjects());

        Circle c1 = new Circle();
        System.out.println("\nAfter creating c1");
        System.out.printf("\tc1 radius: %.1f\n", c1.radius);
        System.out.printf("\tCircle objects: %d\n", Circle.getNumberOfObjects());

        Circle c2 = new Circle(5);
        c1.radius = 9;
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.printf("\tc1 radius: %.1f\n", c1.radius);
        System.out.printf("\tc2 radius: %.1f\n", c2.radius);
        System.out.printf("\tCircle objects: %d\n", Circle.getNumberOfObjects());

    }
}
