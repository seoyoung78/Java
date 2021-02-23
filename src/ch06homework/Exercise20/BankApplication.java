package ch06homework.Exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
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
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		for (int i = 0; i <= accountArray.length; i++) {
			if (accountArray[i] == null) {
				System.out.print("계좌변호: ");
				accountArray[i].setAno(scanner.nextLine());
				System.out.print("계좌주: ");
				accountArray[i].setOwner(scanner.nextLine());
				System.out.print("초기입금액: ");
				accountArray[i].setBalance(scanner.nextInt());
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
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
	
	//예금하기
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		
		System.out.println("---------");
		System.out.println("계좌번호: ");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray == null) {
				continue;
			} else if (accountArray[i].getAno().equals(scanner.nextLine())) {
				System.out.println("예금액: ");
				accountArray[i].setBalance(accountArray[i].getBalance() + scanner.nextInt());
				break;
			}
		}
		
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.println("계좌번호: ");
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray == null) {
				continue;
			} else if (accountArray[i].getAno().equals(scanner.nextLine())) {
				System.out.println("출금액: ");
				accountArray[i].setBalance(accountArray[i].getBalance() - scanner.nextInt());
				break;
			}
		}
				
		System.out.println("결과: 출금이 성공되었습니다.");
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
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
