import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentBO {
public boolean processPayment(Cheque ch){
	Date date1 = new Date();
	Date date2 = new Date();

	SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
	try {
		// current date as per requirement
		date1 = sf.parse("15/05/2017");
		// date after 3 months
		date2 = sf.parse("15/08/2017");
	} catch (ParseException e) {
	}
	Date chd = ch.getChequeDate();
	return chd.after(date1) && chd.before(date2);
}
}
