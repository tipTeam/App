package com.tip.product.app.ws.get_patient_index;

import com.tip.product.app.base.BaseInfo;

public class Response {
	
	private BaseInfo baseInfo;
	
	private ResponseMessage Message;

	public ResponseMessage getMessage() {
		return Message;
	}

	public void setMessage(ResponseMessage message) {
		Message = message;
	}

	public BaseInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}
	
	

}
