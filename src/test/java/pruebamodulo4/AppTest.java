package pruebamodulo4;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testSubstraction() {
        Calculator calculator = new Calculator();
        int result = calculator.substract(20,10);
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 10);
        assertEquals(100, result);
    }


    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 10);
        assertEquals(1, result);
    }

}
