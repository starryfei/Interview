package com.stack;

public class SeqStack<T> implements SStack<T> {
	private Object element[];
	private int top;

	public SeqStack(int size) {
		// TODO Auto-generated constructor stub
		this.element = new Object[Math.abs(size)];
		this.top = -1;
	}

	@Override
	public void push(T x) {
		if (x == null)
			return;
		/*
		 * 判断栈的大小，如何栈小，
		 */
		if (this.top == element.length - 1) {
			Object[] temp = this.element;
			this.element = new Object[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				this.element[i] = temp[i];
			}
		}
		this.top++;
		this.element[this.top] = x;
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return this.top == -1 ? null : (T) this.element[this.top--];
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return this.top == -1 ? null : (T) this.element[this.top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		  return top == -1;
	}

}
