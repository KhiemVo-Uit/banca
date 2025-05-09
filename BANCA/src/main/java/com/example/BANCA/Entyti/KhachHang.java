package com.example.BANCA.Entyti;

import jakarta.persistence.*;
import java.time.LocalDate; //  Sử dụng LocalDate
import java.util.List;

@Entity
@Table(name = "KHACHHANG") //  Thêm @Table để chỉ định tên bảng
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long makh;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "SODT")
    private String soDienThoai;

    @Column(name = "NGSINH")
    private LocalDate ngaySinh;  //  Thêm trường ngaySinh

    @Column(name = "DOANHSO")
    private Double doanhSo;  //  Thêm trường doanhSo

    @Column(name = "NGDK")
    private LocalDate ngayDangKy;  //  Thêm trường ngayDangKy

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, orphanRemoval = true) //  Thêm quan hệ ngược lại
    private List<HoaDon> hoaDons;

    public KhachHang() {
    }

    public KhachHang(String soDienThoai, String diaChi, String ten, LocalDate ngaySinh, Double doanhSo, LocalDate ngayDangKy) {
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.doanhSo = doanhSo;
        this.ngayDangKy = ngayDangKy;
    }

    public Long getMakh() {
        return makh;
    }

    public void setMakh(Long id) {
        this.makh = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public LocalDate getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(LocalDate ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public List<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(List<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }
}