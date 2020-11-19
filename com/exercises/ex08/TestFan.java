package com.exercises.ex08;

public class TestFan
{
    public static void main(String[] args)
    {
        Fan fan1 = new Fan();

        Fan fan2 = new Fan();
        fan2.setColor("green");
        fan2.setRadius(10.5);
        fan2.setSpeed(Fan.MEDIUM);

        Fan fan3 = new Fan();
        fan3.turnOn();
        fan3.setColor("red");
        fan3.setSpeed(Fan.FAST);
        fan3.setRadius(18.654);

        System.out.printf("Fan 1: {%s}\n", fan1);
        System.out.printf("Fan 2: {%s}\n", fan2);
        System.out.printf("Fan 3: {%s}\n", fan3);
    }
}
