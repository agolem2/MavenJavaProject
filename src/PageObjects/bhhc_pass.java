package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bhhc_pass {
	
	 public static WebElement element = null;
     
     // bhhc_pass
    
     public static WebElement Agent (WebDriver driver)
    
     {element = driver.findElement(By.id("agent_pass"));
     return element;

     }
}
