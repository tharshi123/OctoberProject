package day1.example;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world ");
		int x = 20;
		int y =3;
		int result= x+y;
		System.out.println("Result = "+ result);
		double z = x/y;
		System.out.println(z);
		
		Calculator c1 = new Calculator();
		 double monthlyInterest = c1.interestCalculator(12000, 15);
		 System.out.println("I in in main class - the monthly Interest is = "+monthlyInterest );
		
		
	}
	
	private double interestCalculator(int amount,  int interestPercentage  ) {
		  
		double monInterest = (amount/100)*interestPercentage/12;
		System.out.println(" Monthly Interest is =  "+ monInterest);
		
		return monInterest;
		
		
	}

}
