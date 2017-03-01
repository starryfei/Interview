package com.SingleTon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleTon singleTon = new SingleTon();
		
		//获取唯一可用的对象
		SingleTon singleTon =SingleTon.getInstance();
		singleTon.showMessage();
	}

}
