package ch11.exam05;

import java.util.Arrays;

public class String01 {

	public static void main(String[] args) throws Exception {
		byte[] arr1 = {65, 66, 67};
		String str1 = new String(arr1);
		System.out.println(str1);
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR"); //한글 1자는 2바이트로 표시 - 영어와 한글만 지원
		byte[] arr32 = str3.getBytes("UTF-8");	//한글 1자는 3바이트로 표시 - 전세계 언어 지원(인터넷 표준)
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		
		String str4 = new String(arr31, "EUC-KR"); //만든 것과 동일하게 복원도
		String str5 = new String(arr32, "UTF-8");
		System.out.println(str4);
		System.out.println(str5);
	}

}
