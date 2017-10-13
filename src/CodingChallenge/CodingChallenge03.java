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

import PageObjects.YelpHomePage;
import PageObjects.YelpRestaurantTitlePage;
import PageObjects.YelpSearchBox;
import PageObjects.YelpSearchBoxInput;
import PageObjects.YelpSearchBoxRestaurants;
import PageObjects.YelpSearchBoxSubmit;
import utiity.ScreenShotOnFailure;
import utiity.WebDriverBrowserFactory;

public class CodingChallenge03 extends WebDriverBrowserFactory {

	 private static StringBuffer verificationErrors = new StringBuffer();

	    static java.util.Date date = new java.util.Date();
	    static Timestamp t = new Timestamp(date.getTime());
	    static String dateNow = t.toString().replace(":", "_");
	    String obj = "Screenshots";
	    String className = this.getClass().getSimpleName();

	    @Rule
	    public ScreenShotOnFailure screenShotRule;

	    @Test
	    public void SearchRestaurantsAppendPizza() throws Exception {

	    	//Get the Yelp URL Home Page
	        driver.get(YelpHomePage.YelpHomePageURl(driver));
	        Thread.sleep(2000);
	        
	        //Verify Restaurants Link Is Displayed and Spelled Correctly
	        assertEquals("Restaurants", driver.findElement(By.linkText("Restaurants")).getText());
	        
	        //Select Restruants In Drop Down box in Find 
	        YelpSearchBox.SearchBox(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).click();
	        YelpSearchBoxRestaurants.SearchBoxRestaurantOption(driver).click();
	        YelpSearchBoxInput.SearchBoxInput(driver).sendKeys("Restaurants");
	        
	        //Search Restruants
	        YelpSearchBoxSubmit.SubmitSearch(driver).click();
	        
	        //Verify Search Restruants Page Returned
	        assertEquals("Best Restaurants in Berkeley, CA", YelpRestaurantTitlePage.RestaurantTitlePage(driver));
	        Thread.sleep(2000);

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