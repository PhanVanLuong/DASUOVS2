package com.dasuo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tinhthanh")
public class TinhThanh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tinh_Id;
	@Column
	private String tenTinh;
	@OneToMany(mappedBy = "tinhThanh")
	private List<TaiKhoan> taikhoan;
	

	public TinhThanh() {
		super();
	}

	public Integer getTinh_Id() {
		return tinh_Id;
	}

	public void setTinh_Id(Integer tinh_Id) {
		this.tinh_Id = tinh_Id;
	}

	public String getTenTinh() {
		return tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	public List<TaiKhoan> getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(List<TaiKhoan> taikhoan) {
		this.taikhoan = taikhoan;
	}
	
	

}
