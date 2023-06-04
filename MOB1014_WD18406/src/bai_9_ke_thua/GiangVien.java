/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_9_ke_thua;

/**
 *
 * @author Khanh Huyen
 */
//LỚP CHA: Người 
//LỚP CON: GV 
//Con có thể kế thừa lại tất cả thuộc tính và phương thức của Cha
//trừ constructor
public class GiangVien extends Nguoi{
    //thuộc tính riêng
    private String account;
    private double luong;
    //ctrl cách x3 lần

    public GiangVien() {
    }

    public GiangVien(String account, double luong) {
        this.account = account;
        this.luong = luong;
    }

    //this: biến tham chiếu tới đối tượng của lớp hiện tại
    //super: biến tham chiếu tới đối tượng của lớp cha
    public GiangVien(String account, double luong, String ten, int namSinh, int gioiTinh) {
        super(ten, namSinh, gioiTinh);
        this.account = account;
        this.luong = luong;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    //kế thừa phương thức inThongTin()
    //override: ghi đè phương thức
    //click chuột phải -> Insert Code -> Override Method -> tích chọn inThongTin()

    @Override
    public String toString() {
        return "GiangVien{" + "account=" + account + ", luong=" + luong + '}';
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("GiangVien{" + "account=" + account + ", luong=" + luong + '}');
    }
    
}
