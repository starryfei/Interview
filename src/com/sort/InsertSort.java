package com.sort;

public class InsertSort {
	public static void main(String[] args) {
		int[] table = { 3, 4, 0, 1, 6 };
		insertSort(table);

	}

	/*
	 * 直接插入排序算法思想： 
	 * 1.从第一个元素开始，该元素可以认为已经被排序
	 * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
	 * 3.如果被扫描的元素（已排序）大于新元素，将该元素后移一位
	 * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
	 * 5.将新元素插入到该位置后
	 * 6.重复步骤2~5
	 * 
	 * 时间复杂度：最坏o(n^2)
	 *  	        最好o(n)
	 * 空间复杂度：o(1),稳定排序算法
	 */
	public static void insertSort(int[] table) {
		int len = table.length;
		int j;
		int temp = 0;
		for (int i = 1; i < len; i++) {
			temp = table[i];
			for (j = i - 1; j >= 0 && table[j] > temp; j--) {
				table[j + 1] = table[j];
			}
			table[j + 1] = temp;
			System.out.print("第" + i + "趟:  ");
			for (int a = 0; a < table.length; a++) {
				System.out.print(table[a]);
			}
			System.out.println();
		}

	}
}
