package com.sof3021.nguyenvv4.ph21408.service.impl;

import com.sof3021.nguyenvv4.ph21408.entity.CuaHang;
import com.sof3021.nguyenvv4.ph21408.repository.CuaHangRepository;
import com.sof3021.nguyenvv4.ph21408.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuaHangServiceImpl implements CuaHangService {
    @Autowired
    private CuaHangRepository cuaHangRepository;

    @Override
    public List<CuaHang> getAll() {
        return cuaHangRepository.findAll();
    }
}
