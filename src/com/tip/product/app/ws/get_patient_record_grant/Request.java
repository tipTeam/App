package com.tip.product.app.ws.get_patient_record_grant;

import com.tip.product.app.base.BaseInfo;

public class Request {
	
	private BaseInfo baseInfo;
	
	private RequestMessage Message;
	

	public BaseInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public RequestMessage getMessage() {
		return Message;
	}

	public void setMessage(RequestMessage message) {
		Message = message;
	}
	
	

}
