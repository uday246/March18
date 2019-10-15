package Mat16th;

import java.io.File;
import java.security.MessageDigest;
import java.util.Scanner;
/*
 * 
 * Authenticate class is used to authorize the user
 */
class Authenticate {

	// validates the user id and password
	public boolean authorize(String userName, String password) throws Exception {
		Scanner readCFile = new Scanner(new File("Credentials.txt"));
		boolean authenticated = false;
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] digest = md.digest();
		StringBuilder sb = new StringBuilder();
		for (byte b : digest) {
			sb.append(String.format("%02x", b & 0xff));
		}
		// <---->While Loop to read user information in the
		// <---->credentials.txt file until End Of File (EOF)
		while (readCFile.hasNextLine()) {

			// <-------->Parse the contents of credentials.txt file
			String credInfo = readCFile.nextLine();
			String parsedInfo[] = credInfo.split("\t");
			String nameValue = parsedInfo[0].trim();
			String hashValue = parsedInfo[1].trim();
			String roleValue = parsedInfo[3].trim();

			// <-------->Comparing parsed nameValue to username input
			if (nameValue.equalsIgnoreCase(userName)) {

				// <------------>Comparing parsed hashValue to password
				// input
				if (hashValue.equals(sb.toString())) {

					// <---------------->If nameValue and hashValue match
					// user input
					// <---------------->set Boolean value authenticated to
					// true
					// <---------------->to indicate log-in was successful
					authenticated = true;

					// <---------------->Open and read the matching role
					// text file returned from roleValue
					// <---------------->(i.e. admin.txt; veterinarian.txt;
					// zookeeper.txt)
					Scanner readRFile = new Scanner(new File(roleValue.concat(".txt")));

					// <---------------->Display message stored in the
					// matching role text file
					// <---------------->(i.e. admin.txt; veterinarian.txt;
					// zookeeper.txt)
					while (readRFile.hasNextLine()) {
						System.out.println("");
						System.out.print(readRFile.nextLine());
					}
					break; // End while loop at End Of File (EOF)
				}
			}
		}
		readCFile.close();
		return authenticated;
	}
}

public class NewZooAuthentication {

	/**
	 *
	 * @param args
	 *            the command line arguments
	 * @throws Exception
	 *
	 **/

	public static void main(String[] args) throws Exception {

		Authenticate au = new Authenticate();
		// <---->Scanner object to read input from the console
		Scanner readUserInput = new Scanner(System.in);

		// <---->Variable to keep track of the number of log-in attempts
		int loginAttempts = 0;

		// <---->While Loop until break encountered
		// <---->(user exits system or 3 unsuccessful log-in attempts are made)
		while (true) {

			// <---->Request user input username
			System.out.print("Enter username: ");

			// <---->Set String variable equal to user input
			String userName = readUserInput.nextLine();

			// <---->Request user input password
			System.out.print("Enter password: ");

			// <---->Set String variable equal to user input
			String userPwd = readUserInput.nextLine();

			// <---->Copied and pasted code section to convert the
			// <---->password with MessageDigest-5 (MD5) hash

			// <----->End copied and pasted code section

			// <---->Boolean variable declared to verify authentication
			boolean authenticated = au.authorize(userName, userPwd);

			// <---->Scanner object to read credentials.txt file

			// <----->If the user log-in was successful and the matching role
			// message
			// <----->has been displayed, user is asked if they wish to exit the
			// system
			if (authenticated) {
				System.out.print("\nDo you want to exit the system? (y/n): ");
				String choice = readUserInput.nextLine();

				// <-------->Exit the system if the user chooses to do so
				// <-------->If the user chooses to stay in the system
				// <-------->loop back to original log-in request
				if (choice.toLowerCase().charAt(0) == 'y') {
					System.out.println("\nUser logged off!\n");
					break; // Program halted by user
				} else {
					loginAttempts = 0; // Reset log-in attempts
					System.out.println("");
				}
			}

			// <---->If the log-in fails, increment variable loginAttempts
			else {
				loginAttempts++;
				// <-------->If loginAttempts threshold IS met, tell the user so
				// and exit the system
				if (loginAttempts == 3) {
					System.out.println("\nMaximum number of failed attempts reached!\nExiting system...\n");
					break;
				}

				// <-------->If loginAttempts threshold is NOT met allow the
				// user additional log-in
				// <-------->attempts until log-in IS successful OR
				// loginAttempts threshold is met
				// <-------->Let the user know how many attempts they have left
				// until system exits
				else {
					System.out.println("\nInvalid username or password..." + "\nPlease enter valid credentials!"
							+ "\nYou have" + " " + (3 - loginAttempts) + " " + "attempt(s) left.");
					System.out.println("");
				}
			}
		}
	}
}