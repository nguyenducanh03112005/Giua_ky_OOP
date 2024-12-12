package main.kho;

import java.util.ArrayList;
import java.util.List;

import main.sanPham.SanPham;

public class Kho {
    private List<SanPham> danhSachSanPham;

    public Kho() {
        this.danhSachSanPham = new ArrayList<>();
    }

    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public double tinhTongGiaTriTonKho() {
        return danhSachSanPham.stream()
                .mapToDouble(SanPham::tinhGiaTriTonKho)
                .sum();
    }

    public void hienThiDanhSachSanPham() {
        danhSachSanPham.forEach(System.out::println);
    }

    public void timSanPhamGiaTriTonKhoCaoNhatVaThapNhat() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Kho hien khong co san pham nao.");
            return;
        }

        SanPham sanPhamCaoNhat = danhSachSanPham.stream()
                .max((sp1, sp2) -> Double.compare(sp1.tinhGiaTriTonKho(), sp2.tinhGiaTriTonKho()))
                .orElse(null);

        SanPham sanPhamThapNhat = danhSachSanPham.stream()
                .min((sp1, sp2) -> Double.compare(sp1.tinhGiaTriTonKho(), sp2.tinhGiaTriTonKho()))
                .orElse(null);

        System.out.println("San pham co gia tri ton kho cao nhat: " + sanPhamCaoNhat);
        System.out.println("San pham co gia tri ton kho thap nhat: " + sanPhamThapNhat);
    }
}
