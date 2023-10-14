import java.util.Scanner;

public class TemperatureConverter {
	
	public static double convertTemp(double temp, String conversion) {
		
		double convertedTemp = 0;
		
		switch(conversion) {
			case "C":
				convertedTemp = (temp - 32)*5/9;
				break;
			case "F":
				convertedTemp = (temp * 9.0 / 5.0) + 32;
		}
		
		return convertedTemp;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		String conversionUnit;
		
		System.out.println("Convert into Celsius (C) or Farenheit (F)?");
		
		conversionUnit = scanner.nextLine();
		
		System.out.println("Enter a number");
		
		input = scanner.nextInt();
		
		if(input<=0) {
			
			while(input<0) {
				
				System.out.println("Enter a valid number (=>0)");
				
				input = scanner.nextInt();
				
			}
			
			double ans = convertTemp(input, conversionUnit);
		    System.out.println("Converted temperature: " + ans);
		    
		} else {
			double ans = convertTemp(input, conversionUnit);
		    System.out.println("Converted temperature: " + ans);
		}
		
	}

}
