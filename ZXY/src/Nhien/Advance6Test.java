package Nhien;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Do.Advance6;

import java.time.LocalDate;

public class Advance6Test {

    @Test
    void testTinhTuoi_HopLe() {
        Advance6 adv = new Advance6();
        int namHienTai = LocalDate.now().getYear();
        int tuoi = adv.tinhTuoi(1, 1, namHienTai - 20); // sinh năm cách đây 20 năm
        assertEquals(20, tuoi);
    }

    @Test
    void testTinhTuoi_SaiNgay() {
        Advance6 adv = new Advance6();
        int tuoi = adv.tinhTuoi(31, 2, 2000); // tháng 2 không có 31
        assertEquals(-1, tuoi);
    }

    @Test
    void testTinhTuoi_SaiThang() {
        Advance6 adv = new Advance6();
        int tuoi = adv.tinhTuoi(1, 13, 2000); // không có tháng 13
        assertEquals(-1, tuoi);
    }

    @Test
    void testTinhTuoi_NgayTuongLai() {
        Advance6 adv = new Advance6();
        int tuoi = adv.tinhTuoi(1, 1, LocalDate.now().getYear() + 1); // năm sinh tương lai
        assertEquals(-1, tuoi);
    }
}

