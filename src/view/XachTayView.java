package view;

import entity.DienThoaiChinhHang;
import entity.DienThoaiXachTay;

import java.util.Scanner;

public class XachTayView {
    public static DienThoaiXachTay inputXachTay() {
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
        System.out.print("Nhập quốc gia xách tay: ");
        String quocgia = sc.nextLine();
        System.out.print("Nhập trạng thái: ");
        String trangthai = sc.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, tendienthoai, giaban, soluong, nhasanxuat, quocgia, trangthai);
        return dienThoaiXachTay;
    }
}
