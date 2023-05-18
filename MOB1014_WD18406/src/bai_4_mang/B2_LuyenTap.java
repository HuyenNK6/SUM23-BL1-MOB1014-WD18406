/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4_mang;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B2_LuyenTap {

    public static void main(String[] args) {
        /* Nhập tòa học của các bạn: string/char
             * - nhập tầng học: int
             * - nhập số lượng phòng học tại tầng học đó: int
             * =>  tạo 1 mảng phòng học tại tầng học đó
             * - nhập số lượng sinh viên trong từng phòng học
             * - xuất toàn bộ mảng
             * - sắp xếp tăng dần mảng
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa hoc: ");
        String toa = sc.nextLine();
        System.out.println("Nhap tang hoc: ");
        int tang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so luong phong hoc tai tang " + tang + " toa " + toa + ": ");
        int soPhong = Integer.parseInt(sc.nextLine());

        int[] arrPhong = new int[soPhong];
        System.out.println("========NHAP MANG========");
        for (int i = 0; i < arrPhong.length; i++) {
            System.out.print("Nhap SV tai phong "+toa+tang+"0"+(i+1)+"= ");
            arrPhong[i]= Integer.parseInt(sc.nextLine());
        }
        System.out.println("========XUAT MANG========");
        for (int i = 0; i < arrPhong.length; i++) {
            System.out.println("SV tai phong "+toa+tang+"0"+(i+1)+"= "+ arrPhong[i]);
        }
    }

}
/* BTVN
 * +-------- Thông tin Ti Vi cửa hàng -------+
	- Mời nhập số lượng ti vi : 
	- Nhập mảng kích cỡ cho từng ti vi : ….
   +------  Xuất thông tin Ti Vi ------ +
	- Số lượng ti vi là :  …… 
	- Kích cỡ trung bình tivi :……  
	- Vị trí Ti vi có kích cỡ lớn nhất là : ….. 
        - Số lượng Ti vi có kích thước là số chẵn là: 
        - Mảng kích cỡ Ti Vi theo thứ tự tăng dần là: 
 */
