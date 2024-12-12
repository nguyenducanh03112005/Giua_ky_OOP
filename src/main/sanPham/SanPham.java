package main.sanPham;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;
    private int soLuongTon;

    public SanPham(String maSanPham, String tenSanPham, double giaBan, int soLuongTon) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public double tinhGiaTriTonKho() {
        return giaBan * soLuongTon;
    }

    @Override
    public String toString() {
        return String.format("%s, gia ban %.0f VND, ton %d", tenSanPham, giaBan, soLuongTon);
    }
}
