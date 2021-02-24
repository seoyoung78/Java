package ch09.exam02;

public class A {
	public class B {
		public int field;
		public B() {}
		public void method() {}
	}
	
	public static class C { // A객체 생성 없이 사용 가능
		public int field;
		public C() {}
		public void method() {}
	}
	
	public void method() {
		class D {
			public int field;
			public D() {}
			public void method() {}
		}
		D d = new D() ;
		d.field = 1;
		d.method();
	}
}
