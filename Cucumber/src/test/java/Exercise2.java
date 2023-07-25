
import org.checkerframework.common.value.qual.BoolVal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		Assert.assertEquals(expectedURL, actualURL);
		System.out.println("Assert true");
		Boolean present = driver.findElement(By.xpath("//a[@rel='async']")).isDisplayed();
		if(present)
		{
			System.out.println("create new account is present");
		}
			else
			{
				System.out.println("create new account is absent");
				}
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("puspa");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("njali");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xyzgah@gamail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("xyzgah@gamail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Abcd@12345");
		WebElement day = driver.findElement(By.id("day"));
		Select Day = new Select(day);
		Day.selectByValue("21");
		WebElement month = driver.findElement(By.id("month"));
		Select Month = new Select(month);
		Month.selectByIndex(2);
		WebElement year = driver.findElement(By.id("year"));
		Select Year = new Select(year);
		Year.selectByValue("1994");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
