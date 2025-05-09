package com.example.BANCA.Sevice;

import com.example.BANCA.Entyti.HoaDon;
import com.example.BANCA.Repository.HoaDonRepo;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonService implements BaseSevice<HoaDon>{
    @Autowired
    private EntityManager entityManager;


    private HoaDonRepo hoaDonRepo;

    @Autowired
    public HoaDonService(HoaDonRepo hoaDonRepo) {
        this.hoaDonRepo = hoaDonRepo;
    }

    public HoaDon findbyid(Long id) {
        return this.hoaDonRepo.findById(id).orElse(null);
    }

    @Override
    public List<HoaDon> findAll() {
        return this.hoaDonRepo.findAll();
    }

    @Override
    public void save(HoaDon hoaDon) {
        this.hoaDonRepo.save(hoaDon);
    }


    public List<HoaDon> findByMaKhachHang(Long makh) {
       String jpql = "SELECT h FROM HoaDon h WHERE h.khachHang.makh = :makh";
       return entityManager.createQuery(jpql, HoaDon.class)
               .setParameter("makh", makh)
               .getResultList();
   }
}
