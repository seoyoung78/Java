package ch03;

public class Exam02 {

	public static void main(String[] args) {
		
		//������ ����� boolean���� ������ �����ȣ
		
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; //���� �����Ѱ� var3 = false
		boolean var4 = var1 != var2; //���� �ٸ���	var3 = true
		boolean var5 = var1 > var2; //var1�� var2���� ū�� false
		boolean var6 = var1 >= var2; // var1�� var2���� ũ�ų� ������ false
		boolean var7 = var1 < var2; // var1�� var2���� ������ true
		boolean var8 = var1 <= var2; // var1�� var2���� �۰ų� ������ true
		boolean var9 = !(var1 == var2); //NOT������ ������� �ݴ� true
		boolean var10 = (var1 == var2) || (var1 < var2); // OR������ true
		boolean var11 = (var1 == var2) && (var1 < var2); // AND������ false

		}

}
