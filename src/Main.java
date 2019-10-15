import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bank = sc.nextLine();
		System.out.println("Cheque number");
		String chequeNo = sc.nextLine();
		System.out.println("Enter Cheque date");
		String temp = sc.nextLine();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sf.parse(temp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cheque ch = new Cheque(bank, chequeNo, date);
		PaymentBO po = new PaymentBO();
		if(!po.processPayment(ch)){
			throw new InvalidDateException();
		}
		System.out.println("Cheque is sent to clearing house");
		sc.close();
	}
}
