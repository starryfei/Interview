package com.Factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ͨ����ģʽ
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("mail");
		sender.Sends();
		//�����������ģʽ
		SendFactory factory1 = new SendFactory();  
        Sender sender1 = factory.produceMail();  
        sender1.Sends();
        
        //��̬��������ģʽ
        Sender sender2= SendFactory.produceSms();  
        sender2.Sends();  
		/*
		 * ������˵������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д����������ϵ�����ģʽ�У�
		 * ��һ�����������ַ������󣬲�����ȷ�������� ������������ڵڶ��֣�����Ҫʵ����������
		 * �����ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
		 */
	}

}
