package com.exercises.ex06;

public class Stopwatch
{
    private long startTime;
    private long endTime;

    public Stopwatch() { startTime = System.currentTimeMillis(); }
    public void start() { startTime = System.currentTimeMillis(); }
    public void end() { endTime = System.currentTimeMillis(); }
    public long getElapsedTime() { return endTime - startTime; }
}
