package main;

import main.kho.Kho;
import main.sanPham.*;

public class Main {
    public static void main(String[] args) {
        Kho kho = new Kho();

        SanPhamSach sachToan = new SanPhamSach("SP001", "Sach Toan", 150000, 10, "Nguyen Van A");
        SanPhamDungCuHocTap but = new SanPhamDungCuHocTap("SP002", "But", 5000, 200, "ABC");

        kho.themSanPham(sachToan);
        kho.themSanPham(but);

        System.out.println("Tong gia tri ton kho: " + kho.tinhTongGiaTriTonKho() + " VND");
        System.out.println("\nDanh sach san pham trong kho:");
        kho.hienThiDanhSachSanPham();

        System.out.println("\nTim san pham có gia tri ton kho cao nhat va thap nhat:");
        kho.timSanPhamGiaTriTonKhoCaoNhatVaThapNhat();
    }
}
