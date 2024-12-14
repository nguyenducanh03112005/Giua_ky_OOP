package main;

import main.kho.Kho;
import main.sanPham.*;

public class Main {
    public static void main(String[] args) {
        Kho kho = new Kho();

        SanPhamSach sachToan = new SanPhamSach("SP101", "Sach Toan", 150000, 10, "Nguyen Van A");
        SanPhamSach sachVan = new SanPhamSach("SP102", "Sach Van", 200000, 12, "Nguyen Van B");
        SanPhamSach sachAnh = new SanPhamSach("SP103", "Sach Anh", 4000, 16, "Nguyen Van C");
        SanPhamDungCuHocTap but = new SanPhamDungCuHocTap("SP201", "But", 5000, 200, "A");
        SanPhamDungCuHocTap thuoc = new SanPhamDungCuHocTap("SP202", "Thuoc", 10000, 320, "B");
        SanPhamDungCuHocTap tay = new SanPhamDungCuHocTap("SP203", "Tay", 3000, 1100, "C");

        kho.themSanPham(sachToan);
        kho.themSanPham(sachVan);
        kho.themSanPham(sachAnh);
        kho.themSanPham(but);
        kho.themSanPham(thuoc);
        kho.themSanPham(tay);

        System.out.println("Tong gia tri ton kho: " + kho.tinhTongGiaTriTonKho() + " VND");
        System.out.println("\nDanh sach san pham trong kho:");
        kho.hienThiDanhSachSanPham();

        System.out.println("\nTim san pham co gia tri ton kho cao nhat va thap nhat:");
        kho.timSanPhamGiaTriTonKhoCaoNhatVaThapNhat();
    }
}
