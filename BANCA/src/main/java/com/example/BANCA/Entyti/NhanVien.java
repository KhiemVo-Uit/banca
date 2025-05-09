package com.example.BANCA.Entyti;

import com.example.BANCA.Entyti.HoaDon;
import jakarta.persistence.*;
import java.time.LocalDate; //  Sử dụng LocalDate
import java.util.List;

@Entity
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MANV")
    private Integer maNv;  //  Đổi 'manv' -> 'maNv'

    @Column(name = "HOTEN")
    private String hoTen;

    @Column(name = "SODT")
    private String soDienThoai;

    @Column(name = "NGVL")
    private LocalDate ngayVaoLam;  //  Đổi 'ngayVaoLam' kiểu dữ liệu thành LocalDate

    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL, orphanRemoval = true) //  Thêm quan hệ ngược lại
    private List<HoaDon> hoaDons;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String soDienThoai, LocalDate ngayVaoLam) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.ngayVaoLam = ngayVaoLam;
    }

    public Integer getMaNv() {
        return maNv;
    }

    public void setMaNv(Integer maNv) {
        this.maNv = maNv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }
}
