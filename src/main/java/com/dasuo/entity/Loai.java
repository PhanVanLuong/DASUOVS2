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
@Table(name = "loai")
public class Loai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loai_Id;
	@Column
	private String tenLoai;
	
	@OneToMany(mappedBy = "loai")
	private List<TaiKhoan> taiKhoan;

	public Loai() {
		super();
	}

	public Integer getLoai_Id() {
		return loai_Id;
	}

	public void setLoai_Id(Integer loai_Id) {
		this.loai_Id = loai_Id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public List<TaiKhoan> getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(List<TaiKhoan> taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	
	
	

}
