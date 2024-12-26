package service;

import entity.DienThoaiXachTay;

import java.util.List;

public interface IXachTayService {
    List<DienThoaiXachTay> dienThoaiXachTays();

    void add(DienThoaiXachTay dienThoaiXachTay);

    void remove(int id);

    List<DienThoaiXachTay> searchByTitle(String title);
}
