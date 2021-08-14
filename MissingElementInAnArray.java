package week1.day2assignment;

import java.util.Arrays;

public class MissingElementInAnArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrNum = {1,2,3,4,7,6,8};
		
		Arrays.sort(arrNum);
		for(int i=1;i<=arrNum.length;i++) {
			if(arrNum[i-1]!=i)
			{
System.out.println("Missing Element is " + i);
			break;
		
	}
	}
}
}
