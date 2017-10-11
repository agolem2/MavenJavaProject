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
import utiity.DriverFactory;
import utiity.DriverFactory.BrowserType;

public class Access_Indeed {
	
	private static final BrowserType CHROME = null;

	private static Logger Log = Logger.getLogger(Logger.class.getName());
	 
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    String actualTitle; 
    public WebDriver driver;
    DriverFactory.BrowserType type = CHROME;
   
@Before
    public void setUp() throws Exception {
       
       System.out.println("Running Regression Test " +className+dateNow);
       Log.info("Started Test Case Regression Test " +className+dateNow);
       DOMConfigurator.configure("log4j.xml");    
       this.driver = DriverFactory.getDriver (type);

	}


	@Test
	public void TitlePage() {
		
		// Optional, if not specified, WebDriver will search your path for chromedriver.

		driver.get("https://www.indeed.com/");
		
		// This step validates the WebPage is available and the Title Page is consistant without changes. 
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
  		String expectedTitle = "Job Search | Indeed";
  		
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
