package com.megatunger;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    void add() {
        assertTrue("Calc sum correct", 5 == Calc.add (2, 3));
    }

    @Test
    public void subtract() {
        assertTrue("Calc subtract correct", -1 == Calc.subtract (2, 3));
    }

    @Test
    public void divide() {
        assertTrue("Calc divide correct", 2 == Calc.divide (4, 2));
    }

    @Test
    public void divideByZero() {
        assertTrue("Calc divide correct", 0 == Calc.divide (4, 0));
    }

    @Test
    public void multiply() {
        assertTrue("Calc multiply correct", 8 == Calc.multiply (4, 2));
    }
}