package groups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bi.framework.testdesign.ProjectMethods;

public class DuplicateLead extends ProjectMethods {

	@Test(groups="sanity")
	
	public void duplicatelead() {

		WebElement link = locateElement("xpath", "//div[@id='label']/a");
		click(link);
		WebElement Dup = locateElement("xpath", "//a[text()='Leads']");
		click(Dup);
		WebElement FL = locateElement("xpath", "//a[text()='Find Leads']");
		click(FL);
		WebElement FLS = locateElement("xpath", "//span[text()='Email']");
		click(FLS);
		WebElement email = locateElement("xpath", "//input[@name='emailAddress']");
		clearAndType(email, "@");
		WebElement FLB = locateElement("xpath", "//button[text()='Find Leads']");
		click(FLB);
		
		WebElement LN = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
		getElementText(LN);
		WebElement CL = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a");
		click(CL);
		WebElement DL = locateElement("xpath", "//a[text()='Duplicate Lead']");
		click(DL);
		verifyTitle("Duplicate");
		WebElement CN = locateElement("xpath", "//input[@id='createLeadForm_firstName']");
		verifyPartialText(CN, "FName G");
	}
}
