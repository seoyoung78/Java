package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		//�����ڸ� �̿��ؼ� ��ü ��� - ���� ���� x
		//Singletone result1 = new Singletone(); (x)
		
		//Factory Method �̿��ؼ� ��ü ��� - �� 1���� ��ü�� �����ؼ� �����ؼ� �������ϱ� ����, static���� ��
		Singletone result2 = Singletone.getInstance();
		Singletone result3 = Singletone.getInstance();
		if (result2 == result3) {
			System.out.println("���� ��ü�� ����");
		} else {
			System.out.println("�ٸ� ��ü�� ����");
		}
	}

}
