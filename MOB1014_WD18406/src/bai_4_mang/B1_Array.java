/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4_mang;

import java.util.Arrays;

/**
 *
 * @author Khanh Huyen
 */
public class B1_Array {
    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
    //main tab
    public static void main(String[] args) {
        //1. Khai báo mảng
        int arrSo[];
        int[] arrSo2;
        //2. Khởi tạo mảng
        //mảng số nguyên gồm 4 phần tử
        arrSo = new int[]{10,8,24,5};
        //mảng điểm gồm 5 phần tử
        double[] arrDiem = new double[]{9.2, 8, 10,7.4,5};
        //mảng string có độ dài = 5
        String[] arrTen= new String[5];
        //sout tab
        System.out.println("length= "+ arrTen.length);
        //3. Gán giá trị cho arrTen
        //index từ 0 đến n-1
        arrTen[0]= "Hoa";
        arrTen[1]= "Dao";
        arrTen[2]= "Man";
        arrTen[3]= "Hue";
        arrTen[4]= "Hong";
        //arrTen[5]= "Tra"; => LỖI
        //4. Truy xuất phần tử
        System.out.println("arrDiem[1]= "+ arrDiem[1]);
        //5. Duyệt mảng
        //cách 1: for i => for tab
        for (int i = 0; i < arrTen.length; i++) {
            System.out.println("arrTen["+(i+1)+"]= "+ arrTen[i]);
        }
        
        //cách 2: foreach
        //fore tab
        for (String ten : arrTen) {
            System.out.println(ten);
        }
        //6. Thao tác mảng
        //{10,8,24,5};
        System.out.println("Sort: sap xep tang dan");
        Arrays.sort(arrSo);
        //fore tab
        for (int i : arrSo) {
            System.out.println(i);
        }
        //reverse => học ở ArrayList
        System.out.println("Thuat toan tim kiem");
        //{9.2, 8, 10, 7.4, 5};
        //index = 0   1   2   3    4
        //value = 5  7.4  8  9.2   10
        Arrays.sort(arrDiem);
        int viTri= Arrays.binarySearch(arrDiem, 7.4);
        System.out.println("vi tri= "+ viTri);
    }
}
