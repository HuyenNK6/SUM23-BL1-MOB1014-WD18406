/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TiVi tv1 = new TiVi(11, "Samsung", 15, 2020);
        TiVi tv2 = new TiVi(12, "Panasoni", 15, 2020);
        TiVi tv3 = new TiVi(13, "Samsung", 15, 2020);
        TiVi tv4 = new TiVi(14, "Panasoni", 15, 2020);
        TiVi tv5 = new TiVi(15, "Samsung", 15, 2020);

        TiVi tv = new TiVi();
        //nhập thông tin từ bàn phím cho tv
        //.......
        
        //1. khởi tạo danh sách tivi
        ArrayList<TiVi> lstTivi= new ArrayList<>();
        //2. thêm tivi vào trong danh sách
        lstTivi.add(tv);
        lstTivi.add(tv1);
        lstTivi.add(tv2);
        lstTivi.add(tv3);
        lstTivi.add(tv4);
        lstTivi.add(tv5);
        //3. duyệt
        //cách 1: for tab
        //lstTivi.get(i): là đối tượng tivi tại vị trí i
        for (int i = 0; i < lstTivi.size(); i++) {
            //System.out.println(lstTivi.get(i));
            lstTivi.get(i).inThongTin();
        }
        //cách 2: fore tab
        for (TiVi tiVi : lstTivi) {
            tiVi.inThongTin();
        }
    }
}
/*BTVN
 * P1. Tạo class DieuHoa gồm các thuộc tính
 * - id: int
 * - hang: string
 * - congSuat: int
 * - gia: double
 * - xuatXu: string
 * => private tất cả thuộc tính, 
 * tạo constructor ko tham số và có tham số,
 * có đầy đủ Getter & Setter, tạo phương thức inThongTin()
 * 
 * tạo phương thức kiemTra(): boolean 
 * => kiểm tra nếu gia > 20,000,000 và công suất >=3000 trả về đúng, và ngược lại
 * 
 * bổ sung vào thêm phương thức inThongTin():
 * in ra "Hàng Chất Lượng Cao"
 * nếu kiemTra() trả về kết quả đúng

 * P2.
 * - tạo 4 đối tượng bằng ctor có tham số
 * - tạo 1 đối tượng bằng ctor không tham số -> nhập thông tin từ bàn phím
 * - tạo ArrayList<DieuHoa> chứa tất cả 5 đối tượng trên
 * - sau đó in thông tin ra màn hình 
 */