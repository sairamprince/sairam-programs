package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_handling {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3.org/WAI/UA/2002/06/thead-test");
		driver.findElement(By.xpath("//td[contains(text(),'T. Sexton')]"));
		String text=driver.findElement(By.xpath("//th[@id='t1']")).getText();
		System.out.println(text);
	}

}
