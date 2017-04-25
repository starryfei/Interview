package com.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * 给出String[] temps数组，统计单词的出现的最多的频率的前十个
 * 
 * @author Administrator
 *
 */
public class GetCount {
	public static void main(String[] args) {
		String[] temps = { "aa", "bb", "cc", "dd", "cc", "dd", "dd", "ee",
				"ads", "aa", "bb", "cc", "dd", "dd", "ee", "ads", "123", "12",
				"123", "12" };
		total(temps);
	}

	public static void total(String[] temps) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < temps.length; i++) {
			if (map.containsKey(temps[i])) {
				int count=map.get(temps[i]);
				map.put(temps[i], count+1);

			}else{
				map.put(temps[i], 1);
			}
//				map.put(temps[i], 1);
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
