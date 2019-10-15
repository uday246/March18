package May19;

/**
 * @author This program contains the 2 threads which prints the plus and minus
 *
 */
public class ThreadsExample {
	public static void main(String[] args) {
		// reading the time from the command line
		int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		// creating thread 1 to print the plus
		Thread t1 = new Thread() {

			public void run() {
				for (int i = 0; i < 20; i++) {
					try {
						Thread.sleep(a1);
						System.out.print("\n" + "+");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}

		};
		// starting the thread1
		t1.start();
		// creating thread 2 to print the plus
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					try {
						Thread.sleep(a2);
						System.out.print("\n" + "-");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}

		};
		// starting the thread-2
		t2.start();
	}
}
