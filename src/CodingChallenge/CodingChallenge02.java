package CodingChallenge;
import static org.junit.Assert.assertEquals;

/**
 * @author miloonken
 *
 */
import java.sql.Timestamp;

import org.junit.Rule;
import org.junit.Test;
import PageObjects.YelpHomePage;
import PageObjects.YelpRestaurantsLink;
import PageObjects.YelpSearchBox;
import PageObjects.YelpSearchBoxInput;
import PageObjects.YelpSearchBoxSubmit;
import utiity.ScreenShotOnFailure;
import utiity.WebDriverBrowserFactory;

public class CodingChallenge02 extends WebDriverBrowserFactory {

	 private static StringBuffer verificationErrors = new StringBuffer();

	    static java.util.Date date = new java.util.Date();
	    static Timestamp t = new Timestamp(date.getTime());
	    static String dateNow = t.toString().replace(":", "_");
	    String obj = "Screenshots";
	    String className = this.getClass().getSimpleName();
	    
	    @Rule
	    public ScreenShotOnFailure screenShotRule;

	    @Test
	    public void SelectRestaurantsLinkVerify() throws Exception {

	    	//Get the Yelp URL Home Page
	        driver.get(YelpHomePage.YelpHomePageURl(driver));
	        Thread.sleep(1000);
	        
	        //Verify Restaurants Link Is Displayed and Spelled Correctly
	        assertEquals("Restaurants",YelpRestaurantsLink.RestaurantsLink(driver).getText());
	        
	        //Click on Restruants Link
	        //YelpRestaurantsLink.RestaurantsLink(driver).click();
	        //Thread.sleep(1000); 
	        
	        //assertEquals("The Best 10 Restaurants in Berkeley, CA", YelpRestaurantTitlePage.RestaurantTitlePage(driver));
	        
	        //Select Restruants In Drop Down box in Find
	        
	        YelpSearchBox.SearchBox(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys("Restaurants");
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