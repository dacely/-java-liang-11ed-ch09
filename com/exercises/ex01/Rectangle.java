package com.exercises.ex01;

public class Rectangle
{
    private final double width;
    private final double height;

    public Rectangle()
    {
        this(1, 1);
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }

    public String getInfo()
    {
        return String.format("\tWidth: %.2f\n", width) +
                String.format("\tHeight: %.2f\n", height) +
                String.format("\tArea: %.2f\n", getArea()) +
                String.format("\tPerimeter: %.2f\n", getPerimeter());
    }
}
