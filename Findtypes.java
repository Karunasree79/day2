package week1.day2assignment;

public class Findtypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
char[] Array=test.toCharArray();
for(int i=0;i<Array.length;i++){
	if(Character.isLetter(Array[i])) {
		letter=letter+1;
	}else if(Character.isDigit(Array[i])) {
		num=num+1;
	}else if(Character.isSpaceChar(Array[i])) {
		space=space+1;
	}else
		specialChar=specialChar+1;
	
}
System.out.println("Characters:"+ letter);
System.out.println("Digits:"+ num);
System.out.println("Space:"+ space);
System.out.println("Special Characters:"+ specialChar);
	}

}
