package Indeed_Apply;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apply_Indeed {
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	 
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    String actualTitle; 
   
    @Before
    public void setUp() throws Exception {
           
       System.out.println("Running Regression Test " +className+dateNow);
       Log.info("Started Test Case Regression Test " +className+dateNow);
       DOMConfigurator.configure("log4j.xml");
            
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

  		
  		// Create a new instance of the driver
  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("https://www.indeed.com/");
  		  		
  		driver.close();
  		
  		driver.quit();
  		
    
	}


	@Test
	public void TitlePage() {
		
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		
		// /Users/miloonken/dev
		System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.bhhc.com/");
		
		// This step validates the WebPage is available and the Title Page is consistant without changes. 
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
  		String expectedTitle = "Home - Berkshire Hathaway Homestate Companies";
  		
  		System.out.println("Running Regression Test " +className+dateNow);
  		System.out.println("ActualTitle is" +actualTitle);
  		
  		assertEquals(actualTitle, expectedTitle);
  		
		
		driver.close();
  		
  		driver.quit();
			
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
	 
	public void tearDown() throws Exception {
	 
	 
	 
	}
	
}
