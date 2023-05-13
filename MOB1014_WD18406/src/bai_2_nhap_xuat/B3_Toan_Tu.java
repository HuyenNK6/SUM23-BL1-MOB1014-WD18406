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
public class B3_Toan_Tu {
    /*
         * 4 Loại toán tử trong lập trình
         *  1. Toán tử số học:
         *  (+ - * / % ++ --)
         *      +: Tính tổng của 2 số hoặc dùng để cộng chuỗi
         *      -: Phép trừ của 2 số
         *      *: Phép nhân của 2 số
         *      /: Phép chia lấy nguyên của 2 số
         *      %: Phép chia lấy dư của 2 số
         *      ++: Tăng lên 1 đơn vị
         *      --: Giảm 1 đơn vị
         *  2. Toán tử so sánh:
         *  (> < >= <= == !=)
         *      >: Lớn hơn
         *      <: nhỏ hơn
         *      >=: lớn hơn hoặc bằng
         *      <=: nhỏ hơn hoặc bằng
         *      ==: so sánh bằng
         *      !=: so sánh khác
         *  3. Toán tử Logic:
         * (&& || !)
         *      &&: Yêu cầu các mệnh đề phải luôn đúng
         *      ||: Yêu cầu 1 trong các mệnh đề dúng là được
         *      !: Lấy giá trị phủ định của mệnh đề.
         *  4. Toán tử gán:
         * (= += -= *= /= %=)
         *      +=: Cộng tiếp với vế bên phải các phép còn lại tương tự
         */

        /*
         * Toán tử ba ngôi
         *  (<biểu thức> ? <kết quả đúng> : <kết quả sai>)
         */
    public static void main(String[] args) {
        /* Nhập xuất thông tin của Điện thoại
             * - mã đt: string
             * - tên: string
             * - giá: double
             * - dung lượng: int
             * - trangThai: boolean (true/false)
             *  => in ra: true- máy mới/ false - máy cũ
             */
        Scanner sc= new Scanner(System.in);
        System.out.println("======NHAP========");
        System.out.println("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten= sc.nextLine();
        System.out.println("Nhap gia: ");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap dung luong: ");
        int dungLuong = Integer.parseInt(sc.nextLine());
       // int dungLuong = sc.nextInt();
        System.out.println("Nhap trang thai (true/false): ");
        boolean trangThai= Boolean.parseBoolean(sc.nextLine());
        
        System.out.println("======XUAT========");
        System.out.println("Ma: "+ ma);
        System.out.println("Ten: "+ ten);
        System.out.println("Gia: "+ gia);
        System.out.println("Dung luong: "+ dungLuong);
        System.out.println("Trang thai: "+ trangThai);
        //trangThai? => trangThai == true ?
        System.out.println("Trang thai: "+ (trangThai ? "May moi": "May cu"));
        //trangThai? => trangThai == false ?
        System.out.println("Trang thai: "+ (!trangThai ? "May cu": "May moi"));
        String status= (!trangThai ? "May cu": "May moi");
        System.out.println("Trang thai: "+ status );
    }
}
