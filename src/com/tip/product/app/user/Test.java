package com.tip.product.app.user;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 private static org.springframework.context.ApplicationContext applicationContext = null;   //�ṩ��̬ApplicationContext  
	    static{  
	        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //ʵ����  
	    }  
	    
	    
	    
	    
	    
	public static void main(String[] args) {
		
		 UserDaoImpl impl=new UserDaoImpl();
		
		 System.out.println("1="+impl.getUserList());
		
	}
	
	
	
	

}
