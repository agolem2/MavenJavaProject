package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bhhc_policy {
	
	 public static final String PolicyNumber = null;
	public static WebElement element = null;
     
     // bhhc_agent
    
     public static WebElement PolicyNumber (WebDriver driver)
    
     {element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPolNum"));
     
     return element;

     }
}
