package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		
		Class var1 = A.class; //A클래스가 로딩된 번지를 var1에 저장
		
		A a = new A();
		Class var2 = a.getClass(); //a 객체의 클래스 번지를 var2에 저장
		
	}

}
