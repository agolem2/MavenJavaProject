package CodingChallenge;
import static org.junit.Assert.assertEquals;

/**
 * @author miloonken
 *
 */
import java.sql.Timestamp;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import PageObjects.YelpHomePage;
import PageObjects.YelpSearchBox;
import PageObjects.YelpSearchBoxInput;
import PageObjects.YelpSearchBoxSubmit;
import utiity.ScreenShotOnFailure;
import utiity.WebDriverBrowserFactory;

public class CodingChallenge06 extends WebDriverBrowserFactory {

	 private static StringBuffer verificationErrors = new StringBuffer();

	    static java.util.Date date = new java.util.Date();
	    static Timestamp t = new Timestamp(date.getTime());
	    static String dateNow = t.toString().replace(":", "_");
	    String obj = "Screenshots";
	    String className = this.getClass().getSimpleName();

	    public static String Neighborhoods = "Neighborhoods";
	    public static String Distance = "Distance";
	    public static String Price = "Price";
	    public static String Features = "Features";

	    public static CharSequence[] SearchArguments (String sNeighborhoods, String sDistance, String sPrice, String sFeatures){
			return SearchArguments(null, null, null, null);
		
	    }
	    
	    @Rule
	    public ScreenShotOnFailure screenShotRule;

	    @Test
	    public void FilterRestaurantsParameterize() throws Exception {

	    	//Get the Yelp URL Home Page
	        driver.get(YelpHomePage.YelpHomePageURl(driver));
	        Thread.sleep(1000);
	        
	        //Verify Restaurants Link Is Displayed and Spelled Correctly
	        assertEquals("Restaurants", driver.findElement(By.linkText("Restaurants")).getText());
	       
    	    //Select Neightborhoods Restruants In Drop Down box in Find 
	        YelpSearchBox.SearchBox(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys("Neighborhoods");
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys(Keys.RETURN);
	        //Search Restruants
	        YelpSearchBoxSubmit.SubmitSearch(driver).click();
	        
	        //Select Neightborhoods Restruants In Drop Down box in Find 
	        YelpSearchBox.SearchBox(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys("Distance");
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys(Keys.RETURN);
	        
	        //Search Restruants
	        YelpSearchBoxSubmit.SubmitSearch(driver).click();

	        //Select Neightborhoods Restruants In Drop Down box in Find 
	        YelpSearchBox.SearchBox(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys("Price");
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys(Keys.RETURN);

	        //Select Neightborhoods Restruants In Drop Down box in Find 
	        YelpSearchBox.SearchBox(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys("Features");
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys(Keys.RETURN);

	        //Search Restruants
	        YelpSearchBoxSubmit.SubmitSearch(driver).click();

	    }


	    public static void verification() {

	        String verificationErrorString = verificationErrors.toString();

	        if (!"".equals(verificationErrorString)) {

	        }


	    }

	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	    }

}
