package com.niuke;

public class Reverse {
	public static void main(String[] args) {
		String str = "I am a student. hahha dafafd";
		String newStr = reverse(str);
		System.out.println(newStr);
	}

	public static  String reverse(String str) {
		StringBuffer stringBuffer = new StringBuffer("");// �����˳�16�ֽڵ��ַ�������
		// ʹ��split()��������ʹ�ַ�����ָ���ķָ��ַ����ַ��������ݽ��зָ�����ָ��Ľ��������ַ������С�
		String[] strSet = str.split(" ");
		int length = strSet.length;
		for (int i = length - 1; i >= 0; i--) {
			stringBuffer.append(strSet[i] + " ");
		}
		return stringBuffer.toString();
	}
}
