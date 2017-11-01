package ParameterizedTesting;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utiity.WebDriverBrowserFactory;
 
/**
 * This class explains the usage of data driven excel
 * 
 * @author A. K. Sahu
 * 
 */
public class DataDrivenTest extends WebDriverBrowserFactory{
 
 @DataProvider(name = "loginToAppWithAllRoles")
 public Object[][] getLoginDataForAllRoles() throws Exception {
 
  DataDrivenExcel userData = new DataDrivenExcel("/Users/miloonken/Downloads/Book3.xls", "Sheet1");
 
  ArrayList<Object> dataList = new ArrayList<Object>();
 
  int i = 1;// excluding header row
  int totalRows = 6;
  while (i < totalRows) {
   System.out.println("loginToAppWithAllRoles : line : " + i);
 
   Object[] dataLine = new Object[4];
   dataLine[0] = userData.getCell(i, 0);
   dataLine[1] = userData.getCell(i, 1);
   dataLine[2] = userData.getCell(i, 2);
   dataLine[3] = userData.getCell(i, 3);
 
   dataList.add(dataLine);
 
   i++;
  }
 
  Object[][] data = new Object[dataList.size()][];
  for (i = 0; i < dataList.size(); i++)
   data[i] = (Object[]) dataList.get(i);
 
  return data;
 }
 
 @Test(dataProvider = "loginToAppWithAllRoles", 
       description = "Login with different roles")
 public void testLogin (String userID, String username, String password,
   String role) {
 
  WebDriver driver = new ChromeDriver();
 
  driver.get("http://yoursiteurl.com");
 
  // Do required actions using the input data, i am just printing here
  System.out.println("userID:" + userID);
  System.out.println("username:" + username);
  System.out.println("password:" + password);
  System.out.println("role:" + role);
 
  driver.quit();
 }
}