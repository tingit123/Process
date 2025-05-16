package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Calculator2;

public class Calculator2Test {

    @Test
    void testSub_NormalValues() {
        Calculator2 calc = new Calculator2();
        calc.number1 = 20;
        calc.number2 = 10;
        calc.sub();
        assertEquals(10, calc.result);
    }

    @Test
    void testSub_Overflow() {
        Calculator2 calc = new Calculator2();
        calc.number1 = Integer.MAX_VALUE;
        calc.number2 = -1;
        calc.sub();
        assertEquals(Integer.MIN_VALUE, calc.result);
    }

    @Test
    void testSub_Underflow() {
        Calculator2 calc = new Calculator2();
        calc.number1 = Integer.MIN_VALUE;
        calc.number2 = 1;
        calc.sub();
        assertEquals(Integer.MAX_VALUE, calc.result);
    }
}
