package May19;

import java.util.Scanner;

public class DetermineifaCharacterisaLetteraDigitorNeither {
	   
    public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the character:");
            char ch = scanner.next().charAt(0);
            if(Character.isLetter(ch)){
            System.out.println("It is a Letter.");
            }
            else if(Character.isDigit(ch)){
            System.out.println("It is a Digit.");
            }
            else
            System.out.println("It is neither a Letter nor a digit.");
    }
   
}