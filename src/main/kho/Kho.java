package main.kho;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.sanPham.SanPham;
import main.sanPham.SanPhamDungCuHocTap;
import main.sanPham.SanPhamSach;

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
    List<SanPhamSach> danhSachSach = danhSachSanPham.stream()
        .filter(sanPham -> sanPham instanceof SanPhamSach)
        .map(sanPham -> (SanPhamSach) sanPham)
        .toList();

    List<SanPhamDungCuHocTap> danhSachDungCu = danhSachSanPham.stream()
        .filter(sanPham -> sanPham instanceof SanPhamDungCuHocTap)
        .map(sanPham -> (SanPhamDungCuHocTap) sanPham)
        .toList();

    SanPhamSach sachCaoNhat = danhSachSach.stream()
        .max(Comparator.comparingDouble(SanPham::tinhGiaTriTonKho))
        .orElse(null);
    SanPhamSach sachThapNhat = danhSachSach.stream()
        .min(Comparator.comparingDouble(SanPham::tinhGiaTriTonKho))
        .orElse(null);

    SanPhamDungCuHocTap dungCuCaoNhat = danhSachDungCu.stream()
        .max(Comparator.comparingDouble(SanPham::tinhGiaTriTonKho))
        .orElse(null);
    SanPhamDungCuHocTap dungCuThapNhat = danhSachDungCu.stream()
        .min(Comparator.comparingDouble(SanPham::tinhGiaTriTonKho))
        .orElse(null);

    System.out.println("San pham sach co gia tri ton kho cao nhat: " + (sachCaoNhat != null ? sachCaoNhat : "Không có"));
    System.out.println("San pham sach co gia tri ton kho thap nhat: " + (sachThapNhat != null ? sachThapNhat : "Không có"));
    System.out.println("San pham dung cu hoc tap co gia tri ton kho cao nhat: " + (dungCuCaoNhat != null ? dungCuCaoNhat : "Không có"));
    System.out.println("San pham dung cu hoc tap co gia tri ton kho thap nhat: " + (dungCuThapNhat != null ? dungCuThapNhat : "Không có"));
}

}
