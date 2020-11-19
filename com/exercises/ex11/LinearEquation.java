package com.exercises.ex11;

public class LinearEquation
{
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable()
    {
        return Math.abs(det()) > 1E-14;
    }

    private double det()
    {
        return a * d - b * c;
    }

    public double getX()
    {
        if (isSolvable())
            return (e * d - b * f) / det();
        else
            return 0;
    }

    public double getY()
    {
        if (isSolvable())
            return (a * f - e * c) / det();
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return "Linear Equation: \n" +
                String.format("\t(%.2f)x + (%.2f)y = %.2f\n", a, b, e) +
                String.format("\t(%.2f)x + (%.2f)y = %.2f\n", c, d, f);
    }

    public void displaySolution()
    {
        System.out.print(this.toString());
        if (isSolvable())
            System.out.printf("has solution x = %.2f, y = %.2f\n", getX(), getY());
        else
            System.out.println("has no solution.");
    }
}
