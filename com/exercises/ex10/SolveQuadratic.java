package com.exercises.ex10;

import java.util.Scanner;

public class SolveQuadratic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficients of quadratic equation: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation p = new QuadraticEquation(a, b, c);
        p.displayRoots();
    }
}
