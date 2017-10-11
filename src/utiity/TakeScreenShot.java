package utiity;
	
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

	public class TakeScreenShot {

	    private static StringBuffer verificationErrors = new StringBuffer();
	    static java.util.Date date= new java.util.Date();
	    static Timestamp t = new Timestamp (date.getTime());
	    static String dateNow = t.toString().replace(":","_");
	    String obj = "Screenshots";
	    String className = this.getClass().getSimpleName();

	    @BeforeClass
	    public static void setUp(){
	    	 // /Users/miloonken/dev
	        System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

	   		// Create a new instance of the driver
	   		WebDriver driver = new ChromeDriver();
	   				
	   		driver.get("https://www.google.com/");
	   		
	   		driver.close();
	   		
	     }

	    @Test
	    public void TestTakeScreenShot() throws IOException {
	    	
	    	WebDriver driver = new ChromeDriver();
	    	
	        driver.get("http://www.memorynotfound.com/");
	        	             
            // Take the screenshot at the end of test
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            // now save the screenshot to a file some place
            FileUtils.copyFile(scrFile, new File("/Users/miloonken/dev/Documents/screenshot"+className+dateNow+".png"));
           
                    
            }
            

	@AfterClass
	 
	public static void  afterClass() throws Exception {
	 
	System.out.println("Finished Test Case - Screen Shot Captured to /Users/miloonken/dev/Documents/screenshot ");
	
	
	}      
	 
	public static void verification () {
	 
	String verificationErrorString = verificationErrors.toString();
	 
	        if (!"".equals(verificationErrorString)) {
	 
	                }
	        
	       
	}
	 
	 
	@After
	 
	public void tearDown() throws Exception {
	 
	
	}
	
}


