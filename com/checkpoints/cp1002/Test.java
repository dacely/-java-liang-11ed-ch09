package com.checkpoints.cp1002;

public class Test
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);

        swap1(c1, c2);
        System.out.println("After swap1");
        System.out.printf("\tc1 radius: %.1f\n", c1.getRadius());
        System.out.printf("\tc2 radius: %.1f\n", c2.getRadius());

        swap2(c1, c2);
        System.out.println("After swap2");
        System.out.printf("\tc1 radius: %.1f\n", c1.getRadius());
        System.out.printf("\tc2 radius: %.1f\n", c2.getRadius());
    }

    public static void swap1(Circle x, Circle y)
    {
        Circle temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Circle x, Circle y)
    {
        double temp = x.getRadius();
        x.setRadius(y.getRadius());
        y.setRadius(temp);
    }
}
