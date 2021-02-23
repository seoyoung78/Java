package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		//생성자를 이용해서 객체 얻기 - 수의 제한 x
		//Singletone result1 = new Singletone(); (x)
		
		//Factory Method 이용해서 객체 얻기 - 딱 1개의 객체만 생성해서 공유해서 쓰도록하기 위해, static여야 함
		Singletone result2 = Singletone.getInstance();
		Singletone result3 = Singletone.getInstance();
		if (result2 == result3) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
	}

}
