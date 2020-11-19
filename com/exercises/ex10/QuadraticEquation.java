package com.exercises.ex10;

public class QuadraticEquation
{
    private double a;
    private double b;
    private double c;
    private static final double EPSILON = 1E-6;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = Math.abs(a) < EPSILON ? 1 : a;
        this.b = b;
        this.c = c;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    public double getDiscriminant()
    {
        return b * b - 4 * a * c;
    }

    public double getRoot1()
    {
        double disc = getDiscriminant();
        if (disc < 0)
            return 0;
        else
            return (-b + Math.sqrt(disc)) / (2 * a);
    }

    public double getRoot2()
    {
        double disc = getDiscriminant();
        if (disc < 0)
            return 0;
        else
            return (-b - Math.sqrt(disc)) / (2 * a);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%.2fx^2", a ));

        if (b < -EPSILON)
            builder.append(String.format(" - %.2fx", Math.abs(b)));
        else if (b > EPSILON)
            builder.append(String.format(" + %.2fx", b));

        if (c > -EPSILON)
            builder.append(String.format(" + %.2f", c));
        else if (c < EPSILON)
            builder.append(String.format(" - %.2f", Math.abs(c)));

        return builder.toString();
    }

    public void displayRoots()
    {
        System.out.printf("Quadratic Equation %s", this.toString());

        if (getDiscriminant() < 0 )
            System.out.print(" has no roots");
        else if (getDiscriminant() < EPSILON)
            System.out.printf(" has one root r = %.4f", getRoot1());
        else
        {
            System.out.println(" has tow roots");
            System.out.printf("\tRoot 1 = %.4f\n", getRoot1());
            System.out.printf("\tRoot 2 = %.4f", getRoot2());
        }

        System.out.println();
    }
}
