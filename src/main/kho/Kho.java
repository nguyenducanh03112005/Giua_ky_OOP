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

    danhSachSanPham.sort((sp1, sp2) -> Double.compare(sp1.tinhGiaTriTonKho(), sp2.tinhGiaTriTonKho()));

    SanPham sanPhamThapNhat = danhSachSanPham.get(0);
    SanPham sanPhamCaoNhat = danhSachSanPham.get(danhSachSanPham.size() - 1);

    System.out.println("San pham co gia tri ton kho cao nhat: " + sanPhamCaoNhat);
    System.out.println("San pham co gia tri ton kho thap nhat: " + sanPhamThapNhat);
}
}
