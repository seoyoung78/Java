package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTask());
		thread1.start(); //������ ���� - run �޼ҵ� ����
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask());
		thread2.start(); //������ ����
		
		//ä�� �۾��� �ϴ� ������ ������ ���� - �͸� ���� ��ü ���
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		}); //Runnable�̶�� �������̽��� ������ Ŭ������ ����� ����� ��ü ����(�������̽��� ������ ��ü ����x)
		thread3.start();
		
		while(true) {
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
	}

}
