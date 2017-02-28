package com.sort;

/*
 * Ï£¶ûÅÅÐò
 * 
 */
public class ShellSort {
	public static void shellSort(int[] table) {
		for(int delta=table.length/2;delta>0;delta/=2){
			for(int i =delta;i<table.length;i++){
				int temp = table[i],j;
				for(j =i- delta;j>=0&&temp<table[j];j-=delta){
					table[j+delta] = table[j];
				}
				table[j+delta] = temp;
			}
			for(int k=0;k<table.length;k++){
				System.out.print(table[k]+ " ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int[] table={27,38,65,97,76,13,27,49,55,4};
		shellSort(table);
	}

}
