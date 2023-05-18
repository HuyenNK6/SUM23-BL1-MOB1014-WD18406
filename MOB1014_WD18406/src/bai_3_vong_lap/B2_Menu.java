/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3_vong_lap;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class B2_Menu {
    public static void main(String[] args) {
        
        menu();
        System.out.println("To be continue....");
    }
    public static void menu(){
        Scanner sc= new Scanner(System.in);
        int chon;
        do {
            System.out.println("----------MENU---------");
            System.out.println("1. Bun dau mam tom");
            System.out.println("2. Goi ga mang cut");
            System.out.println("3. Tra mang cau");
            System.out.println("4. My tom");
            System.out.println("0. Thoat CT");
            System.out.println("---------------------");
            System.out.println("Moi chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            //sw tab
            switch (chon) {
                case 1:
                    System.out.println("1. Bun dau mam tom");
                    //break;
                case 2:
                    System.out.println("2. Goi ga mang cut");
                    break;
                case 3:
                    System.out.println("3. Tra mang cau");
                    break;
                case 4:
                    System.out.println("4. My tom");
                    break;
                case 0:
                    System.out.println("0. Thoat CT");
                    System.exit(0);
                    //break;
                default:
                    System.out.println("Moi nhap lai!!!!!");
            }
        } while (chon!=0);
    }
    
    public static void checkNgayTrongThang(){
        //nhập tháng => in ra số ngày trong tháng
        //áp dụng switch- case
        //xem lại điều kiện năm nhuận
        
    }
    //nếu quan tâm:
    //nhập ngày tháng năm hiện tại
    //sau đó in ra ngày hôm trước và ngày sau
}
