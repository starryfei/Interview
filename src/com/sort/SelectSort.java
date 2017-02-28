package com.sort;

public class SelectSort {
	/*
	 * ѡ������˼��:��n��Ԫ����ѡ����С��һ���ŵ���ǰλ�ã���һ�δ�n-1��ѡ����С�ķŵ��ڶ���λ�á�������
	 * ʱ�临�Ӷ�o(n^2)
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
			System.out.println("��" + (i+1) + "�Σ�");
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
