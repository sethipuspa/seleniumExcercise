import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class divyaassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qatechhub.com/");
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		String expectedtitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		Assert.assertEquals(expectedtitle, actualtitle);
		System.out.println("Assert true");
		Thread.sleep(3000);
	    driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
	    String pageUrl = driver.getCurrentUrl();
	    System.out.println(pageUrl);
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.close();
	    System.out.println("Assert true");
		Thread.sleep(3000);
	
		
		
		


		
		
		
		
		

	}



}
