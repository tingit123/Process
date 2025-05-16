package Do;

import java.util.Calendar;

public class Advance7 {
    // Tính thứ dựa vào ngày tháng năm, sai thì trả về 0
    public int tinhThu(int ngay, int thang, int nam) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setLenient(false); // kiểm tra dữ liệu đầu vào hợp lệ
            cal.set(nam, thang - 1, ngay);
            return cal.get(Calendar.DAY_OF_WEEK);
        } catch (Exception e) {
            return 0;
        }
    }
}

