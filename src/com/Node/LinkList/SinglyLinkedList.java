package com.Node.LinkList;

import com.Node.LinkList.LList;

public class SinglyLinkedList<E> implements LList<E> {
	public Node<E> head;
	int size;
	public SinglyLinkedList() {
		this.head = new Node<E>();// 构造空单链表，创建头结点，值均为null
		this.size =0;
//		System.out.println("构造空单链表，创建头结点，值均为null");
	}

//	public SinglyLinkedList(E[] element) {
//		this();
//		Node<E> rear = this.head;
//		for(int i=0;i<element.length;i++){
//			rear.next = new Node<E>(element[i], null);
//			rear =rear.next;
//		}
//	}

	@Override
	public void insert(int i, E x) {
		// TODO Auto-generated method stub
		if(x==null)
			return;
		Node<E> p = this.head;
		for(int j=0;j<i&&p.next!=null;j++){
			p=p.next;
		}
		p.next = new Node<E>(x,p.next);
		//等价于q.next = p.next; p.next = q;
	}

	@Override
	public int length() {
		int i=0;
		Node<E> p =this.head.next;
		while(p!=null){
			i++;
			p=p.next;
		}
		return i;
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		if(i>=0){
			Node<E> p = this.head.next;
			for(int j=0;p!=null&&j<i;j++){
				p =p.next;
				if(p!=null)
					return p.data;
			}
		}
		return null;
	}

	@Override
	public E search(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, E x) {
		// TODO Auto-generated method stub

	}

}
