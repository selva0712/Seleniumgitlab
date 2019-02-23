package groups;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bi.framework.testdesign.ProjectMethods;
import bl.framework.api.SeleniumBase;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.sym.Name;

public class CreateLead extends ProjectMethods {
	//@Test(dependsOnMethods="attributelearning.TC001_LoginAndLogout.login")
	//@Test(groups="smoke")
	public void createleads(){
		WebElement createlead = locateElement("Partial", "Create Lead");
		click(createlead);
		WebElement companyname= locateElement("id", "createLeadForm_companyName");
		clearAndType(companyname, "harward");
		WebElement Firstname= locateElement("id", "createLeadForm_companyName");
		clearAndType(Firstname, "Amar");
		WebElement Lastname= locateElement("id", "createLeadForm_companyName");
		clearAndType(Lastname, "jack");
	}
}
