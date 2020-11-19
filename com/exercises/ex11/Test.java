package com.exercises.ex11;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Cramer's rule for a system of two equations:");
        System.out.println("\t (1) ax + by = e");
        System.out.println("\t (2) cx + dy = f");

        System.out.print("Enter coefficients for equation (1) [a b e]: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double e = input.nextDouble();

        System.out.print("Enter coefficients for equation (2) [c d f]: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);
        eq.displaySolution();
    }
}
