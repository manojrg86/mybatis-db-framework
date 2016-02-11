package com.entity;

public class OnlineOrderContainer{

	private String dcNo;
	private String soNo;
	private int onlineOrder;
	public String getDcNo() {
		return dcNo;
	}
	public void setDcNo(String dcNo) {
		this.dcNo = dcNo;
	}
	public String getSoNo() {
		return soNo;
	}
	public void setSoNo(String soNo) {
		this.soNo = soNo;
	}
	public int getOnlineOrder() {
		return onlineOrder;
	}
	public void setOnlineOrder(int onlineOrder) {
		this.onlineOrder = onlineOrder;
	}
	
	@Override
	public String toString() {
		return "OnlineOrderContainer [dcNo=" + dcNo + ", soNo=" + soNo
				+ ", onlineOrder=" + onlineOrder + "]";
	}
	
	
}
