package com.example.BANCA.Sevice;

import com.example.BANCA.Entyti.KhachHang;
import com.example.BANCA.Repository.KhachHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangService implements BaseSevice<KhachHang>{
    private KhachHangRepo khachHangRepo;

    @Autowired
    public KhachHangService(KhachHangRepo khachHangRepo) {
        this.khachHangRepo = khachHangRepo;
    }


    @Override
    public void save(KhachHang khachHang) {
        khachHangRepo.save(khachHang);
    }

    @Override
    public KhachHang findbyid(Long id) {
        return khachHangRepo.findById(id).orElse(null);
    }

    @Override
    public List<KhachHang> findAll() {
        return khachHangRepo.findAll();
    }
}
