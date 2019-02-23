package testprojects;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import bl.framework.api.SeleniumBase;

public class Zoomcar{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=1;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//div/a[@class='search']").click();
		driver.findElementByXPath("//*[contains(text(),'Kodambakkam')]").click();
		
		
		driver.findElementByXPath("//button[@class='proceed']").click();
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
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		driver.findElementByXPath("//button[contains(text(),'Done')]").click();
		
		//driver.getScreenshotAs(OutputType.FILE);
		Thread.sleep(5000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
		driver.findElementByXPath("//div[contains(text(),'Price: High to Low')]").click();
		String Str1=driver.findElementByXPath("(//div[@class='price'])[1]").getText();
		System.out.println(Str1);
		driver.findElementByXPath("(//button[@type='button'])[1]").click();
	//	driver.close();
		
	}//

}
