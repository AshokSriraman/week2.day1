package week2.day1_assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd class of Automation $$";
		int letter = 0, space = 0, num = 0, specialchar = 0;
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i]))
				letter = letter + 1;
			else if (Character.isDigit(charArray[i]))
				num = num + 1;
			else if (Character.isSpaceChar(charArray[i]))
				space = space + 1;
			else
				specialchar = specialchar + 1;
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacter: " + specialchar);
	}
}
