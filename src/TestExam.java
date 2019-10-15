
class Exam {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int aA) {
		a = aA;
	}

	public int getB() {
		return b;
	}

	public void setB(int aB) {
		b = aB;
	}

	public Exam(int aA, int aB) {
		super();
		a = aA;
		b = aB;
	}

	public Exam(int aA) {
		super();
		a = aA;
	}

	// copy constructor which peforms deep copy
	public Exam(Exam e) {
		this.a = e.a;
		this.b = e.b;
	}

	@Override
	public String toString() {
		return "Exam [a=" + a + ", b=" + b + "]";
	}

}

public class TestExam {
	public static void main(String[] args) {
		// creating the 3 instances for Exam class
		Exam e1 = new Exam(5, 7);
		System.out.println(e1);
		Exam e2 = new Exam(3);
		System.out.println(e2);
		Exam e3 = new Exam(e2);
		System.out.println(e3);

	}
}
