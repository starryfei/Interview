package com.sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 18, 4, 15, 6, 12, 48, 9 };
		for (int a = 0; a < array.length; a++) {
			System.out.print(array[a] + "  ");
		}
		System.out.println("");
		quicksort(array, 0, array.length - 1);
	}

	public static void quicksort(int[] array, int begin, int end) {
		if (begin >= end) {
			return;
		}
		int key = array[(begin + end) / 2];
		int i = begin;
		int j = end;
		while (i <= j) {
			if (array[i] < key && i <= j) {
				i++;
			}
			if (array[j] > key && i <= j) {
				j--;
			}
			int temp = 0;
			temp = array[j];
			array[j] = array[i];
			array[i] = temp;
			i++;
			j--;
		}

		for (int a = 0; a < array.length; a++) {

			System.out.print(array[a] + " ");
		}
		quicksort(array, begin, j);
		quicksort(array, i, end);
	}

	public static void quickSort(int[] array, int begin, int end) {

		if (begin < end) {
			int temp = 0;
			int i = begin;
			int j = end;
			int key = array[i];
			while (i != j) {
				while (i < j && key <= array[j]) {
					j--;
				}
				if (i < j) {
					temp = array[j];
					array[j] = array[i];
					array[i++] = temp;
				}
				while (i < j && key >= array[i]) {
					i++;
				}
				if (i < j) {
					temp = array[i];
					array[i] = array[j];
					array[j--] = temp;
				}
				for (int a = 0; a <= array.length - 1; a++)
					System.out.print(array[a] + "  ");
				System.out.println(" ");
			}
			array[i] = key;// 基准到达最终位置,从基准分成两部分
			for (int a = 0; a <= array.length - 1; a++)
				System.out.print(array[a] + "  ");
			System.out.println(" ");
			// quickSort(array, begin, i - 1);
			// quickSort(array, j + 1, end);

		}
	}

}
