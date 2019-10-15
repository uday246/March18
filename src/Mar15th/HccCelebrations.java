package Mar15th;

import java.util.Scanner;
/*
 * 
 * Method Overloading is having the same method name with different number of ,order of ,type arguments, 
 * in our program we have getAttendeMemberShip() method as without argument and with one int argument so here
 * getAttendeMemberShip() is overloaded
 * default : if given value is not matched with any of the case than default case will get executed, in our case if user enters other than 5,10,50,100 than we should return Custom donation 
 * so in default case i am assigning Custom donation
 */
public class HccCelebrations {
public String getAttendeMemberShip(){
	return "VIP";
	
}
public String getAttendeMemberShip(int amount){
	String res="";
	switch(amount){
	case 5:
		res = "Attendee";
		break;
	case 10:
		res = "Bronze Attendee";
		break;
	case 50:
		res = "Silver Attendee";
		break;
	
	case 100:
		res = "Gold Attendee";
		break;
	default:
		res = "Cusotm Donation Attendee";
		break;
	
	
	}
	return res;
}
public static void main(String[] args) {
	HccCelebrations hcc = new HccCelebrations();
	Scanner sc = new Scanner(System.in);
	String choice="";
	String ticket="";
	System.out.println("Are you Belongs to Columbia Association? type yer or no");
	choice = sc.nextLine();
	if(choice.equalsIgnoreCase("yes")){
		ticket = hcc.getAttendeMemberShip();
	}
	else{
		int amount=0;
		System.out.println("How much your willing to donate");
		amount = sc.nextInt();
		ticket=hcc.getAttendeMemberShip(amount);
		
	}
	sc.close();
	System.out.println("Ticket : "+ticket);
}
}
