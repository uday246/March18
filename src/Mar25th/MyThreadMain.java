package Mar25th;

public class MyThreadMain {
	public static void main(String[] args) {

		/*step A dode
		 * MyThread t = new MyThread();
	t.start();// starting the thread
		 */
		MyThread t1 = new MyThread("Uday",5);
		MyThread t2 = new MyThread("Koti",5);
		t1.start(); // starting a thread it will internally invokes the run() method in the thread class
		t2.start();
		
	}
}
class MyThread extends Thread{

	String name;
	int numberOfPapers;

	public MyThread(){

	}
	public MyThread(String aName, int aNumberOfPapers) {
		super();
		name = aName;
		this.setName(aName);// setting the thread name as person name
		numberOfPapers = aNumberOfPapers;
	}


	public void run(){
		// reading the papers provided by the user
		for(int i=1;i<=numberOfPapers;i++){
			System.out.println(name+" has filled the paper "+i);
		}
		System.out.println(name+" has finished the their work for the day");

	}

	/* 
	 * Step A code
    public void run()
    {
    	System.out.println("Office Threading ");
    }*/

}