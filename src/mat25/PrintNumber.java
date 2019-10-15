package mat25;

public class PrintNumber {
public static void main(String[] args) {
	if(isDigitOrChar('c')){
		System.out.println("Given char is Digit/letter");
	}
	else{
		System.out.println("Given char is not a Digit/letter");
			
	}
}

private static boolean isDigitOrChar(char aC) {
	return Character.isLetter(aC) || Character.isDigit(aC);
}
}