package calculator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerStringCalculator {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(StringCalculatorShould.class);
		for(Failure failure : result.getFailures())
			System.out.println("Failed : "+failure.toString());
		
		System.out.println("All Test succedde : "+result.wasSuccessful());
	}
}
