package com.example.BANCA.Entyti;

import java.io.Serializable;
import java.util.Objects;

public class CTHDId implements Serializable {

    private Integer hoaDon;  //  Đổi 'sohd' -> 'hoaDon' và kiểu dữ liệu thành Integer
    private Integer sanPham;  //  Đổi 'masp' -> 'sanPham' và kiểu dữ liệu thành Integer

    public CTHDId() {
    }

    public CTHDId(Integer hoaDon, Integer sanPham) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
    }

    public Integer getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(Integer hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Integer getSanPham() {
        return sanPham;
    }

    public void setSanPham(Integer sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CTHDId cthdId = (CTHDId) o;
        return Objects.equals(hoaDon, cthdId.hoaDon) && Objects.equals(sanPham, cthdId.sanPham); //  Sử dụng Objects.equals()
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoaDon, sanPham);
    }
}