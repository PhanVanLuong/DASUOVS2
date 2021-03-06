package com.dasuo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giaotrinh")
public class GiaoTrinh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer giaoTrinh_Id;
	
	@ManyToOne
	@JoinColumn(name = "lop_id")
	private Lop lop;
	@Column
	private String giaoTrinh;
	@Column
	private Date thoiGian;

	public GiaoTrinh() {
		super();
	}
	
	

	public Date getThoiGian() {
		return thoiGian;
	}



	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}



	public Integer getGiaoTrinh_Id() {
		return giaoTrinh_Id;
	}

	public void setGiaoTrinh_Id(Integer giaoTrinh_Id) {
		this.giaoTrinh_Id = giaoTrinh_Id;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public String getGiaoTrinh() {
		return giaoTrinh;
	}

	public void setGiaoTrinh(String giaoTrinh) {
		this.giaoTrinh = giaoTrinh;
	}
	
	

}
