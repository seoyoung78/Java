package ch11.exam01;

public class Example {

	public static void main(String[] args) {

		Member m1 = new Member("winter", "늦겨율");
		Member m2 = new Member("winter", "늦겨율");
		
		System.out.println(m1==m2); //번지 비교
		System.out.println(m1.equals(m2));
	}

}
