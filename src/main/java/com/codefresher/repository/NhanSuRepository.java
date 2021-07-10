package com.codefresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefresher.model.NhanSu;

@Repository
public interface NhanSuRepository extends JpaRepository<NhanSu, Integer> {

}
