package week2.day1_assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		boolean b = true;
		int length1 = text1.length();
		int length2 = text2.length();
		if (text1.length() != text2.length())
			b = false;
		else {
			char[] charArray1 = text1.toLowerCase().toCharArray();
			char[] charArray2 = text2.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			b = Arrays.equals(charArray1, charArray2);
		}
		if (b)
			System.out.println(text1 + " and " + text2 + " are Anagrams");
		else
			System.out.println(text1 + " and " + text2 + " are not Anagrams");
	}

}
