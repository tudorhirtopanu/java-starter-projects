import java.util.Scanner;

public class GreatestCommonDivider {
	
	public static int euclideanGCD(int a, int b) {
		
		if(b == 0) {
			
			// GCD is found when b becomes 0
			return a;
			
		} else {
			
			// Recursively call the function
			return euclideanGCD(b, a % b);
			
		}
	}

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			// Finding GCD using Euclidean algorithm 
			
			int number1;
			int number2;
			
			System.out.println("Enter two numbers separated by a space:");
			
			// Loop until 2 valid numbers are entered
			while(true) {
				
				
				String input = scanner.nextLine();
				String[] parts = input.split(" ");
				
				if (parts.length == 2) {
					
					// Check if both parts can be parsed as integers
					try {
						// assign the two parts of the array to num1 and num2
						number1 = Integer.parseInt(parts[0]);
						number2 = Integer.parseInt(parts[1]);
						break;
						
					} catch (NumberFormatException e) {
						
						System.out.println("Please enter two valid numeric numbers separated by a space.");
						
					}
				} else {
					System.out.println("Please enter two numbers separated by a space.");
				}
			}

			// Return the absolute value 
			int gcd =  Math.abs(euclideanGCD(number1, number2)); 
			
			if(gcd == 0) {
				System.out.println("GCD (0,0) is not defined");
			} else {
				System.out.println("GCD is " + gcd);	
			}
		}

	}

}
