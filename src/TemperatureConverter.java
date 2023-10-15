import java.util.Scanner;

public class TemperatureConverter {
	
	// Convert temperature based on conversion unit
	public static double convertTemp(double temp, char conversion) {
		
		switch(conversion) {
			case 'C':
				return (temp - 32)*5/9;
			case 'F':
				return (temp * 9.0 / 5.0) + 32;
		}
		
		return Double.NaN;
		
	}

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			
			char conversionUnit;
			int input;		
			
			System.out.println("Convert into Celsius (C) or Fahrenheit (F)?");
			
			// Loops until valid C or F is entered
			while (true) {
				
				conversionUnit = scanner.next().charAt(0);
				
				// Converts character to upper case
				conversionUnit = Character.toUpperCase(conversionUnit);
				
				if (conversionUnit == 'C' || conversionUnit == 'F') {
					break;
					
				} else {
					System.out.println("Please enter valid unit ('C' or 'F')");
				}
				
			}
			
			System.out.println("Enter a number");
			
			// Loops until an integer is entered
			while (true) {
				if (scanner.hasNextInt()) {
					
					input = scanner.nextInt();
					
					double ans = convertTemp(input, conversionUnit);
				    System.out.println("Converted temperature: " + ans+" °"+conversionUnit);
					
					break; 
					
				} else {
					System.out.println("Enter a valid number");
					scanner.next();
				}
			}
			
		}
		
	}

}
