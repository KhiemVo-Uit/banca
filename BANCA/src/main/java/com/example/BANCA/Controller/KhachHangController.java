package com.example.BANCA.Controller;

import com.example.BANCA.Sevice.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/khachhang")
    public String listkhachhang(Model model){
        model.addAttribute("danhsachKH" , khachHangService.findAll());
        return "khachhang";
    }
}
