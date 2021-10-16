package calculator;

public class StringCalculator {

    public int add(String input) {
    	
    	//Case 1 String(input) is empty or null 
    	if (input == null || input.length() == 0) {
			 return 0;
		}
    	
    	// Delimiters are collected into this
    	StringBuilder delimiters = new StringBuilder();
    	delimiters.append(',');
    	delimiters.append('\n');
    	
    	// Numbers are extracted in String form  into numbers array
    	String numbers[] = input.split("["+delimiters.toString()+"]+");
    	
    	// To calculate sum
    	int sum = 0;
    	for(String num : numbers)
    		sum = sum + Integer.parseInt(num);
    	
        return sum;
    }

}