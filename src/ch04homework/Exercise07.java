package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
				
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			
			int selectNum = scanner.nextInt();
			
			if (selectNum == 1) {
				System.out.print("���ݾ�>");
				balance += scanner.nextInt();
				continue;
				
			} else if (selectNum == 2) {
				System.out.print("��ݾ�>");
				balance -= scanner.nextInt();
				continue;
				
			} else if (selectNum == 3) {
				System.out.print("�ܰ�>" + balance);
				System.out.println();
				continue;
				
			} else if (selectNum == 4) {
				System.out.println();
				run = false;
			} 
			
		}
		
		System.out.println("���α׷� ����");
	}

}
