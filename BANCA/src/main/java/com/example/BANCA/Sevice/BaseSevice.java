package com.example.BANCA.Sevice;

import com.example.BANCA.Entyti.KhachHang;

import java.util.List;

public interface BaseSevice <T>{


    T findbyid(Long id);
    List<T> findAll();
    void save(T t);

}
