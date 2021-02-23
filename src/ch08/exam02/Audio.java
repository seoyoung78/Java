package ch08.exam02;

public class Audio implements RemoteControl{
	//Field
	private int volume;
	//Constructor
	//Field
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
		if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;				
		}
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;				
		}
		
		System.out.println("Audio ������ " + volume + "���� �����մϴ�.");
	}
}
