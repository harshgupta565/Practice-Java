package Junit.JUnit;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Order(1)
    @Test

    void testAdd() {
        Calculator c = new Calculator();
        int result = c.add(2, 3);
        assertEquals(5, result);
    }
    @Order(3)
    @Test

    void testSubtract() {
        Calculator c = new Calculator();
        int result = c.subtract(4, 3);
        assertEquals(1, result);
    }
    @Order(2)

    @Test

    void testmultiply(){
        Calculator c = new Calculator();
        int  result = c.multiply(10, 5);
        assertEquals(50, result);
    }
    @Order(4)
    @Test

    void testDivide(){
        Calculator c = new Calculator();
        int result = c.divide(10, 5);
        assertEquals(2, result);
    }
}
