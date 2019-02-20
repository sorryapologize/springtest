package cn.pro.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import cn.pro.dao.ICustormerDao;
import cn.pro.service.CustormerService;



public class BeanFactory {
	//读取properties文件
	
	//a 定义一个properties对象
	/*private static Properties props =null;
	
	//b定义静态代码块
	static{
		
		try {
			InputStream in = BeanFactory.class.getClassLoader()
					.getResourceAsStream("bean.properties");
			
			//InputStream in = new FileInputStream("src/bean.properties");  不要使用在web工程中会报空指针
			props.load(in);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError("读取配置文件失败" + e);
		}
	}*/
	
	//1.上面那么多可用于下面一句    它只能用于读取properties文件别的文件读不了
	//2.只能用于读取，不能用于写入。
	//3.只能用于读取类路径下的文件
	//注意参数的写法是按照包名类名的方式写的，所以请不要写扩展名。
	private static ResourceBundle bundle= ResourceBundle.getBundle("bean");
	
	
	
	
	
	public static Object getBean(String beanName){
		try {
			//1.读取配置文件，根据beanName获取全限定类名
			//String beanPath=props.getProperty(beanName);
			
			String beanPath=bundle.getString(beanName);
			
			return Class.forName(beanPath).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	
	
	//下面方法的局限性比较大，一个方法只能返回一个对象
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
