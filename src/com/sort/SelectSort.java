package com.sort;

public class SelectSort {
	/*
	 * 选择排序思想:从n个元素中选择最小的一个放到最前位置，下一次从n-1个选择最小的放到第二个位置。。。。
	 * 时间复杂度o(n^2)
	 * 
	 */
	public static void selectSort(int[] table) {
		int length = table.length;
		int i;
		for (i = 0; i < length; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (table[min] > table[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = table[i];
				table[i] = table[min];
				table[min] = temp;
			}
			System.out.println("第" + (i+1) + "次：");
			for (int a = 0; a < length; a++)
				System.out.print(table[a] + "  ");
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		int[] table = { 3, 4, 0, 1, 5, 6 };
		selectSort(table);
		
	}
}
