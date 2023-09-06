package Broswersetup;




import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends Readconfig101 implements ITestListener  {




	@Override
	public void onTestFailure(ITestResult result) {
		
	
//			ca(result.getTestName());
		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
		
		System.out.println("onTestFailure");
	}



}
