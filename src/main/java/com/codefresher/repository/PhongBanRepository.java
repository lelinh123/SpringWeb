package com.codefresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codefresher.model.PhongBan;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, Integer> {

}
