package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance5;

public class Advance5Test {

    @Test
    void testPalindrome_True_OddLength() {
        Advance5 adv = new Advance5();
        assertTrue(adv.kiemTraDoiXung(121));
    }

    @Test
    void testPalindrome_True_EvenLength() {
        Advance5 adv = new Advance5();
        assertTrue(adv.kiemTraDoiXung(1221));
    }

    @Test
    void testPalindrome_False() {
        Advance5 adv = new Advance5();
        assertFalse(adv.kiemTraDoiXung(123));
    }

    @Test
    void testPalindrome_SingleDigit() {
        Advance5 adv = new Advance5();
        assertTrue(adv.kiemTraDoiXung(7));
    }

    @Test
    void testPalindrome_Zero() {
        Advance5 adv = new Advance5();
        assertTrue(adv.kiemTraDoiXung(0));
    }

    @Test
    void testPalindrome_LargeNumber() {
        Advance5 adv = new Advance5();
        assertTrue(adv.kiemTraDoiXung(1234321));
    }
}

