package com.niuke;

public class Shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 1, 2, 3 }, { 2, 5, 6 }, { 5, 8, 9 }, { 5, 8, 9 } };
		int col = array.length - 1;// �еĳ���
		int row = array[0].length - 1;// �еĳ���
		System.out.println(Find(array,10));
		/*
		 * [1,2,3] [2,5,6] [5.8.9] ���ж�������ĵ�һ�������һ��ֵ�ô�С
		 */
	}

	public static boolean Find(int[][] array, int target) {
		int col = array.length - 1;// �еĳ���
		int m =array[0].length-1;//�еĳ���
		int row = 0;
		while (row <= m && col >= 0) {
			if (target == array[col][row]) 
				return true;
	        else if (target > array[col][row])
				row++;
			 else 
				col--;
		}
			return false;

	}

}
