package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password; // 인스턴스 필드 선언
	static String nation = "한국";
	
	//Constructor - 인스턴스 멤버x
	User(String name) {
		this.name = name;
	}
	//Method
	static void info() {
		nation = "대한민국";
		System.out.println("모든 User는 한국인입니다."); //객체 없이도 사용가능한 메소드
	}
	
	void login() {
		System.out.println(name + "님이 로그인합니다."); //객체가 필요한 메소드 - 필드 사용하고 있기 때문
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃합니다.");
	}
}
