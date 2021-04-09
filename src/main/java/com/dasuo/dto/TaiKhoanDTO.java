package com.dasuo.dto;

import java.util.List;
import java.util.Set;

public class TaiKhoanDTO {
	
	private Integer taiKhoan_Id;
	
	private String hoTen;
	
	private String sdt;
	
	private TinhThanhDTO tinhThanh;
	
	private String email;
	
	private String matKhau;
	
	private LoaiDTO loai;
	
	private boolean gioiTinh;
	
	private String hinhDaiDien;
	
	private String moTa;
	
	private NgheNghiepDTO ngheNghiep;
	
	private double hocPhi;
	
	private String bangCap;
	
	private String cmnd;
	
	private double soDu;
	
	private Set<BaiDangDTO> baiDangs;
	
	private List<LichSuGiaoDichDTO> lichSuGiaoDichs;
	
	private List<ChatDTO> nguoiNhans;
	
	private List<ChatDTO> nguoiGuis;
	
	private List<LopDTO> nguoiDays;
	
	private List<LopDTO> nguoiHocs;
	
	private Set<MonDTO> mons;
	
	public TaiKhoanDTO() {
		super();
	}

	public Integer getTaiKhoan_Id() {
		return taiKhoan_Id;
	}

	public void setTaiKhoan_Id(Integer taiKhoan_Id) {
		this.taiKhoan_Id = taiKhoan_Id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public TinhThanhDTO getTinhThanh() {
		return tinhThanh;
	}

	public void setTinhThanh(TinhThanhDTO tinhThanh) {
		this.tinhThanh = tinhThanh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public LoaiDTO getLoai() {
		return loai;
	}

	public void setLoai(LoaiDTO loai) {
		this.loai = loai;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getHinhDaiDien() {
		return hinhDaiDien;
	}

	public void setHinhDaiDien(String hinhDaiDien) {
		this.hinhDaiDien = hinhDaiDien;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public NgheNghiepDTO getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(NgheNghiepDTO ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public String getBangCap() {
		return bangCap;
	}

	public void setBangCap(String bangCap) {
		this.bangCap = bangCap;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public List<LichSuGiaoDichDTO> getLichSuGiaoDichs() {
		return lichSuGiaoDichs;
	}

	public void setLichSuGiaoDichs(List<LichSuGiaoDichDTO> lichSuGiaoDichs) {
		this.lichSuGiaoDichs = lichSuGiaoDichs;
	}

	public List<ChatDTO> getNguoiNhans() {
		return nguoiNhans;
	}

	public void setNguoiNhans(List<ChatDTO> nguoiNhans) {
		this.nguoiNhans = nguoiNhans;
	}

	public List<ChatDTO> getNguoiGuis() {
		return nguoiGuis;
	}

	public void setNguoiGuis(List<ChatDTO> nguoiGuis) {
		this.nguoiGuis = nguoiGuis;
	}

	public List<LopDTO> getNguoiDays() {
		return nguoiDays;
	}

	public void setNguoiDays(List<LopDTO> nguoiDays) {
		this.nguoiDays = nguoiDays;
	}

	public List<LopDTO> getNguoiHocs() {
		return nguoiHocs;
	}

	public void setNguoiHocs(List<LopDTO> nguoiHocs) {
		this.nguoiHocs = nguoiHocs;
	}

	public Set<BaiDangDTO> getBaiDangs() {
		return baiDangs;
	}

	public void setBaiDangs(Set<BaiDangDTO> baiDangs) {
		this.baiDangs = baiDangs;
	}

	public Set<MonDTO> getMons() {
		return mons;
	}

	public void setMons(Set<MonDTO> mons) {
		this.mons = mons;
	}
	
	
}
