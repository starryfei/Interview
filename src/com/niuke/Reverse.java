package com.niuke;

public class Reverse {
	public static void main(String[] args) {
		String str = "I am a student. hahha dafafd";
		String newStr = reverse(str);
		System.out.println(newStr);
	}

	public static  String reverse(String str) {
		StringBuffer stringBuffer = new StringBuffer("");// 分配了长16字节的字符缓冲区
		// 使用split()方法可以使字符串按指定的分隔字符或字符串对内容进行分割，并将分割后的结果存放在字符数组中。
		String[] strSet = str.split(" ");
		int length = strSet.length;
		for (int i = length - 1; i >= 0; i--) {
			stringBuffer.append(strSet[i] + " ");
		}
		return stringBuffer.toString();
	}
}
