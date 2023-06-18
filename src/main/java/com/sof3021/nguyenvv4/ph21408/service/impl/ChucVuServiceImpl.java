package com.sof3021.nguyenvv4.ph21408.service.impl;

import com.sof3021.nguyenvv4.ph21408.entity.ChucVu;
import com.sof3021.nguyenvv4.ph21408.repository.ChucVuRepository;
import com.sof3021.nguyenvv4.ph21408.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    private ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepository.findAll();
    }
}
