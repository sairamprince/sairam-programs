package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		/*WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(Electronics).build().perform();
		WebElement audio = driver.findElement(By.xpath("//*[text()='Audio']"));
		action.moveToElement(audio).build().perform();
		WebElement All = driver.findElement(By.xpath("//*[text()='All']"));
		action.moveToElement(All).click().build().perform();*/
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[1]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 60, 0).build().perform();
		WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[2]"));
		action.dragAndDropBy(slider2, -30, 0).build().perform();
		
	}

}
