package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password; // �ν��Ͻ� �ʵ� ����
	static String nation = "�ѱ�";
	
	//Constructor - �ν��Ͻ� ���x
	User(String name) {
		this.name = name;
	}
	//Method
	static void info() {
		nation = "���ѹα�";
		System.out.println("��� User�� �ѱ����Դϴ�."); //��ü ���̵� ��밡���� �޼ҵ�
	}
	
	void login() {
		System.out.println(name + "���� �α����մϴ�."); //��ü�� �ʿ��� �޼ҵ� - �ʵ� ����ϰ� �ֱ� ����
	}
	
	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
}
