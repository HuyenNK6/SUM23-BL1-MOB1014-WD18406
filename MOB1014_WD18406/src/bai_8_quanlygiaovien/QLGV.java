/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_8_quanlygiaovien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class QLGV {
    ArrayList<GiaoVien> _lstGV = new ArrayList<>();
    GiaoVien _gv;
    Scanner _sc= new Scanner(System.in);
    //fake data -> ko có điểm -> hỗ trợ 
    //ctrl cách enter

    public QLGV() {
        _lstGV.add(new GiaoVien(1, "Dung", 40));
        _lstGV.add(new GiaoVien(2, "Khanh", 32));
        _lstGV.add(new GiaoVien(3, "Tien", 18));
        _lstGV.add(new GiaoVien(4, "Phong", 36));
        _lstGV.add(new GiaoVien(5, "Linh", 45));
    }
    
    public void nhapDS(){
        String tiepTuc;
        do {
            _gv= new GiaoVien();
            System.out.println("Nhap id= ");
            _gv.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap ten= ");
            _gv.setTen(_sc.nextLine());
            System.out.println("Nhap so gio day= ");
            _gv.setSoGioDay(Double.parseDouble(_sc.nextLine()));
            _lstGV.add(_gv);
            System.out.println("Co tiep tuc k? (co/ko) ");
            tiepTuc= _sc.nextLine();
        } while (tiepTuc.equals("co"));
    }
    
    public void xuatDS(){
        if(_lstGV.isEmpty()){
            System.out.println("Danh sach trong!!!");
            return;
        }
        for (GiaoVien giaoVien : _lstGV) {
            giaoVien.inThongTin();
        }
    }
    
    public void timKiemTheoID(){
        System.out.println("Nhap id can tim: ");
        int id= Integer.parseInt(_sc.nextLine());
        //foreach đều được
        for (int i = 0; i < _lstGV.size(); i++) {
            //_lstGV.get(i): lấy ra ĐỐI TƯỢNG GV tại vị trí i
            if(_lstGV.get(i).getId() == id){
                _lstGV.get(i).inThongTin();//có 1 kết quả-> unique
                return;
            }
        }
        System.out.println("Khong tim thay!!!!");
    }
    
    public void timKiemTheoKhoang(){
        //khoảng số giờ dạy do ng dùng nhập -> min - max
        System.out.println("Nhap so gio day min: ");
        double min = Double.parseDouble(_sc.nextLine());
        System.out.println("Nhap so gio day max: ");
        double max = Double.parseDouble(_sc.nextLine());
        int count= 0;
        for (int i = 0; i < _lstGV.size(); i++) {
            if(_lstGV.get(i).getSoGioDay() >= min &&
                    _lstGV.get(i).getSoGioDay() <= max){
                _lstGV.get(i).inThongTin(); //nhiều kết quả
                count++;
            }
        }
        if(count==0){
            System.out.println("Khong tim thay!!");
        }else{//nếu: đếm tất cả GV có số giờ dạy nằm trong khoảng từ min-max
            System.out.println("So luong GV co so gio day thoa man: "+ count);
        }
    }
    
    public void suaThongTin(){
        System.out.println("Nhap id can sua: ");
        int id= Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstGV.size(); i++) {
            if(_lstGV.get(i).getId() == id){
                //trước khi sửa
                _lstGV.get(i).inThongTin();
                //sửa số giờ dạy
                System.out.println("Nhap so gio day moi: ");
                double gioMoi= Double.parseDouble(_sc.nextLine());
                _lstGV.get(i).setSoGioDay(gioMoi);
                //sau khi sửa
                System.out.println("Da sua thanh cong!!!");
                 _lstGV.get(i).inThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay!!!!");
    }
    
    public void xoaTheoID(){
        System.out.println("Nhap id can xoa: ");
        int id= Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < _lstGV.size(); i++) {
            if(_lstGV.get(i).getId() == id){
                _lstGV.get(i).inThongTin();
                _lstGV.remove(i); //xóa đối tượng GV tại vị trí i
                System.out.println("Da xoa thanh cong!!!");
                return;
            }
        }
        System.out.println("Khong tim thay!!!!");
    }
    
    public void sapXep(){
        //import java.util.Collections;
        //Collections.sort(_lstGV);
        System.out.println("-----Sap xep-------");
        //Collections.sort(_lstGV, (a,b) -> (int)( a.getSoGioDay() - b.getSoGioDay()));
        
        Collections.sort(_lstGV, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
               //return -Double.compare(o1.getSoGioDay(), o2.getSoGioDay());
               //return -Integer.compare(o1.getId(), o2.getId());
               return o1.getTen().compareTo(o2.getTen());
            }
        });
        xuatDS();//gọi lại xuất danh sách
    }
}
