package com.tip.product.app.repository;

import java.util.HashMap;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.tip.product.app.base.BaseInfo;
import com.tip.product.app.base.IOperator;

public class BaseInfoDaoImpl extends SqlMapClientDaoSupport  implements IBaseInfoDao {

	public  BaseInfoDaoImpl(SqlMapClient sqlMapClient) {
		setSqlMapClient(sqlMapClient);
	}
	
	@Override
	public int save(IOperator Operator, BaseInfo baseInfo) {
		HashMap params=new HashMap();
		params.put("id", null);
		
		int baseId=-1;
		
		baseId= ((Integer) getSqlMapClientTemplate().insert("sss",baseInfo.buildMap())).intValue();
		Operator.saveRequstContent(getSqlMapClient(), baseId);

		return baseId;
	}

	@Override
	public boolean updateStatus(int paramInt, String paramString) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveException(int paramInt, String paramString) {
		// TODO Auto-generated method stub
		return false;
	}

}
