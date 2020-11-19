package com.listings;

import java.util.Scanner;
import javafx.geometry.Point2D;

public class L05_TestPoint2D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.printf("p1 is %s\n", p1.toString());
        System.out.printf("p2 is %s\n", p2.toString());
        System.out.printf("Distance: %.2f\n", p1.distance(p2));
        System.out.printf("Midpoint: %s\n", p1.midpoint(p2).toString());
    }
}
