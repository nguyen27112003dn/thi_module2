package view;

import entity.DienThoaiChinhHang;

import repository.ChinhHangRepository;

import java.util.List;
import java.util.Scanner;

import static view.Main.sc;


public class ChinhHangView {
    public static DienThoaiChinhHang inputChinhHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên điện thoại: ");
        String tendienthoai = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        double giaban = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập nhà sản xuất: ");
        String nhasanxuat = sc.nextLine();
        System.out.print("Nhập thời gian bảo hành: ");
        String thoigian = sc.nextLine();
        System.out.print("Nhập phạm vi bảo hành: ");
        String phamvi = sc.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, tendienthoai, giaban, soluong, nhasanxuat, thoigian, phamvi);
        return dienThoaiChinhHang;
    }

    public static void printPhoneTable(List<DienThoaiChinhHang> dienThoaiChinhHangs) {
        System.out.println("+------+----------------------+----------------------+----------------------+------------+-------------------+-------------------+");
        System.out.printf("| %-4s | %-20s | %-20s | %-20s | %-10s | %-15s | %-15s |\n",
                "ID", "Title", "Price", "Quantity", "Manufacturer", "Warranty Date", "Warranty Scope");
        System.out.println("+------+----------------------+----------------------+----------------------+------------+-------------------+-------------------+");
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangs) {
            System.out.printf("| %-4s | %-20s | %-20.2f | %-20d | %-10s | %-15s | %-15s |\n",
                    dienThoaiChinhHang.getID(),
                    dienThoaiChinhHang.getTenDienThoai(),
                    dienThoaiChinhHang.getGiaBan(),
                    dienThoaiChinhHang.getSoLuong(),
                    dienThoaiChinhHang.getNhaSanXuat(),
                    dienThoaiChinhHang.getThoiGianBaoHanh(),
                    dienThoaiChinhHang.getPhamViBaoHanh());
        }
        System.out.println("+------+----------------------+----------------------+----------------------+------------+-------------------+-------------------+");
    }

    public static void printSearchPhoneTable(List<DienThoaiChinhHang> dienThoaiChinhHangs) {
        System.out.println("+------+----------------------+----------------------+----------------------+------------+-------------------+-------------------+");
        System.out.printf("| %-4s | %-20s | %-20s | %-20s | %-10s | %-15s | %-15s |\n",
                "ID", "Title", "Price", "Quantity", "Manufacturer", "Warranty Date", "Warranty Scope");
        System.out.println("+------+----------------------+----------------------+----------------------+------------+-------------------+-------------------+");
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangs) {
            System.out.printf("| %-4s | %-20s | %-20.2f | %-20d | %-10s | %-15s | %-15s |\n",
                    dienThoaiChinhHang.getID(),
                    dienThoaiChinhHang.getTenDienThoai(),
                    dienThoaiChinhHang.getGiaBan(),
                    dienThoaiChinhHang.getSoLuong(),
                    dienThoaiChinhHang.getNhaSanXuat(),
                    dienThoaiChinhHang.getThoiGianBaoHanh(),
                    dienThoaiChinhHang.getPhamViBaoHanh());
        }
        System.out.println("+------+----------------------+----------------------+----------------------+------------+-------------------+-------------------+");
    }
}
