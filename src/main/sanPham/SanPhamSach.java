package main.sanPham;

public class SanPhamSach extends SanPham {
    private String tacGia;

    public SanPhamSach(String maSanPham, String tenSanPham, double giaBan, int soLuongTon, String tacGia) {
        super(maSanPham, tenSanPham, giaBan, soLuongTon);
        this.tacGia = tacGia;
    }

    public String getTacGia() {
        return tacGia;
    }

    @Override
    public String toString() {
        return String.format("Sach %s (tac gia %s), gia ban %.0f VND, ton %d", getTenSanPham(), tacGia, getGiaBan(), getSoLuongTon());
    }
}
