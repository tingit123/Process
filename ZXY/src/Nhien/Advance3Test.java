package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance3;

public class Advance3Test {

    @Test
    void testFibonacci_Negative() {
        Advance3 adv = new Advance3();
        int result = adv.fibonacci(-5);
        assertEquals(-1, result); // Trường hợp n < 0
    }

    @Test
    void testFibonacci_Zero() {
        Advance3 adv = new Advance3();
        int result = adv.fibonacci(0);
        assertEquals(0, result); // F(0) = 0
    }

    @Test
    void testFibonacci_One() {
        Advance3 adv = new Advance3();
        int result = adv.fibonacci(1);
        assertEquals(1, result); // F(1) = 1
    }

    @Test
    void testFibonacci_Two() {
        Advance3 adv = new Advance3();
        int result = adv.fibonacci(2);
        assertEquals(1, result); // F(2) = 1
    }

    @Test
    void testFibonacci_Five() {
        Advance3 adv = new Advance3();
        int result = adv.fibonacci(5);
        assertEquals(5, result); // F(5) = 5
    }

    @Test
    void testFibonacci_Seven() {
        Advance3 adv = new Advance3();
        int result = adv.fibonacci(7);
        assertEquals(13, result); // F(7) = 13
    }
}
