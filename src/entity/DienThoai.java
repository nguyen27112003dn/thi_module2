package entity;

public class DienThoai {
    private int ID;
    private String TenDienThoai;
    private double GiaBan;
    private int SoLuong;
    private String NhaSanXuat;

    public DienThoai(int ID, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat) {
        this.ID = ID;
        this.TenDienThoai = tenDienThoai;
        this.GiaBan = giaBan;
        this.SoLuong = soLuong;
        this.NhaSanXuat = nhaSanXuat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenDienThoai() {
        return TenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        TenDienThoai = tenDienThoai;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double giaBan) {
        GiaBan = giaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        NhaSanXuat = nhaSanXuat;
    }
}
