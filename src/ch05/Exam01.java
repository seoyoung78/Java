package ch05;

public class Exam01 {

	public static void main(String[] args) {

		int var1 = 10;
		int var2 = 10;
		
		//����
		System.out.println(var1 == var2); //T
		System.out.println(var1 != var2); //F

		String var3 = "�ڹ�";
		String var4 = new String("�ڹ�");
				
		//������
		System.out.println(var3 == var4); //F BUT (new ����)������ ���ͷ� ��� -> �ϳ��� ��ü ����
		System.out.println(var3 != var4); //T
		System.out.println(var3.equals(var4)); //T
		
	}

}
