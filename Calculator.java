package week1.day2assignment;

public class Calculator {
	
	public int add(int a,int b,int c)
	{int d=a+b+c;
	return d;}
	public int sub(int a,int b)
	{int e=a-b;
	return e;}
	public double mul(double a,double b)
	{double e=a*b;
	return e;}
	public float div(int a,int b)
	{float e=a/b;
	return e;}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator calc=new Calculator();

System.out.println("Sum:"+ calc.add(45,30,70));
System.out.println("Sub:"+ calc.sub(45,30));
System.out.println("Mul:"+ calc.mul(45,30));
System.out.println("Div:"+ calc.div(45,15));
	
	}
}

