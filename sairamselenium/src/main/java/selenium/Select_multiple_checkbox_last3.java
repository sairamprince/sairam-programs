package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_multiple_checkbox_last3 {
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		System.out.println(checkbox.size());
		
		for(int i=(checkbox.size()-3);i<checkbox.size();i++)
		{
			checkbox.get(i).click();
			Thread.sleep(2000);
		}  
	}
}

