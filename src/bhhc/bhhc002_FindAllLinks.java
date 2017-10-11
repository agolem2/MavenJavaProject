
/* 	
 *  Test case ID: bhhc002_FindAllLinks
 * 
 * 	Test priority (High): 

 *	Module Name – bhhc002_FindAllLinks
 *	Test Designed By:
 *		@Author Milo.Onken
 *
 *
 *	Test Designed Date: 
 *		16-OCT-16
 *	Test Executed By: 
 *		Name of tester. (To be filled after test execution)
 *	Test Execution Date: 
 *		Date when test executed.
 *	Test Title/Name: bhhc002_FindAllLinks
 *
 *	Test Summary/Description: 
 *		This Test Script Validates bhhc002_FindAllLinks from the bhhc main webpage 
 *	Pre-condition: Any prerequisite that must be fulfilled before execution of this test case. List all pre-conditions in order to successfully execute this test case.
 *	
 *	Dependencies: 
 *	
 *	Test Steps: List all test execution steps in detail. Write test steps in the order in which these should be executed. Make sure to provide as much details as you can. Tip – to efficiently manage test case with lesser number of fields use this field to describe test conditions, test data and user roles for running test.	
 *	
 *	Step 1 - Navigate to WebPage http://www.bhhc.com
 *	Step 2 - Select Count and Verify the number of elements available on (Home - Berkshire Hathaway Homestate Companies)
 *	Step 3 - Verify OutPut = 148
 *	Step 4 - 
 *

Claims Center

Careers

Agents / Brokers

About

Contact

"Commercial
Auto"

"Commercial
Property"

"Public
Entity"

"Workers
Compensation"

Open

Commercial Property

Previous
Next
Commercial Auto
Online Property Rater
Learn More
Need Help?
Commercial Auto
auto@bhhc.com
Product Information

Coverages
Auto Rater Information
Report a Claim
Resources
Commercial Property
property@bhhc.com
Product Information

Property Rater Information
Report a Claim
Resources
Public Entity
public@bhhc.com
Coverages
Report a Claim
Workers Compensation
Services

Claim Center

CA Medical Provider Network

Injured Workers

Safety Center

Careers
Current Openings
Career Opportunities

Agents / Brokers
Benefits
Become An Agent
About
History
Financial Information
Contact
Contact us by Region
Contact us by Department

BHHC on LinkedIn

PRIVACY
TERMS OF USE
CA RESIDENTS
IL RESIDENTS
LA RESIDENTS (NF&M)
LA RESIDENTS (BHHIC)
MO RESIDENTS
NY RESIDENTS
WI RESIDENTS
STATES OF OPERATION


 *
 *	Test Data: Test Data should match the output test script
 *				(Use of test data as an input for this test case. You can provide different data sets with exact values to be used as an input.)
 *	
 *	Expected Result:  
 *			(What should be the system output after test execution? Describe the expected result in detail including message/error that should be displayed on screen.)
 *	
 *	Actual result: 
 *			(Actual test result should be filled after test execution. Describe system behavior after test execution.)
 *
 *	Pass/Fail: 
 * 
 * */

package bhhc;

import java.io.FileOutputStream;
import java.sql.Timestamp;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class bhhc002_FindAllLinks {

	private static Logger Log = Logger.getLogger(Logger.class.getName());
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
   
    @Before
    public void setUp() throws Exception {
           
       System.out.println("Running Regression Test " +className+dateNow);
       Log.info("Started Test Case Regression Test " +className+dateNow);
       DOMConfigurator.configure("log4j.xml");
            
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

  		
  		// Create a new instance of the driver
  		WebDriver driver = new ChromeDriver();
  		
  		
  		driver.get("https://www.google.com/");
  		
  		driver.close();
  		
    }

    @Test
    public void FindAllLinks() throws Exception {

    	
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bhhc.com/");


        Thread.sleep(3000);
        
        FileOutputStream fos = new FileOutputStream("/Users/miloonken/dev/Documents/data.xls");
        
        @SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet s = wb.createSheet("allElements");
        
        //java.util.List<WebElement> links = driver.findElements(By.xpath("//*"));
        
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println(links.size());

        for (int i = 0; i<links.size();i++)


        {
            //will store all the webElements in excel at given path

            Row row = s.createRow(i);
            row.createCell(0).setCellValue(links.get(i).getText());
            row.createCell(1).setCellValue(links.get(i).toString());

    		//System.out.println(links.size());
			System.out.println(links.get(i).getText());


        }
        wb.write(fos);
        fos.close();
        
        //List<WebElement> optionCount = driver.findElements(By.xpath("//select/option"));
        //System.out.println(optionCount.size());
                
        
        
   	driver.close();
   	 
   	System.out.println("Finished storing all the webElements in excel at given path");

   	driver.quit();
   	
    }

    @AfterClass
	 
	public static void  afterClass() throws Exception {
	 
	System.out.println("Finished Test Case");
	}      
	 
	public static void verification () {
	 
	String verificationErrorString = verificationErrors.toString();
	 
	        if (!"".equals(verificationErrorString)) {
	 
	                }
	}
	 
	 
	@After
	 
	public void tearDown() throws Exception {
	 
	 
	}
	
}
