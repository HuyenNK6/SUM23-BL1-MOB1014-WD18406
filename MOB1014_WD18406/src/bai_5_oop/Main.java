/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5_oop;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        //1. khai báo đối tượng
        SinhVien sv;
        //2. khởi tạo đối tượng
        sv = new SinhVien();
        //ctor không tham số
        SinhVien svPoly= new SinhVien();
        //ctor có tham số
        SinhVien svFPT = new SinhVien("PH12345", "Phuong", 2004, 9);
        
        //3. Gán giá trị cho thuộc tính
        svPoly.setMsv("PH45678");
        svPoly.setTen("Hoang");
        svPoly.setNamSinh(2002);
        svPoly.setDiem(8);
        
        //4. truy xuất 
        System.out.println("xin chao "+ svPoly.getTen());
        
        //5. gọi phương thức inThongTin()
        svFPT.inThongTin();
        svPoly.inThongTin();
        sv.inThongTin();
        ///////////////////////////////
        //nhập toàn bộ thông cho sv từ bàn phím
        SinhVien svNeu= new SinhVien();
        System.out.println("===========NHAP========");
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Nhap ma sv: ");
        svNeu.setMsv(sc.nextLine());
        System.out.println("Nhap ten sv: ");
        svNeu.setTen(sc.nextLine());
        System.out.println("Nhap nam sinh: ");
        svNeu.setNamSinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap diem: ");
        svNeu.setDiem(Double.parseDouble(sc.nextLine()));
        
        System.out.println("===========XUAT========");
        svNeu.inThongTin();
        
    }
   
}
/* BTVN
 * 
 * 1. Tạo class MayTinh gồm các thuộc tính
 * - ma: string
 * - hang: string
 * - namSX: int
 * - gia: double
 * - trangThai: int (1- mới, 2- cũ)
 * 2. Tạo class ConMeo gồm các thuộc tính
 * - id: int
 * - ten: string
 * - tuoi: int
 * - loai: string
 * - canNang: double
 * - gioiTinh: bool (true- đực, false- cái)
 * 
 * Đối với mỗi class, thực hiện các yêu cầu sau
 * => private tất cả thuộc tính, 
 * tạo constructor ko tham số và có tham số,
 * có đầy đủ Getter & Setter, tạo phương thức inThongTin()
 * => sang Main(): 
 * - tạo 2 đối tượng bằng ctor có tham số 
 * - tạo 1 đối tượng bằng ctor không tham số 
 * và nhập thông tin từ bàn phím cho đối tượng đó
 * - in toàn bộ thông tin ra màn hình bằng phương thức inThongTin()
 *
*/