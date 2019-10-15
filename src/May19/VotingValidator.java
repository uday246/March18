package May19;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
	private int age;
	private int year;

	public InvalidAgeException(int aAge, int aYear) {
		super("User was born in " + aYear + " and he/she will be " + aAge + " by the next election");
		age = aAge;
		year = aYear;
	}

}

public class VotingValidator {
	public void ValidateAge(int year) throws InvalidAgeException {
		int age = 2020 - year;
		if (age >= 18)
			System.out.println("Welcome to Vote!");
		else
			throw new InvalidAgeException(age, year);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int y = sc.nextInt();
		sc.close();
		VotingValidator v = new VotingValidator();
		try {
			v.ValidateAge(y);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}
