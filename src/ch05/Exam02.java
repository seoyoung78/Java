package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {

		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);

		int[] scores2 = null;
		scores2 = new int[] {10, 20, 30}; //NullPointerExcepion 발생
		
		//메소드 호출
		add(scores1);
		add(scores2);
		add(new int[] {100, 200, 300}); //add에 이미 변수가 선언 되어있기 때문
	}

	//메소드 선언
	public static void add(int[] arr) {
		System.out.println("값: " + Arrays.toString(arr));
	}
}
