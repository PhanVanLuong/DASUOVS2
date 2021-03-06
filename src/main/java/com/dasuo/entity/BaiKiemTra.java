package com.dasuo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "baikiemtra")
public class BaiKiemTra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer baiKiemTra_Id;
	@ManyToOne
	@JoinColumn(name = "lop_id")
	private Lop lop;
	@Column
	private String noiDung;
	@Column
	private Date thoiGianBatDau;
	@Column
	private Date thoiGianNop;
	@OneToMany(mappedBy = "baiKiemTra")
	private List<BaiLam> baiLam;

	public BaiKiemTra() {
		super();
	}

	public Integer getBaiKiemTra_Id() {
		return baiKiemTra_Id;
	}

	public void setBaiKiemTra_Id(Integer baiKiemTra_Id) {
		this.baiKiemTra_Id = baiKiemTra_Id;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}


	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoiGianNop() {
		return thoiGianNop;
	}

	public void setThoiGianNop(Date thoiGianNop) {
		this.thoiGianNop = thoiGianNop;
	}

	public List<BaiLam> getBaiLam() {
		return baiLam;
	}

	public void setBaiLam(List<BaiLam> baiLam) {
		this.baiLam = baiLam;
	}
	
	

}
