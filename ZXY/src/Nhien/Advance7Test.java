package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance7;

public class Advance7Test {

    @Test
    void testTinhThu_ChuNhat() {
        Advance7 adv = new Advance7();
        int thu = adv.tinhThu(5, 4, 2020); // Chủ nhật
        assertEquals(1, thu); // 1 = Chủ nhật
    }

    @Test
    void testTinhThu_ThuHai() {
        Advance7 adv = new Advance7();
        int thu = adv.tinhThu(6, 4, 2020); // Thứ hai
        assertEquals(2, thu); // 2 = Thứ hai
    }

    @Test
    void testTinhThu_ThuBay() {
        Advance7 adv = new Advance7();
        int thu = adv.tinhThu(13, 4, 2024); // Thứ bảy
        assertEquals(7, thu); // 7 = Thứ bảy
    }

    @Test
    void testTinhThu_InvalidDate() {
        Advance7 adv = new Advance7();
        int thu = adv.tinhThu(31, 2, 2024); // Sai ngày
        assertEquals(0, thu); // Trả về 0 nếu sai
    }
}

