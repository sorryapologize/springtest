package cn.pro.factory;

import cn.pro.service.CustormerService;

public class BeanFactory {
	public static CustormerService getCustormerService(){
		return Class.forName("cn.pro.service.impl.CustormerServiceimpl").newInstance();
		
		
		
	}
}
