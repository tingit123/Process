package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Do.Calculator4;

public class Calculator4Test {

    @Test
    void testDiv_NormalValues() {
        Calculator4 calc = new Calculator4();
        calc.setNumber1(10);
        calc.setNumber2(2);
        assertEquals(5, calc.div());
    }

    @Test
    void testDiv_DivisionByZero() {
        Calculator4 calc = new Calculator4();
        calc.setNumber1(10);
        calc.setNumber2(0);
        assertThrows(ArithmeticException.class, () -> calc.div());
    }

    @Test
    void testDiv_FloatResultTruncated() {
        Calculator4 calc = new Calculator4();
        calc.setNumber1(5);
        calc.setNumber2(2);
        assertEquals(2, calc.div());
    }
}

