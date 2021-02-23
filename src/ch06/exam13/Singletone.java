package ch06.exam13;

public class Singletone {
	//Field - 정적 필드 선언 : 같은 객체가 리턴되도록 하기 위해
	private static Singletone singleton = new Singletone();
	
	//Constructor
	private Singletone() { // new를 이용해 호출x, Factory Method만 이용해서 생성 가능
		
	}
	
	//Method 
	static Singletone getInstance() {
		return singleton;
	}
}
