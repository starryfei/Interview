package com.LinearList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
 public static void main(String[] args) {
	 Map map = new HashMap();
	 map.put("Rajib Sarma","100");
	 map.put("Rajib Sarma","200");//The value "100" is replaced by "200".
	 map.put("Sazid Ahmed","200");

	 Iterator iter = map.entrySet().iterator();
	 while (iter.hasNext()) {
	     Map.Entry entry = (Map.Entry) iter.next();
	     Object key = entry.getKey();
	     Object val = entry.getValue();
	     System.out.println(key+"  "+ val);
	 }
}
}
