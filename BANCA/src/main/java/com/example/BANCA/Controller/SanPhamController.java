package com.example.BANCA.Controller;

import com.example.BANCA.Entyti.SanPham;
import com.example.BANCA.Repository.SanPhamRepository;
import com.example.BANCA.Sevice.SanPhamSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    private SanPhamSevice sanPhamSevice;

    @GetMapping("/sanpham")
    public String listSanPham(Model model) {
        model.addAttribute("danhSachCa", sanPhamSevice.findAll());
        return "sanpham"; // trỏ đến sanpham.html
    }

    @GetMapping("/sanpham/{id}")
    public String getSanPhamById(@PathVariable("id") Long id, Model model) {
        SanPham sanPham = sanPhamSevice.findbyid(id);
        if (sanPham == null) {
            // Có thể chuyển sang trang lỗi hoặc trả về một thông báo
            return "not-found";
        }
        model.addAttribute("sanPham", sanPhamSevice.findbyid(id));
        return "sanpham-detail"; // Trỏ đến trang hiển thị chi tiết sản phẩm
    }


}