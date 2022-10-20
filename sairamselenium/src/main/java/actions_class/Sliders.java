package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sliders 
{
	public static void main(String SS[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get URL
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");
		//cpature the frame x path
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"post-2673\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		//capture the x path of red slider
		WebElement redslider=driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		//create action class
		Actions action=new Actions(driver);
		action.dragAndDropBy(redslider, -20, 120).build().perform();
		//capture the  path of green slider
		WebElement greenslider=driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		action.dragAndDropBy(greenslider, -100, 125).build().perform();	
		//capture the x path of blue slider
		WebElement blueslider=driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		action.dragAndDropBy(blueslider, 90, 120).build().perform();
	
	}

}
