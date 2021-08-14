package week1.day2assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "changeme";
		char[] Array1 = text.toCharArray();
		System.out.println("changed text is");

		for (int i = 0; i <= Array1.length; i++) {
			if (i % 2 == 0) {
				Array1[i] = Character.toUpperCase(Array1[i]);
				
			}

			System.out.println(Array1[i]);
		}

	}

}
