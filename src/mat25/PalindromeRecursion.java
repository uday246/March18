package mat25;

import javax.swing.JOptionPane;

public class PalindromeRecursion {
	public static void main(String[] args) {
		String word = "";
		word = JOptionPane.showInputDialog("Enter word: ");
word=word.toUpperCase();

		while (!word.equalsIgnoreCase("quit")) {
			if (isPalindrome(word, 0, word.length() - 1)) {
				JOptionPane.showMessageDialog(null, word + " is Palindrome");
			} else {
				JOptionPane.showMessageDialog(null, word + " is not Palindrome");

			}
			word = JOptionPane.showInputDialog("Enter word: ");

		}
	}

	static boolean isPalindrome(String str, int start, int e) {
		if (start == e)
			return true;

		// checking first and last dont match
		// return false
		if ((str.charAt(start)) != (str.charAt(e)))
			return false;

		// if start is < end
		// than increase start and decrease end
		if (start < e + 1)
			return isPalindrome(str, start + 1, e - 1);

		return true;
	}

}
