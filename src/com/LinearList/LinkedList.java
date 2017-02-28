package com.LinearList;

public class LinkedList<E> implements LList<E> {
	private Object[] element;
	private int len;

	public LinkedList(int size) {
		this.element = new Object[size];
		this.len = 0;
	}

	@Override
	public void insert(int i, E x) {
		if (x == null) {
			return;
		}
		// System.out.println("len的长度"+this.len);
		if (this.len == element.length) {
			Object[] temp = this.element;
			this.element = new Object[temp.length * 2];
			for (int j = 0; j < temp.length; j++) {
				this.element[j] = element[j];
				// System.out.println("复制新表"+this.element[j]);
			}
			// System.out.println("不能插入");
		}
		if (i < 0)
			System.out.println("下标容错");
		if (i > this.len)
			i = this.len;
		for (int j = this.len - 1; j >= i; j--)
			this.element[j + 1] = this.element[j];
		this.element[i] = x;
		this.len++;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return len;
	}

	@Override
	public E remove(int i) {
		if (i < 0 || i >= len) {
			return null;
		}
		E data = (E) this.element[i];
		for (int j = i; j < this.len - 1; j++) {
			this.element[j] = this.element[j + 1];

		}
		this.element[this.len - 1] = null;
		this.len--;

		return data;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		if (i >= 0 && i < this.len)
			return (E) this.element[i];
		return null;
	}

	@Override
	public E search(int i) {
		// TODO Auto-generated method stub
		E data = (E) this.element[i];
		for (int j = 0; j < this.len - 1; j++) {
			if (i == j) {
				System.out.println("search：" + this.element[i]);
				return (E) this.element[i];
			}
		}
		System.out.println("search：" + i + "的值为" + data);
		return data;
	}

	@Override
	public void set(int i, E x) {
		// TODO Auto-generated method stub
		if(x == null){
			return;
		}
		if(i>0 &&i<this.len){
			this.element[i] =x;
		}else{
			throw new IndexOutOfBoundsException();
		}
	}
}
