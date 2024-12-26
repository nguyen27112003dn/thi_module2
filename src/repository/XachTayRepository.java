package repository;

import entity.DienThoaiChinhHang;
import entity.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XachTayRepository {
    public static final String DIENTHOAIXACHTAY = "D:\\Codegym\\module2\\ThiModule2\\src\\data\\DienThoai.csv";

    public static List<DienThoaiXachTay> getAllPhone() {
        File file = new File(DIENTHOAIXACHTAY);
        List<DienThoaiXachTay> dienThoaiXachTays = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 7) {
                    dienThoaiXachTays.add(new DienThoaiXachTay(
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
        return dienThoaiXachTays;
    }

    private static void writeFile(List<DienThoaiXachTay> dienThoaiXachTays, boolean append) {
        File file = new File(DIENTHOAIXACHTAY);
        try (FileWriter fileWriter = new FileWriter(file, append); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTays) {
                bufferedWriter.write(xachTayToString(dienThoaiXachTay));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    private static String xachTayToString(DienThoaiXachTay dienThoaiXachTay) {
        return dienThoaiXachTay.getID() + ", " + dienThoaiXachTay.getTenDienThoai() + ", " + dienThoaiXachTay.getGiaBan() + ", " + dienThoaiXachTay.getSoLuong() + ", " + dienThoaiXachTay.getNhaSanXuat() + ", " + dienThoaiXachTay.getQuocGiaXachTay() + ", " + dienThoaiXachTay.getTrangThai();
    }

    public static void add(DienThoaiXachTay dienThoaiXachTay) {
        List<DienThoaiXachTay> dienThoaiXachTays = new ArrayList<>();
        dienThoaiXachTays.add(dienThoaiXachTay);
        writeFile(dienThoaiXachTays, true);
        System.out.println("Thêm mới thành công!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    //Xoa
    public static void remove(int id) {
        List<DienThoaiXachTay> dienThoaiXachTays = getAllPhone();
        boolean isRemoved = false;

        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTays) {
            if (dienThoaiXachTay.getID() == id) {
                dienThoaiXachTays.remove(dienThoaiXachTay);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            writeFile(dienThoaiXachTays, false);
            System.out.println("Xóa sách thành công!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("Không tìm thấy sách với mã: " + id);
        }
    }

    //Tim kiem
    public List<DienThoaiXachTay> findAllByTitle(String title) {
        List<DienThoaiXachTay> result = new ArrayList<>();
        List<DienThoaiXachTay> dienThoaiXachTays = getAllPhone();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTays) {
            if (dienThoaiXachTay.getTenDienThoai().toLowerCase().contains(title.toLowerCase())) {
                result.add(dienThoaiXachTay);
            }
        }
        return result;
    }
}
