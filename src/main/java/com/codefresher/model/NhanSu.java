package com.codefresher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "nhan_su")
@Entity
public class NhanSu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String ten;
	private String ngaySinh;
	private String chungMinhThu;
	
	@ManyToOne
    @JoinColumn(name="phongban_id", nullable=false)
    private PhongBan phongban;
	
	@OneToOne
    @JoinColumn(name = "chucvu_id", nullable = false)
    private ChucVu chucVu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getChungMinhThu() {
		return chungMinhThu;
	}
	public void setChungMinhThu(String chungMinhThu) {
		this.chungMinhThu = chungMinhThu;
	}
	public PhongBan getPhongban() {
		return phongban;
	}
	public void setPhongban(PhongBan phongban) {
		this.phongban = phongban;
	}
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	
}
