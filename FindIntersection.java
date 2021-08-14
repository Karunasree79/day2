package week1.day2assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum1 ={3,2,11,4,6,7};
		int[] arrNum2 ={1,2,8,4,9,7};
		for(int i=0;i<=arrNum1.length-1;i++) {
			for(int j=0;j<=arrNum2.length-1;j++) {
				
				if(arrNum1[i]==arrNum2[j])
					
				System.out.println("Intersection number is :"+ arrNum1[i]);
			}
		
		}
		

	}

}
