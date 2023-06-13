/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_11_ql_sach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class SachService {
    ArrayList<Sach> _lstSachs = new ArrayList<>();
    Sach _sach;
    Scanner _sc = new Scanner(System.in);
        public SachService() {
        _lstSachs.add(new Sach("S00001", "Hat giong tam hon", "Self-help", 2019,"NXB Kim dong", 90000));
        _lstSachs.add(new Sach("S00002", "Phan tich ky thuat", "Khoa hoc", 2021,"NXB Kim dong", 120000));
        _lstSachs.add(new Sach("S00003", "The Discoverers", "Khoa hoc", 2015,"NXB Kim dong", 150000));
        _lstSachs.add(new Sach("S00004", "Rua va tho", "Truyen", 2010,"NXB Kim dong", 50000));
        _lstSachs.add(new Sach("S00005", "Vu tru", "Khoa hoc", 2023,"NXB Kim dong", 80000));
        _lstSachs.add(new Sach("S00006", "Dac nhan tam", "Self-help", 2022,"NXB Kim dong", 100000));
    }
    public String kiemTraDauVao(String msg, String regex){
        String input;
        do {
            System.out.println("Moi nhap "+msg+": ");
            input= _sc.nextLine();
            if(!input.matches(regex)){
                System.out.println("Moi nhap lai!!!");
            }
        } while (!input.matches(regex));
        return input;
    }    
    public void nhapDS(){
        String tiepTuc;
        do {
            //1. khởi tạo đt
            _sach= new Sach();
            //2. nhập tt
            //code chỉ được là số và chữ, gồm chính xác 6 ký tự
            //-> nếu sai thì phải nhập lại
//            _sach.setCode(kiemTraDauVao("code", "^[a-zA-Z0-9]{6}$"));
//            _sach.setNamXuatBan(Integer.parseInt(kiemTraDauVao("nam xb", "^[0-9]{4}$")));
            
            System.out.println("Nhap code: ");
            _sach.setCode(_sc.nextLine());
            System.out.println("Nhap ten: ");
            _sach.setTen(_sc.nextLine());
            System.out.println("Nhap the loai: ");
            _sach.setTheLoai(_sc.nextLine());
            System.out.println("Nhap nam xuat ban: ");
            _sach.setNamXuatBan(Integer.parseInt(_sc.nextLine()));
            System.out.println("Nhap nha xuat ban: ");
            _sach.setNhaXuatBan(_sc.nextLine());
            System.out.println("Nhap gia: ");
            _sach.setGia(Double.parseDouble(_sc.nextLine()));
            //3. thêm đối tượng vào dsach
            _lstSachs.add(_sach);
            //4. hỏi tiếp tục
            System.out.println("Co tiep tuc ko? ");
            tiepTuc = _sc.nextLine();
        } while (tiepTuc.equals("co"));
    }
    public void xuatDS(){
        if(_lstSachs.isEmpty()){
            System.out.println("Danh sach trong!!");
            return;
        }
        for (Sach sach : _lstSachs) {
            sach.inThongTin();
        }
    }
    // 5. Tìm kiếm sách theo Code => equal # startwith S00001 # S00001111
    //10. Tìm tất cả Sách có thể loại (chính xác) là Sách khoa học => equal
    //11. Tìm tất cả Sách có tên gần đúng (tên chứa) được nhập từ bàn phím
    public void dsTheoTenGanDung(){
        System.out.println("Nhap ten can tim: ");
        String input= _sc.nextLine();
        int count=0;
        for (int i = 0; i < _lstSachs.size(); i++) {
            if(_lstSachs.get(i).getTen().contains(input)){
                _lstSachs.get(i).inThongTin();
                count++;
            }
        }
        if(count==0){
            System.out.println("Khong tim thay!!");
        }
    }
    //14. Tìm tất cả sách có mã bắt đầu bằng SGK =>  startwith
}
