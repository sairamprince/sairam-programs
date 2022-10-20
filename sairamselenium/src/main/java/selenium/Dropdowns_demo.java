package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns_demo {
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//clicking + button 4 times
		int i=1;
		for(i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		//done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//get text on dropdown
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}

}
