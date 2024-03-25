package com.example.doan.Object;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ThongBao1{

	@SerializedName("ThongBao1")
	private List<ThongBao1Item> thongBao1;

	public void setThongBao1(List<ThongBao1Item> thongBao1){
		this.thongBao1 = thongBao1;
	}

	public List<ThongBao1Item> getThongBao1(){
		return thongBao1;
	}
}