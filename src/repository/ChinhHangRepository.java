package repository;

import entity.DienThoaiChinhHang;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChinhHangRepository {
    public static final String DIENTHOAICHINHHANG = "D:\\Codegym\\module2\\ThiModule2\\src\\data\\DienThoai.csv";

    public static List<DienThoaiChinhHang> getAllPhone() {
        File file = new File(DIENTHOAICHINHHANG);
        List<DienThoaiChinhHang> dienThoaiChinhHangs = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 7) {
                    dienThoaiChinhHangs.add(new DienThoaiChinhHang(
                            Integer.parseInt(temp[0].trim()),
                            temp[1].trim(),
                            Double.parseDouble(temp[2].trim()),
                            Integer.parseInt(temp[3].trim()),
                            temp[4].trim(),
                            temp[5].trim(),
                            temp[6].trim()
                    ));
                } else {
                    System.out.println("Dữ liệu dòng không hợp lệ: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi chuyển đổi định dạng số: " + e.getMessage());
        }
        return dienThoaiChinhHangs;
    }

    private static void writeFile(List<DienThoaiChinhHang> dienThoaiChinhHangs, boolean append) {
        File file = new File(DIENTHOAICHINHHANG);
        try (FileWriter fileWriter = new FileWriter(file, append); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangs) {
                bufferedWriter.write(chinHangToString(dienThoaiChinhHang));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    private static String chinHangToString(DienThoaiChinhHang dienThoaiChinhHang) {
        return dienThoaiChinhHang.getID() + ", " + dienThoaiChinhHang.getTenDienThoai() + ", " + dienThoaiChinhHang.getGiaBan() + ", " + dienThoaiChinhHang.getSoLuong() + ", " + dienThoaiChinhHang.getNhaSanXuat() + ", " + dienThoaiChinhHang.getThoiGianBaoHanh() + ", " + dienThoaiChinhHang.getPhamViBaoHanh();
    }

    public static void add(DienThoaiChinhHang dienThoaiChinhHang) {
        List<DienThoaiChinhHang> dienThoaiChinhHangs = new ArrayList<>();
        dienThoaiChinhHangs.add(dienThoaiChinhHang);
        writeFile(dienThoaiChinhHangs, true);
        System.out.println("Thêm mới thành công!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    //Xoa
    public static void remove(int id) {
        List<DienThoaiChinhHang> dienThoaiChinhHangs = getAllPhone();
        boolean isRemoved = false;

        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangs) {
            if (dienThoaiChinhHang.getID() == id) {
                dienThoaiChinhHangs.remove(dienThoaiChinhHang);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            writeFile(dienThoaiChinhHangs, false);
            System.out.println("Xóa sách thành công!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("Không tìm thấy sách với mã: " + id);
        }
    }

    //Tim kiem
    public List<DienThoaiChinhHang> findAllByTitle(String title) {
        List<DienThoaiChinhHang> result = new ArrayList<>();
        List<DienThoaiChinhHang> dienThoaiChinhHangs = getAllPhone();
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangs) {
            if (dienThoaiChinhHang.getTenDienThoai().toLowerCase().contains(title.toLowerCase())) {
                result.add(dienThoaiChinhHang);
            }
        }
        return result;
    }
}

