package actiTIME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String args[])
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(Electronics).build().perform();
		WebElement audio = driver.findElement(By.xpath("//*[text()='Audio']"));
		action.moveToElement(audio).build().perform();
		WebElement bluetooth = driver.findElement(By.xpath("Bluetooth Headphones"));
		action.moveToElement(bluetooth).click().build().perform();
		
		
	}

}
