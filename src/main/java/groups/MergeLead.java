package groups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bi.framework.testdesign.ProjectMethods;

public class MergeLead extends ProjectMethods {

	@Test
	public void MergeLeads() throws InterruptedException
	{
		WebElement link = locateElement("xpath", "//div[@id='label']/a");
		click(link);
		WebElement LB = locateElement("xpath", "//a[text()='Leads']");
		click(LB);
		WebElement ML = locateElement("xpath", "//a[text()='Merge Leads']");
		click(ML);
		WebElement MLL1 = locateElement("xpath", "(//table[@id='widget_ComboBox_partyIdFrom'])//parent::*/following-sibling::a/img");
		click(MLL1);
		switchToWindow(1);
		WebElement table = locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])//input");
		clearAndType(table, "10089");
		WebElement FLB = locateElement("xpath", "//button[@class='x-btn-text'][1]");
		click(FLB);
		Thread.sleep(5000);
		WebElement Llink = locateElement("xpath", "//a[text()='10089']");
		clickWithNoSnap(Llink);
		switchToWindow(0);
		WebElement PT = locateElement("xpath", "(//table[@id='widget_ComboBox_partyIdTo'])//parent::*/following-sibling::a/img");
		click(PT);
		switchToWindow(1);
		WebElement table1 = locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])//input");
		clearAndType(table1, "10089");
		WebElement FLB1 = locateElement("xpath", "//button[@class='x-btn-text'][1]");
		click(FLB1);
		
		WebElement Llink1 = locateElement("xpath", "//a[text()='10089']");
		clickWithNoSnap(Llink1);
		switchToWindow(0);
		WebElement MB = locateElement("xpath", "//a[text()='Merge']");
		clickWithNoSnap(MB);
		switchToAlert();
		acceptAlert();
		WebElement Message = locateElement("xpath", "//li[@class='errorMessage']");
		getElementText(Message);
		
	}
}
