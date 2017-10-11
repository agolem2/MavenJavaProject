package utiity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFireFox {
	public void Chrome() throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String strPageTitle = driver.getTitle();
		
		System.out.println("Page Title: - "+strPageTitle);
		
		driver.close();
		
		System.out.println("closing chrome browser");
		
		driver.quit();
	}

}
