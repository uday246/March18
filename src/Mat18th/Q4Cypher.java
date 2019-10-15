package Mat18th;

public class Q4Cypher {

	int key;
	/**
	 * Constructor for a cypher instance
	 * @param key The key used by the cypher
	 */
	public Q4Cypher(int key) {
		this.key = key;
		// FIXME Question 4b: complete this constructor
	}

	/**
	 * Determine whether the input string is well-formed according to the following rules:
	 * - it must not be null
	 * - it must not be empty
	 * - it must only contain the characters in the character range ' ' to 'Z' (values 32 to 90 inclusive).
	 * - it must not start or end with a space
	 * @param input The string to be checked
	 * @return True if the input string is well-formed
	 */
	static boolean isWellFormed(String input) {
		boolean flag = false;
		if(input!=null && input.length()!=0 && input.charAt(0)!=' ' && input.charAt(input.length()-1)!=' '){

			for(int i=0;i<input.length();i++){
				if(input.charAt(i)>=32 && input.charAt(i)<=90){
					flag = true;
				}
				else{
					flag = false;
					break;
				}
			}

		}
		return flag; // FIXME Question 4a: complete this function
	}

	/**
	 * Encode the input string using a simple rotation cypher.
	 *
	 * For a character c at position i in the string, it is shifted i + key places
	 * in the sequence of 59 characters ' ' ... 'Z', where a shift beyond 'Z'
	 * wraps around to the start of the sequence.
	 *
	 * For example, if key was 2, the string "CAT" becomes "EDW", with the character
	 * 'C' rotated 2, 'A' rotated 3, and 'T' rotated 4.   The string "YOU" becomes
	 * " RY", with 'Y' rotated 2 (wrapping around to ' '), 'R' rotated 3, and 'W'
	 * rotated 4.
	 *
	 * @param input THe string to be encoded
	 * @return An encoded string
	 * 
	 * if T rotates by 4 than it will become X right, who it becoming W?
	 */
	String encode(String input) {
		// FIXME Question 4c: complete this function
		int tempKey = key;
		String output="";
		for(int i=0;i<input.length();i++){
			int val = input.charAt(i)+tempKey;
			if(val>90) // if it reaches more than 90 than changing to default 32;
				val = 32;
			String str = new String (Character.toChars(val));
			output= output + str;
			tempKey++;
		}
		return output;
	}

	/*
      ASCII Character codes (for information)

      32  SPACE     64  @
      33  !         65  A
      34  "         66  B
      35  #         67  C
      36  $         68  D
      37  %         69  E
      38  &         70  F
      39  '         71  G
      40  (         72  H
      41  )         73  I
      42  *         74  J
      43  +         75  K
      44  ,         76  L
      45  -         77  M
      46  .         78  N
      47  /         79  O
      48  0         80  P
      49  1         81  Q
      50  2         82  R
      51  3         83  S
      52  4         84  T
      53  5         85  U
      54  6         86  V
      55  7         87  W
      56  8         88  X
      57  9         89  Y
      58  :         90  Z
      59  ;
      60  <
      61  =
      62  >
      63  ?
	 */

	public static void main(String[] args) {
		Q4Cypher q= new Q4Cypher(2);
		System.out.println(" YOU is Valid : "+Q4Cypher.isWellFormed(" YOU"));
		System.out.println("YOU is Valid : "+Q4Cypher.isWellFormed("YOU"));
		System.out.println("Encoded : "+q.encode("YOU"));
	}
}