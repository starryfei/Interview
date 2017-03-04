package com.AnotherSort;

import java.util.Comparator;

public class CustomComparator1 implements Comparator<Message> {


	@Override
	public int compare(Message o1, Message o2) {
		// TODO Auto-generated method stub
//		if(o1.getDate().equals(o2.getDate())){
			return o1.getDate().compareTo(o2.getDate());
//		}
//		else 
//			return o1.getName().compareTo(o2.getName());
	}

}
