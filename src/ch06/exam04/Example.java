package ch06.exam04;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("ȫ�浿","123456-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("���ڹ�","654321-1234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
	}

}
