package ch08.exam01;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("Audio �մϴ� ");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio ���ϴ� ");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio ������ " + volume + "���� �����մϴ�.");
	}
}
