
public class InvalidDateException extends RuntimeException{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public String toString(){
	return "InvalidDateException: Cheque is valid only for three months";
}
}
