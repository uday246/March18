import java.util.Date;

public class Cheque {
	private String bankName;
	private String chequeNumber;
	private Date chequeDate;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String aBankName) {
		bankName = aBankName;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String aChequeNumber) {
		chequeNumber = aChequeNumber;
	}
	public Date getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(Date aChequeDate) {
		chequeDate = aChequeDate;
	}
	public Cheque(String aBankName, String aChequeNumber, Date aChequeDate) {
		super();
		bankName = aBankName;
		chequeNumber = aChequeNumber;
		chequeDate = aChequeDate;
	}

}
