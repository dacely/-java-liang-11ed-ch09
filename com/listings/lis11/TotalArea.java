package com.listings.lis11;

public class TotalArea
{
    public static void main(String[] args)
    {
        Circle[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static Circle[] createCircleArray()
    {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++)
            circleArray[i] = new Circle(Math.random() * 100);

        return circleArray;
    }

    public static void printCircleArray(Circle[] circles)
    {
        System.out.printf("%8s%15s\n", "Radius", "Area");

        for (Circle c : circles)
            System.out.printf("%8.2f%15.2f\n", c.getRadius(), c.getArea());

        System.out.println("-----------------------");
        System.out.printf("%-12s%11.2f\n", "Total area", sumAreas(circles));
    }

    public static double sumAreas(Circle[] circles)
    {
        double sum = 0;

        for (Circle c : circles)
            sum += c.getArea();

        return sum;
    }
}
