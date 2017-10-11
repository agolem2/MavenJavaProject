package SoapUI;

import org.junit.Test;

public class testSoapUI {

	//Junit test method

	@Test
	public void testSoap() {
	    //initialize  SoapUITestCaseRunner class object
	    SoapUITestCaseRunner soapUITestCaseRunner = new SoapUITestCaseRunner();
	    
	    //set your project absolute path of your project 
	    soapUITestCaseRunner.setProjectFile("D://SampleTest-soapui-project.xml");
	    try {
	            //call run method to execute all test of project.
	              soapUITestCaseRunner.run();
	        } catch (Exception e) {                                                           
	              e.printStackTrace();
	    }
	    finally {
	        
	    }
	
	}
}
