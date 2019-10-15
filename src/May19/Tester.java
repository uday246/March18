package May19;

class A {
	int a;

	public A() {
		a = 0;
	}

	public A(int x) {
		a = x;
	}

	public int getA() {
		return a;
	}

	public void setA(int aA) {
		a = aA;
	}

	public String toString() {
		return Integer.toString(a);
	}
}

class B extends A {
	private String st;

	public B() {
		super();
		st = "not yet!";
	}

	public B(int aX, String aSt) {
		super(aX);
		st = aSt;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String aSt) {
		st = aSt;
	}

	public String toString() {
		String RetSt = super.toString() + " , " + this.st;
		return RetSt;

	}
}

public class Tester {
	public static void main(String[] args) {
		A a = new A();
		a.setA(4);
		System.out.println(a);
		B b = new B();
		b.setA(6);
		b.setSt("H");
		System.out.println(b);
		b = new B(2, "Bye");
		System.out.println(b);
	}
}