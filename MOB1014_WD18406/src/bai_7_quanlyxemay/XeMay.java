/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_7_quanlyxemay;

/**
 *
 * @author Khanh Huyen
 */
public class XeMay {
    //1. thuộc tính
    private int id;
    private String hang;
    private int phanKhoi;
    private String xuatXu;
    private int namSX;
    //2. constructor

    public XeMay() {
    }

    public XeMay(int id, String hang, int phanKhoi, String xuatXu, int namSX) {
        this.id = id;
        this.hang = hang;
        this.phanKhoi = phanKhoi;
        this.xuatXu = xuatXu;
        this.namSX = namSX;
    }
    //3. getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(int phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    //4. inThongTin()

    @Override
    public String toString() {
        return "XeMay{" + "id=" + id + ", hang=" + hang + ", phanKhoi=" + phanKhoi + ", xuatXu=" + xuatXu + ", namSX=" + namSX + '}';
    }
    
    public void inThongTin(){
        System.out.println("XeMay{" + "id=" + id + ", hang=" + hang + ", phanKhoi=" + phanKhoi + ", xuatXu=" + xuatXu + ", namSX=" + namSX + '}');
    }
}
