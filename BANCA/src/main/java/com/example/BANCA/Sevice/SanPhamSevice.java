package com.example.BANCA.Sevice;

import com.example.BANCA.Entyti.KhachHang;
import com.example.BANCA.Entyti.SanPham;
import com.example.BANCA.Repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SanPhamSevice implements BaseSevice<SanPham>{
    private SanPhamRepository sanPhamRepository;

    @Autowired
    public SanPhamSevice(SanPhamRepository sanPhamRepository) {
        this.sanPhamRepository = sanPhamRepository;
    }

    @Override
    public void save(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
    }


    @Override
    public SanPham findbyid(Long id) {
        return sanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public List<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }
}
