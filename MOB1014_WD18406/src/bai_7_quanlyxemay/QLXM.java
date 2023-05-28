/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7_quanlyxemay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLXM {
    //toàn cục
    //khởi tạo danh sách xe máy
    ArrayList<XeMay> lstXeMay= new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public void nhapDS(){
        //nhập danh sách đối tượng
        //sau khi nhập xong, hỏi có tiếp tục ko
        String tiepTuc;
        do {
            //1. khởi tạo đối tượng
            XeMay xm = new XeMay();
            //2. nhập thông tin đối tượng
            System.out.println("Nhap id= ");
            xm.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap hang= ");
            xm.setHang(sc.nextLine());
            System.out.println("Nhap phan khoi= ");
            xm.setPhanKhoi(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap xuat xu= ");
            xm.setXuatXu(sc.nextLine());
            System.out.println("Nhap nam sx= ");
            xm.setNamSX(Integer.parseInt(sc.nextLine()));
            //3. thêm đối tượng vào danh sách
            lstXeMay.add(xm);
            //4. hỏi tiếp tục ko?
            System.out.println("Co muon tiep tuc ko (co/ko)? ");
            tiepTuc= sc.nextLine();
        } while (tiepTuc.equals("co"));
        //equals: dùng để so sánh 2 chuỗi vs nhau
        //so sánh có phân biệt chữ hoa chữ thường
    }
    public void xuatDS(){
        //fore tab
        for (XeMay xeMay : lstXeMay) {
            xeMay.inThongTin();
        }
    }
}
