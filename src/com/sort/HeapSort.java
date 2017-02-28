package com.sort;


/*
 * @������
 * ʱ�临�Ӷ�ΪO(n*log2n)
 * �ռ临�Ӷ�ΪO(1),���ȶ��㷨
 */
public class HeapSort {
	private static void sift(int[] table, int begin, int end) {
		int i = begin;
		int j = 2 * i + 1;//�ڵ�i������
		int temp = table[i];
		while (j <= end) {
			if (j < end && table[j] > table[j + 1])
				j++;//Ϊ���Һ��ӽ�С��
			if (temp > table[j]) {
				table[i] = table[j];
				i = j;
				j = 2 * i + 1;//����һ���ƶ�
			} else
				break;
		}
		table[i] = temp;//��ǰ����ԭ�������λ��
		
	}

	public static void heapSort(int[] table) {
		int length = table.length;
		System.out.println("��ʼ������");
		//������С�ѣ������һ���к��ӵĽڵ㿪ʼ����ʼλ��Ϊlength / 2 - 1
		for (int j = length / 2 - 1; j >= 0; j--) {
			sift(table, j, length);
			for(int a=0;a<length;a++){
				System.out.print(table[a]+" ");
			}
			System.out.println("");
		}
		//ÿ�˰���Сֵ����������棬�ڵ�����
		for (int j = length - 1; j > 0; j--) {
			int temp = table[0];
			table[0] = table[j];
			table[j] = temp;
			sift(table, 0, j - 1);
			
		}
		System.out.println("������������� ");
		for(int a=0;a<length;a++){
			System.out.print(table[a]+" ");
		}
		System.out.println("");
		
	}
	public static void main(String[] args) {
		int[] table ={81,49,38,27,97,76,19,13,32};
		heapSort(table);
	}
}
