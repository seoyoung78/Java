package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {

		String ssn = "123465-1234567";
		
		//� ��ġ�� ���� 1�� ���
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		//���ڿ� �߶󳻱� : ���1
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		//���ڿ� �߶󳻱� : ���2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//���ڿ� �и��ϱ� : ���3
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while(st.hasMoreTokens()) { //������ ��ū�� �� �ִ°�
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//second = st.nextToken();
		//String third = st.nextToken(); - ���� �߻� 
		
		//���� ���� : ���1
		String content  = "�̰��� �ڹ� å�Դϴ�.";
		boolean result = content.contains("�ڹ�"); // true
		System.out.println(result);
		
		//���� ����: ���2
		int index = content.indexOf("�ڹ�"); //���ڿ��� �ش� ���ڷ� �����ϴ� �ε��� ��ȯ, ������ -1 ��ȯ
		if (index != -1) {
			System.out.println("�ڹ� ���� å�̱���");
		} else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���");
		}
		
		//���ڿ��� ����
		int length = content.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		String content2 = content.replace("�ڹ�", "Java"); //String�� ��ü�� ���� ���� ������ �����
		System.out.println(content2);
	}

}
