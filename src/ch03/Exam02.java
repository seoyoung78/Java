package ch03;

public class Exam02 {

	public static void main(String[] args) {
		
		//연산의 결과가 boolean으로 나오는 연산기호
		
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; //값이 동일한가 var3 = false
		boolean var4 = var1 != var2; //값이 다른가	var3 = true
		boolean var5 = var1 > var2; //var1이 var2보다 큰가 false
		boolean var6 = var1 >= var2; // var1이 var2보다 크거나 같은가 false
		boolean var7 = var1 < var2; // var1이 var2보다 작은가 true
		boolean var8 = var1 <= var2; // var1이 var2보다 작거나 같은가 true
		boolean var9 = !(var1 == var2); //NOT연산자 결과값의 반대 true
		boolean var10 = (var1 == var2) || (var1 < var2); // OR연산자 true
		boolean var11 = (var1 == var2) && (var1 < var2); // AND연산자 false

		}

}
