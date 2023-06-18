package com.sof3021.nguyenvv4.ph21408.service;

import com.sof3021.nguyenvv4.ph21408.entity.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NhanVienService {
    Page<NhanVien> getAll(Pageable pageable);
}
