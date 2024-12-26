package controller;

import entity.DienThoaiChinhHang;
import repository.ChinhHangRepository;
import service.ChinhHangService;
import service.IChinhHangService;

import java.util.List;

public class ChinhHangController {

    private IChinhHangService chinhHangService = new ChinhHangService();

    public List<DienThoaiChinhHang> getAllByTitle(String title) {
        return chinhHangService.searchByTitle(title);
    }

    public void add(DienThoaiChinhHang dienThoaiChinhHang) {
        chinhHangService.add(dienThoaiChinhHang);
    }

    public List<DienThoaiChinhHang> remove() {
        return chinhHangService.dienThoaiChinhHang();
    }

    public List<DienThoaiChinhHang> getAllPhone() {
        return ChinhHangRepository.getAllPhone();
    }
}
