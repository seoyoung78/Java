package ch18.exam16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		
		//방법1
		/*InputStream is = System.in;
		 
		byte[] data = new byte[100];
		int readNum = is.read(data);
		String str = new String(data, 0 , readNum-2);
		System.out.println(str);
		
		readNum = is.read(data);
		str = new String(data, 0 , readNum-2);
		System.out.println(str);*/
		
		//방법2
		InputStream is = System.in; //바이트 넘어옴
		InputStreamReader isr = new InputStreamReader(is); //바이트를 문자로 변경
		BufferedReader br = new BufferedReader(isr); //한꺼번에 입력 받을 수 있음
		
		String str = br.readLine();
		System.out.println(str);
		str = br.readLine();
		System.out.println(str);
		
	}

}
