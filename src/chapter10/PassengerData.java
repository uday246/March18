package chapter10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class PassengerData extends Passenger {
	public static CreateQueue<Passenger> createQueue;

	public PassengerData() {
		super();
	}

	public void menuOptions() {
		String name = "";
		String ticket_type = "";
		int seat_no = 0;
		char choice;
		do {
			System.out.println("Enter A(dd), R(emove), S(can), or Q(uit)");
			// scan the input
			Scanner input = new Scanner(System.in);
			choice = (input.nextLine()).toUpperCase().charAt(0);
			switch (choice) {
			case 'A':
				System.out.println("Enter Passenger name");
				name = input.nextLine();
				System.out.println("enter ticket type Ac/Gen");
				ticket_type = input.nextLine();

				System.out.println("enter seat number");
				seat_no = input.nextInt();
				Passenger p = new Passenger(name, ticket_type, seat_no);
				createQueue.enqueue(p);
				break;
			case 'R':
				System.out.println("");
				break;
			case 'S':
				// SCAN AND DISPLAY DETAILS OF A PARTICULAR PASSENGER
				/* YOUR CODE HERE */
				break;
			case 'Q':
				// DISPLAY CONTENTS IN QUEUE AND QUIT THE LOOP
				/* YOUR CODE HERE */
				break;
			default:
				System.out.println("Invalid choice ---try again\n");
			}
		} while (choice != 'Q');
	}

	public static void main(String[] args) {
		createQueue = new CreateQueue<Passenger>();
		PassengerData data = new PassengerData();
		data.menuOptions();
	}
}

class Passenger {
	private String name;
	private String ticket_type;
	private int seat_no;

	public Passenger() {
	}

	public Passenger(String name, String type, int num) {
		this.setName(name);
		this.setTicket_type(type);
		this.setSeat_no(num);
	}

	public String toString() {
		return this.getName() + " " + this.getTicket_type();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
}

class CreateQueue<E> implements Iterable {
	private LinkedList<E> list = new LinkedList<E>();

	public void enqueue(E item) { // SAME AS PUSH IN STACK
		list.addLast(item);
	}

	public E dequeue() { // SAME AS POP IN STACK
		return list.poll();
	}

	public boolean hasItems() { // CHECKS IF THE QUEUE IS EMPTY OR NOT
		return !list.isEmpty();
	}

	public int size() { // DETERMINES THE SIZE OF QUEUE
		return list.size();
	}

	public void addItems(CreateQueue<? extends E> q) { // ADDS ITEMS TO LINKED
														// LIST
		while (q.hasItems())
			list.addLast(q.dequeue());
	}

	@Override
	public Iterator iterator() { // RETURNS QUEUE VALUES AS A LIST
		return list.iterator();
	}
}