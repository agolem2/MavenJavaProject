package bhhc;

import static org.junit.Assert.assertEquals;
import java.sql.Timestamp;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import utiity.ScreenShotOnFailure;
import utiity.WebDriverBrowserFactory;

public class bhhc004_fail extends WebDriverBrowserFactory{

	private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    
    
   

    @Rule
    public ScreenShotOnFailure screenShotRule;
    
    @Test
    public void ExpressPolicyPayment() throws Exception {
         
         driver.get("https://www.google.com/");
         
         String actualTitle = driver.getTitle();
         String expectedTitle = "Googlez";
         
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
	
	public static void verification () {
	 
	String verificationErrorString = verificationErrors.toString();
	 
	        if (!"".equals(verificationErrorString)) {
	 
	                }
	        
	       
	}
	 
	 
	    
	    
    
    }


