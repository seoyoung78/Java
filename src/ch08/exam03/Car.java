package ch08.exam03;

public class Car implements Shipable, Flyable {
	@Override
	public void sailing() {
		System.out.println("�����մϴ�.");
	}
	
	@Override
	public void anchor() {
		System.out.println("�����մϴ�.");
	}
	
	@Override
	public void takeOff() {
		System.out.println("�̷��մϴ�.");
	}
	@Override
	public void land() {
		System.out.println("�����մϴ�.");
	}
	@Override
	public void fly() {
		System.out.println("�����մϴ�.");
	}
}
