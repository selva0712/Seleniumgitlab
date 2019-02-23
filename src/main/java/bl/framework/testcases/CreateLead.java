package bl.framework.testcases;

import org.openqa.selenium.WebElement;

import bl.framework.api.SeleniumBase;

public class CreateLead extends SeleniumBase {

public void createleads(){
	WebElement companyname= locateElement("id", "createLeadForm_companyName");
	clearAndType(companyname, "harward");
	WebElement Firstname= locateElement("id", "createLeadForm_companyName");
	clearAndType(Firstname, "Amar");
	WebElement Lastname= locateElement("id", "createLeadForm_companyName");
	clearAndType(Lastname, "jack");
	
}
}
