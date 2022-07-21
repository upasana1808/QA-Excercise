package domain;

import org.TestUnits;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestAll {

	public static void main(String[] args) {
		//some other
		 Result result=JUnitCore.runClasses(MyTestSuiteClass.class);
		  for(Failure fail:result.getFailures())
		  {
			  System.out.println(fail.toString());
		  }
		  System.out.println("Result ="+result.wasSuccessful());

	}

}
