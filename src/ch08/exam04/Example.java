package ch08.exam04;

public class Example {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//Ÿ�̾� ����
		myCar.t1 = new KumhoTire();
		myCar.t2 = new KumhoTire();
		myCar.t3 = new HankookTire();
		myCar.t4 = new HankookTire();
		
		//�޷�����
		myCar.run();
	}

}
