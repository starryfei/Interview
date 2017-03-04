package com.AnotherSort;

import java.security.KeyStore.Entry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SortMessage {
	public static void main(String[] args) throws ParseException {
		List<Message> array = new ArrayList<Message>();
		// Message[] message =null;
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String time1 = "2017-03-04 10:50:32";
		String time2 = "2017-03-04 10:49:32";
		String time3 = "2017-03-04 10:51:32";
		String time4 = "2017-03-04 10:52:32";

		Date date1 = dateFormat.parse(time1);
		Date date2 = dateFormat.parse(time2);
		Date date3 = dateFormat.parse(time3);
		Date date4 = dateFormat.parse(time4);
		array.add(new Message("张三", date1, "ddd"));
		array.add(new Message("李四", date2, "ddda"));
		array.add(new Message("张三", date3, "dddd"));
		array.add(new Message("王五", date4, "dddf"));
		array.add(new Message("王五", date4, "dddd"));
		array.add(new Message("22", date4, "dddd"));
		
		// 实现Comparator比较，实现Comparator类来新建一个比较器
		Collections.sort(array, new CustomComparator1());
		// 实现Comparable比较，实现Comparable接口的类的对象
		// Collections.sort(array);
		for (Message message1 : array) {
			System.out.println(message1);
		}
		count(array);
	}
	public static void count(List<Message> array) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Message message = new Message();
		
		for (Message message1 : array) {
			Integer coun=1;
			if(map.containsKey(message1.getName()))
				coun++;
		   map.put(message1.getName(), coun);
		}
	
		System.out.println(map);	
	}
}
