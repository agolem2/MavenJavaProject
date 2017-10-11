
package Skillz;

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


public class Skillz002_FindAllLinks {

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
  		
  		
  		driver.get("http://corp.skillz.com/");
  		
  		driver.close();
  		
    }

    @Test
    public void FindAllLinks() throws Exception {

    	
        WebDriver driver = new ChromeDriver();
        driver.get("http://games.skillz.com/");


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
