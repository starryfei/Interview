package com.LinearList;


/*
 * ���Ա��˳��洢�ṹ
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
