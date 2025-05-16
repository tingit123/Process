package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Triangle;

public class TriangleTest {

    @Test
    void testFirstNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(15);
        triangle.setNumber2(10);
        triangle.setNumber3(5);
        assertEquals(15, triangle.maxLength());
    }

    @Test
    void testSecondNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(5);
        triangle.setNumber2(15);
        triangle.setNumber3(10);
        assertEquals(15, triangle.maxLength());
    }

    @Test
    void testThirdNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(10);
        triangle.setNumber2(5);
        triangle.setNumber3(15);
        assertEquals(15, triangle.maxLength());
    }
}

