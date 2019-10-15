package Mar25th;

import java.util.Scanner;

public class Data {

	private String name;

	private String type;

	private String os;

	private String version;

	private String eth;

	private String subnet;

	private String netmask;

	// getData and setData methods

	public void setname(String s) {

		name = s;

	}

	public String getname() {

		return name;

	}

	public void settype(String s) {

		type = s;

	}

	public String gettype() {

		return type;

	}

	public void setos(String s) {

		os = s;

	}

	public String getos() {

		return os;

	}

	public void setversion(String s) {

		version = s;

	}

	public String getversion() {

		return version;

	}

	public void seteth(String s) {

		eth = s;

	}

	public String geteth() {

		return eth;

	}

	public void setsubnet(String s) {

		subnet = s;

	}

	public String getsubnet() {

		return subnet;

	}

	public void setnetmask(String s) {

		netmask = s;

	}

	public String getnetmask() {

		return netmask;

	}

	public void printData() {

		System.out.println("Name: " + name);

		System.out.println("Type: " + type);

		System.out.println("OS : " + os);

		System.out.println("Version: " + version);

		System.out.println("Eth : " + eth);

		System.out.println("Subnet: " + subnet);

		System.out.println("Netmask: " + netmask);

	}

	public static void main(String[] args) {

		Data data = new Data();

		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter Name:");

		String w = s1.nextLine();

		data.setname(w);

		System.out.print("Enter Type:");

		String f = s1.nextLine();

		data.settype(f);

		System.out.print("Enter OS:");

		String z = s1.nextLine();

		data.setos(z);

		System.out.print("Enter version:");

		String p = s1.nextLine();

		data.setversion(p);

		System.out.print("Enter Eth:");

		String r = s1.nextLine();

		data.seteth(r);

		System.out.print("Enter Subnet:");

		String q = s1.nextLine();

		data.setsubnet(q);

		System.out.print("Enter Netmask:");

		String g = s1.nextLine();

		data.setnetmask(g);

		data.printData();

	}

}
