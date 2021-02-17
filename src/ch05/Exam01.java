package ch05;

public class Exam01 {

	public static void main(String[] args) {

		int var1 = 10;
		int var2 = 10;
		
		//값비교
		System.out.println(var1 == var2); //T
		System.out.println(var1 != var2); //F

		String var3 = "자바";
		String var4 = new String("자바");
				
		//번지비교
		System.out.println(var3 == var4); //F BUT (new 없이)동일한 리터럴 사용 -> 하나의 객체 공유
		System.out.println(var3 != var4); //T
		System.out.println(var3.equals(var4)); //T
		
	}

}
