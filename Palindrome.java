package week2.day1_assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "ashok";
		String rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		if (str.equals(rev))
			System.out.println("Entered String " + rev + " is a palindrome");
		else
			System.out.println("Entered String " + rev + " is not a palindrome");

	}

}
