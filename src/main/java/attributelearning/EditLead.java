package attributelearning;

import org.openqa.selenium.WebElement;

import bl.framework.api.SeleniumBase;

public class EditLead extends SeleniumBase{
	public void Editleads(){
		WebElement companyname= locateElement("id", "createLeadForm_companyName");
		clearAndType(companyname, "harward");
		WebElement Firstname= locateElement("id", "createLeadForm_companyName");
		clearAndType(Firstname, "Amar");
		WebElement Lastname= locateElement("id", "createLeadForm_companyName");
		clearAndType(Lastname, "jack");
		
	}
}
