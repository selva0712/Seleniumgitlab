package demoonlineexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bi.framework.testdesign.ProjectMethods;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class ManageServiceTypeverifications  extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testcaseName = "TC003_CreateLead";
		testDec = "Create a new Lead in leaftaps";
		author = "Gayatri";
		category = "Smoke";
	//	dataSheetName = "TC001";
	} 	
	
@Test	
public void servicetype() {
	
	locateElement("xpath", "//ul/li[@id='Inpatient Ward']").click();
	locateElement("id", "loginButton").click();//form/fieldset/ul/li[@id='Inpatient Ward']
	locateElement("xpath","//a[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']").click();
	click(locateElement("id", "appointmentschedulingui-manageAppointmentTypes-app"));
	List<WebElement>  Noofpages = locateElements("xpath","//div[@id='appointmentTypesTable_paginate']/span/a");
	System.out.println(Noofpages.size());
	
	for (int i = 1; i <= Noofpages.size(); i++) {
		
	List<WebElement> table1 = locateElements("xpath","//*[@id=\"appointmentTypesTable\"]/tbody/tr/td[1]");
	System.out.println(table1.size());	
	for (int j = 0; j < table1.size(); j++) {
		
	String Text=getElementText(table1.get(j));
	System.out.println(Text);
	}
		
	}
	
	
	
	//*[@id="appointmentTypesTable"]/tbody/tr[1]/td[1]
	
}//*[@id="appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension"]/text()
}////div/a[5]/text()[2]
