package com.sof3021.nguyenvv4.ph21408.service.impl;

import com.sof3021.nguyenvv4.ph21408.entity.NhanVien;
import com.sof3021.nguyenvv4.ph21408.repository.NhanVienRepository;
import com.sof3021.nguyenvv4.ph21408.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public Page<NhanVien> getAll(Pageable pageable) {
        return nhanVienRepository.findAll(pageable);
    }
}
