package com.exercises.ex11;

import java.util.Scanner;

public class IntersectingPoints
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (x1 y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (x2 y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter point 3 (x3 y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Enter point 4 (x4 y4): ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double e = a * x1 + b * y1;

        double c = y3 - y4;
        double d = x4 - x3;
        double f = c * x3 + d * y3;

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);
        if (eq.isSolvable())
            System.out.printf("The two lines intersect at (%.2f, %.2f)", eq.getX(), eq.getY());
        else
            System.out.println("The two lines are parallel");
    }
}
