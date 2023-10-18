
public class DecimalToBinary {
	
	// Convert number into binary
	public static String decimalToBinary(int num) {
		
		// Special case for 0
		if(num == 0) {
			return "0";
		}
		
		StringBuilder binary = new StringBuilder();
		
		while(num != 0) {
			
			// calculate remainder when dividing decimal by two
			int remainder = num % 2;
			
			// add remainder to the front of the string
			binary.insert(0, remainder);
			
			// update number by dividing it
			num /= 2;
			
		}
		
		return binary.toString();
	}

	public static void main(String[] args) {
		
		int number = 670;
		String binaryRep = decimalToBinary(number);
		
		// currently only accept positive integers
		if(number<0) {
			System.out.println("Please enter a positive integer");
		}else {
		System.out.println("Binary representation of "+number + " is "+ binaryRep);
		}

	}

}
