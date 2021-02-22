package ch06homework.package12;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeen();
		System.out.println("현재 속도: " + speed + "km/h");
	}

}
