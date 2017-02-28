package com.LinearList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>(4);
		linkedList.insert(2, 31);
		linkedList.insert(0, 30);
		linkedList.insert(0, 20);
		linkedList.insert(1, 21);

		// linkedList.insert(3, 200);
		for (int i = 0; i < linkedList.length(); i++) {
			System.out.println("第" + i + "个数为" + linkedList.get(i));
		}
		linkedList.remove(2);
		for (int i = 0; i < linkedList.length(); i++) {
			System.out.println("第" + i + "个数为" + linkedList.get(i));
		}
		linkedList.search(1);
		linkedList.set(1, 1);
		for (int i = 0; i < linkedList.length(); i++) {
			System.out.println("第" + i + "个数为" + linkedList.get(i));
		}
	}

}
