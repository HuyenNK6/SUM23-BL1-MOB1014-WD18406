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
public class B2_BTVN {
    public static void main(String[] args) {
        /* BTVN:
nhập và xuất thông tin về Trà sữa NYC thích:
- hãng TS: string
- vị: string
- topping: string
- giá: int/float
- số lượng: int
- size: char (S, M, L)

*/
        Scanner sc= new Scanner (System.in);
        System.out.println("=======NHAP=========");
        System.out.println("Nhap hang TS: ");
        String hang = sc.nextLine();
        System.out.println("Nhap vi: ");
        String vi = sc.nextLine();
        System.out.println("Nhap topping: ");
        String topping= sc.nextLine();
        System.out.println("Nhap gia: ");
        //int gia = Integer.parseInt(sc.nextLine());
        float gia= Float.parseFloat(sc.nextLine());
        System.out.println("Nhap so luong: ");
        int soLuong= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap size (S-M-L): ");
        char size= sc.nextLine().charAt(0);
        //charAt(index): lấy ký tự tại vị trí index
        System.out.println("=======XUAT=========");
        System.out.println("Hang: "+ hang);
        System.out.println("vi: "+ vi);
        System.out.println("topping: "+ topping);
        System.out.println("gia: "+ gia);
        System.out.println("so luong: "+ soLuong);
        System.out.println("size: "+ size);
    }
}
