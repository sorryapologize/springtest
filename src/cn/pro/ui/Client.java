package cn.pro.ui;

import cn.pro.factory.BeanFactory;
import cn.pro.service.CustormerService;
import cn.pro.service.impl.CustormerServiceimpl;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustormerService service = new CustormerServiceimpl();
		
		//�������ĳ��������ͽ����������ϵ
		//CustormerService service =BeanFactory.getCustormerService();
		CustormerService service = (CustormerService) BeanFactory.getBean("CUSTORMERSERVICE");
		
		service.saveCustormer();
	}

}
