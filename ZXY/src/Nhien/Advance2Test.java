package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance2;

public class Advance2Test {

    @Test
    void testSum_NormalNumber() {
        Advance2 adv = new Advance2();
        int result = adv.sum(5765);
        assertEquals(23, result);  // 5+7+6+5 = 23
    }

    @Test
    void testSum_Zero() {
        Advance2 adv = new Advance2();
        int result = adv.sum(0);
        assertEquals(0, result);
    }

    @Test
    void testSum_SingleDigit() {
        Advance2 adv = new Advance2();
        int result = adv.sum(9);
        assertEquals(9, result);
    }

    @Test
    void testSum_LongNumber() {
        Advance2 adv = new Advance2();
        int result = adv.sum(1234567890L);  // 1+2+3+4+5+6+7+8+9+0 = 45
        assertEquals(45, result);
    }

    @Test
    void testSum_NegativeNumber() {
        Advance2 adv = new Advance2();
        int result = adv.sum(-1234);
        assertEquals(10, result);  // -1234 => xử lý như 1234: 1+2+3+4 = 10
    }
}

