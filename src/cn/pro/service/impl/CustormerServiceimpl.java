package cn.pro.service.impl;

import cn.pro.dao.ICustormerDao;
import cn.pro.dao.impl.ICustormerDaoimpl;
import cn.pro.service.CustormerService;


//客户的业务层实现层
public class CustormerServiceimpl implements CustormerService{
	ICustormerDao custormerdao = new ICustormerDaoimpl();
	@Override
	public void saveCustormer() {
		// TODO Auto-generated method stub
		System.out.println("custormer saved!");
		custormerdao.SaveCustormer();
	}

}
