/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tran;
import java.time.*;
import java.util.Calendar;
/**
 *
 * @author TrMTu
 */
public class Advance7 {

    /*Tính thứ dựa vào ngày tháng năm
* Nếu nhập dữ liệu sai sẽ trả về 0
* VD: 5/4/2020 -> 1 (CN), 6/4/2020 -> 2 (T2)...
     */
    public int tinhThu(int ngay, int thang, int nam) {
        
        Calendar cal = Calendar.getInstance();
        cal.set(nam, thang - 1, ngay);
        return cal.get(Calendar.DAY_OF_WEEK);

    }
}
