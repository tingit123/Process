package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance4;

public class Advance4Test {

    @Test
    void testPrime_Zero() {
        Advance4 adv = new Advance4();
        assertFalse(adv.isPrimeNumber(0)); // 0 không phải số nguyên tố
    }

    @Test
    void testPrime_One() {
        Advance4 adv = new Advance4();
        assertFalse(adv.isPrimeNumber(1)); // 1 không phải số nguyên tố
    }

    @Test
    void testPrime_Two() {
        Advance4 adv = new Advance4();
        assertTrue(adv.isPrimeNumber(2)); // 2 là số nguyên tố
    }

    @Test
    void testPrime_Three() {
        Advance4 adv = new Advance4();
        assertTrue(adv.isPrimeNumber(3)); // 3 là số nguyên tố
    }

    @Test
    void testPrime_Four() {
        Advance4 adv = new Advance4();
        assertFalse(adv.isPrimeNumber(4)); // 4 không phải số nguyên tố
    }

    @Test
    void testPrime_LargePrime() {
        Advance4 adv = new Advance4();
        assertTrue(adv.isPrimeNumber(97)); // 97 là số nguyên tố
    }

    @Test
    void testPrime_LargeNonPrime() {
        Advance4 adv = new Advance4();
        assertFalse(adv.isPrimeNumber(100)); // 100 không phải số nguyên tố
    }
}

