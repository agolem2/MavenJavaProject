package FitStar;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FitStarSignUpError {
	
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
    private static StringBuffer verificationErrors = new StringBuffer();
    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
   
    @Before
    public void setUp() throws Exception {
           
    	FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("browser.startup.homepage_override.mstone", "ignore");
		profile.setPreference("startup.homepage_welcome_url.additional",  "about:blank");
        profile.setPreference("xpinstall.signatures.required", false);
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("https://app.fitstar.com/en/users/new/#/landing");
		
        
		// Create a new instance of the Firefox driver
        
        System.out.println("Running Regression Test " +className+dateNow);
        Log.info("Started Test Case Regression Test " +className+dateNow);
        DOMConfigurator.configure("log4j.xml");
    }
	
	
	@Test
	public void FitStarSignUpTest() {

		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://app.fitstar.com/en/users/new/#/landing");
		
		// This test script validates the FitStar Sign Up Page. 
		
		// Navigate to SignUp URL
		driver.get("https://app.fitstar.com/en/users/new/#/landing");
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		// Enter UserName in the DDLB
		driver.findElement(By.name("user_name")).sendKeys("eronken");
		
		// Enter Email in the DDLB
		driver.findElement(By.name("user_email")).sendKeys("@hotmail.com");
		
		// Enter Passowrd in the DDLB 
		
		driver.findElement(By.name("user_password")).sendKeys("!");
		
		// Click on Sign Up - OPT IN
		
		driver.findElement(By.xpath(".//*[@id='top_level_reg_flow']/div/div/div[2]/form/div[3]/input))")).click();
		
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Assert Not Yet Implemented
		
		//Close the browser.
		driver.close();
		
		
		fail("Not yet implemented");
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
