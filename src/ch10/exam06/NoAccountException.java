package ch10.exam06;

public class NoAccountException extends RuntimeException {
	public NoAccountException() {}
	public NoAccountException (String message) { //예외 이유 입력
		super(message); 
	}
}
