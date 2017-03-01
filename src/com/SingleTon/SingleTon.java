package com.SingleTon;

public class SingleTon {

	/* 单例模式（Singleton Pattern）是 Java
	         中最简单的设计模式之一。这种类型的设计模式属于创建型模式，
	         它提供了一种创建对象的最佳方式。
	        这种模式涉及到一个单一的类，该类负责创建自己的对象，
	      同时确保只有单个对象被创建。
	   这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象
	  */
	
	/* private static SingleTon instance = null; 私有构造方法，防止被实例化
	 *  private  SingleTon() { 
	 *  } 
	*/
	//1、懒汉式，线程不安全
	/*public static synchronized Singleton getInstance() {
	    if (instance == null) {
	        instance = new Singleton();
	    }
	    return instance;
	}*/
	// 2、双重检验锁模式
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	/*
	 *  静态工程方法，创建实例 
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
	// 3、饿汉式 static final field       ***推荐使用***
	// 创建 SingleTon 的一个对象
	/*private static final SingleTon instance = new SingleTon();

	// 让构造函数为 private，这样该类就不会被实例化
	private SingleTon() {	}

	// 获取唯一可用的对象
	public static SingleTon getInstance() {
		return instance;
	}*/
	
	
	//4、静态内部类 static nested class			***推荐使用***
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
