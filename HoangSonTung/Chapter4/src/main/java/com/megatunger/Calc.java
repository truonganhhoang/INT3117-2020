package com.megatunger;

public class Calc
{
    static public int add (int a, int b)
    {
        return a + b;
    }
    static public int subtract (int a, int b)
    {
        return a - b;
    }
    static public int divide (int a, int b)
    {
        try {
            return a / b;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
            return 0;
        }
    }
    static public int multiply (int a, int b)
    {
        return a * b;
    }
}
