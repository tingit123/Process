package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Calculator1;

public class Calculator1Test {

    @Test
    void testAdd_NormalValues() {
        Calculator1 calc = new Calculator1();
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void testAdd_Overflow() {
        Calculator1 calc = new Calculator1();
        int result = calc.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    void testAdd_Underflow() {
        Calculator1 calc = new Calculator1();
        int result = calc.add(Integer.MIN_VALUE, -1);
        assertEquals(Integer.MAX_VALUE, result);
    }
}
