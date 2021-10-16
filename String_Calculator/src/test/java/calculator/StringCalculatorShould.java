package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class StringCalculatorShould {
	//Case 1 Empty string
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
    
    //Case 2 String with one input
    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
}
