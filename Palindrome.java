package week1.day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";

		String rev = " ";

		int lengthstr = str.length()-1;
		System.out.println("length is " + lengthstr);
		for (int i = lengthstr; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("The given string is palindrome");

		}

	}
}
