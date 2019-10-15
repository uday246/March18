package Mar27th;

import java.util.Scanner;

class CityGovernment {
	private String name;
	private String state;
	private String mayor;

	public CityGovernment(String aName, String aState, String aMayor) {
		super();
		name = aName;
		state = aState;
		mayor = aMayor;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getState() {
		return state;
	}

	public void setState(String aState) {
		state = aState;
	}

	public String getMayor() {
		return mayor;
	}

	public void setMayor(String aMayor) {
		mayor = aMayor;
	}

}

public class TesterGovernment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String c = sc.nextLine();
		System.out.println("Enter state name");
		String state = sc.nextLine();
		System.out.println("Enter mayor name");
		String mayor = sc.nextLine();

		CityGovernment city = new CityGovernment(c, state, mayor);
		System.out.println("City Name : " + city.getName());
		System.out.println("State Name : " + city.getState());
		System.out.println("Mayor Name : " + city.getMayor());

	}
}
