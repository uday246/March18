package Mat16th;
class A{
	String msg;

	public A(String aMsg) {
		super();
		msg = aMsg;
	}
	public A(){}
	public String f(int n){
		return null;
	}
}

interface I{
	public String f(int n);
	public String  first();
}
class B extends A implements I
{

	String msg;

	public B(String aMsg) {
		msg = aMsg;
	}
	public B(){}

	@Override
	public String f(int aN) {
		return null;
	}

	@Override
	public String first() {
		return null;
	}
}

class C extends A implements I
{

	String msg;

	public C() {
	}

	@Override
	public String f(int aN) {
		return null;
	}

	@Override
	public String first() {
		return null;
	}
}

class D extends B 
{

	String msg;
	public D(String aMsg) {
		msg = aMsg;
	}
}

class E extends B 
{

	String msg;
	int num;
	public E(String aMsg,int n) {
		msg = aMsg;
		num = n;
	}
}

public class Exec {
	public static boolean check(Object o) {

		return o instanceof C;

	}

	public static void main(String[] args) {
		A[] A_arr = new A[4];
		A_arr[0] = new A("Alan Turing");
		A_arr[1] = new B("Marvin Minaky");
		A_arr[2] = new D("Hayao Miyazaki");
		A_arr[3] = new C();

		for (int i = 0; i < A_arr.length; i++) {
			System.out.println(A_arr[i].f(1));

		}
		B[] B_arr = new B[2];
		B_arr[0] = new D("SpaceX");
		B_arr[1] = new E("DeepGenomics", 1);

		for (int i = 0; i < B_arr.length; i++) {
			System.out.println(B_arr[i].f(2));
			System.out.println(B_arr[i].first());
		}

		I[] I_arr = new I[2];
		I_arr[0] = new B("Next Generation Sequencing");
		I_arr[1] = new C();

		for (int i = 0; i < I_arr.length; i++) {
			System.out.println(I_arr[i].first());

		}
		B b = new B("ali");

		if (check(b))
			System.out.println("yes");
		else
			System.out.println("No");

	}

}