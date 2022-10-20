package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_browser 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.cricbuzz.com/");
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("get the ecurrent url  : "+driver.getCurrentUrl());
	}

}
