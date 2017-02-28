package com.search;

import com.Node.LinkList.SinglyLinkedList;

public class HashSet<E> {
	private SinglyLinkedList<E>[] table;
	public  HashSet(int size ) {
		this.table = new SinglyLinkedList[Math.abs(size)];
		for (int i = 0; i < table.length; i++) {
			table[i] =new SinglyLinkedList<E>();
		}
	}
	public HashSet(){
		this(97);
	}
	private int hash(E x){
		int key=Math.abs(x.hashCode());
		return key%table.length;
	}
	public void insert(E x) {
		table[hash(x)].insert(0, x);
		
	}
//	public void remove(E x) {
//		table[hash(x)].remove(x);
//	}
	/*public T search(E key) {
		return table[hash(key)].search(key);
	}*/
}
