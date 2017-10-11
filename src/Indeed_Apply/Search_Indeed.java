package Indeed_Apply;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Indeed {
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	 
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
   
    @Before
    public void setUp() throws Exception {
           
       System.out.println("Access Indeed Page" +className+dateNow);
       Log.info("Access Indeed Page" +className+dateNow);
       DOMConfigurator.configure("log4j.xml");
            
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/**/dev/chromedriver");

  		
  		// Create a new instance of the Firefox driver
  		WebDriver driver = new ChromeDriver();
  		
  		
  		driver.get("https://www.indeed.com/");
  		
  		driver.close();
  		
    }
	
	
	@Test
	public void testsignup() {
		
		// Optional, if not specified, WebDriver will search your path for chromedriver /Users/miloonken/dev
		System.setProperty("webdriver.chrome.driver", "/Users/**/dev/chromedriver");

		// Create a new instance of driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://indeed.com");
				
		// Navigate to Search
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			boolean SignUp = isElementPresent("//input[@value='Sign up']");
			
			Log.info(SignUp);
			
			driver.quit();
			
			System.out.println("Driver Quit");
			
	}

	private boolean isElementPresent(String string) {
		// TODO Auto-generated method stub
		return false;
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
	 
} 