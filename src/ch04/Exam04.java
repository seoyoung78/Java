package ch04;

public class Exam04 {

	public static void main(String[] args) {

		char grade = 'D';
		
		switch (grade) {
			
			case 'A':
				System.out.println("Ŀ�Ǹ� �����մϴ�.");
				//break;
			case 'B':
				System.out.println("������ �ݴϴ�.");
				break;
			case 'C':
				System.out.println("�λ縸 �մϴ�.");
				break;
			default:
				System.out.println("�Ű澲�� �ʽ��ϴ�.");
			
		}
		
		//------------------------------------------
		
		if (grade == 'A') {
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
			System.out.println("������ �ݴϴ�.");
		} else if (grade == 'B') {
			System.out.println("������ �ݴϴ�.");
		} else if (grade == 'C') {
			System.out.println("�λ縸 �մϴ�.");
		} else {
			System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
		
	}

}
