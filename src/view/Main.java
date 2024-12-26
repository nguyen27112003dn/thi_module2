package view;

import controller.ChinhHangController;
import controller.XachTayController;
import entity.DienThoaiChinhHang;
import entity.DienThoaiXachTay;
import repository.ChinhHangRepository;

import java.util.List;
import java.util.Scanner;

import static view.ChinhHangView.*;
import static view.XachTayView.inputXachTay;

public class Main {
    private static ChinhHangController chinhHangController = new ChinhHangController();
    private static XachTayController xachTayController = new XachTayController();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=====================================");
            System.out.println("       CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("=====================================");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("\t1. Thêm mới");
            System.out.println("\t2. Xóa");
            System.out.println("\t3. Xem danh sách điện thoại");
            System.out.println("\t4. Tìm kiếm");
            System.out.println("\t5. Thoát");
            System.out.println("=====================================");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    DienThoaiChinhHang dienThoaiChinhHang = inputChinhHang();
                    chinhHangController.add(dienThoaiChinhHang);
                    break;
                case 2:
                    System.out.println("Nhập mã điện thoại cần xóa: ");
                    int chinhHangRemove = Integer.parseInt(sc.nextLine());
                    ChinhHangRepository.remove(chinhHangRemove);
                    break;
                case 3:
                    List<DienThoaiChinhHang> dienThoaiChinhHangs = chinhHangController.getAllPhone();
                    if (dienThoaiChinhHangs.isEmpty()) {
                        System.out.println("Thư viện hiện không có điện thoại nào nào.");
                    } else {
                        System.out.println("Danh sách điện thoaại hiện có: ");
                        printPhoneTable(dienThoaiChinhHangs);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
