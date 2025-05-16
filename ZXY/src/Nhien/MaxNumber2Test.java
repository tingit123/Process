package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.MaxNumber2;

public class MaxNumber2Test {

    @Test
    void testFirstNumberIsMax() {
        MaxNumber2 max = new MaxNumber2();
        max.number1 = 10;
        max.number2 = 5;
        assertEquals(10, max.max2());
    }

    @Test
    void testSecondNumberIsMax() {
        MaxNumber2 max = new MaxNumber2();
        max.number1 = 5;
        max.number2 = 10;
        assertEquals(10, max.max2());
    }
}

