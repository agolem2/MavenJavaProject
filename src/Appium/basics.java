package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class basics {

	public static void main(String[] args) throws MalformedURLException{
		
		// TODO Auto-generated method stub
		//Appium Server Arguements.
		//CommandLine commandAppiumServer = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");
		//commandAppiumServer.addArgument("--session-override", true);

		 File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");
	     
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     //capabilities.setCapability("platformVersion", "7.1.1");
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	   
	     capabilities.setCapability("no",true);
	     capabilities.setCapability("newCommandTimeout", 100000);
	     capabilities.setCapability("noReset", true);
	     capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	     capabilities.setCapability(CapabilityType.VERSION, "4.4.2");
	     capabilities.setCapability("noRest", true);
	        
	     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    
	     driver.get("http://appium.io/");
	     
	     //driver.pressKeyCode(AndroidKeyCode.BACK);
	     
	     //driver.findElementByXPath("//andriod.widget.TextView[@text='Preference']").click();
	}

}
