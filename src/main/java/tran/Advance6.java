/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tran;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author TrMTu
 */
public class Advance6 {

    /*Tính số tuổi dựa vào ngày tháng năm sinh
* Nếu nhập dữ liệu sai sẽ trả về -1
* VD: 12/1/1999 -> 21, 12/5/1999 -> 20
     */
    public int tinhTuoi(int ngay, int thang, int nam) {
        
        LocalDate ngaySinh = LocalDate.of(nam, thang, ngay);
        LocalDate ngayHienTai = LocalDate.now();
        return Period.between(ngaySinh,
                ngayHienTai).getYears();
    }

}
