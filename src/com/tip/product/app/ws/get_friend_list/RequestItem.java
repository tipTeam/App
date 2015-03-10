package com.tip.product.app.ws.get_friend_list;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.tip.product.app.base.AElement;

public class RequestItem extends AElement{
	
	 private String userName;
	 private String userCode;
	 private String domian;
	 
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getDomian() {
		return domian;
	}
	public void setDomian(String domian) {
		this.domian = domian;
	}
	@Override
	public String checkSelf() {
		StringBuffer buf=new StringBuffer(64);
		if(super.isNullOrEmpty(this.userName)){
			buf.append("用户名userName为空;");
		}
		if(super.isNullOrEmpty(this.userCode)){
			buf.append("用户密码password为空;");
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
