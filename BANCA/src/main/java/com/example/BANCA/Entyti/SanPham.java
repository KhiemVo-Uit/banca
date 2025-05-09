package com.example.BANCA.Entyti;

import jakarta.persistence.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "sanpham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masp")
    private long masp;  // Mã cá

    @Column(name = "TENsp")
    private String tensp;  // Tên cá

    @Column(name = "LOAI")
    private String loai;  // Loại cá

    @Column(name = "DVT")
    private String dvt;  // Đơn vị tính

    @Column(name = "NUOCSX")
    private String nuocSX;  // Nguồn gốc

    @Column(name = "MAUSAC")
    private String mauSac;  // Màu sắc

    @Column(name = "KICHTHUOC")
    private Double kichThuoc;  // Kích thước (cm)

    @Column(name = "MOOTA")
    private String moTa;  // Mô tả

    @Column(name = "GIA")
    private Double gia;  // Giá bán

    private String hinhAnh;

    public SanPham(){}
    public SanPham(Double gia, String moTa, Double kichThuoc, String mauSac, String nuocSX, String dvt, String loai, String tenCa) {
        this.gia = gia;
        this.moTa = moTa;
        this.kichThuoc = kichThuoc;
        this.mauSac = mauSac;
        this.nuocSX = nuocSX;
        this.dvt = dvt;
        this.loai = loai;
        this.tensp = tenCa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setMasp(long masp) {
        this.masp = masp;
    }

    // Getters and Setters
    public Long getMasp() {
        return masp;
    }

    public void setMasp(Integer masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTenCa(String tenCa) {
        this.tensp = tenCa;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(Double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
}
