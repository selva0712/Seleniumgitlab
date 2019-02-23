package bl.framework.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import bl.framework.api.SeleniumBase;

public class TC001_LoginAndLogout extends SeleniumBase{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUsername = locateElement("id", "username");
		clearAndType(eleUsername, "DemoSalesManager"); 
		WebElement elePassword = locateElement("id", "password");
		clearAndType(elePassword, "crmsfa"); 
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin); 
		
		WebElement crmlink = locateElement("link", "CRM/SFA");
		click(crmlink);
		
		WebElement createlead = locateElement("Partial", "Create Lead");
		click(createlead);
		
		WebElement SelectSource =locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(SelectSource, 5);
		WebElement SelectSource1 =locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingValue(SelectSource1, "ADP");
		WebElement SelectSource2 =locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(SelectSource2, "Computer Hardware");
		
		WebElement Submitbutton =locateElement("name", "submitButton");
		click(Submitbutton);
		
		
		
		
		
	//	WebElement eleLogout = locateElement("class", "decorativeSubmit");
	//	click(eleLogout);//div/ul/li/a[@class='selected']
	}
}








