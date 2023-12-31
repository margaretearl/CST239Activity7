package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junit.Calculator;
import junit.Calculator.Type;

@RunWith(Parameterized.class)
public class CalculatorTest {

    @Parameter(0)
    public Type type;

    @Parameter(1)
    public int a1;

    @Parameter(2)
    public int a2;

    @Parameter(3)
    public int result;

    @Test
    public void testCalculatorOperations() {
        Assume.assumeTrue(type == Type.ADD);

        Calculator calc = new Calculator();
        assertEquals(result, calc.add(a1, a2));
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            {Type.ADD, 2, 1, 3}, {Type.ADD, 5, 2, 7},
            {Type.SUBTRACT, 2, 1, 1}, {Type.SUBTRACT, 5, 2, 3},
            {Type.MULTIPLY, 2, 1, 2}, {Type.MULTIPLY, 5, 2, 10},
            {Type.DIVIDE, 2, 1, 2}, {Type.DIVIDE, 5, 2, 2}
        };

        return Arrays.asList(data);
    }
}
