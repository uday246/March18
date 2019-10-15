import java.util.Scanner;

public class HotelOccupancyCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floors;
		int totalRooms = 0;
		int totalOccupied = 0;
		double percentage;
		//reading floors
		while (true) {
			System.out.println("Enter number of floors: ");
			floors = sc.nextInt();
			//if it is valid floor break loop
			if (floors >= 2 && floors <= 5)
				break;
			// if it is invalid..keep asking for valid value
			System.out.println("Invalid input. try again..");
		}
		//reading total rooms and occupied rooms for each floor
		for (int i = 0; i < floors; i++) {
			System.out.println("Enter total rooms at floor " + (i + 1));
			totalRooms += sc.nextInt();
			System.out.println("Enter total occupied rooms at floor " + (i + 1));
			totalOccupied += sc.nextInt();
		}
		//finding percentage
		percentage = totalOccupied / (double) totalRooms;
		percentage = percentage * 100;
		System.out.println("Total rooms: "+totalRooms);
		System.out.println("Total occupied rooms: "+totalRooms);
		System.out.println("Hotel occupany : " + percentage + "%");
	}
}
