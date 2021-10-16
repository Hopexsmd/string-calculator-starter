package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorShould {
	// Case 1 Empty string
	@Test
	public void empty_string_should_return_0() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}

	// Case 2 String with one input
	@Test
	public void string_with_single_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}

	// Case 3 String with two input
	@Test
	public void string_with_two_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("1,2"));
	}

	// Case 4 String with n input
	@Test
	public void string_with_n_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
	}

	// Case 5 String with n input and \n or , as delimiter
	@Test
	public void string_with_n_number_and_newline_delimiter_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	// Case 6 String with n input , \n or , and starting with
	// //[newDelimiter][newDelimiter]...\n[numers...] as delimiter
	@Test
	public void string_with_n_number_and_custom_delimiters_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("//;\n1;2"));
	}

	// Case 7 String with negative input should throw exception with all negative
	// numbers printed
	@Test(expected = IllegalArgumentException.class)
	public void string_with_negative_number_should_throw_IllegalArgumentException_excetion() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("1,2,-4,5,-6"));
	}

	// Case 8 String with number bigger than 1000 should be ignored during sum calculation 
	// 
	@Test
	public void string_with_number_bigger_than_thousand_should_return_number_ignoring_those() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1003, stringCalculator.add("1,1000,1001,2"));
	}
}
