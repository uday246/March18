import java.util.Scanner;

public class Excercise3 {
	public static void main(String[] args) {
		final String VALID_PWD = "albaha";
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the password: ");
		String p = sc.next();
		// invalid counter
		int count = 0;
		// loop if user gives incorrect password
		while (!VALID_PWD.equals(p)) {
			count++;
			//checking if invalid counter reaches 3 break;
			if (count == 3) {
				System.out.println("sorry your account is closed");
				return;
			}
			System.out.print("try again please enter the password : ");
			p=sc.next();
		}
		System.out.println("welcome!, you've entered the correct password");
	}
}
