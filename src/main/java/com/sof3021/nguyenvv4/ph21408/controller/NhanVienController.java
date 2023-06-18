package com.sof3021.nguyenvv4.ph21408.controller;

import com.sof3021.nguyenvv4.ph21408.entity.ChucVu;
import com.sof3021.nguyenvv4.ph21408.entity.CuaHang;
import com.sof3021.nguyenvv4.ph21408.entity.NhanVien;
import com.sof3021.nguyenvv4.ph21408.service.ChucVuService;
import com.sof3021.nguyenvv4.ph21408.service.CuaHangService;
import com.sof3021.nguyenvv4.ph21408.service.NhanVienService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private CuaHangService cuaHangService;
    @Autowired
    private ChucVuService chucVuService;

    @GetMapping("/nhan-vien/hien-thi")
    private String hienThi(@RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo,
                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                           Model model) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<NhanVien> pageNhanViens = nhanVienService.getAll(pageable);
        List<CuaHang> listCuaHangs = cuaHangService.getAll();
        List<ChucVu> listChucVus = chucVuService.getAll();
        model.addAttribute("nhanViens", pageNhanViens);
        model.addAttribute("chucVu", listChucVus);
        model.addAttribute("cuaHang", listCuaHangs);
        return "/nhanvien/nhan-vien";
    }

}
