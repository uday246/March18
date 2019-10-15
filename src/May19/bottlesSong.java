package May19;

public class bottlesSong {

	public static void main(String[] args) {
	       // TODO Auto-generated method stub
	      
	       songMethods song1 = new songMethods(99);   // 99 bottles
	       songMethods song2 = new songMethods(5);   // 5 bottles
	      
	       song1.PrintSong();
	       System.out.println("\n\nSecond song with only five bottles:\n");
	       song2.PrintSong();

	  

	}
}

class songMethods {
	/**
	 * Default constructor, sets the number of bottles to 99.
	 */

	private int numBottles = 99;

	/**
	 * BeerSong constructor
	 * 
	 * @param bottles
	 *            Number of bottles initially on the wall
	 */
	public songMethods(int bottles) {
		numBottles = bottles;
	}

	public void PrintSong() {
		for(int i=numBottles;i>=1;i--)
		PrintStanza(i);
	}

	/**
	   * This method prints the number passed in (between 0-99) to the
	   * console in English
	   * @param num       Value to print in English, must be in the range 0-99
	   */
	   private void PrintNumInEnglish(int num)
	   {
	       int tens, ones;
	      
	       // Extract the digit in the tens place and the ones place
	       tens = num/10;
	       ones = num%10;
	      
	       // Output 20-90
	       switch (tens) {
	       case 9:
	           System.out.print("Ninety ");
	           break;
	       case 8:
	           System.out.print("Eighty ");
	           break;
	       case 7:
	           System.out.print("Seventy ");
	           break;
	       case 6:
	           System.out.print("Seventy ");
	           break;
	       case 5:
	           System.out.print("Fifty ");
	       case 4:
	           System.out.print("Forty ");
	           break;
	       case 3:
	           System.out.print("Thirty ");
	           break;
	       case 2:
	           System.out.print("Twenty ");
	           break;
	       }
	      
	       // Handle special cases of 10-19,0
	       switch (num) {
	       case 10:
	           System.out.print("Ten ");
	           return;
	       case 11:
	           System.out.print("Eleven ");
	           return;
	       case 12:
	           System.out.print("Twelve ");
	           return;
	       case 13:
	           System.out.print("Thirteen ");
	           return;
	       case 14:
	           System.out.print("Fourteen ");
	           return;
	       case 15:
	           System.out.print("Fifteen ");
	           return;
	       case 16:
	           System.out.print("Sixteen ");
	           return;
	       case 17:
	           System.out.print("Seventeen ");
	           return;
	       case 18:
	           System.out.print("Eighteen ");
	           return;
	       case 19:
	           System.out.print("Nineteen ");
	           return;
	       case 0:
	           System.out.print("Zero ");
	           return;
	       }
	      
	       // Output the ones digit
	       switch (ones)
	       {
	       case 1:
	           System.out.print("One ");
	           break;
	       case 2:
	           System.out.print("Two ");
	           break;
	       case 3:
	           System.out.print("Three ");
	           break;
	       case 4:
	           System.out.print("Four ");
	           break;
	       case 5:
	           System.out.print("Five ");
	           break;
	       case 6:
	           System.out.print("Six ");
	           break;
	       case 7:
	           System.out.print("Seven ");
	           break;
	       case 8:
	           System.out.print("Eight ");
	           break;
	       case 9:
	           System.out.print("Nine ");
	           break;
	       }
	       return;
	   }

	/**
	 * This method prints an entire stanza of the beer song for the number of
	 * bottles passed in.
	 * 
	 * @param numBottles
	 *            Number of bottles currently on the wall
	 */
	private void PrintStanza(int numBottles) {
		// Method below outputs number in English
		PrintNumInEnglish(numBottles);
		// account for "one bottle" vs. many "bottles"
		if (numBottles == 1) {
			System.out.println("bottle of beer on the wall, ");
		} else {
			System.out.println("bottles of beer on the wall, ");
		}
		PrintNumInEnglish(numBottles);
		if (numBottles == 1) {
			System.out.println("bottle of beer on the wall, ");
		} else {
			System.out.println("bottles of beer on the wall, ");
		}
		System.out.println("Take one down and pass it around,");
		numBottles--;
		PrintNumInEnglish(numBottles);
		if (numBottles == 1) {
			System.out.println("bottle of beer on the wall, ");
		} else {
			System.out.println("bottles of beer on the wall.");
		}
		System.out.println();
		return;
	}

	/**
	 * This method outputs the entire song for the number of bottles currently
	 * on the wall.
	 */
	public void Listen() {
		int num;

		// Loop from numBottles down to 0
		for (num = numBottles; num > 0; num--) {
			PrintStanza(num);
		}
		System.out.println();
	}

}