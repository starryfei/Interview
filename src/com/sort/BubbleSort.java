package com.sort;

/*
 *@ ð������˼��:�Ƚ�����Ԫ�صĹؼ���ֵ����������������ÿһ�ν���ɨ������������е����Ԫ�ؽ��������λ��
 * ���ѭ�����������n-1��ɨ��
 * �ڲ�ѭ��������һ��ɨ��ıȽϺͽ���
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
			System.out.println("��"+i+"�Σ� ");
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
