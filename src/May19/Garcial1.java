package May19;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Garcial1 {
	public static void main(String[] args) throws Exception {
		Scanner myObj = new Scanner(System.in);
		String ch="y";
		while(ch.equalsIgnoreCase("Y")){
			System.out.println("What would you like to shop for?");
			String answer = myObj.nextLine();
			answer = answer.trim();
			double min = myObj.nextDouble();
			double max = myObj.nextDouble();
			while (min > max) {
				System.out.println("ERROR:Max should be greater than min");
				min = myObj.nextDouble();
				max = myObj.nextDouble();
			}
			long x = Math.round(min);
			long y = Math.round(max);
			answer = answer.replace(' ', '+');
			String url = "";
			URI t = new URI(url);
			Desktop desktop = Desktop.getDesktop();
			desktop.browse(t);
			System.out.println("Do you want to continue [Y/N]?");
			ch=myObj.nextLine();
			ch=myObj.nextLine();
		}
	}
}
