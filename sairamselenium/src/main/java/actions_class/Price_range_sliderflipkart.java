package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Price_range_sliderflipkart 
{
	public static void main(String sri[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get URL
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//capture the search bar x path & click search button
		driver.findElement(By.name("q")).sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(2000);
		//capture the rage button x path of left side
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[1]/div"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider, 60, 0).build().perform();
		Thread.sleep(2000);
		WebElement slider2=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[2]/div"));
		action.dragAndDropBy(slider2, -40, 0).build().perform();
	}
	

}
