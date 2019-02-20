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
		
		//上面代码改成下面代码就解决了依赖关系
		//CustormerService service =BeanFactory.getCustormerService();
		CustormerService service = (CustormerService) BeanFactory.getBean("CUSTORMERSERVICE");
		
		service.saveCustormer();
	}

}
