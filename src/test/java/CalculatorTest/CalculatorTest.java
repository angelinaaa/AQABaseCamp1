package CalculatorTest;

import demo.Calculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        calculator = new Calculator();
    }

    @Test
    public void testGetSum() {
        assertEquals(3, calculator.calc(1, 2, '+'));
    }

    @Test
    public void testGetDivide() {
        assertEquals(2, calculator.calc(4, 2, '/'));
    }

    @Test
    public void testGetMultiple() {
        assertEquals(2, calculator.calc(1, 2, '*'));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.calc(2, 0, '/');
    }
    @Test(timeout = 500)
    public void timeStampTest() {
        System.out.println("timeStampTest()");
        while (true);
    }
}




