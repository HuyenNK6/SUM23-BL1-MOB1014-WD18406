/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_11_ql_sach;

/**
 *
 * @author Khanh Huyen
 */
public class SachGiaoKhoa extends Sach{
    private int lop;
    //ctrl cách 3 lần

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(int lop) {
        this.lop = lop;
    }

    public SachGiaoKhoa(int lop, String code, String ten, String theLoai, int namXuatBan, String nhaXuatBan, double gia) {
        super(code, ten, theLoai, namXuatBan, nhaXuatBan, gia);
        this.lop = lop;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("lop= "+ lop);
    }
    
}
