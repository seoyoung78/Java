package ch08.exam02;

public class Example {

	public static void method(RemoteControl rc) {
		//�����佺�� �����θ� ����ϴ� �ڵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	
	public static void main(String[] args) {
		
		RemoteControl rc = new Television(); //Audio��� ��ü�� �������̽��� ���
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		method(new Television() );
		method (new Audio());	
		
	}

}
