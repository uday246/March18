import java.util.Scanner;

public class Payment {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name="";
	double due,payment,totalDue=0,totalPayment=0;
	while(true){
		System.out.println("Enter Customer name (Enter STOP to stop entering values) :");
		name=sc.nextLine();
		if(name.equalsIgnoreCase("Stop"))
			break;
		System.out.println("Enter Paymenr Due : ");
		due=sc.nextDouble();
		System.out.println("Enter Amount Paid : ");
		payment=sc.nextDouble();
		totalDue+=due;
		totalPayment+=payment;
		double d = due-payment;
		if(d<0)
			d=0;
		System.out.println("Customer's Remaining balance : "+d);
		sc.nextLine();
	}
	System.out.println("Total Payment due: "+totalDue);
	System.out.println("Total Amount paid : "+totalPayment);
	double d=totalDue-totalPayment;
	if(d<0)
		d=0;
	System.out.println("Total Remaining balance : "+d);

			
}
}
