package mat25;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	char c1=sc.next().charAt(0);
	char c2=sc.next().charAt(0);
	char c3=sc.next().charAt(0);
	int n1=c1-48;
	int n2=c2-48;
	int n3=c3-48;
	System.out.println(n1*2+""+n2*2+""+n3*2);
}
}
