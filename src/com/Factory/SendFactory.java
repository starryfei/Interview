package com.Factory;

//��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
public class SendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("message".equals(type)) {
			return new SmsSender();
		} else
			System.out.println("��������ȷ������");
		return null;

	}
	//�����������ģʽ
	/* public Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public Sender produceSms(){  
	        return new SmsSender();  
	    } */
	    //��̬��������ģʽ
	    public static Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public static Sender produceSms(){  
	        return new SmsSender();  
	    }  
}
