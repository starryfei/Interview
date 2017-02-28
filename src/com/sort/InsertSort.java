package com.sort;

public class InsertSort {
	public static void main(String[] args) {
		int[] table = { 3, 4, 0, 1, 6 };
		insertSort(table);

	}

	/*
	 * ֱ�Ӳ��������㷨˼�룺 
	 * 1.�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
	 * 2.ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ��
	 * 3.�����ɨ���Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ�غ���һλ
	 * 4.�ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��
	 * 5.����Ԫ�ز��뵽��λ�ú�
	 * 6.�ظ�����2~5
	 * 
	 * ʱ�临�Ӷȣ��o(n^2)
	 *  	        ���o(n)
	 * �ռ临�Ӷȣ�o(1),�ȶ������㷨
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
			System.out.print("��" + i + "��:  ");
			for (int a = 0; a < table.length; a++) {
				System.out.print(table[a]);
			}
			System.out.println();
		}

	}
}
