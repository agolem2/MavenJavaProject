//Using a continuous integration server (eg Hudson is perfect for this) it is possible to run unit tests automatically JUnit format. 
//Below is an example of integrating SoapUI project in a JUnit test.

package SoapUI;

public class SoapUITestCaseRunner {
	
	{
	    SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
	    runner.setProjectFile( "src/dist/sample-soapui-project.xml" );
	    runner.run(); 
	}

	void setProjectFile(String string) {
		// TODO Auto-generated method stub
		
	}

	void run() {
		// TODO Auto-generated method stub
		
	}

}
