/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5_oop;

/**
 *
 * @author Khanh Huyen
 */
public class SinhVien {
    //LỚP: SinhVien 
    //1. thuộc tính
    //phải private tất cả thuộc tính
    private String msv;
    private String ten;
    private int namSinh;
    private double diem;
    
    //2. constructor - hàm tạo -> tạo đối tượng
    //Cách 1: ctrl + cách + enter (x2)
    //Cách 2: click chuột phải -> Insert code ->Constructor
    // - bỏ trống -> generate
    // - select all  -> generate
    //2.1 constructor không tham số
    public SinhVien() {
        System.out.println("Day la Sinh Vien");
        namSinh = 2005;//set giá trị mặc định
    }
    //2.2 constructor có tham số
    //this: biến tham chiếu tới đối tượng của lớp hiện tại
    public SinhVien(String msv, String ten, int namSinh, double diem) {
        this.msv = msv;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diem = diem;
    }
    
    //3. Getter and Setter
    //Click chuột phải -> Insert code -> Getter and Setter
    //select all -> generate

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
        
    //4. Phương thức inThongTin()
    //Click chuột phải -> Insert code -> toString()
    //select all -> generate

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", ten=" + ten + ", namSinh=" + namSinh + ", diem=" + diem + '}';
    }
    public void inThongTin(){
        //System.out.println(toString());
        System.out.println("SinhVien{" 
                + "msv=" + msv 
                + ", ten=" + ten 
                + ", tuoi=" + (2023- namSinh)
                + ", diem=" + diem + '}');
    }
    
}
