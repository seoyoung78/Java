package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		
		System.out.println(Korean.NATION);
		//Korean.NATION = "미국"; - final 변수 때문에 에러 발생
		
		Korean k1 = new Korean("123456-1234567");
		// k1.ssn = "654321-1234567"; (x) - final로 정의 되어서 변경x
		
		System.out.println(Math.PI);
		double area = 10 * 10 * Math.PI; // PT:static final로 정의된 상수값
	}

}
