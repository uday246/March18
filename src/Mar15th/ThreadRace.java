package Mar15th;

public class ThreadRace {
	public static void main(String[] args) {
		// Assigning the id for each thread or else we can use the default
		// thread name also
		Racer r1 = new Racer(1);
		Racer r2 = new Racer(2);
		Racer r3 = new Racer(3);
		Racer r4 = new Racer(4);
		Racer r5 = new Racer(5);
		Racer r6 = new Racer(6);
		Racer r7 = new Racer(7);
		Racer r8 = new Racer(8);
		Racer r9 = new Racer(9);
		Racer r10 = new Racer(10);

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		r7.start();
		r8.start();
		r9.start();
		r10.start();
	}
}

class Racer extends Thread {
	int threadID; // for maintain the unique id for each thread
	static boolean res = true;

	public Racer(int aThreadID) {
		threadID = aThreadID;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Thread : " + threadID + " -->" + i);
		}
		// once loop ended i am printing which thread got completed first, 1st
		// line which thread prints than that thread won the race
		System.out.println("Thread " + threadID + " Won");
		System.exit(0);
	}
}