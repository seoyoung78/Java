package ch05;

public class Exam11 {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		//index �̿��ؼ� �ݺ�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
			
		}
		
		System.out.println();
		
		//����� ���� ���� ��ŭ �ݺ�
		for (int value : arr) {
			System.out.print(value + ", ");
		}

	}

}
