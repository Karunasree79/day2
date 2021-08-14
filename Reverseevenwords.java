package week1.day2assignment;

public class Reverseevenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = " The software tester";
String odd=" ";
String even=" ";
String[] array1=text.split(" ");
for(int i=0;i<array1.length;i++) {
	if(i%2!=0) {
		char[] charstr=array1[i].toCharArray();
	for(int j=charstr.length-1;j>=0;j-- ) {
		odd=odd+charstr[j];
	}
	odd=odd.concat(" ");
	even=odd;	
}
	else
	{
		even=even+array1[i].concat(" ");
		odd=even;
		
	}

	}
System.out.println(even);
}
}