package com.example.BANCA.Controller;

import com.example.BANCA.Entyti.HoaDon;
import com.example.BANCA.Repository.HoaDonRepo;
import com.example.BANCA.Sevice.HoaDonService;
import com.example.BANCA.Sevice.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping("/hoadon")
    public String listkhachhang(Model model){
        model.addAttribute("dshoadon" , hoaDonService.findAll());
        return "hoadon";
    }

    @GetMapping("/hoadon/khachhang")
    public String searchHoaDonByMaKH(@RequestParam("searchMaKH") Long makh, Model model) {
        List<HoaDon> ds = hoaDonService.findByMaKhachHang(makh);
        model.addAttribute("dshoadon", ds);
        model.addAttribute("maKH", makh);
        model.addAttribute("searchMaKH", makh);
        return "hoadon";
    }



}
