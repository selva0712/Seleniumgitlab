package testprojects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import bl.framework.api.SeleniumBase;

public class FacebookLike extends SeleniumBase {
@Test
	public void fb()  {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.findElementById("https://www.facebook.com");
		WebElement Id= locateElement("id","email");
		clearAndType(Id, "sundramselva@gmail.com");
	}

}
