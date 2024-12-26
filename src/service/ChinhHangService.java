package service;

import entity.DienThoaiChinhHang;
import repository.ChinhHangRepository;

import java.util.List;

public class ChinhHangService implements IChinhHangService {
    private ChinhHangRepository chinhHangRepository = new ChinhHangRepository();

    @Override
    public List<DienThoaiChinhHang> dienThoaiChinhHang() {
        return chinhHangRepository.getAllPhone();
    }

    @Override
    public void add(DienThoaiChinhHang dienThoaiChinhHang) {
        ChinhHangRepository.add(dienThoaiChinhHang);
    }

    @Override
    public void remove(int id) {
        ChinhHangRepository.remove(id);
    }

    @Override
    public List<DienThoaiChinhHang> searchByTitle(String title) {
        return this.chinhHangRepository.findAllByTitle(title);
    }
}
