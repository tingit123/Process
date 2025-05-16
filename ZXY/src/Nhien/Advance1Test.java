package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance1;

public class Advance1Test {

    @Test
    void testUSCLN() {
        Advance1 advance = new Advance1();
        int result = advance.USCLN(36, 60);
        assertEquals(12, result);  // 12 là UCLN của 36 và 60
    }

    @Test
    void testBSCNN() {
        Advance1 advance = new Advance1();
        int result = advance.BSCNN(36, 60);
        assertEquals(180, result);  // 180 là BSCNN của 36 và 60
    }

    @Test
    void testUSCLN_WhenEqualNumbers() {
        Advance1 advance = new Advance1();
        int result = advance.USCLN(25, 25);
        assertEquals(25, result);  // UCLN của 25 và 25 là chính nó
    }

    @Test
    void testBSCNN_WhenEqualNumbers() {
        Advance1 advance = new Advance1();
        int result = advance.BSCNN(25, 25);
        assertEquals(25, result);  // BSCNN của 25 và 25 là chính nó
    }

    @Test
    void testUSCLN_WhenOneIsZero() {
        Advance1 advance = new Advance1();
        int result = advance.USCLN(0, 25);
        assertEquals(25, result);  // UCLN của 0 và 25 là 25
    }

    @Test
    void testBSCNN_WhenOneIsZero() {
        Advance1 advance = new Advance1();
        int result = advance.BSCNN(0, 25);
        assertEquals(0, result);  // BSCNN của 0 và 25 là 0
    }
}

