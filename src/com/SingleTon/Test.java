package com.SingleTon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ϸ��Ĺ��캯��
		// ����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
		// SingleTon singleTon = new SingleTon();
		
		//��ȡΨһ���õĶ���
		SingleTon singleTon =SingleTon.getInstance();
		singleTon.showMessage();
	}

}
