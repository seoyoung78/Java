package ch07.exam03;

public class Child extends Parent {
	//Field
	//Constructor
	public Child(String firstName) {
		super("��", firstName);
		System.out.println("Child ��ü ����");
	}
	
	//Method
	public void method2() {
		System.out.println("method2() ����");
	}
	@Override
	public void sound() {
		System.out.println("�Ⱦ��~~~~");
	}
}
