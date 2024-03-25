package com.example.doan.Object;

import com.google.gson.annotations.SerializedName;

public class ThongBaoItem{

	@SerializedName("Sender")
	private String sender;

	@SerializedName("img")
	private String img;

	@SerializedName("LoaiTin")
	private String loaiTin;

	@SerializedName("Content")
	private String content;

	@SerializedName("Title")
	private String title;

	@SerializedName("SentDate")
	private String sentDate;

	@SerializedName("ID")
	private int iD;

	public void setSender(String sender){
		this.sender = sender;
	}

	public String getSender(){
		return sender;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setLoaiTin(String loaiTin){
		this.loaiTin = loaiTin;
	}

	public String getLoaiTin(){
		return loaiTin;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSentDate(String sentDate){
		this.sentDate = sentDate;
	}

	public String getSentDate(){
		return sentDate;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}
}