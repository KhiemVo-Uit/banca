package com.example.BANCA.Entyti;

import com.example.BANCA.Entyti.CTHDId;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CTHD")
@IdClass(CTHDId.class)
public class CTHD {

    @Id
    @ManyToOne(fetch = FetchType.LAZY) //  Thêm fetch = FetchType.LAZY
    @JoinColumn(name = "SOHD", referencedColumnName = "soHd")
    private HoaDon hoaDon;

    @Id
    @ManyToOne(fetch = FetchType.LAZY) //  Thêm fetch = FetchType.LAZY
    @JoinColumn(name = "MASP", referencedColumnName = "masp")
    private SanPham sanPham;

    @Column(name = "SL")
    private int soLuong; //  Đổi tên 'sl' -> 'soLuong'

    public CTHD() {
    }

    public CTHD(HoaDon hoaDon, SanPham sanPham, int soLuong) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CTHD cthd = (CTHD) o;
        return soLuong == cthd.soLuong && hoaDon.equals(cthd.hoaDon) && sanPham.equals(cthd.sanPham);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoaDon, sanPham, soLuong);
    }
}