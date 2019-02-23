package groups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bi.framework.testdesign.ProjectMethods;

public class createleadparam  extends ProjectMethods{
@Parameters({"url","username","password"})
public void login(String url,String username,String password) {
	
	startApp("chrome", url);
	WebElement eleUsername = locateElement("id", "username");
	clearAndType(eleUsername, username); 
	WebElement elePassword = locateElement("id", "password");
	clearAndType(elePassword, password); 
	WebElement eleLogin = locateElement("class", "decorativeSubmit");
	click(eleLogin);
	WebElement crmlink = locateElement("link", "CRM/SFA");
	click(crmlink);
}
@BeforeTest
public void setData() {
	testcaseName = "TC001_CreateLead";
	testDec = "Create a new Lead in leaftaps";
	author = "Gayatri";
	category = "Smoke";
	dataSheetName = "TC001";
} 

@Test(dataProvider="getdata" /*,invocationCount=2*/)
	public void createleads1(String cname,String fname,String lname){
	
	click(locateElement("link", "Create Lead"));
//	locateElement("link", "Create Lead").click();
	locateElement("id", "createLeadForm_companyName").click();
	locateElement("id", "createLeadForm_firstName").click();
	locateElement("id", "createLeadForm_lastName").click();
	locateElement("name", "submitButton").click();

/*	@DataProvider(name="getdata",indices= 0)
	public String [] [] fetchdata(){
		String [] [] data = new String [2] [3];
		data[0] [0]="testleaf";
		data[0] [1]="kousik";
		data[0] [2]="A";
		
		data[1] [0]="testleaf";
		data[1] [1]="Amar";
		data[1] [2]="A";
		
		
		return data;
		
	}*/
}	
}
