package ch06homework.package12;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeen();
		System.out.println("���� �ӵ�: " + speed + "km/h");
	}

}
