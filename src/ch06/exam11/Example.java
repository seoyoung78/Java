package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		//�ν��Ͻ� ���(�ʵ� + �޼ҵ�)�� �ݵ�� ��ü ���� ������ ���ؼ� ����
		User user = new User("ȫ�浿");
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//���� ���(�ʵ�+�޼ҵ�)�� ��ü ���� ��� ���� - Ŭ������ ����
		System.out.println(User.nation);
		User.info();
	}

}
