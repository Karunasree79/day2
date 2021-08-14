package week1.day2assignment;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = arrNum.length;

		for (int i = 0; i < length - 1; i++) {
			int count = 0;
			for (int j = i + 1; j <= length - 1; j++) {
				if (arrNum[i] == arrNum[j])
					count = count + 1;

			}
			if (count > 0)
				System.out.println("Duplicates are :" + arrNum[i]);
		}

	}
}
