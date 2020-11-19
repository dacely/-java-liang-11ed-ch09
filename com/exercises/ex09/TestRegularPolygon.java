package com.exercises.ex09;

public class TestRegularPolygon
{
    public static void main(String[] args)
    {
        RegularPolygon rPol1 = new RegularPolygon();
        RegularPolygon rPol2 = new RegularPolygon(4, 8);
        RegularPolygon rPol3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Regular Polygon 1:\n %s\n\n", rPol1);
        System.out.printf("Regular Polygon 2:\n %s\n\n", rPol2);
        System.out.printf("Regular Polygon 3:\n %s\n\n", rPol3);
    }
}
