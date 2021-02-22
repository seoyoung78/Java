package ch06homework.Exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//���»����ϱ�
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("---------");
		
		for (int i = 0; i <= accountArray.length; i++) {
			if (accountArray[i] == null) {
				System.out.print("���º�ȣ: ");
				accountArray[i].setAno(scanner.nextLine());
				System.out.print("������: ");
				accountArray[i].setOwner(scanner.nextLine());
				System.out.print("�ʱ��Աݾ�: ");
				accountArray[i].setBalance(scanner.nextInt());
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("---------");
		
		for (int i = 0; i <= accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t"
									+ accountArray[i].getOwner() + "\t"
									+ accountArray[i].getBalance());
				} else {
					continue;
			}
		}
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("----------");
		System.out.println("����");
		
		System.out.println("---------");
		System.out.println("���¹�ȣ: ");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray == null) {
				continue;
			} else if (accountArray[i].getAno().equals(scanner.nextLine())) {
				System.out.println("���ݾ�: ");
				accountArray[i].setBalance(accountArray[i].getBalance() + scanner.nextInt());
				break;
			}
		}
		
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("���");
		System.out.println("---------");
		System.out.println("���¹�ȣ: ");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray == null) {
				continue;
			} else if (accountArray[i].getAno().equals(scanner.nextLine())) {
				System.out.println("��ݾ�: ");
				accountArray[i].setBalance(accountArray[i].getBalance() - scanner.nextInt());
				break;
			}
		}
				
		System.out.println("���: ����� �����Ǿ����ϴ�.");
		
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount (String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				continue;
			} else if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
	}
}
