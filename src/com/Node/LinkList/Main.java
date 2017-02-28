package com.Node.LinkList;

public class Main {
  public static void main(String[] args) {
	SinglyLinkedList<Integer > singlyLinkedList = new SinglyLinkedList<>();
	singlyLinkedList.insert(1, 12);
	singlyLinkedList.insert(2, 2);
	
	System.out.println("-------------------");
	System.out.println(singlyLinkedList.length()+" "+singlyLinkedList.get(1));
	for(int i=0;i<singlyLinkedList.length();i++){
		System.out.print(singlyLinkedList.get(i)+" ");
		
	}
		
  }
}
