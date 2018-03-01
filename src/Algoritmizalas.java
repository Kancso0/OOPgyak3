import java.util.Scanner;

public class Algoritmizalas {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int someInteger = scanner.nextInt();
		String someString = scanner.next();
		double someDouble = scanner.nextDouble();
		double result = 0;
		
		System.out.println("pls enter your input method:"
				+ "\n 1. Three arguments"
				+ "\n 2. One argument");
		
		
		switch(someString){
		
		case "1":
			result=ThreeArguments();
			break;
		case "2": 
			result=OneArguments();
			break;
		default:
			System.out.println("Pls enter a valid calc type");
			break;
			
		
		}
		scanner.close();
		
		System.out.println(result);
		
	}
	
	public static double calculate(double firstOperand, double secondOperand, String operator ){
		double result=0;
		switch (operator){
		case "+":
			result =firstOperand + secondOperand;
			break;
		case "-":
			result = firstOperand-secondOperand;
			break;
		case "*":
			result = firstOperand * secondOperand;
			break;
		case "/":
				if (secondOperand!=0) {
					result=firstOperand/secondOperand;
					break;
				}
				else System.out.println("Dont divide by 0 stupid");
				
				default: 
					System.out.println("Please enter a valid operator!"); 
		}
		return result;
	}

	private static double OneArguments() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double ThreeArguments() {
		// TODO Auto-generated method stub
		return 0;
	}
}
