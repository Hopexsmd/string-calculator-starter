package calculator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerStringCalculator {
	public static void main(String[] args) {
		// To Run all test cases at once
		Result result = JUnitCore.runClasses(StringCalculatorShould.class);
		
		// To print the failed cases 
		for(Failure failure : result.getFailures())
			System.out.println("Failed Test Case : "+failure.toString());
		
		// To print All Test Cases succeeded or not
		System.out.println("All Test Cases succeeded : "+result.wasSuccessful());
	}
}
