package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Sort1;

public class Sort1Test {

    @Test
    void testNumber1GreaterThanNumber2() {
        Sort1.number1 = 15;
        Sort1.number2 = 5;
        Sort1.sortAsc();
        assertEquals(5, Sort1.number1);
        assertEquals(15, Sort1.number2);
    }

    @Test
    void testNumber1LessThanNumber2() {
        Sort1.number1 = 5;
        Sort1.number2 = 15;
        Sort1.sortAsc();
        assertEquals(5, Sort1.number1);
        assertEquals(15, Sort1.number2);
    }
}


