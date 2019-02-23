package reports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class runReport {

	  ExtentHtmlReporter html;
	  ExtentReports extent;
	  ExtentTest test;
	  
	  @Test
	 public void htmlreport() {
	  	 html =new ExtentHtmlReporter("./report/extendreport.html");
	  	 extent = new ExtentReports();
	  	 html.setAppendExisting(true);
	  	 extent.attachReporter(html);
	  	 
	  	test = extent.createTest("TC001_login","login to leaftaps");
	  	test.assignAuthor("Amar");
	  	test.assignCategory("Smoke");
	  	try {
	  	test.pass("Demo Manager Entered Successfully",
			MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	 
	  	test = extent.createTest("TC002_loginpassword","login to leaftaps");
	  	test.assignAuthor("Amar");
	  	test.assignCategory("Smoke");
	  	try {
	  	test.fail("Demo Manager Entered Successfully",
			MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	
	  	extent.flush();
	  
	  }
}
