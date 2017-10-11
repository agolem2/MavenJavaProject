package utiity;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestRunner  {
    public WebDriver driver;
 
    
    @Rule
    public TestName testName = new TestName();
 
    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void starting(final Description description) {
            String methodName = description.getMethodName();
            String className = description.getClassName();
            className = className.substring(className.lastIndexOf('.') + 1);
            System.out.println("Starting JUnit-test: " + className + " " + methodName);
            
        }
    };
   
//This result object has many methods and it is very useful
//Type result and press dot, all the methods will display
//This statement is to load all type of results in the result object
 
   
    Result result = JUnitCore.runClasses(TestRunner.class);
    public TestRunner(Class<?> klass) throws InitializationError {
        super();
    }
 
    
   
    public void run (RunNotifier notifier){
       
    System.out.println("Executing run()");
       
    //Add Listener. This will register our JUnit Listener.
        notifier.addListener(new RunListener());
 
        //Get each test notifier
        EachTestNotifier testNotifier = new EachTestNotifier(notifier,
                getDescription());
        try {
      
        //In order capture testRunStarted method
        //at the very beginning of the test run, we will add below code.
        //Invoke here the run testRunStarted() method
           
        notifier.fireTestRunStarted(getDescription());
           
        Statement statement = classBlock(notifier);
           
        statement.evaluate();
        } catch (org.junit.internal.AssumptionViolatedException e) {
            testNotifier.fireTestIgnored();
       
        } catch (StoppedByUserException e) {
            throw e;
       
        } catch (Throwable e) {
            testNotifier.addFailure(e);
        
            //Capture ScreenShot and Debug Statement On Failure
 
               Result result = JUnitCore.runClasses(TestJunit.class);
            if (result.wasSuccessful())
               System.out.println("Test run was successful");
            else {
               System.out.println("Test run was NOT successful: ");
               for (Failure f : result.getFailures())
                              System.out.println(f.getMessage() + " - Trace: " + f.getTrace() + " - Exception: "
                                                            + f.getException() + " - " + f.getException().getStackTrace());
              
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                 // Save the screenshot to a file some place
                 try {
                                             FileUtils.copyFile(scrFile, new File("C:\\Users\\eonken\\workspace\\screenshots\\screenshot" + testName + ".png"));
                              } catch (IOException e1) {
                                             // TODO Auto-generated catch block
                                             e1.printStackTrace();
                              }
                
            }
           
            
           
            //Here it is getting the run count from the result object
 
            System.out.println("Total number of tests " + result.getRunCount());
   
            //This is to get the failure count from the result object
            System.out.println("Total number of tests failed " + result.getFailureCount());
    
            for(Failure failure : result.getFailures())
            {
 
            //This will print message only in case of failure
               System.out.println(failure.getMessage());
            }
            //This will print the overall test result in boolean type
            System.out.println(result.wasSuccessful());
   
        }
    }



	private Statement classBlock(RunNotifier notifier) {
		// TODO Auto-generated method stub
		return null;
	}



	private Description getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	}

