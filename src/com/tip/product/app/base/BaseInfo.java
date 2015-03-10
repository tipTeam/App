package com.tip.product.app.base;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class BaseInfo extends AElement{
	
	private String userRole;
	private String userCode;
	private String requestTime;
	private String donmainCode;
	
	
	 
	
	
	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}



	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public String getRequestTime() {
		return requestTime;
	}


	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}


	public String getDonmainCode() {
		return donmainCode;
	}


	public void setDonmainCode(String donmainCode) {
		this.donmainCode = donmainCode;
	}


	/**
	 * ���췵����Ϣ
	 * @return
	 */
	
	public BaseInfo buildResponse(){
		BaseInfo baseInfo=new BaseInfo();
		baseInfo.setDonmainCode(this.donmainCode);
		baseInfo.setUserCode(this.userCode);
		baseInfo.setUserRole(this.userRole);
		baseInfo.setRequestTime(new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime()));
		return baseInfo;
	}
	

	@Override
	public HashMap<String, Object> buildMap() {
		HashMap<String,Object> hashMap=new HashMap<String, Object>();
		 try {
				Field[] fields=this.getClass().getDeclaredFields();
				for(Field field:fields){
					hashMap.put(field.getName(), field.get(this));
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		 
		return hashMap;
	}
	
	@Override
	public String checkSelf() {
		StringBuffer buf=new StringBuffer(64);
		if(super.isNullOrEmpty(this.userCode)){
			buf.append("������ϢuserCode����Ϊ��;");
		}
		if(super.isNullOrNaN(this.requestTime)){
			buf.append("������ϢrequestTimeΪ�ջ�Ƿ�;");
		}
		if(super.isNullOrEmpty(this.donmainCode)){
			buf.append("������ϢdonmainCodeΪ��;");
		}
		if(super.isNullOrEmpty(this.userRole)){
			buf.append("������ϢuserRoleΪ��;");
		}
		return buf.toString();
	}
	
	
}
