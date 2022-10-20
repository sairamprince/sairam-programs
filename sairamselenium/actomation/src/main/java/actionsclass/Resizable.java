package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get URL
		driver.get("https://jqueryui.com/resizable/");
		//capture frame x path
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		Actions action=new Actions(driver);
		WebElement resizable=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		action.moveToElement(resizable).dragAndDropBy(resizable, 200, 100).build().perform();
		

	}

}
