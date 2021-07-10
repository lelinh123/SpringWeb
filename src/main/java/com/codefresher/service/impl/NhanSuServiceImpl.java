package com.codefresher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codefresher.model.NhanSu;
import com.codefresher.repository.NhanSuRepository;
import com.codefresher.service.NhanSuService;

@Service
public class NhanSuServiceImpl implements NhanSuService {
	@Autowired
	NhanSuRepository nhanSuRepository;

	@Override
	public List<NhanSu> getAllNhanSu() {
		// TODO Auto-generated method stub
		return nhanSuRepository.findAll();
	}

}
