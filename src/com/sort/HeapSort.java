package com.sort;


/*
 * @堆排序
 * 时间复杂度为O(n*log2n)
 * 空间复杂度为O(1),不稳定算法
 */
public class HeapSort {
	private static void sift(int[] table, int begin, int end) {
		int i = begin;
		int j = 2 * i + 1;//节点i的左孩子
		int temp = table[i];
		while (j <= end) {
			if (j < end && table[j] > table[j + 1])
				j++;//为左右孩子较小者
			if (temp > table[j]) {
				table[i] = table[j];
				i = j;
				j = 2 * i + 1;//向下一层移动
			} else
				break;
		}
		table[i] = temp;//当前子树原根的最后位置
		
	}

	public static void heapSort(int[] table) {
		int length = table.length;
		System.out.println("开始堆排序：");
		//创建最小堆，从最后一个有孩子的节点开始即起始位置为length / 2 - 1
		for (int j = length / 2 - 1; j >= 0; j--) {
			sift(table, j, length);
			for(int a=0;a<length;a++){
				System.out.print(table[a]+" ");
			}
			System.out.println("");
		}
		//每趟把最小值交换到最后面，在调整堆
		for (int j = length - 1; j > 0; j--) {
			int temp = table[0];
			table[0] = table[j];
			table[j] = temp;
			sift(table, 0, j - 1);
			
		}
		System.out.println("输出堆排序结果： ");
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
