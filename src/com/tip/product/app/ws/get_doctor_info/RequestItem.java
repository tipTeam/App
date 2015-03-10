package com.tip.product.app.ws.get_doctor_info;

import java.lang.reflect.Field;
import java.sql.Date;
import java.util.HashMap;

import com.tip.product.app.base.AElement;



/**
 * ҽ����������
 * @author Administrator
 *
 */
public class RequestItem extends AElement{
	
	 private String doctorName; 		//ҽ������
	 private String doctorCode; 		//ҽ������
     private String doctorTitle;        //ҽ��ְ��
     private String doctorSex;          //ҽ���Ա�
     private String doctorHospital;     //ҽ��ҽԺ
	 private String doctorDep;          //ҽ������
	 private String major;				//ҽ��רҵ
	 
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getDoctorTitle() {
		return doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}
	public String getDoctorSex() {
		return doctorSex;
	}
	public void setDoctorSex(String doctorSex) {
		this.doctorSex = doctorSex;
	}
	public String getDoctorHospital() {
		return doctorHospital;
	}
	public void setDoctorHospital(String doctorHospital) {
		this.doctorHospital = doctorHospital;
	}
	public String getDoctorDep() {
		return doctorDep;
	}
	public void setDoctorDep(String doctorDep) {
		this.doctorDep = doctorDep;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String checkSelf() {
		StringBuffer buf=new StringBuffer(64);
		if(super.isNullOrEmpty(this.doctorCode)){
			buf.append("�û�doctorCodeΪ��;");
		}
		if(super.isNullOrEmpty(this.doctorName)){
			buf.append("�û�doctorNameΪ��;");
		}
		
		return buf.toString();
	}
	@Override
	public HashMap<String, Object> buildMap() {
		HashMap<String,Object> hashMap=new HashMap<String,Object>();
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for(Field field:fields){
				hashMap.put(field.getName(), field.get(this));
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return hashMap;
	}
	 
	 
	
	
}
