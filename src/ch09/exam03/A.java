package ch09.exam03;

public class A {
	public void method(final int x) {
		final int y = 2;
		
		//x = 10;
		//y = 20;
		
		class B {
			public void mehtod() {
				int result = x + y;
			}
		}
	}
}
