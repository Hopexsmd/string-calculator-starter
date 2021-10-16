package calculator;

public class StringCalculator {

	public int add(String input) {

		// Case 1 String(input) is empty or null
		if (input == null || input.length() == 0) {
			return 0;
		}

		// Delimiters are collected into this
		StringBuilder delimiters = new StringBuilder();
		delimiters.append(',');
		delimiters.append('\n');

		// To collect extract all delimiters from string(input) for custom delimiters provided
		if (input.startsWith("//")) {
			int last_index = input.indexOf("\n");
			for (int i = 0; i < last_index; i++) {
				if (input.charAt(i) != '[' && input.charAt(i) != ']' && input.charAt(i) != '/')
					delimiters.append(input.charAt(i));
			}
			input = input.substring(last_index + 1);
		}

		// Numbers are extracted in String form into numbers array
		String numbers[] = input.split("[" + delimiters.toString() + "]+");

		// To calculate sum
		int sum = 0;
		StringBuilder negativeNumbers = new StringBuilder();
		boolean foundNeagtive = false;
		for (String num : numbers) {
			if(Integer.parseInt(num) < 0) {
				negativeNumbers.append(num+" ");
				foundNeagtive = true;
				continue;
			}
			sum = sum + Integer.parseInt(num);
		}
		if(foundNeagtive)
			throw new IllegalArgumentException("Negatives not allowed "+negativeNumbers.toString());
			

		return sum;
	}

}