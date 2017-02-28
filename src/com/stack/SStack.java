package com.stack;

public interface SStack<T> {
	void push(T x);
	T pop();
	T get();
	boolean isEmpty();
}
