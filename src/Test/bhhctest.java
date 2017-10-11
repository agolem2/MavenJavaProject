package Test;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Timestamp;
import org.junit.runners.Parameterized;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestListener;
import utiity.ScreenShotOnFailure;
import utiity.TestJunit;
import utiity.TestRunner;

@SuppressWarnings("unused")
public class bhhctest {

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

    @Rule
    public ScreenShotOnFailure screenShotRule;
    
    @Test
    public static void TestActualTitle() throws Exception {

    	
        WebDriver driver = new ChromeDriver();
                
        driver.get("https://www.google.com/");
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        
        System.out.println(actualTitle);
        Thread.sleep(500);
        
        try {
        	 assertEquals(actualTitle, expectedTitle);
                        
    } catch (Error e) {
            System.out.println("Test Case Error");
            verificationErrors.append(e.toString());
            
   
            {
                    Assert.fail("Test failed : " + e.getMessage());
           
                    driver.switchTo().defaultContent();
            }
    }
    
    }
	@AfterClass
	 
	public static void  afterClass() throws Exception {
	 
	System.out.println("Finished Test Case");
	
	
	}      
	 
	public static void verification () {
	 
	String verificationErrorString = verificationErrors.toString();
	 
	        if (!"".equals(verificationErrorString)) {
	 
	                }
	        
	       
	}
	 
	 
	@After

	    public static void tearDown() throws Exception {
	String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	        System.out.print(verificationErrorString);
	    }

	    Result result = JUnitCore.runClasses(TestListener.class);
	    System.out.println("Completed Test Case " + " Date:  " + dateNow);
	    
	    if (result.wasSuccessful())
	        System.out.println("Test run was successful");
	    else {
	        System.out.println("Test run was NOT successful: ");
	        for (Failure f: result.getFailures())
	            System.out.println(f.getMessage() + " - Trace: " + f.getTrace() + " - Exception: " +
	                f.getException() + " - " + f.getException().getStackTrace());

	    }
	    
	    }

	
}
