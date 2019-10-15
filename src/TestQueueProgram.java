public class TestQueueProgram {

	public static void main(String[] args) {

		Queue<Character> letters = new Queue<Character>();

		char ch = 'A';

		try {

			System.out.println("Let's try to enqueue 12 letters into the queue");

			for (int i = 1; i < 12; i++, ch++) {

				System.out.println("Enqueue " + ch);

				letters.enqueue(ch);

			}

		}

		catch (Exception e)

		{

			System.out.println("***Error: " + e.getMessage() + "***");

		}

		System.out.println("Number of Characters in Queue = " + letters.size());

		System.out.println("Queue: " + letters);

		System.out.println("Now let's dequeue from the queue");

		while (!letters.isEmpty())

		{

			System.out.println("Dequeue " + letters.enqueue());

		}

		System.out.println("Number of Characters in Queue = " + letters.size());

		System.out.println("Queue: " + letters);

	}

}

class Queue<abc> {

	public static final int MAX_SIZE = 10;

	public class Node {

		public abc element;

		public Node link;

	}

	public Node first;

	public Node last;

	public int numOfElements;

	public Queue() {

		first = null;

		last = null;

		numOfElements = 0;

	}
// changed name from add to enqueue to match the Q program terminology
	public void enqueue(abc element) {

		if (isFull())

			throw new RuntimeException("Queue overflow");

		Node a = new Node();

		a.element = element;

		a.link = null;

		if (first == null) {

			first = a;

		}

		else

		{

			last.link = a;

		}

		last = a;

		numOfElements++;

	}
//// changed name from remove to dequeue to match the Q program terminology
	public abc dequeue() {

		if (first == null) {

			throw new RuntimeException("Queue underflow");

		}

		else

		{

			abc removed = first.element;

			first = first.link;

			if (first == null) {

				last = null;

			}

			numOfElements--;

			return removed;

		}

	}

	public int size() {

		return numOfElements;

	}

	public boolean isFull() {

		if (numOfElements == MAX_SIZE)

			return true;

		else

			return false;

	}

	public boolean isEmpty() {

		if (first == null)

			return true;

		else

			return false;

	}

	public boolean contains(Object o) {

		Node cur = first;

		while (cur != null) {

			if (cur.element.equals(o))

				return true;

			cur = cur.link;

		}

		return false;

	}

	public String toString() {

		String string1 = "[";

		if (numOfElements > 0) {

			string1 += first.element;

			Node cur = first.link;

			while (cur != null) {

				string1 += ", " + cur.element;

				cur = cur.link;

			}

		}

		string1 += "]";

		return string1;

	}

}