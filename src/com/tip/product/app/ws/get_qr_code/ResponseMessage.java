package com.tip.product.app.ws.get_qr_code;

public class ResponseMessage {
	
	private String type;  // ״̬  S�� �ɹ�  E�� ʧ��
	
	private String errMsg;
	
	private ResponseItem[] items;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public ResponseItem[] getItems() {
		return items;
	}

	public void setItems(ResponseItem[] items) {
		this.items = items;
	}
	
	

}
