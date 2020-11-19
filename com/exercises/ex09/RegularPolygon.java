package com.exercises.ex09;

public class RegularPolygon
{
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(int numberOfSides, double sideLength, double xCenter, double yCenter)
    {
        setNumberOfSides(numberOfSides);
        setSideLength(sideLength);
        setCenter(xCenter, yCenter);
    }

    public RegularPolygon(int numberOfSides, double sideLength)
    {
        this(numberOfSides, sideLength, 0, 0);
    }

    public RegularPolygon()
    {
        this(3, 1);
    }

    public void setNumberOfSides(int numberOfSides){n = Math.max(numberOfSides, 3);}
    public int getNumberOfSides(){return n;}
    public void setSideLength(double sideLength){side = Math.max(sideLength, 0);}
    public double getSideLength(){return side;}
    public void setCenter(double x, double y){this.x = x; this.y = y;}
    public double[] getCenter(){return new double[]{x, y};}

    public double getPerimeter(){return n * side;}
    public double getArea(){return (n * side * side) / (4 * Math.tan(Math.PI / n));}

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append(String.format("\tSides: %d\n", getNumberOfSides()));
        str.append(String.format("\tLength: %.2f\n", getSideLength()));
        str.append(String.format("\tArea: %.2f\n", getArea()));
        str.append(String.format("\tPerimeter: %.2f\n", getPerimeter()));
        str.append(String.format("\tCenter: [%.2f, %.2f]\n", getCenter()[0], getCenter()[1]));
        return str.toString();
    }
}
