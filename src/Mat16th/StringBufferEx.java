package Mat16th;

import java.util.Scanner;

public class StringBufferEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer("");
		System.out.println("Enter Firstname");
		String firstName = sc.nextLine();

		System.out.println("Enter Initial");
		String initial = sc.nextLine();
		System.out.println("Enter Middle name");
		String middleName=sc.nextLine();

		// adding firstName
		sb.append(firstName+" ");
		// adding lastname
		sb.append(initial);
		System.out.println(sb);
		// adding initial after first name
		sb.insert(sb.indexOf(firstName)+firstName.length()+1,middleName+" ");
		System.out.println(sb);
		// removing the initial and space
		sb.delete(sb.indexOf(middleName), sb.indexOf(middleName)+2);
		System.out.println(sb);

	}
}
