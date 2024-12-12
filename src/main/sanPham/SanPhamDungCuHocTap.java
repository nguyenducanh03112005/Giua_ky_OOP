package main.sanPham;

public class SanPhamDungCuHocTap extends SanPham {
    private String thuongHieu;

    public SanPhamDungCuHocTap(String maSanPham, String tenSanPham, double giaBan, int soLuongTon, String thuongHieu) {
        super(maSanPham, tenSanPham, giaBan, soLuongTon);
        this.thuongHieu = thuongHieu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    @Override
    public String toString() {
        return String.format("Dung cu hoc tap %s (thuong hieu %s), gia ban %.0f VND, ton %d", getTenSanPham(), thuongHieu, getGiaBan(), getSoLuongTon());
    }
}
