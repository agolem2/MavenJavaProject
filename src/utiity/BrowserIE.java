package utiity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserIE {
	public void Chrome() throws Exception {
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("www.google.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String strPageTitle = driver.getTitle();
		
		System.out.println("Page Title: - "+strPageTitle);
		
		driver.close();
		
		System.out.println("closing chrome browser");
		
		driver.quit();
	}

}
