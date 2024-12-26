package entity;

import java.util.Date;

public class DienThoaiChinhHang extends DienThoai {
    private String ThoiGianBaoHanh;
    private String PhamViBaoHanh;

    public DienThoaiChinhHang(int ID, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat) {
        super(ID, tenDienThoai, giaBan, soLuong, nhaSanXuat);
    }

    public DienThoaiChinhHang(int ID, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(ID, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.ThoiGianBaoHanh = thoiGianBaoHanh;
        this.PhamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return ThoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        ThoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return PhamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        PhamViBaoHanh = phamViBaoHanh;
    }
}
