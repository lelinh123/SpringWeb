package com.codefresher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "chuc_vu")
@Entity
public class ChucVu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String maChucVu;
	
	private String moTa;
	
	private String tenChucVu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	public String getMaChucVu() {
		return maChucVu;
	}

	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
	
}
