package com.tip.product.app.webservice;

import com.tip.product.app.ws.get_doctor_info.Operator;
import com.tip.product.app.ws.get_doctor_info.Request;
import com.tip.product.app.ws.get_doctor_info.Response;



public class SI_TIP_APP_GetDoctorInfo {

	public Response OP_Get_Doctor_Info(Request request){
		return new Operator().process(request);
	 }
	
}
