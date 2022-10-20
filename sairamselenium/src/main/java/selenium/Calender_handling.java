package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_handling {
	
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//select date of birth
		
		//select on the year
		Thread.sleep(2000);
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
		Thread.sleep(2000);
		year.selectByValue("2005");
		
		//select month
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
		Thread.sleep(2000);
		month.selectByVisibleText("November");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@aria-label='Choose Friday, November 18th, 2005']")).click();
			
		
		
	}

}
