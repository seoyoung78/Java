package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		
		System.out.println(Korean.NATION);
		//Korean.NATION = "�̱�"; - final ���� ������ ���� �߻�
		
		Korean k1 = new Korean("123456-1234567");
		// k1.ssn = "654321-1234567"; (x) - final�� ���� �Ǿ ����x
		
		System.out.println(Math.PI);
		double area = 10 * 10 * Math.PI; // PT:static final�� ���ǵ� �����
	}

}
