package ch10.exam01;

import java.io.FileInputStream;

public class Example {
	
	public static void main(String[] args) {
		
		int[] arr = null;
		arr[0] = 10; 
		//NullPointerException => ���� ���� (�����Ϸ��� üũ���� ����)
		
		//FileInputStream fi = new FileInputStream("C:/Temp/file.txt");
		// FileNotFoundException => �Ϲ� ����(������ üũ ����)
	}
}
