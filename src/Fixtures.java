

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import junit.framework.TestListener;
import utiity.WebDriverBrowserFactory;

public class Fixtures extends WebDriverBrowserFactory {
	
    private static StringBuffer verificationErrors = new StringBuffer();
    String className = this.getClass().getSimpleName();
    String actualTitle;
    static java.util.Date date = new java.util.Date();
    static Timestamp t = new Timestamp(date.getTime());
    static String dateNow = t.toString().replace(":", "_");
	
	@Before
	@Ignore
	    public void openBrowser() {
	 
	        File file = new File("C:\\bin\\Config.Properties");
	        FileInputStream fileInput = null;
	        try {
	            fileInput = new FileInputStream(file);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	        Properties prop = new Properties();
	 
	        //load properties file
	        try {
	            prop.load(fileInput);
	        } catch (IOException e)
	 
	        {
	            e.printStackTrace();
	        }
	 
	        //driver = (GetDriver(prop.getProperty("browser")));
	        //System.out.print(prop.getProperty("browser"));
	       
	        System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
	       
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	       
	        ChromeOptions options = new ChromeOptions();
	       
	        options.setBinary(new File("C:\\Applications\\chrome.exe"));
	        options.addArguments("incognito");
	        options.addArguments("disable-infobars");
	        options.addArguments("test-type");
	        options.addArguments("--start-maximized");
	        options.addArguments("--disable-web-security");
	        options.addArguments("--allow-running-insecure-content");
	        capabilities.setCapability("chrome.binary", "./src//lib//chromedriver");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	       
	        driver = new ChromeDriver(options);
	 
	        //driver.get("about:blank");
	        //driver.manage().window().maximize();
	       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	    }
	 
	@After
	@Ignore
	    public void tearDown() throws Exception {
	               String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	        System.out.print(verificationErrorString);
	    }
	 
	    Result result = JUnitCore.runClasses(TestListener.class);
	    System.out.println("Completed Test Case " + className + " Date:  " + dateNow);
	   
	    if (result.wasSuccessful())
	        System.out.println("Test run was successful");
	    else {
	        System.out.println("Test run was NOT successful: ");
	        for (Failure f: result.getFailures())
	            System.out.println(f.getMessage() + " - Trace: " + f.getTrace() + " - Exception: " +
	                f.getException() + " - " + f.getException().getStackTrace());
	 
	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        // Save the screenshot to a file some place
	        try {
	            FileUtils.copyFile(scrFile, new File("C:\\Users\\eonken\\workspace\\screenshots\\screenshot" + dateNow + ".png"));
	        } catch (IOException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	 
	    }
	    WebDriverBrowserFactory.driver.quit();
	    driver.quit();
	 
	    }
	    @Ignore
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	 
	    }
	 
	}
