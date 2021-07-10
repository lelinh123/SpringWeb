package com.codefresher.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codefresher.model.NhanSu;
import com.codefresher.service.NhanSuService;

@RestController
@RequestMapping("/api")
public class NhanSuController {
	
	@Autowired
	NhanSuService nhanSuService;
	@GetMapping("/nhansu")
	public List<NhanSu> getNhanSu() {
		return nhanSuService.getAllNhanSu();
	}
}
