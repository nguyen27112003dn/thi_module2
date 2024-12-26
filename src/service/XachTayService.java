package service;

import entity.DienThoaiXachTay;
import repository.XachTayRepository;

import java.util.List;

public class XachTayService implements IXachTayService {
    private XachTayRepository xachTayRepository = new XachTayRepository();

    @Override
    public List<DienThoaiXachTay> dienThoaiXachTays() {
        return xachTayRepository.getAllPhone();
    }

    @Override
    public void add(DienThoaiXachTay dienThoaiXachTay) {
        XachTayRepository.add(dienThoaiXachTay);
    }

    @Override
    public void remove(int id) {
        XachTayRepository.remove(id);
    }

    @Override
    public List<DienThoaiXachTay> searchByTitle(String title) {
        return this.xachTayRepository.findAllByTitle(title);
    }
}
