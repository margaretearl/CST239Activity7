package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add(2, 1));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(8, 3));
 
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(20, calc.multiply(4, 5));

    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(10, 0);
    }
}