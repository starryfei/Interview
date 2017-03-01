package com.SingleTon;

public class SingleTon {

	/* ����ģʽ��Singleton Pattern���� Java
	         ����򵥵����ģʽ֮һ���������͵����ģʽ���ڴ�����ģʽ��
	         ���ṩ��һ�ִ����������ѷ�ʽ��
	        ����ģʽ�漰��һ����һ���࣬���ฺ�𴴽��Լ��Ķ���
	      ͬʱȷ��ֻ�е������󱻴�����
	   ������ṩ��һ�ַ�����Ψһ�Ķ���ķ�ʽ������ֱ�ӷ��ʣ�����Ҫʵ��������Ķ���
	  */
	
	/* private static SingleTon instance = null; ˽�й��췽������ֹ��ʵ����
	 *  private  SingleTon() { 
	 *  } 
	*/
	//1������ʽ���̲߳���ȫ
	/*public static synchronized Singleton getInstance() {
	    if (instance == null) {
	        instance = new Singleton();
	    }
	    return instance;
	}*/
	// 2��˫�ؼ�����ģʽ
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
	/*
	 *  ��̬���̷���������ʵ�� 
	 *  public static SingleTon getInstance() {
	 * 		if(instance == null) {
	 * 		 synchronized (instance) {
	 * 			 if(instance == null)
	 * 				instance = new SingleTon();
	 * 			 }
	 * 			} 
	 * 		return instance;
	 *  } 
	 */
	// 3������ʽ static final field       ***�Ƽ�ʹ��***
	// ���� SingleTon ��һ������
	/*private static final SingleTon instance = new SingleTon();

	// �ù��캯��Ϊ private����������Ͳ��ᱻʵ����
	private SingleTon() {	}

	// ��ȡΨһ���õĶ���
	public static SingleTon getInstance() {
		return instance;
	}*/
	
	
	//4����̬�ڲ��� static nested class			***�Ƽ�ʹ��***
	 private static class SingletonHolder {  
	        private static final SingleTon INSTANCE = new SingleTon();  
	    }  
	    private SingleTon (){}  
	    public static final SingleTon getInstance() {  
	        return SingletonHolder.INSTANCE; 
	    }  
	
	public void showMessage() {
		System.out.println("Hello World!");
	}

}
