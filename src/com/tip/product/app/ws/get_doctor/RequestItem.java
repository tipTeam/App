package com.tip.product.app.ws.get_doctor;

public class RequestItem {
	
	private int id;  
	private String doctorCode;   //ҽ������
	private String doctorName;   //ҽ������
	private String doctorMajor;  //ҽ��רҵ
	private String doctorAge;    //ҽ������
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorMajor() {
		return doctorMajor;
	}
	public void setDoctorMajor(String doctorMajor) {
		this.doctorMajor = doctorMajor;
	}
	public String getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(String doctorAge) {
		this.doctorAge = doctorAge;
	}
	
	
	
	

}
