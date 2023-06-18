package com.sof3021.nguyenvv4.ph21408.repository;

import com.sof3021.nguyenvv4.ph21408.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
}
