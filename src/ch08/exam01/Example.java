package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television(); //Audio라는 객체를 인터페이스로 사용
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
