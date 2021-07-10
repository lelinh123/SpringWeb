package com.codefresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefresher.model.ChucVu;

@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, Integer> {

}
