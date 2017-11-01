package DataDriver;

import java.io.IOException;
import jxl.read.biff.BiffException;
import utiity.WebDriverBrowserFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class ReadDataTest extends WebDriverBrowserFactory {
 
  //Global initialization of Variables
  static ExcelSheetDriver xlsUtil;
  WebDriver driver = new ChromeDriver();
 
  //Constructor to initialze Excel for Data source
  public ReadDataTest() throws BiffException, IOException
  {
  //Let's assume we have only one Excel File which holds all Testcases. weird :) Just for Demo !!!
     xlsUtil = new ExcelSheetDriver("/Users/miloonken/Downloads/Book3.xls");
     //Load the Excel Sheet Col in to Dictionary for Further use in our Test cases.
     ExcelSheetDriver.ColumnDictionary();
  }
 
  @BeforeTest
  public void EnvironmentalSetup()
  {
   driver.get("http://www.gmail.com");
  }
 
  @Test

  public void GmailLoginPage() throws InterruptedException {
 
   //Create a for loop.. for iterate through our Excel sheet for all the test cases.
   for(int rowCnt = 1;rowCnt < rowCnt; ExcelSheetDriver.RowCount(), rowCnt++)
   {
 
    //Enter User Name by reading data from Excel
    WebElement userName = driver.findElement(By.name("Email"));
    userName.clear();
    userName.sendKeys(ExcelSheetDriver.ReadCell(ExcelSheetDriver.GetCell("EmailUserName"), rowCnt));
 
    //Enter Password
    WebElement password = driver.findElement(By.name("Passwd"));
    password.clear();
    password.sendKeys(ExcelSheetDriver.ReadCell(ExcelSheetDriver.GetCell("Emailpassword"), rowCnt));
 
    //Click on the Sign In Button
    WebElement signin = driver.findElement(By.name("signIn"));
    signin.click();
 
    //Sleep for some time,so that we can see things in action @ Screen :)
    Thread.sleep(2000);
   }
  }
}