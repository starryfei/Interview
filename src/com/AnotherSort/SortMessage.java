package com.AnotherSort;

import java.util.Map.Entry;
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
		array.add(new Message("����", date1, "ddd"));
		array.add(new Message("����", date2, "ddda"));
		array.add(new Message("����", date3, "dddd"));
		array.add(new Message("����", date4, "dddf"));
		array.add(new Message("����", date4, "dddd"));
		array.add(new Message("22", date4, "dddd"));
		
		// ʵ��Comparator�Ƚϣ�ʵ��Comparator�����½�һ���Ƚ���
		Collections.sort(array, new CustomComparator1());
		// ʵ��Comparable�Ƚϣ�ʵ��Comparable�ӿڵ���Ķ���
		// Collections.sort(array);
		for (Message message1 : array) {
			System.out.println(message1);
		}
		count(array);
	}
	public static void count(List<Message> array) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (Message message1 : array) {
			if(map.containsKey(message1.getName())){
				 int coun = map.get(message1.getName());
				 map.put(message1.getName(), coun+1);
			}else{
				map.put(message1.getName(), 1);
			}
		  
		}
	
		 Iterator<Entry<String, Integer>> it = map.entrySet().iterator();  
	        while (it.hasNext()) {  
	            Map.Entry<String, Integer> entry =  it.next();  
	            String key = entry.getKey();  
	             Integer value = entry.getValue();  
	            System.out.println("key = " + key + "; value = " + value);  
	        }  	
	}
}
