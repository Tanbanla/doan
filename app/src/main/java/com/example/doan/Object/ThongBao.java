package com.example.doan.Object;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ThongBao{

	@SerializedName("ThongBao")
	private List<ThongBaoItem> thongBao;

	public void setThongBao(List<ThongBaoItem> thongBao){
		this.thongBao = thongBao;
	}

	public List<ThongBaoItem> getThongBao(){
		return thongBao;
	}
}