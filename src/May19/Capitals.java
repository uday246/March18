package May19;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Capitals {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Austria", "Vienna");
		map.put("Canada", "Toronto");
		map.put("England", "London");
		map.put("Austria", "Vienna");

		map.put("Florda", "Tallahassess");
		map.put("Idaho", "Boise");
		map.put("Lowa", "Des");
		map.put("Maine", "Augusta");

		map.put("Ohio", "Columbus");
		map.put("Georgia", "Atlanta");
		map.put("Oregon", "Salem");
		map.put("Texas", "Austin");

		map.put("Utah", "Salt lake City");
		map.put("New York", "Albany");
		map.put("New Jersey", "Trenton");

		System.out.println("HashMap");
		for (String s : map.keySet())
			System.out.println(s + " : " + map.get(s));
		TreeMap<String, String> tree = new TreeMap<String, String>(map);
		System.out.println("Tree Map");
		for (String s : tree.keySet())
			System.out.println(s + " : " + map.get(s));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String city = sc.nextLine();
		if (map.get(city) != null)
			System.out.println(city + " : " + map.get(city));
		else
			System.out.println(city + " Not found in the list");
	}
}
