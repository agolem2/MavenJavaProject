package Skillz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillz_001 {
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	 
    private static StringBuffer verificationErrors = new StringBuffer();

    static java.util.Date date= new java.util.Date();
    static Timestamp t = new Timestamp (date.getTime());
    static String dateNow = t.toString().replace(":","_");
    String obj = "Screenshots";
    String className = this.getClass().getSimpleName();
    String actualTitle; 
   
    @Before
    public void setUp() throws Exception {
           
       System.out.println("Running Regression Test " +className+dateNow);
       Log.info("Started Test Case Regression Test " +className+dateNow);
       DOMConfigurator.configure("log4j.xml");
            
         // /Users/miloonken/dev
       System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

  		
  		// Create a new instance of the driver
  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("http://skillz.com/games.json");
  		  		

  		driver.close();
  		
  		driver.quit();
  		
    
	}


	@Test
	public void Link1861() throws IOException {
		
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		
		// /Users/miloonken/dev
		System.setProperty("webdriver.chrome.driver", "/Users/miloonken/dev/chromedriver");

		
		// Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://skillz.com/games.json");
		
		// This step validates the WebPage is available and the Title Page is consistant without changes. 
		
		// Maximize the window.
		driver.manage().window().maximize();
		
        
        FileOutputStream fos = new FileOutputStream("/Users/miloonken/dev/Documents/data.xls");
        
        @SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet s = wb.createSheet("allElements");
        
        //java.util.List<WebElement> links = driver.findElements(By.xpath("//*"));
        
        java.util.List<WebElement> links = driver.findElements(By.id("1861"));
        
        System.out.println(links.size());

        for (int i = 0; i<links.size();i++)


        {
            //will store all the webElements in excel at given path

            Row row = s.createRow(i);
            row.createCell(0).setCellValue(links.get(i).getText());
            row.createCell(1).setCellValue(links.get(i).toString());

    		//System.out.println(links.size());
			System.out.println(links.get(i).getText());


        
        wb.write(fos);
        fos.close();
        

            try {

        	File scrFile = ((skillz_001)driver).SkillzPng(OutputType.FILE);
	        
			// now save the screenshot to a file some place
	        
			FileUtils.copyFile(scrFile, new File("/Users/miloonken/dev/Documents"+className+dateNow+".png"));
        } 
        
        catch (Exception e) {
            // No need to crash the tests if the screenshot fails
        }
    }
        
		
		driver.close();
  		
  		driver.quit();
        }		
	private File SkillzPng(OutputType<File> file) {
		// TODO Auto-generated method stub
		return null;
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
