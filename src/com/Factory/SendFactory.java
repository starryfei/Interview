package com.Factory;

//普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("message".equals(type)) {
			return new SmsSender();
		} else
			System.out.println("请输入正确的类型");
		return null;

	}
	//多个工厂方法模式
	/* public Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public Sender produceSms(){  
	        return new SmsSender();  
	    } */
	    //静态工厂方法模式
	    public static Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public static Sender produceSms(){  
	        return new SmsSender();  
	    }  
}
