package com.checkpoints.cp1003;

public class Test04
{
    public static void main(String[] args)
    {
        B b1 = new B();
        B b2 = new B();
        System.out.printf("b1.i = %d\n", b1.i);
        System.out.printf("b1.j = %d\n\n", b1.j);

        System.out.printf("b2.i = %d\n", b2.i);
        System.out.printf("b2.j = %d\n\n", b2.j);
    }
}

class B
{
    static int i = 0;
    int j = 0;

    B()
    {
        i++;
        j = 1;
    }
}
