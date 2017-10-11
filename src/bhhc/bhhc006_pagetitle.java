package bhhc;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Rule;
import org.junit.Test;
import utiity.ScreenShotOnFailure;
import utiity.WebDriverBrowserFactory;

public class bhhc006_pagetitle extends WebDriverBrowserFactory{

	private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    
    @Rule
    public ScreenShotOnFailure screenShotRule;
    
    @Test
    public void GetPageTitle() throws Exception {
       
        driver.get("https://www.google.com/");
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        assertEquals(actualTitle, expectedTitle);
        
        System.out.println(actualTitle);
        
       
    }
    
	
	public static void verification () {
	 
	String verificationErrorString = verificationErrors.toString();
	 
	        if (!"".equals(verificationErrorString)) {
	 
	                }
	        
	       
	}
	 
	
	 
	
	}
	

