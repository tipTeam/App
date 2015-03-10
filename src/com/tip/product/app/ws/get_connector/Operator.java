package com.tip.product.app.ws.get_connector;


import java.util.HashMap;
import java.util.List;

import com.tip.product.app.base.BaseInfo;
import com.tip.product.app.base.MessageStatus;
import com.tip.product.app.ibatis.SqlClient;



public class Operator {

	private boolean hasError = false;
	private StringBuilder errorBuf = new StringBuilder(256);
	
	public Response process(Request request) {
		//������������Ϣ�����ɷ�����Ϣ
		Response response = this.check(request);
		//����д���ֱ�ӷ���
		if(this.hasError){
			return response;
		}		

		RequestMessage requestMessage = request.getMessage();
		ResponseMessage responseMessage = response.getMessage();

		int baseId = 0;
		try {
			//���������Ϣ
		//	baseId = BaseInfoManager.save(this.getClass().getPackage().getName(),request.getBaseInfo());
			//��ʼҵ����
			HashMap<String,Object> params = new HashMap<String,Object>();
			RequestItem[] requestItems = requestMessage.getItems();	
			
		
			// ���ݿ� ����ӿڲ���		
			List<ResponseItem> responseItemLists= SqlClient.getInstance().queryForList("get_friend_list");
			
			ResponseItem[] responseItems = new ResponseItem[responseItemLists.size()];
			responseItemLists.toArray(responseItems);
			responseMessage.setItems(responseItems);
		} catch (Exception e) {
			responseMessage.setType(MessageStatus.ERROR);
			e.printStackTrace();
		//	responseMessage.setErrorMsg(e.getMessage());
		//	BaseInfoManager.saveException(baseId, e.getMessage());
		} finally {
			//���÷�����Ϣ
			response.setMessage(responseMessage);
			//���´���״̬
		//	BaseInfoManager.updateStatus(request.getBaseInfo(),responseMessage.getType());
		}

		return response;
	}
	
	private Response check(Request request){		
		Response response = new Response();
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setType(MessageStatus.SUCCESS);
		//responseMessage.setErrorMsg("");
		
		//�õ�������Ϣ
		BaseInfo requestInfo = request.getBaseInfo();
		//������Ϣ�Լ�
		this.errorBuf.append(requestInfo.checkSelf());
		
		//�õ�ҵ����Ϣ
		RequestMessage requestMessage = request.getMessage();
		RequestItem[] requestItems = requestMessage.getItems();
		
		//ҵ����Ϣ���Լ�
		for(RequestItem requestItem:requestItems){			
			this.errorBuf.append(requestItem.checkSelf());
		}	
		
		//������Ϣ��Ϊ��
		if(this.errorBuf.length()>0){
			this.hasError = true;
			responseMessage.setType(MessageStatus.ERROR);
		//	responseMessage.setErrorMsg(this.errorBuf.toString());
		}
		
		//���÷�����Ϣ
		response.setMessage(responseMessage);
		response.setBaseInfo(requestInfo.buildResponse());
		
		return response;
		
	}
}
