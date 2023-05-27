/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_6_arraylist;

/**
 *
 * @author Khanh Huyen
 */
public class TiVi {

    //1. thuộc tính
    private int id;
    private String hang;
    private double gia;
    private int namSX;

    //2. constructor
    public TiVi() {
    }

    public TiVi(int id, String hang, double gia, int namSX) {
        this.id = id;
        this.hang = hang;
        this.gia = gia;
        this.namSX = namSX;
    }

    //3. Getter & setter
    

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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    
    //4. inThongTin()

//    @Override
//    public String toString() {
//        return "TiVi{" + "id=" + id + ", hang=" + hang + ", gia=" + gia + ", namSX=" + namSX + '}';
//    }

    public void inThongTin(){
        System.out.println("TiVi{" + "id=" + id + ", hang=" + hang + ", gia=" + gia + ", namSX=" + namSX + '}');
    }
}
