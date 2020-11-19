package com.exercises.ex08;

public class Fan
{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan()
    {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean getState()
    {
        return on;
    }

    public void turnOn()
    {
        this.on = true;
    }

    public void turnOff()
    {
        this.on = false;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        switch (speed)
        {
            case 1:
                str.append("Speed=SLOW");
                break;
            case 2:
                str.append("Speed=MEDIUM");
                break;
            case 3:
                str.append("Speed=FAST");
                break;
        }
        str.append(String.format(", Color='%s'", color));
        str.append(String.format(", Radius=%.2f", radius));
        str.append(String.format(", State=%s", on ? "ON" : "OFF"));
        return str.toString();
    }
}
