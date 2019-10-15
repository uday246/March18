package mat25;

public class Lab06 {
public static void main(String[] args) {
	try{
	someMethod();}
	catch(Exception e){
		System.err.println(e.getMessage());
		e.printStackTrace();
	}
}
public static void someMethod() throws Exception{
	try{
		someMethod2();
	}
	catch(Exception e){
		throw new Exception("This Exception caught in someMethod2, chained,and thrown as a new Exception");
	}
}
public static void someMethod2() throws Exception{
	throw new Exception("This Exception thrown in someMethod2");
}

}
