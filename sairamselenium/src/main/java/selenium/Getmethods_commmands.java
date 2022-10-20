package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getmethods_commmands 
{
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		System.out.println("Title of the page : "+driver.getTitle()); //title of the page
		System.out.println("retunrs the current url of the page : "+driver.getCurrentUrl()); //return url of the page
		String text=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[6]/div[2]/div[1]/div[2]")).getText(); //get text
		System.out.println(text);
		
	}

}
