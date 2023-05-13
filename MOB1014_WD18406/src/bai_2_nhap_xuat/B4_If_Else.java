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
public class B4_If_Else {

    /*
	* 1. CẤU TRÚC IF
	*	if (điều kiện){
	*		//thực hiện công việc
	*	}
	* 2. CẤU TRÚC IF-ELSE
	*	if (điều kiện){
	*		//thực hiện công việc 1
	*	}else{
	*		//thực hiện công việc 2
	*	}
	* 3. CẤU TRÚC IF-ELSE IF
	*	if (điều kiện 1){
	*		//thực hiện công việc 1
	*	}else if(điều kiện 2){
	*		//thực hiện công việc 2
	*	}else if(điều kiện 3){
	*		//thực hiện công việc 3
	*	}else{
	* 		//thực hiện công việc n
	*	}
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien ban co: ");
        int money = Integer.parseInt(sc.nextLine());

        //>= 15: roll royce
        //10-15: may bach
        //5-10: G63
        //còn lại: audi
        if (money >= 15) {
            System.out.println("Mua roll royce");
        } else if (money >= 10) {
            System.out.println("Mua may bach");
        } else if (money >= 5) {
            System.out.println("Mua G63");
        }else{
            System.out.println("Mua audi");
        }
    }
}
/* 
 * Nhập xuất thông tin của Con Chó
 * - id : int
 * - tên: string
 * - cân nặng: double
 * - loài: string
 * - giới tính: int (1- đực/2- cái)
 * Đánh giá cân nặng:
 * nếu cân nặng >= 20 => béo phì
 * nếu cân nặng 10-20 => chó đẹp dáng xinh
 * nếu cân nặng 5-10 => cần tăng cân
 * còn lại => suy dinh dưỡng
*/
