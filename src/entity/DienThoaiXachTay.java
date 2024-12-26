package entity;

public class DienThoaiXachTay extends DienThoai {
    private String QuocGiaXachTay;
    private String TrangThai;

    public DienThoaiXachTay(int ID, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat) {
        super(ID, tenDienThoai, giaBan, soLuong, nhaSanXuat);
    }

    public DienThoaiXachTay(int ID, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(ID, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.QuocGiaXachTay = quocGiaXachTay;
        this.TrangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return QuocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        QuocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }
}
