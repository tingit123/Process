package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Do.SolveEquation;

public class SolveEquationTest {

    @Test
    void testMultiRoots() {
        SolveEquation eq = new SolveEquation();
        eq.setNumber1(0);
        eq.setNumber2(0);
        assertEquals("Multi roots", eq.linearEquation());
    }

    @Test
    void testNoRoot() {
        SolveEquation eq = new SolveEquation();
        eq.setNumber1(0);
        eq.setNumber2(5);
        assertEquals("No root", eq.linearEquation());
    }

    @Test
    void testOneRoot() {
        SolveEquation eq = new SolveEquation();
        eq.setNumber1(2);
        eq.setNumber2(5);
        assertEquals("One root", eq.linearEquation());
    }
}

