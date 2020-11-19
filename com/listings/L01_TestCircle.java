package com.listings;

public class L01_TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(25);
        Circle c3 = new Circle(125);

        System.out.println("Circle 1:");
        System.out.printf("\tRadius: %.2f\n", c1.radius);
        System.out.printf("\tArea: %.2f\n", c1.getArea());
        System.out.printf("\tPerimeter: %.2f\n", c1.getPerimeter());

        System.out.println("Circle 2:");
        System.out.printf("\tRadius: %.2f\n", c2.radius);
        System.out.printf("\tArea: %.2f\n", c2.getArea());
        System.out.printf("\tPerimeter: %.2f\n", c2.getPerimeter());

        System.out.println("Circle 3:");
        System.out.printf("\tRadius: %.2f\n", c3.radius);
        System.out.printf("\tArea: %.2f\n", c3.getArea());
        System.out.printf("\tPerimeter: %.2f\n", c3.getPerimeter());

        c2.setRadius(100);
        System.out.println("Circle 2:");
        System.out.printf("\tRadius: %.2f\n", c2.radius);
        System.out.printf("\tArea: %.2f\n", c2.getArea());
        System.out.printf("\tPerimeter: %.2f\n", c2.getPerimeter());

    }
}

class Circle
{
    double radius;

    Circle()
    {
        radius = 1;
    }

    Circle(double newRadius)
    {
        radius = newRadius;
    }

    double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}