/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_11_ql_sach;

import java.util.Scanner;

/**
 *
 * @author Khanh Huyen
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        SachService service = new SachService();
        int chon;
        System.out.println("1. Nhập 1 đối tượng hoặc danh sách đối tượng\n"
                + "                        2. Xuất danh sách đối tượng\n"
                + "                        3. Xuất danh sách Sách có giá trong khoảng người dùng nhập\n"
                + "                        4. Sắp xếp giảm dần theo năm xuất bản\n"
                + "                        5. Tìm kiếm sách theo Code\n"
                + "                        6. Xóa Sách theo code\n"
                + "                        7. Sắp xếp tăng dần theo tên\n"
                + "                        8. Sắp xếp giảm dần theo giá\n"
                + "                        9. Xuất danh sách các Sach được xuất bản sau năm 2000\n"
                + "                        10. Tìm tất cả Sách có thể loại là Sách khoa học\n"
                + "                        11. Tìm tất cả Sách có tên gần đúng (tên chứa) được nhập từ bàn phím\n"
                + "                        12. Xuất thông tin của Sách có giá lớn nhất và bé nhất\n"
                + "                        13. Đếm xem có tất cả bao nhiêu Sách có giá ngoài khoảng người dùng nhập\n"
                + "                        14. Tìm tất cả sách có mã bắt đầu bằng SGK \n"
                + "                        0.Thoát ");
        do {
            System.out.println("======================");
            System.out.println("Moi chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    service.nhapDS();
                    break;
                case 2:
                    service.xuatDS();
                    break;
                case 11:
                    service.dsTheoTenGanDung();
                    break;
                case 15:
                    service.keThua();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi nhap lai!!!!");
            }
        } while (chon != 0);
    }
}
