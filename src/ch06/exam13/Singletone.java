package ch06.exam13;

public class Singletone {
	//Field - ���� �ʵ� ���� : ���� ��ü�� ���ϵǵ��� �ϱ� ����
	private static Singletone singleton = new Singletone();
	
	//Constructor
	private Singletone() { // new�� �̿��� ȣ��x, Factory Method�� �̿��ؼ� ���� ����
		
	}
	
	//Method 
	static Singletone getInstance() {
		return singleton;
	}
}
