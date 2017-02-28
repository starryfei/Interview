package com.sort;

/*
 * �鲢����
 */
public class MergeSort {
	/**
	 * һ�ι鲢
	 * @param X
	 * @param Y
	 * @param m ǰһ��������ʼ�±�
	 * @param r ��һ����������ʼ�±�
	 * @param n ��һ�������г���
	 */
	public static void merge(int[] X, int[] Y, int m, int r, int n) {
		int i = m, j = r, k = m;
		while (i < r && j < r + n && j < X.length) {
			if (X[i] < X[j])
				Y[k++] = X[i++];
			else
				Y[k++] = X[j++];
		}
		while (i < r)
			Y[k++] = X[i++];
		while (j < r + n && j < X.length)
			Y[k++] = X[j++];
	}

	/**
	 * һ�˹鲢
	 * @param X
	 * @param Y
	 * @param n �����г���
	 */
	public static void mergepass(int[] X, int[] Y, int n) {
		int i=0;
		while(i<X.length-2*n+1){
			merge(X, Y, i, i+n, n);
			i+=i*2;
		}
		if(i+n<X.length){
			merge(X, Y, i, i+n, n);
		}else
			for(int j=i;j<X.length;j++){
				Y[j]=X[j];
			}
		for(int a=0;a<X.length;a++)
			System.out.print(X[a]);
	}
/**
 * 	
 * @param X
 */
	public static void mergeSort(int[] X) {
		int[] Y = new int[X.length];
		int n=1;
		while(n<X.length){
			mergepass(X, Y, n);
			n=n*2;
			if(n<X.length){
				mergepass(Y, X, n);
				n=n*2;
			}
			
		}
	}
	public static void main(String[] args) {
		int[] table={52,26,97,19,66,8,49};
		mergeSort(table);
	}
}
