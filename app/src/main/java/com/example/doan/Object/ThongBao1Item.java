package com.example.doan.Object;

import com.google.gson.annotations.SerializedName;

public class ThongBao1Item{

	@SerializedName("Sender")
	private Object sender;

	@SerializedName("img")
	private Object img;

	@SerializedName("LoaiTin")
	private Object loaiTin;

	@SerializedName("Content")
	private Object content;

	@SerializedName("Title")
	private Object title;

	@SerializedName("SentDate")
	private Object sentDate;

	@SerializedName("ID")
	private int iD;

	public void setSender(Object sender){
		this.sender = sender;
	}

	public Object getSender(){
		return sender;
	}

	public void setImg(Object img){
		this.img = img;
	}

	public Object getImg(){
		return img;
	}

	public void setLoaiTin(Object loaiTin){
		this.loaiTin = loaiTin;
	}

	public Object getLoaiTin(){
		return loaiTin;
	}

	public void setContent(Object content){
		this.content = content;
	}

	public Object getContent(){
		return content;
	}

	public void setTitle(Object title){
		this.title = title;
	}

	public Object getTitle(){
		return title;
	}

	public void setSentDate(Object sentDate){
		this.sentDate = sentDate;
	}

	public Object getSentDate(){
		return sentDate;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}
}