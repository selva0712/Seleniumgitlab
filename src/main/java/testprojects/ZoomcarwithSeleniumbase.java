package testprojects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.ListAutoNumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

import bl.framework.api.SeleniumBase;

public class ZoomcarwithSeleniumbase extends SeleniumBase {
@Test
	public void zoomcar() throws InterruptedException{
		
		startApp("chrome", "https://www.zoomcar.com/chennai/");
		WebElement Clicksearchbutton = locateElement("xpath", "//div/a[@class='search']");
		click(Clicksearchbutton);
		WebElement PopularpickupPoints = locateElement("xpath", "//*[contains(text(),'Kodambakkam')]");
		click(PopularpickupPoints);
		WebElement NextButton = locateElement("xpath", "//button[@class='proceed']");
		click(NextButton);
		Date date = new Date();

		// Get only the date (and not month, year, time etc)
				
		DateFormat sdf = new SimpleDateFormat("dd");
		
		 
		// Get today's date
				
		String today = sdf.format(date);

		// Convert to integer and add 1 to it
		 
		int tomorrow = Integer.parseInt(today)+2;

		// Print tomorrow's date
				
		System.out.println(tomorrow);
		Thread.sleep(5000);
		WebElement Selectdate = locateElement("xpath", "//div[contains(text(),'"+tomorrow+"')]");
		click(Selectdate);
		
		WebElement Nextbutton = locateElement("xpath", "//button[@class='proceed']");
		click(Nextbutton);
		WebElement Donebutton = locateElement("xpath", "//button[contains(text(),'Done')]");
		click(Donebutton);
		takeSnap();
		Thread.sleep(5000);
	//	WebElement Sorthightolowprice = locateElement("xpath","(//div[contains(text(),'Price: High to Low')])");
	//	click(Sorthightolowprice);
	//	Sorthightolowprice.getSize();
	//	System.out.println(Sorthightolowprice.getSize());
	//	String Str1= locateElement("xpath", "((//div[@class='price'])[3])").getText();
	//	System.out.println(Str1);
		
	
		
	//	WebElement tablename1 = driver.findElementByXPath("//div[@class='car-list-layout']"); //DataTable TrainList
	//	System.out.println(tablename1.getSize());
		/*List <WebElement> rows1 =  tablename1.findElements(By.xpath("//div[@class='price']"));
		System.out.println(rows1.size());
*/	
		
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class='details']/h3"));
		   List<WebElement> elements = driver.findElements(By.xpath("//div[@class='price']"));
		    System.out.println("Number of elements:" +elements.size());
		    List listA = new ArrayList();
		    for (int i=0; i<elements.size();i++){
		     //System.out.println("The Brand Name is:" + elements1.get(i).getText() +" ,and the Price Value is:" + elements.get(i).getText());
		    //String Str2=("The Brand Name is:" + elements1.get(i).getText() +" ,and the Price Value is:" + elements.get(i).getText());
		    //String Str2=("The Brand Name is:" + elements1.get(i).getText());
		    //String Str3=("The Price Value is:" + elements.get(i).getText());
		    	String Str2=(elements1.get(i).getText());
		    	String Str3=(elements.get(i).getText());
		    	
		    //  System.out.println("The Brand Name is:" + elements1.get(i).getText());
		      
		      listA.add(Str2 + Str3);
		  //    listA.add(Str3); 
		    
		    	}	
		    System.out.println(listA);
		    Object obj = Collections.max(listA);
			System.out.println(obj);
		  //  System.out.println(listA.get(5));
		    
		WebElement Booknowbutton = locateElement("xpath", "(//button[@type='button'])[1]");
		click(Booknowbutton);		
		
		
	}
	
	
}
