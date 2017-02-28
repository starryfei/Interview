package com.sort;

/*
 *@ 冒泡排序思想:比较两个元素的关键字值，若按升序排序，则每一次将被扫描的数据序列中的最大元素交换到最后位置
 * 外层循环：进行最多n-1次扫描
 * 内层循环：进行一趟扫描的比较和交换
 */
public class BubbleSort {
	public static void bubbleSort(int[] table) {
		int length = table.length;
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < length-i; j++) {
				if (table[j] > table[j+1]) {
					int temp = table[j];
					table[j] = table[j+1];
					table[j+1] = temp;
				}		
			}
			System.out.println("第"+i+"次： ");
			for (int k = 0; k < length; k++) {
				System.out.print(table[k]+"  ");
			}
			System.out.println("");	
		}
	}
	public static void main(String[] args) {
		int[] table ={32,26,87,72,26,17};
		bubbleSort(table);
	}
}
