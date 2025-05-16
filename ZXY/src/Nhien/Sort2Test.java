package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Sort2;

public class Sort2Test {

    @Test
    void testNumber1GreaterThanNumber2() {
        Sort2 sort = new Sort2();
        sort.number1 = 15;
        sort.number2 = 5;
        sort.sortDesc();
        assertEquals(15, sort.number1);
        assertEquals(5, sort.number2);
    }

    @Test
    void testNumber1LessThanNumber2() {
        Sort2 sort = new Sort2();
        sort.number1 = 5;
        sort.number2 = 15;
        sort.sortDesc();
        assertEquals(15, sort.number1);
        assertEquals(5, sort.number2);
    }
}

