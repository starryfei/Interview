package com.search;

public class BinarySearch {
	/**
	 * 折半查找
	 * @param table
	 * @param key
	 * @param begin
	 * @param end
	 */
public static void binarySearch(int[] table,int key,int begin,int end) {
	while(begin<=end){
		int mid =(begin+end)/2;
		System.out.println("mid="+mid);
		if(key<table[mid])
			end = mid-1;
		else if(key>table[mid])
			begin = mid+1;
		else if(key == table[mid]){
			
			System.out.println("key="+key+"所在的位置"+mid);
		break;
		}
	}	
}
public static void main(String[] args) {
	int[] table={8,17,26,32,40,44};
	binarySearch(table, 40, 0, table.length);
}
}
