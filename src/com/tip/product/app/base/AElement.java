package com.tip.product.app.base;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public abstract class AElement {
	
	
	/**
	 * ��Ϣ�Լ�
	 * @return error message
	 */
	public abstract String checkSelf();
	
	/**
	 * �Ƿ�Ϊ�յ��ִ�(ȥ���հ׺�)
	 * @param s
	 * @return true|false
	 * @see Utility.isNullOrEmpty
	 */
	protected boolean isNullOrEmpty(String s){
		return (s == null || s.trim().length() == 0);
	}
	
	/**
	 * �Ƿ�Ϊ��������ʽ�ִ�
	 * @param n
	 * @return true|false
	 * @see Utility.isNullOrNaN
	 */
	protected boolean isNullOrNaN(String n){
		if(this.isNullOrEmpty(n)){
			return true;
		}else{
			try {
				new BigDecimal(n);
			} catch (NumberFormatException e) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * ���������Լ�ֵ��ɼ�ֵ��
	 * @return ���Լ�ֵ��
	 */
	public abstract HashMap<String,Object> buildMap();
	
	/**
	 * ���������Լ�ֵ��ɼ�ֵ��,��׷�Ӵ���ļ�ֵ��
	 * @param appendKey ��
	 * @param appendVal ֵ
	 * @return ����׷��ֵ�ļ�ֵ��
	 */
	public HashMap<String,Object> buildMap(String appendKey,Object appendVal){
		HashMap<String,Object> hashMap = this.buildMap();
		hashMap.put(appendKey, appendVal);
		return hashMap;
	}
	
	/**
	 * ���������Լ�ֵ��ɼ�ֵ��,��׷�Ӵ���ļ�ֵ��
	 * @param appendKeyVal ��ֵ��
	 * @return ����׷��ֵ�ļ�ֵ��
	 */
	public HashMap<String,Object> buildMap(Map<String,Object> appendKeyVal){
		HashMap<String,Object> hashMap = this.buildMap();
		hashMap.putAll(appendKeyVal);
		return hashMap;
	}

}
