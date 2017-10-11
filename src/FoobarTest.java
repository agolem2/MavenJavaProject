import junit.framework.JUnit4TestAdapter;
import java.sql.Timestamp;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoobarTest {
	public static Logger Log = Logger.getLogger(Logger.class.getName());
    public static StringBuffer verificationErrors = new StringBuffer();
    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    
    @Before
    public void setUp() throws Exception {
       
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

  		
  		// Create a new instance of the driver
  		WebDriver driver = new ChromeDriver();
  		
  		
  		driver.get("https://www.google.com/");
  		
  		driver.close();
  		
    }
    
    @Test
    public void mytest() {
        Foobar f = new Foobar();

        assert(15==f.getfifteen());
    }
    
    public static void verification () {
   	 
    	String verificationErrorString = verificationErrors.toString();
    	 
    	        if (!"".equals(verificationErrorString)) {
    	 
    	                }
    	        
    	       
    	}
    
    public static void main(String... args) throws ClassNotFoundException { 
        String[] classAndMethod = args[0].split("#"); 
        Request request = Request.method(Class.forName(classAndMethod[0]), 
                classAndMethod[1]); 
     
        Result result = new JUnitCore().run(request);
        if (result.wasSuccessful())
        	System.out.println("Test run was successful");
        else {
        	System.out.println("Test run was NOT successful: ");
        	for (Failure f : result.getFailures())
        		System.out.println(f.getMessage() + " - Trace: " + f.getTrace() + " - Exception: "
        				+ f.getException() + " - " + f.getException().getStackTrace());
        }
        System.exit(result.wasSuccessful() ? 0 : 1); 
    }
     
    
    @After

    public void tearDown() throws ClassNotFoundException  {
        
   
    Result result = new JUnitCore().run();

    if (result.wasSuccessful())
        System.out.println("Test run was successful");
    else {
        System.out.println("Test run was NOT successful: ");
        for (Failure f: result.getFailures())
            System.out.println(f.getMessage() + " - Trace: " + f.getTrace() + " - Exception: " +
                f.getException() + " - " + f.getException().getStackTrace());

    }
    
    }
    public static junit.framework.Test suite(){
       return new JUnit4TestAdapter(FoobarTest.class);
    }
}
