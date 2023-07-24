package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.xpath("//input[@type='ckeckbox']")).getSize();
		System.out.println(driver.findElement(By.xpath("//input[@type='ckeckbox']")).getSize());
		
		
		
		
		
		
		}

}
