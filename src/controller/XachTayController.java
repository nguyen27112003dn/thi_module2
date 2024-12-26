package controller;

import entity.DienThoaiXachTay;
import repository.XachTayRepository;
import service.IXachTayService;
import service.XachTayService;

import java.util.List;

public class XachTayController {
    private IXachTayService xachTayService = new XachTayService();

    public List<DienThoaiXachTay> getAllByTitle(String title) {
        return xachTayService.searchByTitle(title);
    }

    public void add(DienThoaiXachTay dienThoaiXachTay) {
        xachTayService.add(dienThoaiXachTay);
    }

    public List<DienThoaiXachTay> remove() {
        return xachTayService.dienThoaiXachTays();
    }

    public List<DienThoaiXachTay> getAllPhone() {
        return XachTayRepository.getAllPhone();
    }
}
