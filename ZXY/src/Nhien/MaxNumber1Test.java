package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.MaxNumber1;

public class MaxNumber1Test {

    @Test
    void testFirstNumberIsMax() {
        MaxNumber1 max = new MaxNumber1(10, 5, 2);
        assertEquals(10, max.max3());
    }

    @Test
    void testSecondNumberIsMax() {
        MaxNumber1 max = new MaxNumber1(5, 10, 2);
        assertEquals(10, max.max3());
    }

    @Test
    void testThirdNumberIsMax() {
        MaxNumber1 max = new MaxNumber1(5, 2, 10);
        assertEquals(10, max.max3());
    }
}
