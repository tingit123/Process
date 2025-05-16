package Nhien;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Do.Calculator3;

public class Calculator3Test {

    @Test
    void testMul_NormalValues() {
        Calculator3 calc = new Calculator3(10, 5);
        assertEquals(50, calc.mul());
    }

    @Test
    void testMul_Overflow() {
        Calculator3 calc = new Calculator3(Integer.MAX_VALUE, 2);
        assertEquals(-2, calc.mul());
    }

    @Test
    void testMul_Underflow() {
        Calculator3 calc = new Calculator3(Integer.MIN_VALUE, 2);
        assertEquals(0, calc.mul());
    }
}

