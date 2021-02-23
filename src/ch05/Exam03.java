package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {

		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1; // 번지 복사 -> 참조하는 객체 동일
		
		System.out.println(scores1 == scores2); //F 별도 배열, 값만 동일
		System.out.println(scores1 == scores3); //T 동일 주소, 참조 값 동일
		
	}
}
