package ch10.exam06;

public class Account {
	public void deposit(String account, int money) throws NoAccountException{
		if (account == null) {
			//예외 발생 코드
			throw new NoAccountException("입금 계좌가 없습니다."); 
			//예외처리 다양화를 위해 발생하는 곳에서 정의 하도록 알려주기만 하는 기능
		}
		System.out.println("입금 성공");
	}
	
	public void withdraw(String account, int money)
			throws NoAccountException, BalanceLackException {
		int balance = 10000;
		if (account == null) {
			//예외 발생 코드
			throw new NoAccountException("출금 계좌가 없습니다.");
		} else if (money > balance) {
			throw new BalanceLackException("잔고가 부족합니다."); 
		} else {
			System.out.println("출금 성공");
		}
	}
}
