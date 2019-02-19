package cn.pro.ui;

import cn.pro.service.CustormerService;
import cn.pro.service.impl.CustormerServiceimpl;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustormerService service = new CustormerServiceimpl();
		service.saveCustormer();
	}

}
