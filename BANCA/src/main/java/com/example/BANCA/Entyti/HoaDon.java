package com.example.BANCA.Entyti;

import jakarta.persistence.*;
import java.time.LocalDate; //  Sử dụng LocalDate
import java.util.List;

@Entity
@Table(name = "HOADON")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SOHD")
    private Long soHd;  //  Đổi 'sohd' -> 'soHd'

    @Column(name = "NGHD")
    private LocalDate ngayMua;  //  Đổi 'ngayMua' kiểu dữ liệu thành LocalDate

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKH")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV")
    private NhanVien nhanVien;

    @Column(name = "TRIGIA")
    private Double triGia;

    @OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL, orphanRemoval = true) //  Thêm quan hệ ngược lại
    private List<CTHD> chiTietHoaDons;

    public HoaDon() {
    }

    public Long getSoHd() {
        return soHd;
    }

    public void setSoHd(Long soHd) {
        this.soHd = soHd;
    }

    public LocalDate getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(LocalDate ngayMua) {
        this.ngayMua = ngayMua;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Double getTriGia() {
        return triGia;
    }

    public void setTriGia(Double triGia) {
        this.triGia = triGia;
    }

    public List<CTHD> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(List<CTHD> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }
}