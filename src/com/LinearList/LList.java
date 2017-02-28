package com.LinearList;


/*
 * 线性表的顺序存储结构
 * 
 */
public interface LList<E> {
	
	void insert(int i, E x);

	int length();

	E remove(int i);

	E get(int i);

	E search(int i);
	void set(int i,E x);
}
