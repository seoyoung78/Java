package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {

		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1; // ���� ���� -> �����ϴ� ��ü ����
		
		System.out.println(scores1 == scores2); //F ���� �迭, ���� ����
		System.out.println(scores1 == scores3); //T ���� �ּ�, ���� �� ����
		
	}
}
