package com.stack;

public class Main {
	public static void main(String[] args) {
		SeqStack<String> seqStack = new SeqStack<String>(5);
		seqStack.push("2");
		seqStack.push("3");
		seqStack.push("4");
		System.out.println("ȡ��ջ��Ԫ��"+seqStack.get());
		//�������
		
		while (!seqStack.isEmpty()) {
		          System.out.print(seqStack.pop());
//		          System.out.println(seqStack.isEmpty());
		       }
	}
}
