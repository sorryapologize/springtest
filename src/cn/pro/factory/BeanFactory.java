package cn.pro.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import cn.pro.dao.ICustormerDao;
import cn.pro.service.CustormerService;



public class BeanFactory {
	//��ȡproperties�ļ�
	
	//a ����һ��properties����
	/*private static Properties props =null;
	
	//b���徲̬�����
	static{
		
		try {
			InputStream in = BeanFactory.class.getClassLoader()
					.getResourceAsStream("bean.properties");
			
			//InputStream in = new FileInputStream("src/bean.properties");  ��Ҫʹ����web�����лᱨ��ָ��
			props.load(in);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError("��ȡ�����ļ�ʧ��" + e);
		}
	}*/
	
	//1.������ô�����������һ��    ��ֻ�����ڶ�ȡproperties�ļ�����ļ�������
	//2.ֻ�����ڶ�ȡ����������д�롣
	//3.ֻ�����ڶ�ȡ��·���µ��ļ�
	//ע�������д���ǰ��հ��������ķ�ʽд�ģ������벻Ҫд��չ����
	private static ResourceBundle bundle= ResourceBundle.getBundle("bean");
	
	
	
	
	
	public static Object getBean(String beanName){
		try {
			//1.��ȡ�����ļ�������beanName��ȡȫ�޶�����
			//String beanPath=props.getProperty(beanName);
			
			String beanPath=bundle.getString(beanName);
			
			return Class.forName(beanPath).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	
	
	//���淽���ľ����ԱȽϴ�һ������ֻ�ܷ���һ������
	/*public static CustormerService getCustormerService(){ 
		try {
			return (CustormerService) Class.forName("cn.pro.service.impl.CustormerServiceimpl").newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
		
	}
	
	
	public static ICustormerDao getICustormerDao(){
		try {
			return (ICustormerDao) Class.forName("cn.pro.dao.impl.ICustormerDaoimpl").newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
		
		
	}*/
}
