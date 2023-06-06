/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_9_ke_thua;

/**
 *
 * @author Khanh Huyen
 */
public class Main {

    public static void main(String[] args) {
        //tạo đối tượng -> ctor có tham số
        GiangVien gv = new GiangVien("Huyennk6", 7, "Huyen", 2004, 1);
        gv.inThongTin();
        //tạo đối tượng -> ctor ko tham số
        GiangVien gvFpt= new GiangVien();
        gvFpt.setAccount("DungNA29");
        gvFpt.setLuong(10);
        gvFpt.setTen("Dung");
        gvFpt.setNamSinh(2000);
        gvFpt.setGioiTinh(0);
        gv.inThongTin();
       
    }
}
