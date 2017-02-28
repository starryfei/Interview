package com.stack;

public class Main {
	public static void main(String[] args) {
		SeqStack<String> seqStack = new SeqStack<String>(5);
		seqStack.push("2");
		seqStack.push("3");
		seqStack.push("4");
		System.out.println("取出栈顶元素"+seqStack.get());
		//遍历输出
		
		while (!seqStack.isEmpty()) {
		          System.out.print(seqStack.pop());
//		          System.out.println(seqStack.isEmpty());
		       }
	}
}
