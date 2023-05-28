/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7_quanlyxemay;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc= new Scanner(System.in);
        
        QLXM ql= new QLXM();
        int chon;
        do {
            System.out.println("-------MENU-----");
            System.out.println("1. Nhap DS");
            System.out.println("2. Xuat DS");
            System.out.println("0. Thoat CT");
            System.out.println("-----------------");
            System.out.println("--Moi chon: ");
            chon = Integer.parseInt(sc.nextLine());
            //sw tab
            switch (chon) {
                case 1:
                    ql.nhapDS();
                    break;
                case 2:
                    ql.xuatDS();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi nhap lai!!!!!");
            }
        } while (chon!=0);
    }
}
