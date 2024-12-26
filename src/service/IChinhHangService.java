package service;

import entity.DienThoaiChinhHang;

import java.util.List;

public interface IChinhHangService {
    List<DienThoaiChinhHang> dienThoaiChinhHang();

    void add(DienThoaiChinhHang dienThoaiChinhHang);

    void remove(int id);

    List<DienThoaiChinhHang> searchByTitle(String title);
}
