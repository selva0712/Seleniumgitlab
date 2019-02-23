package groups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bi.framework.testdesign.ProjectMethods;
import bl.framework.api.SeleniumBase;

public class EditLead extends ProjectMethods{
	@Test(groups="smoke")
	public void Editleads() throws InterruptedException{
		WebElement link = locateElement("link", "CRM/SFA");
		click(link);
		WebElement LB = locateElement("xpath", "//a[text()='Leads']");
		click(LB);
		WebElement FL = locateElement("xpath", "//a[text()='Find Leads']");
		click(FL);
		WebElement FN = locateElement("xpath", "(//input[@name='firstName'])[3]");
		clearAndType(FN, "karthi");
		WebElement FLB = locateElement("xpath", "//button[text()='Find Leads']");
		click(FLB);
		Thread.sleep(5000);
		WebElement LL = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(LL);
		verifyTitle("View Lead");
		WebElement Editlink = locateElement("xpath", "//a[text()='Edit']");
		click(Editlink);
		WebElement CN = locateElement("xpath", "//input[@id='updateLeadForm_companyName']");
		clearAndType(CN, "Cognizant");
		WebElement subB = locateElement("xpath", "//input[@name='submitButton']");
		click(subB);
		WebElement VLCN = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
		verifyPartialText(VLCN, "Cognizant");
		
	}
}
