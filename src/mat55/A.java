package mat55;

public class A

{

	private int number;

	protected B b;

	public double price;

	public A()

	{

		b= new B();

	}

	public void g()

	{

	}
}//end class A

class B 

{

	private int i;
	private String s=null;

	public void h(A a)

	{
		a.g();
		System.out.println("i = "+i);

	}


}//end class B