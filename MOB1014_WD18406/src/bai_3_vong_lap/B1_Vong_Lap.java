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
public class B1_Vong_Lap {

    /*
       * Bài Vòng lặp:
       *
       * Định nghĩa chung cho tất cả vòng lặp:
       * Vòng lặp cho phép lặp lại một hoặc nhiều câu lệnh cho đến khi thỏa mãn điều kiện được chỉ định định.
       *
       * Các loại vòng lặp: while, do..while, for, foreach
       *
       * Từ khóa sử dụng trong vòng lặp:
       *
       * break - ngắt vòng lặp
       * continue: Sẽ bỏ qua các đoạn code phía sau nó và nó quay trở lại lần lặp tiếp theo.
       *
       * Vòng lặp while: Chỉ chạy khi điều kiện luôn đúng và nếu điều kiện luôn đúng ko điểm dừng thì được gọi là vòng lặp vô hạn.
       * + Cách dùng: wh + tab
       *
       * + Công thức:
       *  while (true)
          {
              //Thực thi 1 câu lệnh hoặc nhiều câu lệnh
          }
          Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
         Cách gõ: do + tab

       Công thức:
         do {
                    //Thực hiện hành động ít nhất là 1 lần.
         } while (true);
     */
    //main tab
    public static void main(String[] args) {
        //PHẦN 1: FOR
        //for(khởi tạo; điều kiện; bước nhảy)
        //for tab
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Yeu em!!!!!!");
                //break;//thoát khỏi vòng lặp
                //return;//thoát luôn khỏi main
                continue; //bỏ qua phần code sau
                //nhảy tiếp sang vòng lặp sau
            }
            System.out.println(i + ". Xin nhoi em!!!");
        }
        System.out.println("Thuong em!!!");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //PHẦN 2: WHILE
        //wh tab
        int n = 0;
        while (n < 20) {
            System.out.println(n+" co Huyen hien nhat BM");
            n++;
        }
        //PHẦN 3: DO-WHILE
        //do tab
        //yêu cầu nhập tuổi từ 18-30 tuổi
        Scanner sc= new Scanner(System.in);
        int tuoi;
        do {
            System.out.println("Nhap tuoi: ");
            tuoi = Integer.parseInt(sc.nextLine());
            if(tuoi >=18 && tuoi <=30){
                System.out.println("Lay nhanh keo e!!!");
                break;
                //return;
            }
             System.out.println("Moi ban nhap lai tuoi 18-30");
        } while (tuoi < 18 || tuoi > 30);
       
        //nếu ngoài khoảng 18-30 => yêu cầu nhập lại

    }
}
