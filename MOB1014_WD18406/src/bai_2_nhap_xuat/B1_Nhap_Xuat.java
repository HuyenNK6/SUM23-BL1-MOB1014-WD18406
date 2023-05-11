/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2_nhap_xuat;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B1_Nhap_Xuat {
    public static void main(String[] args) {
        //khởi tạo đối tượng sc từ lớp Scanner
        //lớp Scanner: hỗ trợ các thao tác liên quan
        //đến việc nhập xuất dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========NHAP========");
        System.out.println("Nhap ten: ");
        //sc.nextLine(): đọc 1 dòng dữ liệu từ bàn phím
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        //cách 1:
        int tuoi = sc.nextInt(); //xảy ra tình trạng trôi lệnh
        sc.nextLine(); //scan hết phần thừa còn lại là \n
        //cách 2: sử dụng cách 2 nhiều
        System.out.println("Nhap tuoi 2: ");
        int tuoi2= Integer.parseInt(sc.nextLine());
        System.out.println("========XUAT========");
        System.out.println("Ten: "+ ten);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Tuoi: "+ tuoi2);
    }
}
/* BTVN:
nhập và xuất thông tin về Trà sữa NYC thích:
- hãng TS: string
- vị: string
- topping: string
- giá: int
- số lượng: int
- size: char (S, M, L)

*/