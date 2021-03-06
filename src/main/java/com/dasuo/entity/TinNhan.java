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
@Table(name = "tinnhan")
public class TinNhan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tinNhan_Id;
	@Column
	private String noiDung;
	@Column
	private Date thoiGian;
	@ManyToOne
	@JoinColumn(name = "chat_id")
	private Chat chat;

	public TinNhan() {
		super();
	}

	public Integer getTinNhan_Id() {
		return tinNhan_Id;
	}

	public void setTinNhan_Id(Integer tinNhan_Id) {
		this.tinNhan_Id = tinNhan_Id;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}
	

}
